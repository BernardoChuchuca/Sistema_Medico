/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import controlador.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.Persona;



/**
 *
 * @author Bernardo
 */
public class GestionPersonas {
    public ArrayList<Persona> getListPersonas(){
     
    ArrayList<Persona> us=new ArrayList<>();
    Connection ctx=null;
        try {
             ctx=Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT *"
                    + " FROM PERSONA ");
            while(rs.next()){
            Persona per=new Persona();
            per.setPer_id(rs.getInt("PER_ID"));
            
            per.setPer_cedula(rs.getString("PER_CEDULA").trim());
            per.setPer_nombre(rs.getString("PER_NOMBRE").trim());
            per.setPer_apellido(rs.getString("PER_APELLIDO").trim());
            per.setPer_direccion(rs.getString("PER_DIRECCION").trim());
            per.setPer_telefono(rs.getString("PER_TELEFONO").trim());
             per.setPer_rol(rs.getString("PER_ROL").trim());
            per.setPer_fec_nac(rs.getDate("PER_FEC_NAC"));
            per.setPer_email(rs.getString("PER_EMAIL"));
          per.setPer_genero(rs.getString("PER_GENERO").trim());
            per.setPer_clave(rs.getString("PER_CLAVE").trim());
            per.setEsp_id(rs.getInt("ESP_ID"));
            
           
            
            
            
            us.add(per);
               
            }
        } catch (SQLException ex) {
             System.out.println(ex.getMessage());
             
            System.out.println("Error en Listado");
        }finally{
        Conexion.close(ctx);
            //System.err.println("CONEXION CERRADA P");
            
        }
    return us;
    }
    
     public void InsertPersona(Persona persona) {
          Connection cnx=null;
    
        try {
            cnx= Conexion.getConnection();
           PreparedStatement pst=cnx.prepareStatement("INSERT INTO PERSONA  VALUES(?,?,?,?,?,?,?,?,?,?,?,?)"); 
           pst.setInt(1,persona.getPer_id());
           pst.setString(2,persona.getPer_cedula());
           pst.setString(3,persona.getPer_nombre());
           pst.setString(4,persona.getPer_apellido());
           pst.setString(5,persona.getPer_direccion());
           pst.setString(6,persona.getPer_telefono());
           pst.setString(7,persona.getPer_email());
           pst.setString(8, persona.getPer_rol());
           pst.setString(9,persona.getPer_genero());
           pst.setDate(10, persona.getPer_fec_nac());
           pst.setString(11,persona.getPer_clave());
           pst.setInt(12,persona.getEsp_id());
           
          
          
          
           pst.execute();
            
        }
            
        catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar datos");
  }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
}
    /*public Persona getBuscarCliente(String codCli){
    Persona cl=null;
       try {
            Connection cnx = Conexion.getConnection();z
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM MER_PERSONAS WHERE PER_ID = '"+codCli+"'");
            while (rs.next()) {
             cl=new Persona();
             cl.setPer_id(rs.getInt("PER_ID"));
             cl.setPer_cedula(rs.getString("PER_CEDULA"));
             cl.setPer_nombre(rs.getString("PER_NOMBRE"));
             cl.setPer_apellido(rs.getString("PER_APELLIDO"));
             cl.setPer_direccion(rs.getString("PER_DIRECCION"));
             cl.setPer_telefono(rs.getString("PER_TELEFONO"));
             cl.setPer_edad(rs.getInt("PER_EDAD"));
            
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }
    return cl;
    }*/
    public Persona getBuscarCedula(String ced){
    Persona cl=null;
    Connection cnx=null;
       try {
             cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM PERSONA WHERE PER_CEDULA = '"+ced+"'");
            while (rs.next()) {
             cl=new Persona();
             cl.setPer_id(rs.getInt("PER_ID"));
             cl.setPer_cedula(rs.getString("PER_CEDULA"));
             cl.setPer_nombre(rs.getString("PER_NOMBRE"));
             cl.setPer_apellido(rs.getString("PER_APELLIDO"));
             cl.setPer_direccion(rs.getString("PER_DIRECCION"));
             cl.setPer_telefono(rs.getString("PER_TELEFONO"));
             cl.setPer_fec_nac(rs.getDate("PER_FEC_NAC"));
             cl.setPer_email(rs.getString("PER_EMAIL"));
             cl.setPer_rol(rs.getString("PER_ROL"));
             cl.setPer_genero(rs.getString("PER_GENERO"));
             cl.setPer_clave(rs.getString("PER_CLAVE"));
             cl.setEsp_id(rs.getInt("ESP_ID"));
             
            
            }
        } catch (SQLException  e ) {
            e.printStackTrace();
            
            System.out.println(e.getMessage());
            
            System.out.println("Error en buscar");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
    return cl;
    }
    
    
    
    
    public void ActualizarPersona( Persona persona){
          Connection cnx=null;
        try{
           cnx= Conexion.getConnection();
            PreparedStatement pst=cnx.prepareStatement(" UPDATE PERSONA SET "
            +" PER_ID=?,PER_CEDULA=?,PER_NOMBRE=?,PER_APELLIDO=?,PER_DIRECCION=?,PER_TELEFONO=?,PER_EMAIL=?,PER_ROL=?,PER_GENERO=?,PER_FEC_NAC=?,PER_CLAVE=?,ESP_ID=? WHERE PER_CEDULA='"+persona.getPer_cedula()+"'");
            //pst.setInt(1,persona.getPer_id());
         pst.setInt(1,persona.getPer_id());
           pst.setString(2,persona.getPer_cedula());
           pst.setString(3,persona.getPer_nombre());
           pst.setString(4,persona.getPer_apellido());
           pst.setString(5,persona.getPer_direccion());
           pst.setString(6,persona.getPer_telefono());
           pst.setString(7,persona.getPer_email());
           pst.setString(8, persona.getPer_rol());
           pst.setString(9,persona.getPer_genero());
           pst.setDate(10, persona.getPer_fec_nac());
          pst.setString(11,persona.getPer_clave());
          pst.setInt(12,persona.getEsp_id());
           pst.execute();
           
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
             System.out.println("Error en Actualizar Dato mmmmmmmmmmm");
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
    }
    
    public void EliminarPersona(String cedula){
        
        Connection cnx=null;
        try{
             cnx= Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM PERSONA "
            +" WHERE PER_CEDULA=?");
            pst.setString(1, cedula);
            pst.execute();
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar Datos....................");
            
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
    }
    
    
    
    
    public int  perids(){
       ArrayList<Persona>list1=new GestionPersonas().getListPersonas();
       int num=list1.size()-1;
       int id=list1.get(num).getPer_id()+1;
        

      return id;
     }
    
}
