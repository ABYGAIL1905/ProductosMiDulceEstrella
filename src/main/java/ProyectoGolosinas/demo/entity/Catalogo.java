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
import lombok.Getter;
import lombok.Setter;

/**
 *
 * @author daysi
 */
@Entity
@Getter
@Setter
@Table(name = "catalogo")
public class Catalogo implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_catalogo")
    private Long id_catalogo;
       
       @Column(name = "nombre_catalogo")
    private String nombre_catalogo;
    
        @ManyToOne
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
 
    private Productos productos;
        
        //Para guardar un array list no borrar
          @Column(name = "visible")
    private boolean visible;

    public Catalogo() {
    }
        
        
    
}
