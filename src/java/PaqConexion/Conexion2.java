package PaqConexion;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Conexion2 {
    private Connection conexión=null;
    private Statement sentenciaSQL=null;
    
    public void Conectar(){
        try{
           String controlador="com.mysql.jdbc.Driver";   
           Class.forName(controlador).newInstance();
           conexión=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/integradora","root","");
           sentenciaSQL=getConexión().createStatement();
           System.out.println("Exito");
           
        } catch (ClassNotFoundException e){
            System.out.println("No se pudo cargar el coontrolador: "+e.getMessage());
        } catch (SQLException e){
            System.out.println("Excepción SQL: "+e.getMessage());
        } catch (InstantiationException e) {
                System.out.println("Objeto no creado. "+e.getMessage());
        } catch (IllegalAccessException e) {
                System.out.println("Acceso ilegal. "+e.getMessage());
        }
    }
        public void cerrar(){
            try{
                if(getSentenciaSQL() != null)
                    getSentenciaSQL().close();
                if(getConexión() != null)
                    getConexión().close();
            }catch(SQLException ignorada){}
                
        }

    public Statement getSentenciaSQL() {
       return sentenciaSQL;
    }

    public Connection getConexión() {
        return conexión;
    }
}
