/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author MSI
 */
public class Corredor implements Comparable<Corredor> {

    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yy");
    private String nombre;
    private String dni;
    private Date fechaDeNacimiento;
    private String direccion;
    private String telefono;

    public Corredor() {
    }

    public Corredor(String dni, String nombre) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Corredor(String nombre, String dni, Date fechaDeNacimiento, String direccion, String telefono) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public SimpleDateFormat getSdf() {
        return sdf;
    }

    public void setSdf(SimpleDateFormat sdf) {
        this.sdf = sdf;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Corredor{" + "sdf=" + sdf + ", nombre=" + nombre + ", dni=" + dni + ", fechaDeNacimiento=" + fechaDeNacimiento + ", direccion=" + direccion + ", telefono=" + telefono + '}';
    }

    @Override
    public int compareTo(Corredor o) {
        int resultado = 0;
        if (this.dni.equals(o.dni)) {
            resultado = 1;
        }
        return resultado;
    }

}
