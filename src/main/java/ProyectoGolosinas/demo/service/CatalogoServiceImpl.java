/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoGolosinas.demo.service;

import ProyectoGolosinas.demo.entity.Catalogo;
import ProyectoGolosinas.demo.repository.ICatalogoRepository;
import ProyectoGolosinas.demo.repository.ICategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author daysi
 */
@Service
public class CatalogoServiceImpl extends GenericServiceImpl <Catalogo, Long> implements ICatalogoService {
    @Autowired
    ICatalogoRepository catarep;


    @Override
    public CrudRepository<Catalogo, Long> getDao() {
        return catarep;
    }
    
}
