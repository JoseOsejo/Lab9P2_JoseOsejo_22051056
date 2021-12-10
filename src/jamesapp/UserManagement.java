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
public boolean checkUser(ArrayList<Cliente>clientes,String user){
    for(Cliente cliente: clientes){
        if(cliente.getUser().equalsIgnoreCase(user)){
            return true;
        }
    }
    return false;
}    
public boolean logIn(ArrayList<Cliente>clientes,String user,String password){
   
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
}
