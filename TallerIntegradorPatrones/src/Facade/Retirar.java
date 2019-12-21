/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

import Patrones.Account;

/**
 *
 * @author lcsan
 */
public class Retirar {
    Account cliente;
    public boolean RealizarRetiro(double monto){ 
        if (cliente.getAmount()>monto){
            cliente.withdraw(monto);
            return true;
        }else{
            return false;
        }
    }
}
