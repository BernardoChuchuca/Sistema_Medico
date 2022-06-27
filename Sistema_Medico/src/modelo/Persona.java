/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author Bernardo
 */
public class Persona {
    
    
    private int per_id,esp_id;
    private String per_cedula,per_nombre,per_apellido,per_direccion,per_telefono,per_email,per_rol,per_genero,per_clave;
    private Date per_fec_nac;

    public Persona() {
    }

    public Persona(int per_id, int esp_id, String per_cedula, String per_nombre, String per_apellido, String per_direccion, String per_telefono, String per_email, String per_rol, String per_genero, String per_clave, Date per_fec_nac) {
        this.per_id = per_id;
        this.esp_id = esp_id;
        this.per_cedula = per_cedula;
        this.per_nombre = per_nombre;
        this.per_apellido = per_apellido;
        this.per_direccion = per_direccion;
        this.per_telefono = per_telefono;
        this.per_email = per_email;
        this.per_rol = per_rol;
        this.per_genero = per_genero;
        this.per_clave = per_clave;
        this.per_fec_nac = per_fec_nac;
    }

    public void setEsp_id(int esp_id) {
        this.esp_id = esp_id;
    }

    public int getEsp_id() {
        return esp_id;
    }

   

    
    public void setPer_clave(String per_clave) {
        this.per_clave = per_clave;
    }

    public String getPer_clave() {
        return per_clave;
    }

    
    
    
    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

    public String getPer_cedula() {
        return per_cedula;
    }

    public void setPer_cedula(String per_cedula) {
        this.per_cedula = per_cedula;
    }

    public String getPer_nombre() {
        return per_nombre;
    }

    public void setPer_nombre(String per_nombre) {
        this.per_nombre = per_nombre;
    }

    public String getPer_apellido() {
        return per_apellido;
    }

    public void setPer_apellido(String per_apellido) {
        this.per_apellido = per_apellido;
    }

    public String getPer_direccion() {
        return per_direccion;
    }

    public void setPer_direccion(String per_direccion) {
        this.per_direccion = per_direccion;
    }

    public String getPer_telefono() {
        return per_telefono;
    }

    public void setPer_telefono(String per_telefono) {
        this.per_telefono = per_telefono;
    }

    public String getPer_email() {
        return per_email;
    }

    public void setPer_email(String per_email) {
        this.per_email = per_email;
    }

    public String getPer_rol() {
        return per_rol;
    }

    public void setPer_rol(String per_rol) {
        this.per_rol = per_rol;
    }

    public String getPer_genero() {
        return per_genero;
    }

    public void setPer_genero(String per_genero) {
        this.per_genero = per_genero;
    }

    public Date getPer_fec_nac() {
        return per_fec_nac;
    }

    public void setPer_fec_nac(Date per_fec_nac) {
        this.per_fec_nac = per_fec_nac;
    }

    @Override
    public String toString() {
        return "Persona{" + "per_id=" + per_id + ", esp_id=" + esp_id + ", per_cedula=" + per_cedula + ", per_nombre=" + per_nombre + ", per_apellido=" + per_apellido + ", per_direccion=" + per_direccion + ", per_telefono=" + per_telefono + ", per_email=" + per_email + ", per_rol=" + per_rol + ", per_genero=" + per_genero + ", per_clave=" + per_clave + ", per_fec_nac=" + per_fec_nac + '}';
    }

   
    
    public int calcularEdad(){
    
    
    
    
    return 0;
    }
    
   
    
}
