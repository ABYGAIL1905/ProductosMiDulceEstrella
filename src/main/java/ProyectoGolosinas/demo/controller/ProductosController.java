/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoGolosinas.demo.controller;

import ProyectoGolosinas.demo.entity.Productos;
import ProyectoGolosinas.demo.service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author daysi
 */
@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/productos")
public class ProductosController {
        	@Autowired
                IProductoService productoService;
                
                 @GetMapping("/listar")
    public ResponseEntity<List<Productos>> listarProductos() {
        return new ResponseEntity<>(productoService.findByAll(), 
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Productos> crearProducto(
            @RequestBody Productos productos) {
        return new ResponseEntity<>(productoService.save(productos), 
                HttpStatus.CREATED);
    }

    @PutMapping("/actualizar/{id}")
    public ResponseEntity<Productos> actualizarProducto(@PathVariable Long id, @RequestBody Productos productos) {
        Productos pro_encontrada = productoService.findById(id);
        if (pro_encontrada == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } else {
            try {
                pro_encontrada.setId_producto(productos.getId_producto());
                pro_encontrada.setCodigo_producto(productos.getCodigo_producto());
                pro_encontrada.setFoto_producto(productos.getFoto_producto());
                pro_encontrada.setNombre_producto(productos.getNombre_producto());
                return new ResponseEntity<>(productoService.save(productos), HttpStatus.OK);
            } catch (DataAccessException e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }
    }

    @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<Productos> eliminarProducto(@PathVariable Long id) {
       productoService.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
    
}
