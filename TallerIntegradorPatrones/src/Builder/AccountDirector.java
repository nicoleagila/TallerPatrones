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
public class AccountDirector {
    private AccountBuilder builder;
    
    public AccountDirector(AccountBuilder builder){
        this.builder=builder;
    }
    
    public void crearCuenta(int id, double amount){
     builder.crearCuenta(id, amount);
    }
    
    public Account getAccount(){
        return builder.getAccount();
    }
}
