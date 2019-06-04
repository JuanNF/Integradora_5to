/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Procesos;

import PaqConexion.Conexion;
import java.sql.PreparedStatement;

/**
 *
 * @author ubald
 */
public class Planes extends Conexion{
    public boolean registrarPlan(String nombre,String descripcion,int costo,String tiempo,String resultados){
        PreparedStatement pst=null;
        try{
            String insertar ="insert into plandietas (id_dieta ,id_Nutriologo, nombre,descripcion,costo,tiempo,resultados) values (null,?,?,?,?,?,?)";
            pst = getConexion().prepareStatement(insertar);
            pst.setInt(1, 1);
            pst.setString(2, nombre );
            pst.setString(3, descripcion);
            pst.setInt(4, costo);
            pst.setString(5, tiempo);
            pst.setString(6, resultados);            
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
