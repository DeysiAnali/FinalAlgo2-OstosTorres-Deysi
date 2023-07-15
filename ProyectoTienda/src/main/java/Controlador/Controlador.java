/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.ArregloVenta;
import Modelo.Categoria;
import Modelo.Cliente;
import Modelo.Producto;
import Modelo.Tienda;
import Modelo.Venta;
import java.util.Date;

/**
 *
 * @author Deysi
 */
public class Controlador {
    private Tienda tienda;
    private ArregloVenta arregloVenta;

    public Controlador(Tienda tienda) {
        this.tienda = tienda;
        this.arregloVenta = new ArregloVenta(100); 
    }
    
     public void agregarCliente(String nombre, String paterno, String materno, String nacimiento, String numDocumento,
                               int celular, float dinero) {
       
    }
 public void agregarCategoria(String nombre) {
        Categoria categoria = new Categoria(nombre);
        tienda.agregarCategoria(categoria);
    }

    public void agregarProducto(float precio, String nombre, int stock, String marca, Categoria categoria) {
        Producto producto = new Producto(precio, nombre, stock, marca, categoria);
        tienda.agregarProducto(producto);
    }
    
    public void agregarVenta(float total, Date fecha, boolean estado, Producto[] productos) {
    
     }
    
      public void eliminarVenta(Venta venta) {
        
    }
public Venta[] getVentas() {
    return arregloVenta.getVentas();
}
        
    
 
    
    
    
    
    
    
    
}
