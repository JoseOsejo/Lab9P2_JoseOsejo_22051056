/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamesapp;

/**
 *
 * @author jcoq2
 */
public class Usuario 
{
    private String user;
    private String nombre;
    private String password;
    private int edad;
    private String tipoEmpleado;

    public Usuario(String user, String nombre, String password, int edad, String tipoEmpleado) {
        this.user = user;
        this.nombre = nombre;
        this.password = password;
        this.edad = edad;
        this.tipoEmpleado = tipoEmpleado;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getTipoEmpleado() {
        return tipoEmpleado;
    }

    public void setTipoEmpleado(String tipoEmpleado) {
        this.tipoEmpleado = tipoEmpleado;
    }

    @Override
    public String toString() {
        return "Usuario{" + "user=" + user + ", nombre=" + nombre + ", password=" + password + ", edad=" + edad + ", tipoEmpleado=" + tipoEmpleado + '}';
    }

    
    
}
