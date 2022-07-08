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
public class Turno {
    
    private int tur_id;
    private int tur_per_id;
    private int tur_med_id;
    private int tur_num;
    private Date tur_fecha;

    public Turno(int tur_id, int tur_per_id, int tur_med_id, int tur_num, Date tur_fecha) {
        this.tur_id = tur_id;
        this.tur_per_id = tur_per_id;
        this.tur_med_id = tur_med_id;
        this.tur_num = tur_num;
        this.tur_fecha = tur_fecha;
    }

    public Turno() {
    }
    
    

    public int getTur_id() {
        return tur_id;
    }

    public void setTur_id(int tur_id) {
        this.tur_id = tur_id;
    }

    public int getTur_per_id() {
        return tur_per_id;
    }

    public void setTur_per_id(int tur_per_id) {
        this.tur_per_id = tur_per_id;
    }

    public int getTur_med_id() {
        return tur_med_id;
    }

    public void setTur_med_id(int tur_med_id) {
        this.tur_med_id = tur_med_id;
    }

    public int getTur_num() {
        return tur_num;
    }

    public void setTur_num(int tur_num) {
        this.tur_num = tur_num;
    }

    public Date getTur_fecha() {
        return tur_fecha;
    }

    public void setTur_fecha(Date tur_fecha) {
        this.tur_fecha = tur_fecha;
    }
    
    
    
}
