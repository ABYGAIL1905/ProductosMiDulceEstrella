/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoGolosinas.demo.controller;

import ProyectoGolosinas.demo.entity.Catalogo;

import ProyectoGolosinas.demo.service.ICatalogoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author daysi
 */
@CrossOrigin(origins = { "*" })
@RestController
@RequestMapping("/api/catalogo")
public class CatalogoController {
    
    @Autowired
   ICatalogoService catalogoService;
              @GetMapping("/listar")
    public ResponseEntity<List<Catalogo>> listarCatalogo() {
        return new ResponseEntity<>(catalogoService.findByAll(), 
                HttpStatus.OK);
    }
    @PostMapping("/crear")
    public ResponseEntity<Catalogo> crearCatalogo(
            @RequestBody Catalogo catalogo) {
        return new ResponseEntity<>(catalogoService.save(catalogo), 
                HttpStatus.CREATED);
    }
    
    //Guardar una lista de productos
    @PostMapping("/crearLista")
    public ResponseEntity<List<Catalogo>> crear(@RequestBody List<Catalogo> catalogos) {
        try {
            List<Catalogo> resultados = new ArrayList<>();

            for (Catalogo catalogo : catalogos) {
                catalogo.setVisible(true);
                resultados.add(catalogoService.save(catalogo));
            }

            return new ResponseEntity<>(resultados, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    
}
