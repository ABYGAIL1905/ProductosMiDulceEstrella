/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProyectoGolosinas.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author daysi
 */

@Entity
@Table(name = "empresa")
@Getter
@Setter
public class Empresa implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @Column(name = "id_empresa")
    private Long id_empresa;
     @Column(name = "nombre_empresa")
    private String nombre_empresa;
     
     @Column(name = "ruc_empresa")
    private String ruc_empresa;
    
    
}
