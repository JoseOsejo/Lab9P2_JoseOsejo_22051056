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
public class TipoEmpleado 
{
private String tipo;

public TipoEmpleado(String tipo){
    this.tipo = tipo;
}

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TipoEmpleado{" + "tipo=" + tipo + '}';
    }


}
