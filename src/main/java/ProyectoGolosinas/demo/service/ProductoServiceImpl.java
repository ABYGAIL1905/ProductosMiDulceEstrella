/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoGolosinas.demo.service;

import ProyectoGolosinas.demo.entity.Productos;
import ProyectoGolosinas.demo.repository.IProductoRepository;
import com.example.AbigailZhingriExamen.service.GenericServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author daysi
 */
@Service
public class ProductoServiceImpl extends GenericServiceImpl <Productos, Long>implements IProductoService {
    
    	@Autowired
    IProductoRepository ipr;
    

    @Override
    public CrudRepository<Productos, Long> getDao() {
    return ipr;
    }
    
}
