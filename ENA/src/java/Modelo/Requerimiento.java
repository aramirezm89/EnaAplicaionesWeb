/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import BaseDatos.Conexion;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Antonio
 */
public class Requerimiento {

    private int id;
    private String gerencia;
    private String departamento;
    private String asignado;
    private String encargado;
    private String requerimiento;
    private String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public Requerimiento() {

    }

    public Requerimiento(String gerencia, String departamento, String asignado, String encargado, String requerimiento) {
        this.gerencia = gerencia.toUpperCase();
        this.departamento = departamento.toUpperCase();
        this.asignado = asignado.toUpperCase();
        this.encargado = encargado.toUpperCase();
        this.requerimiento = requerimiento.toUpperCase();

    }

    public Requerimiento(int id, String gerencia, String departamento, String asignado, String encargado, String requerimiento, String estado) {
        this.id = id;
        this.gerencia = gerencia.toUpperCase();
        this.departamento = departamento.toUpperCase();
        this.asignado = asignado.toUpperCase();
        this.encargado = encargado.toUpperCase();
        this.requerimiento = requerimiento.toUpperCase();
        this.estado = estado.toUpperCase();
    }

    public boolean registrarReq() {
        boolean ok = false;
        Conexion cnn = new Conexion();
        try {
            String query = "insert into REQ_requerimiento (gerencia , departamento , asignado ,encargado ,requerimiento ,estado ) values (?,?,?,?,?,?)";
            cnn.Conectar();
            PreparedStatement st = cnn.getConexion().prepareStatement(query);
            st.setString(1, gerencia);
            st.setString(2, departamento);
            st.setString(3, asignado);
            st.setString(4, encargado);
            st.setString(5, requerimiento);
            st.setString(6, "abierto");

            st.executeUpdate();
            ok = true;
            cnn.Desconectar();
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }
        return ok;
    }

    public ArrayList listarReq() {
        ArrayList lista = new ArrayList();
        Conexion cnn = new Conexion();
        String query = "Select * from REQ_requerimiento";
        try {

            cnn.Conectar();
            PreparedStatement st = cnn.getConexion().prepareStatement(query);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                lista.add(new Requerimiento(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)));

            }

        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }

        return lista;

    }

    public boolean EditarEstado(int id) {
        boolean ok = false;
        Conexion cnn = new Conexion();
        try {
            String query = "Update REQ_requerimiento set estado = 'cerrado' where id = ?";
            cnn.Conectar();
            PreparedStatement st = cnn.getConexion().prepareStatement(query);
            st.setInt(1, id);
            st.executeUpdate();
            ok = true;
            cnn.Desconectar();
        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }
        return ok;
    }

    public ArrayList listarReq2(String gerencia, String departamento, String asignado) {
        ArrayList lista2 = new ArrayList();
        Conexion cnn = new Conexion();
        String query = "Select * from REQ_requerimiento where gerencia = ? && departamento =? && asignado = ?";
        try {

            cnn.Conectar();
            PreparedStatement st = cnn.getConexion().prepareStatement(query);
            st.setString(1, gerencia);
            st.setString(2, departamento);
            st.setString(3, asignado);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                lista2.add(new Requerimiento(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7)));

            }

        } catch (ClassNotFoundException ex) {

        } catch (SQLException ex) {

        }

        return lista2;

    }

}
