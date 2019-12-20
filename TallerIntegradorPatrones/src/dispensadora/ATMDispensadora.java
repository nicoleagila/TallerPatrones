/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dispensadora;

/**
 *
 * @author Kelly
 */
public class ATMDispensadora {
    private Dispensadora d1;
    
    public ATMDispensadora(){
        this.d1= new Dolar20Dispensadora();
        Dispensadora d2= new Dolar10Dispensadora();
        Dispensadora d3= new Coin50Dispensadora();
        Dispensadora d4= new Coin25Dispensadora();
        Dispensadora d5= new Coin5Dispensadora();
        d1.setNextChain(d2);
        d2.setNextChain(d3);
        d3.setNextChain(d4);
        d4.setNextChain(d5);
    }
    
}
