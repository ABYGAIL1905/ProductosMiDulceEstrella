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
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Blob;
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author daysi
 */

@Entity
@Getter
@Setter
@Table(name = "productos")
public class Productos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_producto")
    private Long id_producto;
    
     @Column(name = "codigo_producto")
    private String codigo_producto;
     
       @Column(name = "foto_producto",columnDefinition = "LONGBLOB")
    private byte[] foto_producto;
   // igamen para la base de datos
     @Column(name = "nombre_producto")
    private String nombre_producto;
     
      @Column(name = "unidad_caja")
    private int unidad_caja;
      
       @Column(name = "precio_distribuidor")
    private Double precio_distribuidor;
       
     
       @Column(name = "precio_mayor3")
    private Double precio_mayor3;  
       
       @Column(name = "precio_detallista")
    private Double precio_detallista;  
       
       
       @Column(name = "precio_venta_publico")
    private Double precio_venta_publico;
       
       
     @ManyToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id_categoria")
 
    private Categoria categoria;
     
        @Column(name = "estado_producto")
    private String estado_producto;

    public Productos() {
    }

        
    public Productos(Long id_producto, String codigo_producto, String nombre_producto, int unidad_caja, Double precio_distribuidor, Double precio_mayor3, Double precio_venta_publico, Categoria categoria) {
        this.id_producto = id_producto;
        this.codigo_producto = codigo_producto;
        this.nombre_producto = nombre_producto;
        this.unidad_caja = unidad_caja;
        this.precio_distribuidor = precio_distribuidor;
        this.precio_mayor3 = precio_mayor3;
        this.precio_venta_publico = precio_venta_publico;
        this.categoria = categoria;
    }
     
     
     
    
}
