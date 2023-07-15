/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;
import java.util.Date;

public class Tienda implements Serializable{
    
     private String nombre;
    private String ruc;
    private String direccion;
    private Cliente[] clientes;
    private Categoria[] categorias;
    private Producto[] productos;
    
    public Tienda(String nombre, int maxClientes, int maxCategorias, int maxProductos) {
       this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
        this.clientes = new Cliente[0];
        this.categorias = new Categoria[0];
        this.productos = new Producto[0];
    
    }
    
     public void agregarCliente(Cliente cliente) {
    
    
        }
    
     public void agregarCategoria(Categoria categoria) {
    
     }
    
     public void agregarProducto(Producto producto) {
    
           }
         
   public Producto[] buscarProductoPorCategoria(Categoria categoria) {
      
    return   ;
   }
   
   public Producto[] buscarProductoPorNombre(String nombre) {
       
       return   ; 
   }
   
    public Persona autenticar(String email, String password) {
        
   
     return   ;
    }
   
   
   }