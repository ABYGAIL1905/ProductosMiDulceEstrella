/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoGolosinas.demo.service;

import ProyectoGolosinas.demo.entity.Categoria;

import ProyectoGolosinas.demo.repository.ICategoriaRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author daysi
 */
@Service
public class CategoriaServiceImpl extends GenericServiceImpl <Categoria, Long> implements ICategoriaService{

    @Autowired
    ICategoriaRepository caterep;

    @Override
    public CrudRepository<Categoria, Long> getDao() {
        return  caterep;
    }
    
   
   
  }
