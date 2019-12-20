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
public class SavingsABuilder extends AccountBuilder{
    
    @Override
    public void crearCuenta(int id, double amount) {
        a = new Account(id, amount);
    }

    
}
