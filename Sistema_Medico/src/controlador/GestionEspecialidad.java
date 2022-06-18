/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

//import Modelo.Categoria;
import modelo.Especialidad;
import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;


/**
 *
 * @author Bryan
 */
public class GestionEspecialidad {
    
    public void InsertarEspecialidad(Especialidad esp) {
         Connection cnx=null;
    
        try {
            cnx= Conexion.getConnection();
           PreparedStatement pst=cnx.prepareStatement("INSERT INTO  ESPECIALIDAD (ESP_ID,"
                   + "ESP_NOMBRE)" 
                    + " VALUES(?,?)"); 
           pst.setInt(1,esp.getEsp_id());
           pst.setString(2,esp.getEsp_nombre());
           
          
          
           pst.execute();
            
        }
            
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
       }finally{
        Conexion.close(cnx);
        System.err.println("CONEXION CERRADAz");
            
        }
}
    public ArrayList<Especialidad> getListEspecialidad(){
        //Producto pro=new Producto();
    ArrayList<Especialidad> espl=new ArrayList<>();
    Connection ctx=null;
        try {
             ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT * "
                    + " FROM ESPECIALIDAD ");
            while(rs.next()){
            Especialidad esp=new Especialidad();
            esp.setEsp_id(rs.getInt("ESP_ID"));
            esp.setEsp_nombre(rs.getString("ESP_NOMBRE").trim());
            
            
           
            espl.add(esp);
               
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
            System.out.println("Error en Listado");
       }finally{
        Conexion.close(ctx);
            //System.err.println("CONEXION CERRADA");
            
        }
    return espl;
}
    
    
    public void ActualizarEspecialidad(Especialidad esp){
        
         Connection cnx=null;
        try {
             cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement(" UPDATE ESPECIALIDAD SET ESP_ID=?,"
                   + "ESP_NOMBRE=? WHERE ESP_ID= '"+esp.getEsp_id()+"'");
            
            pst.setInt(1,esp.getEsp_id());
           pst.setString(2,esp.getEsp_nombre());
         
           pst.executeQuery();
          
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
     }
     
     public Especialidad getBuscarEspecialidad(int espnom){
      Especialidad esp=null;
      Connection cnx=null;
       try {
             cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM ESPECIALIDAD WHERE ESP_NOMBRE = '"+espnom+"'");
            while (rs.next()) {
            esp=new Especialidad();
             
            esp.setEsp_id(rs.getInt("ESP_ID"));
            esp.setEsp_nombre(rs.getString("ESP_NOMBRE").trim());
           
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
    return esp;
    }
     
     public void EliminarEspecialidad(int espId){
         Connection cnx=null;
        try {
             cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM ESPECIALIDAD  "
                    + " WHERE ESP_ID=?");
            pst.setInt(1,espId);
            pst.executeQuery();
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar datos");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
     }
     
     
     public Especialidad getBuscarEspecialidadNombre(String espnombre){
      Especialidad esp=null;
      Connection cnx=null;
       try {
            cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM ESPECIALIDAD WHERE  ESP_NOMBRE = '"+espnombre+"'");
            while (rs.next()) {
            esp=new Especialidad();
             
            esp.setEsp_id(rs.getInt("ESP_ID"));
            esp.setEsp_nombre(rs.getString("ESP_NOMBRE").trim());
            
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
      }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
    return esp;
    }
    
    
}
