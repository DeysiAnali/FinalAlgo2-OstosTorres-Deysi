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
public class ArregloVenta implements Serializable {
    private Venta[] ventas;
    private int numVentas;
    
     public ArregloVenta(int capacidad) {
     ventas = new Venta[capacidad];
        numVentas = 0;
     }
    
    
    public void agregarVenta(Venta venta) {
     ventas[numVentas] = venta;
        numVentas++;
     }
    
    
   public void eliminarVenta(Venta venta) { 
    
    int indice = buscarIndiceVenta(venta);
        if (indice != -1) {
            for (int i = indice; i < numVentas - 1; i++) {
                ventas[i] = ventas[i + 1];
            }
            ventas[numVentas - 1] = null;
            numVentas--;
        }
     }
    
    public Venta[] getVentas() {
    Venta[] ventasCopia = new Venta[numVentas];
        System.arraycopy(ventas, 0, ventasCopia, 0, numVentas);
        return ventasCopia;
    }
    
    public float calcularTotalVentas() {
        float total = 0;
        for (int i = 0; i < numVentas; i++) {
            total += ventas[i].getTotal();
        }
    return total;
    }
    
    private int buscarIndiceVenta(Venta venta) {
    float total = 0;
        for (int i = 0; i < numVentas; i++) {
            total += ventas[i].getTotal();
        }
    
    return -1;
    }
}
