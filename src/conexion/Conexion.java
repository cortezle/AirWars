/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author danie
 */
public class Conexion {
    //Declarando variables para el manejo de JDBC
    private String user;
    private String pass;
    private String driver;
    private String url;
    
    //Declarando la variabe de tipo Conexion
    public Connection cnx;

    public static Conexion instance;
    
    public synchronized static Conexion conectar(){
        if(instance==null){
            return new Conexion();
        }
        return instance;
    }
    
    //Constructor de la clase Conexion
    private Conexion(){
        //Cargamos las credenciales;
        cargarCredenciales();
        
        try {
            //abrimos el canal para la comunicacion
            Class.forName(this.driver);
            cnx = (Connection) DriverManager.getConnection(this.url, this.user, this.pass);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    private void cargarCredenciales(){
        user = "root";
        pass = "";
        driver = "com.mysql.jdbc.Driver";
        url = "jdbc:mysql://localhost:3306/airwars";
    }

    public Connection getCnx() {
        return cnx;
    }
    
    public void cerrarConexion(){
        instance = null;
    }
    
}
