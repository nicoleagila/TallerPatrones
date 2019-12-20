/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Builder;

import Patrones.Account;

/**
 *
 * @author nicoleagila
 */
public abstract class AccountBuilder {
    
    protected Account a;
    
    public Account getAccount(){
        return a;
    }
    
    public abstract void crearCuenta(int id, double amount);
    
}
