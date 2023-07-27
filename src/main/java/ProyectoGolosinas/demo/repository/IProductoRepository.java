/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ProyectoGolosinas.demo.repository;

import ProyectoGolosinas.demo.entity.Productos;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author daysi
 */
public interface IProductoRepository extends JpaRepository<Productos, Long> {
    
}
