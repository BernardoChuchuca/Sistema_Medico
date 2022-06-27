/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.util.Date;

/**
 *
 * @author Bernardo
 */
public class Paciente  extends Persona{
    
    private int id;
    private String genero;

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Paciente{" + "id=" + id + ", genero=" + genero + '}';
    }
    
    

    
    
   
   
    
    
    
}
