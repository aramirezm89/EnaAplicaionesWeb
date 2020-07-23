/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Antonio
 */
public class Cliente {
     private String rut; // agregar rut para poder buscar, tambien agregar seter y geter
    private String nombre;
    private String apellido;
    

    public Cliente() {
    }

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
       
    }

    public Cliente(String rut, String nombre, String apellido) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellido = apellido;
 
 } 
    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
}
