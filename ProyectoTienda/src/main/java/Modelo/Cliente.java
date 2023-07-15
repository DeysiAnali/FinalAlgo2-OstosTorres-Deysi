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
public class Cliente extends Persona implements Serializable {
    private int celular;
    private float dinero;

    public Cliente(String nombre, String paterno, String materno, String nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
    }

    public boolean pagar() {
       
        return true;
    }

    public boolean recargarDinero() {
    
        return true;
    }

    Object getEmail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Object getPassword() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
