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
public class Detalle implements Serializable{
    
private int cantidad;
private float precio;
private float descuento;
private float total;
    
    public Detalle(int cantidad, float precio, float descuento) {
    this.cantidad = cantidad;
    this.precio = precio;
    this.descuento = descuento;
    this.total = calcularTotal();
}

public int getCantidad() {
    return cantidad;
}

public float getPrecio() {
    return precio;
}

public float getDescuento() {
    return descuento;
}

public float getTotal() {
    return total;
}

private float calcularTotal() {
    
     return cantidad * precio * (1 - descuento);
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
