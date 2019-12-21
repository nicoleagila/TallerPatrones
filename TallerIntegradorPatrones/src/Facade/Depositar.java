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
public class Depositar {
    Account cliente;
    
    public boolean Realizardeposito(double monto, int denominacion){
        cliente.deposit(monto);
        return true;
    }
}


