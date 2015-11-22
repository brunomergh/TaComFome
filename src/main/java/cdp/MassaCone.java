/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

/**
 *
 * @author Bruno
 */
public class MassaCone extends Massa {
    
    public MassaCone(Pizza pizza){
        super(pizza);
    }
    
    @Override
    public double getValor(){
        return pizzaDecorator.getValor() + 10.00;
    }
    
}
