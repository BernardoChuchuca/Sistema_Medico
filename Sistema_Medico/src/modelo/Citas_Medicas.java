/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Bernardo
 */
public class Citas_Medicas {
    
    private String cit_estado;
    private String cit_evaluacion;
    private int id_turno;
    private String cit_observacion;
    private int id_receta;

    public String getCit_estado() {
        return cit_estado;
    }

    public void setCit_estado(String cit_estado) {
        this.cit_estado = cit_estado;
    }

    public String getCit_evaluacion() {
        return cit_evaluacion;
    }

    public void setCit_evaluacion(String cit_evaluacion) {
        this.cit_evaluacion = cit_evaluacion;
    }

    public int getId_turno() {
        return id_turno;
    }

    public void setId_turno(int id_turno) {
        this.id_turno = id_turno;
    }

    public String getCit_observacion() {
        return cit_observacion;
    }

    public void setCit_observacion(String cit_observacion) {
        this.cit_observacion = cit_observacion;
    }

    public int getId_receta() {
        return id_receta;
    }

    public void setId_receta(int id_receta) {
        this.id_receta = id_receta;
    }

    public Citas_Medicas() {
    }

    public Citas_Medicas(String cit_estado, String cit_evaluacion, int id_turno, String cit_observacion, int id_receta) {
        this.cit_estado = cit_estado;
        this.cit_evaluacion = cit_evaluacion;
        this.id_turno = id_turno;
        this.cit_observacion = cit_observacion;
        this.id_receta = id_receta;
    }
    
    
    
    
    
}
