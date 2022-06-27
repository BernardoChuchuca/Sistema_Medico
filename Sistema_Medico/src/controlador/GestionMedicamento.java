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
import modelo.Medicamento;

/**
 *
 * @author Usuario
 */
public class GestionMedicamento {

    public ArrayList<Medicamento> getListMedicamentos() {

        ArrayList<Medicamento> med = new ArrayList<>();
        Connection ctx = null;
        try {
            ctx = (Connection) Conexion.getConnection();
            Statement st = ctx.createStatement();
            ResultSet rs = st.executeQuery("SELECT *"
                    + "FROM MEDICAMENTO");
            while (rs.next()) {
                Medicamento med1 = new Medicamento();
                med1.setMed_id(rs.getInt("MED_ID"));
                med1.setMed_codigo_barra(rs.getString("MED_CODIGO_BARRA").trim());
                med1.setMed_marca(rs.getString("MED_MARCA").trim());
                med1.setMed_descripcion(rs.getString("MED_DESCRIPCION").trim());
                med1.setMed_cantidad(rs.getInt("MED_CANTIDAD"));
                med1.setMed_unidad_medida(rs.getString("MED_UNIDAD_MEDIDA").trim());
                med1.setMed_stock(rs.getInt("MED_STOCK"));

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

    public void IngresarMedicamento(Medicamento medicamento) {
        Connection cnx = null;

        try {
            cnx = Conexion.getConnection();
            PreparedStatement pst = cnx.prepareStatement("INSERT INTO MEDICAMENTO  VALUES(?,?,?,?,?,?,?)");
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
            System.out.println("Error en Ingresar Datos");
        } finally {
            Conexion.close(cnx);
            System.out.println("Conexion Cerrada");
        }
    }

    public Medicamento getBuscarCodigoBarra(String cod) {
        Medicamento cl = null;
        Connection cnx = null;
        try {
            cnx = Conexion.getConnection();
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery("SELECT * "
                    + "   FROM MEDICAMENTO WHERE MED_CODIGO_BARRA = '" + cod + "'");
            while (rs.next()) {
                cl = new Medicamento();
                cl.setMed_id(rs.getInt("MED_ID"));
                cl.setMed_codigo_barra(rs.getString("MED_CODIGO_BARRA"));
                cl.setMed_marca(rs.getString("MED_MARCA"));
                cl.setMed_descripcion(rs.getString("MED_DESCRIPCION"));
                cl.setMed_cantidad(rs.getInt("MED_CANTIDAD"));
                cl.setMed_unidad_medida(rs.getString("MED_UNIDAD_MEDIDA"));
                cl.setMed_stock(rs.getInt("MED_STOCK"));

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
    
    public int  perids(){
       ArrayList<Medicamento>list1=new GestionMedicamento().getListMedicamentos();
       int num=list1.size()-1;
       int id=list1.get(num).getMed_id()+1;
        

      return id;
     }
    
    }
