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
public class Dolar20Dispensadora implements Dispensadora {

    private Dispensadora chain;
    @Override
    public void setNextChain(Dispensadora nextChain) {
        this.chain=nextChain;
    }

    @Override
    public void dispense(double dinero) {
        if(dinero>= 20){
            double remainder = dinero % 20; 
            if(remainder !=0) this.chain.dispense(remainder);
	}else{
            this.chain.dispense(dinero);
	}
    }
    
}
