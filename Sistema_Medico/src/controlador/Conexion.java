/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Bernardo
 */
public class Conexion {
    
/*Connection con;
    public Conexion(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Citas_Medicas","bernardo","bernardo123");
            //System.out.println("Se conecto");
        } catch (Exception e) {
            System.err.println("error:"+e);
        }        
    }
    public Connection getConnection(){
        return con;
    }
  }*/
    

 public static  Connection getConnection()
            {
                try
                    {
                        Class.forName("com.mysql.jdbc.Driver");
               
                        String myDB="jdbc:oracle:thin:@localhost:1521:XE";
                        Connection cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/Citas_Medicas","bernardo","bernardo123");
                        return cnx;
                        
                    }
                catch(SQLException e)
                        {
                            System.out.println(e.getMessage());
                            System.out.println("no hubo conexion");
                             
                        }
                catch (ClassNotFoundException ex) {
                     Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
                      System.out.println("tenemos erros");
                     }

                    return null;
                    
                    
                    
                    
                    
                    
           
                
                
            }
       
       
       public static void close(Connection con){
       
           try {
               con.close();
               
           } catch (Exception e) {
           
           }
       
       
       }
    
}

