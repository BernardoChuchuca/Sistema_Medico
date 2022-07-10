/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.Receta;

/**
 *
 * @author Usuario
 */
public class GestionReceta {
    
    public ArrayList<Receta> getListRecetas(){
    ArrayList<Receta> us=new ArrayList<>();
    Connection ctx=null;
        try {
             ctx=(Connection) Conexion.getConnection();
            Statement st=ctx.createStatement();
            ResultSet rs=st.executeQuery("SELECT *"
                    + " FROM RECETA ");
            while(rs.next()){
            Receta rec=new Receta();
            rec.setRec_id(rs.getInt("REC_ID"));
            rec.setRec_numero(rs.getInt("REC_NUMERO"));
            rec.setDosis(rs.getNString("REC_DOSIS"));
            rec.setFrecuencia(rs.getNString("REC_FRECUENCIA"));
         
            
            us.add(rec);
               
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
    
    

 public void InsertReceta(Receta receta) {
          Connection cnx=null;
    
        try {
            cnx= Conexion.getConnection();
           PreparedStatement pst=cnx.prepareStatement("INSERT INTO RECETA  VALUES(?,?,?,?,?)"); 
           pst.setInt(1, receta.getRec_id());
           pst.setInt(2, receta.getRec_numero());
           pst.setString(3, receta.getDosis());
           pst.setString(4, receta.getFrecuencia());
           pst.setInt(5, receta.getMedi_id());
           
//Camila Pasaca
            System.out.println("CAMILA NATHALY PASACA GAVILANEZ <3");
          
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
 
    public Receta getBuscarNumero(int num) {
        Receta cl = null;
        Connection cnx = null;
        try {
            cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM MEDICAMENTO WHERE REC_NUMERO = '" + num + "'");
            while (rs.next()) {
                cl = new Receta();
                cl.setRec_id(rs.getInt("REC_ID"));
                cl.setRec_numero(rs.getInt("REC_NUMERO"));
                cl.setDosis(rs.getString("REC_DOSIS"));
                cl.setFrecuencia(rs.getString("REC_FRECUENCIA"));
                cl.setMedi_id(rs.getInt("REC_MEDI_ID"));
                

            }
        } catch (SQLException e) {
            e.printStackTrace();

            System.out.println(e.getMessage());

            System.out.println("Error en buscar");
        } finally {
            Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");

        }
        return cl;
    }
 
}