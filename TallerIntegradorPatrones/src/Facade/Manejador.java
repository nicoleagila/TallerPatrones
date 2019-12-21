/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Facade;

public class Manejador{
    protected double monto;
    protected int denominacion;
    private Depositar depositar;
    private Retirar retirar;
      
    public Manejador(double monto, int denominacion){
        depositar = new Depositar();
        retirar = new Retirar();
        this.monto = monto; // Total de billetes
        this.denominacion = denominacion; // Valor de cada billete
    }
    
    public double getMonto(){ return monto; }
    public int getDenominacion(){ return denominacion; }
    public void setMonto(int monto){ this.monto = monto; }

    public void depositar(int monto, int denominacion){
        depositar.Realizardeposito(monto, denominacion);
    }
    
    public void retirar(int monto){
        retirar.RealizarRetiro(monto);
    }    
}