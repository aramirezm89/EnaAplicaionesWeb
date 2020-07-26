/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.model;

import java.util.ArrayList;
import javax.ejb.Singleton;

/**
 *
 * @author Antonio
 */
@Singleton
public class Servicio implements ServicioLocal {

    private ArrayList<Cliente> lista = new ArrayList();

    public Servicio() {
        // agregar un rut en la lista

        lista.add(new Cliente("1-1", "Bro1", "componentes"));
        lista.add(new Cliente("1-2", "Bro2", "web"));
    }

    @Override
    public void addCliente(Cliente c) {

        lista.add(c);

    }

    @Override
    public ArrayList<Cliente> getCLientes() {
        return lista;
    }

    @Override
    public Cliente buscar(String rut) {
        for (Cliente c : lista) {
            if (c.getRut().equals(rut)) {
                return c;
            }
        }
        return null;

    }

    @Override
    public String eliminar(String r) {
        Cliente c = buscar(r);
        if (c == null) {
            return "rut no encontrado";
        } else {
            lista.remove(c);
            return "cliente eliminado";
        }
    }

    @Override
    public String actualizar(String rut, String nombre, String apellido) {
      
        Cliente c = buscar(rut);
        
        if (c==null) {
          return "rut no encontrado" ;
        }else{
            c.setNombre(nombre);
            c.setApellido(apellido);
            return "Cliente actualizado";
        }
        
        
 
    } 

}
