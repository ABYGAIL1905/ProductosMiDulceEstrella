/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoGolosinas.demo.controller;

import ProyectoGolosinas.demo.entity.Categoria;
import ProyectoGolosinas.demo.entity.Productos;
import ProyectoGolosinas.demo.service.ICategoriaService;
import ProyectoGolosinas.demo.service.IProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author daysi
 */
@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/categoria")
public class CategoriaController {
    
    @Autowired
    ICategoriaService categoriaService;
            
                @GetMapping("/listar")
    public ResponseEntity<List<Categoria>> listar() {
        return new ResponseEntity<>(categoriaService.findByAll(), 
                HttpStatus.OK);
    }
    
}
