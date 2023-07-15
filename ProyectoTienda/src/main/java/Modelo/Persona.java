/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.Serializable;

public class Persona implements Serializable{
   private String nombre;
    private String paterno;
    private String materno;
    private String nacimiento;
    private String numDocumento;
    
      public Persona(String nombre, String paterno, String materno, String nacimiento, String numDocumento) {
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.nacimiento = nacimiento;
        this.numDocumento = numDocumento;
    }
    
    
     public String getNombre() {
        return nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getNumDocumento() {
        return numDocumento;
    }

    
    
    
    
    
    
    
    
    
    
    
}
