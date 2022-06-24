/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Usuario
 */
public class Medicamento {
    
    private int med_id;
    private String med_codigo_barra;
    private String med_marca;
    private String med_descripcion;
    private int med_cantidad;
    private String med_unidad_medida;
    private int med_stock;

    public Medicamento() {
    }

    public Medicamento(int med_id, String med_codigo_barra, String med_marca, String med_descripcion, int med_cantidad, String med_unidad_medida, int med_stock) {
        this.med_id = med_id;
        this.med_codigo_barra = med_codigo_barra;
        this.med_marca = med_marca;
        this.med_descripcion = med_descripcion;
        this.med_cantidad = med_cantidad;
        this.med_unidad_medida = med_unidad_medida;
        this.med_stock = med_stock;
    }

    public int getMed_id() {
        return med_id;
    }

    public void setMed_id(int med_id) {
        this.med_id = med_id;
    }

    public String getMed_codigo_barra() {
        return med_codigo_barra;
    }

    public void setMed_codigo_barra(String med_codigo_barra) {
        this.med_codigo_barra = med_codigo_barra;
    }

    public String getMed_marca() {
        return med_marca;
    }

    public void setMed_marca(String med_marca) {
        this.med_marca = med_marca;
    }

    public String getMed_descripcion() {
        return med_descripcion;
    }

    public void setMed_descripcion(String med_descripcion) {
        this.med_descripcion = med_descripcion;
    }

    public int getMed_cantidad() {
        return med_cantidad;
    }

    public void setMed_cantidad(int med_cantidad) {
        this.med_cantidad = med_cantidad;
    }

    public String getMed_unidad_medida() {
        return med_unidad_medida;
    }

    public void setMed_unidad_medida(String med_unidad_medida) {
        this.med_unidad_medida = med_unidad_medida;
    }

    public int getMed_stock() {
        return med_stock;
    }

    public void setMed_stock(int med_stock) {
        this.med_stock = med_stock;
    }

    @Override
    public String toString() {
        return "Medicamento{" + "med_id=" + med_id + ", med_codigo_barra=" + med_codigo_barra + ", med_marca=" + med_marca + ", med_descripcion=" + med_descripcion + ", med_cantidad=" + med_cantidad + ", med_unidad_medida=" + med_unidad_medida + ", med_stock=" + med_stock + '}';
    }

   
    

    

    
    
    
    
}
