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

    public Venta(float total) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
   public void agregarProducto(Producto producto) {  
      Producto[] nuevosProductos = new Producto[productos.length + 1];
        System.arraycopy(productos, 0, nuevosProductos, 0, productos.length);
        nuevosProductos[productos.length] = producto;
        productos = nuevosProductos;
     
   }

    public boolean eliminarProducto(Producto producto, int cantidad) {   
      int index = -1;
        for (int i = 0; i < productos.length; i++) {
            if (productos[i] == producto) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            Producto[] nuevosProductos = new Producto[productos.length - cantidad];
            int newIndex = 0;
            for (int i = 0; i < productos.length; i++) {
                if (i < index || i >= index + cantidad) {
                    nuevosProductos[newIndex] = productos[i];
                    newIndex++;
                }
            }
            productos = nuevosProductos;
            return true;
        }
      return false;
      }
    
    public float validarCarrito() {
        
        return total;
    }
     public float getTotal() {
        return total;
    }
     
}
