/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jamesapp;

import java.util.ArrayList;

/**
 *
 * @author jcoq2
 */
public class UserManagement 
{
public boolean checkCliente(ArrayList<Cliente>clientes,String user){
    for(Cliente cliente: clientes){
        if(cliente.getUser().equalsIgnoreCase(user)){
            return true;
        }
    }
    return false;
}    
public boolean logInCliente(ArrayList<Cliente>clientes,String user,String password){
   
    for (Cliente cliente : clientes) {
        if(cliente.getUser().equalsIgnoreCase(user)){
            cliente.getPassword();
            if(cliente.getPassword().equalsIgnoreCase(password)){
                return true;
            }
        }
    }
    return false;
}
public boolean checkPersonal(ArrayList<Personal>personal,String user){
    for(Personal usuario: personal){
        if(usuario.getUser().equalsIgnoreCase(user)){
            return true;
        }
    }
    return false;
}    
public boolean logInPersonal(ArrayList<Personal>personal,String user,String password){
   
    for (Personal usuario : personal) {
        if(usuario.getUser().equalsIgnoreCase(user)){
            usuario.getPassword();
            if(usuario.getPassword().equalsIgnoreCase(password)){
                return true;
            }
        }
    }
    return false;
}
}
