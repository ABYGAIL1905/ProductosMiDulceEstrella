/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProyectoGolosinas.demo.service;

import ProyectoGolosinas.demo.entity.Productos;
import com.example.AbigailZhingriExamen.service.GenericService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author daysi
 */

public interface IProductoService extends GenericService<Productos, Long>{
    
}
