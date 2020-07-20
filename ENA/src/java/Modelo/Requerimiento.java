/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import BaseDatos.Conexion;

/**
 *
 * @author Antonio
 */
public class Requerimiento {
 
 private String gerencia;
 private String departamento;
 private String asignado;
 private String encargado;
 private String requerimiento;
 private String estado;   

    public String getGerencia() {
        return gerencia;
    }

    public void setGerencia(String gerencia) {
        this.gerencia = gerencia;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getAsignado() {
        return asignado;
    }

    public void setAsignado(String asignado) {
        this.asignado = asignado;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getRequerimiento() {
        return requerimiento;
    }

    public void setRequerimiento(String requerimiento) {
        this.requerimiento = requerimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    
    
       public boolean registrarProducto() {
        boolean ok = false;
        Conexion cnn = new Conexion();
        try {
            String query = "insert into REQ_Gerencia (gerencia , departamento , asignado ,encargado ,requerimiento ,estado ) values (?,?,?,?,?,?)";
            cnn.Conectar();
            PreparedStatement st = cnn.getConexion().prepareStatement(query);
            st.setString(1, gerencia);
            st.setString(2, departamento);
            st.setString(3, asignado);
            st.setString(4,encargado);
            st.setString(5,requerimiento);
            st.setString(6,"abierto");
            
            st.executeUpdate();
            ok = true;
            cnn.Desconectar();
        } catch (ClassNotFoundException ex) {
           
        }catch(SQLException ex){
            
        }
       return ok;
    }
}


   
    