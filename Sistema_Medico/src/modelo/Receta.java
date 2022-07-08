/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bernardo
 */
public class Receta {
    
    private int rec_id;
    private int rec_numero;
    private String dosis;
    private String frecuencia;
    private int medi_id;

    public void setMedi_id(int medi_id) {
        this.medi_id = medi_id;
    }

    public int getMedi_id() {
        return medi_id;
    }
    
    

    public int getRec_id() {
        return rec_id;
    }

    public void setRec_id(int rec_id) {
        this.rec_id = rec_id;
    }

    public int getRec_numero() {
        return rec_numero;
    }

    public void setRec_numero(int rec_numero) {
        this.rec_numero = rec_numero;
    }

    public String getDosis() {
        return dosis;
    }

    public void setDosis(String dosis) {
        this.dosis = dosis;
    }

    public String getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(String frecuencia) {
        this.frecuencia = frecuencia;
    }

    public Receta() {
    }

    public Receta(int rec_id, int rec_numero, String dosis, String frecuencia, int medi_id) {
        this.rec_id = rec_id;
        this.rec_numero = rec_numero;
        this.dosis = dosis;
        this.frecuencia = frecuencia;
        this.medi_id = medi_id;
    }

    
    
    
}
