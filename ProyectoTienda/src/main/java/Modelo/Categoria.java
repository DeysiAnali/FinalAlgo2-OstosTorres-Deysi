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
public class Categoria implements Serializable {
 private String nombre;
private boolean disponible;
    
public Categoria(String nombre) {
    this.nombre = nombre;
    this.disponible = true;
}

public String getNombre() {
    return nombre;
}

public boolean isDisponible() {
    return disponible;
}

public boolean habilitar() {
    if (!disponible) {
        disponible = true;
        return true;
    }
    
    return false;
}

public boolean deshabilitar(Producto[] productos) {
   for (Producto producto : productos) {
        if (producto != null && producto.getCategoria() == this) {
            return false;
        }
    }
    disponible = false;
    return true;
}













}
