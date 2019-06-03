/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import conexion.Conexion;
import java.sql.*;

/**
 *
 * @author ubald
 */
public class Validacion extends Conexion{
    public String validacion(String correo, String contra, String puesto){
        PreparedStatement pst=null;
        ResultSet rs=null;
        try{
            String consulta="select categoria from registro where correo = ? and contra = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, correo);
            pst.setString(2, contra);
            rs =pst.executeQuery();
            if(rs.absolute(1)){
                puesto = rs.getString("tipo_usuario");
            }
        }catch (Exception e){
            System.out.println("Error" + e);
        }finally{
            try{
                if(getConexion() !=null) getConexion().close();
                if(pst !=null) pst.close();
                if(rs !=null)rs.close();
            }catch(Exception e){
                System.out.println("Error" + e);
            }
        }
        return null;
    }
    public boolean registrarCliente(String correo,String pass,String nombre, String ap, String am, int tel){
        PreparedStatement pst=null;
        try{
            String insertar ="insert into cliente (correo_cliente,contra,nombre_cliente,ap_cliente,am_cliente,tel_cliente) values (?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(insertar);
            pst.setString(1, correo);
            pst.setString(2, pass);
            pst.setString(3, nombre);
            pst.setString(4, ap);
            pst.setString(5, am);
            pst.setInt(6, tel);
            if(pst.executeUpdate() == 1){
                return true;
            }
        }catch(Exception ex){
            System.err.println("ERROR" + ex);
        }finally{
            try{
                if(getConexion() !=null) getConexion().close();
                if(pst != null) pst.close();
            }catch(Exception e){
                System.err.println("ERROR" + e);
            }
        }
        return false;
    }
}
