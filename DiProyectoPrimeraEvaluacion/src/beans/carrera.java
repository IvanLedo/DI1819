/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author MSI
 */
public class Carrera {

    private String nombreCarrera;
    private SimpleDateFormat fecha;
    private String lugar;
    private int maximoCorredores;
    private ArrayList<Corredor> corredores = new ArrayList<Corredor>();

    public Carrera() {
    }

    public Carrera(String nombreCarrera, SimpleDateFormat fecha, String lugar, int maximoCorredores) {
        this.nombreCarrera = nombreCarrera;
        this.fecha = fecha;
        this.lugar = lugar;
        this.maximoCorredores = maximoCorredores;
    }

    public String getNombreCarrera() {
        return nombreCarrera;
    }

    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public SimpleDateFormat getFecha() {
        return fecha;
    }

    public void setFecha(SimpleDateFormat fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getMaximoCorredores() {
        return maximoCorredores;
    }

    public void setMaximoCorredores(int maximoCorredores) {
        this.maximoCorredores = maximoCorredores;
    }

    public ArrayList<Corredor> getCorredores() {
        return corredores;
    }

    public void setCorredores(ArrayList<Corredor> corredores) {
        this.corredores = corredores;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombreCarrera=" + nombreCarrera + ", fecha=" + fecha + ", lugar=" + lugar + ", maximoCorredores=" + maximoCorredores + ", corredores=" + corredores + '}';
    }

}
