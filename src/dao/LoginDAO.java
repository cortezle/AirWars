/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Login;
import conexion.Conexion;
import interfaces.metodos;


/**
 *
 * @author danie
 */
public class LoginDAO implements metodos<Login>{

    //Creando consultas
    private static final String SQL_INSERT = "INSERT INTO prueba (nombre) VALUES (?)";
    private static final Conexion con = Conexion.conectar();
    
    @Override
    public boolean create(Login g) {
        //Preparamos el PreparedStatement
        PreparedStatement ps;
        try {
            ps = con.getCnx().prepareStatement(SQL_INSERT);
            ps.setString(1, g.getNombre());
            if(ps.executeUpdate() > 0){
                return true;
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally{
            con.cerrarConexion();
        }
        return false;  
        
    }
     
}
