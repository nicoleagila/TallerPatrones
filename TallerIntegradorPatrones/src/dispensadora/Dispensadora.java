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
public interface Dispensadora {
    
    void setNextChain(Dispensadora nextChain);
    void dispense(double dinero);
    
}
