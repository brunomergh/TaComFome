/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

import util.AbstractPizzaOption;

/**
 *
 * @author Bruno
 */
public abstract class Queijo extends AbstractPizzaOption {
    
    public Queijo(Pizza pizza){
        super(pizza);
    }
    
    @Override
    public double getValor(){
        return pizzaDecorator.getValor() + 1.00;
    }
    
}
