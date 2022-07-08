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
import modelo.Citas_Medicas;
import modelo.Medicamento;
import modelo.Turno;

/**
 *
 * @author Usuario
 */
public class GestionConsulta_Medica {

    public ArrayList<Citas_Medicas> getListCitas() {

        ArrayList<Citas_Medicas> med = new ArrayList<>();
        Connection ctx = null;
        try {
            ctx = (Connection) Conexion.getConnection();
            Statement st = ctx.createStatement();
            ResultSet rs = st.executeQuery("SELECT *"
                    + "FROM CITA_MEDICA");
            while (rs.next()) {
                Citas_Medicas med1 = new Citas_Medicas();
                
                med1.setId_cita(rs.getInt("CIT_ID"));
                med1.setId_turno(rs.getInt("TUR_ID"));
                med1.setCit_estado(rs.getString("CIT_ESTADO"));
                med1.setCit_evaluacion(rs.getString("CIT_EVALUACION"));
                med1.setCit_observacion(rs.getString("CIT_OBSERVACION"));
                med1.setId_receta(rs.getInt("REC_ID"));
               

                med.add(med1);

            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

            System.out.println("Error en Listado");
        } finally {
            Conexion.close(ctx);
        }
        return med;

    }

    public void IngresarCita(Citas_Medicas medicamento) {
        Connection cnx = null;

        try {
            cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO CITA_MEDICA  VALUES(?,?,?,?,?,?)");
            pst.setInt(1, medicamento.getId_cita());
            pst.setString(2, medicamento.getCit_estado());
            pst.setString(3, medicamento.getCit_evaluacion());
            pst.setString(4, medicamento.getCit_observacion());
             pst.setInt(5, medicamento.getId_turno());
              pst.setInt(6, medicamento.getId_receta());
             
          

           

            pst.execute();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Ingresar Datos");
        } finally {
            Conexion.close(cnx);
            System.out.println("Conexion Cerrada");
        }
    }

    public Turno getBuscarTurno(int cod) {
       Turno cl = null;
        Connection cnx = null;
        try {
            cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM TURNO WHERE PER_ID = '" + cod + "'");
            while (rs.next()) {
                cl = new Turno();
                cl.setTur_id(rs.getInt("TUR_ID"));
                

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

    public void ActualizarPersona(Medicamento medicamento) {
        Connection cnx = null;
        try {
            cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement(" UPDATE PERSONA SET "
                    + " MED_ID=?,MED_CODIGO_BARRA=?,MED_MARCA=?,MED_DESCRIPCION=?,MED_CANTIDAD=?,MED_UNIDAD_MEDIDA=? WHERE MED_CODIGO_BARRA='" + medicamento.getMed_codigo_barra() + "'");
            //pst.setInt(1,persona.getPer_id());
            pst.setInt(1, medicamento.getMed_id());
            pst.setString(2, medicamento.getMed_codigo_barra());
            pst.setString(3, medicamento.getMed_marca());
            pst.setString(4, medicamento.getMed_descripcion());
            pst.setInt(5, medicamento.getMed_cantidad());
            pst.setString(6, medicamento.getMed_unidad_medida());
            pst.setInt(7, medicamento.getMed_stock());
            pst.execute();

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            System.out.println("Error en Actualizar Dato mmmmmmmmmmm");
        } finally {
            Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");

        }
    }
        public void EliminarMedicamento(String codigo){
        
        Connection cnx=null;
        try{
             cnx= Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("DELETE FROM PERSONA "
            +" WHERE PER_CODIGO_BARRA=?");
            pst.setString(1, codigo);
            pst.execute();
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
            System.out.println("Error en Eliminar Datos....................");
            
        }finally{
        Conexion.close(cnx);
            System.err.println("CONEXION CERRADA");
            
        }
        
      }    
    public boolean comparar(int num,ArrayList<Integer>list){
      boolean res=false;
        for (int i = 0; i < list.size(); i++) {
             if(list.get(i)==num){
                res=true;
                break;
            
             
             }
            
        }
      return res;
    
    }
    
    /*public int  perids(){
       ArrayList<Medicamento>list1=new GestionTurno().getListMedicamentos();
       int num=list1.size()-1;
       int id=list1.get(num).getMed_id()+1;
        

      return id;
     }*/
    
    }
