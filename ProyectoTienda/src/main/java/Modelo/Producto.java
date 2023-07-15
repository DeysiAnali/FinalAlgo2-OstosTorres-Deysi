/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

/**
 *
 * @author Deysi
 */
public class Producto implements Serializable{
     
    private float precio;
    private String nombre;
    private int stock;
    private String marca;
    private Categoria categoria;

    public Producto(float precio, String nombre, int stock, String marca, Categoria categoria) {
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
        this.marca = marca;
        this.categoria = categoria;
    }     
            
      public float getPrecio() {
            return precio;
}  
public String getNombre() {
    return nombre;
}

public int getStock() {
    return stock;
}

public String getMarca() {
    return marca;
}

public Categoria getCategoria() {
    return categoria;
}

public boolean vender(int cantidad) {
    
    
    return false;
}
      
  public void reponer(int cantidad) {
   
}    
      
      
      
}
