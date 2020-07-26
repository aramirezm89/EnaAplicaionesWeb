/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model;

import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author Antonio
 */
@Local
public interface ServicioLocal {

    void addCliente(Cliente c);

    ArrayList <Cliente> getCLientes();

    Cliente buscar(String rut);

    String eliminar(String r);

    String actualizar(String rut, String nombre, String apellido);

  
    
}
