package PaqConexion;

import java.sql.*;

public class Conexion {
	private Connection con = null;
	public Conexion() {
		try {
                    Class.forName("com.mysql.jdbc.Driver").newInstance();
                    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/integradora","root","");
		} catch 
                    (InstantiationException | 
                    IllegalAccessException
                    | ClassNotFoundException | 
                    SQLException e) {
			// TODO Auto-generated catch block
                    System.out.println("Error base "+e);
		}//catch
	}//constructor
	
	public Connection getConexion(){
		return con;
	}
	
	public void cerrarConexion(){
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//catch
	}//metodo
}//clase
