/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Info;
import conexion.Conexion;
import interfaces.metodos;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;


/**
 *
 * @author danie
 */
public class InfoDAO implements metodos<Info>{

    //Creando consultas
    private static final String SQL_INSERT = "INSERT INTO info (nombre) VALUES (?,?)";
    private static final String SQL_READALL = "SELECT * FROM info";
    private static final Conexion con = Conexion.conectar();
    
    @Override
    public boolean create(Info g) {
        //Preparamos el PreparedStatement
        PreparedStatement ps;
        try {
            ps = con.getCnx().prepareStatement(SQL_INSERT);
            ps.setString(1, g.getNombre());
            ps.setInt(2, g.getPuntaje());
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

    @Override
    public Info read(Object key) {
       
        return null;
    }

    @Override
    public ArrayList<Info> readAll() {
        ArrayList<Info> all= new ArrayList();
        Statement s;
        ResultSet rs;
        try {
            s = con.getCnx().prepareStatement(SQL_READALL);
            rs = s.executeQuery(SQL_READALL);
            while(rs.next()){
                all.add(new Info(rs.getString(1),rs.getInt(2)));
            }
            rs.close();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }finally{
            con.cerrarConexion();
        }
        return all;
    }
     
}
