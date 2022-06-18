/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bernardo
 */
public class Especialidad {
    
    private int esp_id;
    private String esp_nombre;

    public Especialidad(int esp_id, String esp_nombre) {
        this.esp_id = esp_id;
        this.esp_nombre = esp_nombre;
    }

    public Especialidad() {
    }
    
    
    

    public void setEsp_id(int esp_id) {
        this.esp_id = esp_id;
    }

   
    public int getEsp_id() {
        return esp_id;
    }

    public void setEsp_nombre(String esp_nombre) {
        this.esp_nombre = esp_nombre;
    }

    public String getEsp_nombre() {
        return esp_nombre;
    }

    
    
    
}
