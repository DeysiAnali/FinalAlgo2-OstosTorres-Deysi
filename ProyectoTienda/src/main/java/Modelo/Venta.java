/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Deysi
 */
public class Venta implements Serializable{
    private float total;
    private Date fecha;
    private boolean estado;
    private Producto[] productos;

     public Venta(float total, Date fecha, boolean estado) {
        this.total = total;
        this.fecha = fecha;
        this.estado = estado;
        this.productos = new Producto[0];
    }
    
   public void agregarProducto(Producto producto) {  
     
     
   }

    public boolean eliminarProducto(Producto producto, int cantidad) {   
     
     
     
     
      return false;
      }
    
    public float validarCarrito() {
        
        return total;
    }
     
     
}
