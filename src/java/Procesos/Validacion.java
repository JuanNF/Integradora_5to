/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import PaqConexion.Conexion;
import java.sql.*;

/**
 *
 * @author ubald
 */
public class Validacion extends Conexion{
    String puesto;
    public boolean validacion(String correo, String contra){
        PreparedStatement pst=null;
        ResultSet rs=null;
        try{
            String consulta="select tipo_usuario from registro where correo = ? and contra = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, correo);
            pst.setString(2, contra);
            rs =pst.executeQuery();
            if(rs.absolute(1)){
                puesto = rs.getString("tipo_usuario");
                return true;
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
        return false;
    }
    public void verPuesto (/*String correo, String contra7*/){
        PreparedStatement pst=null;
        ResultSet rs=null;
        String correo = "nfuerzajuan@gmail.com";
        String contra = "123";
        try{
            String consulta="select tipo_usuario from registro where correo = ? and contra = ?";
            pst = getConexion().prepareStatement(consulta);
            pst.setString(1, correo);
            pst.setString(2, contra);
            rs =pst.executeQuery();
            while(rs.next()){
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
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}