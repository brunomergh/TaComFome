/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import cdp.Pizza;

/**
 *
 * @author Bruno
 */
public class AbstractPizzaOption extends Pizza {
    
    protected Pizza pizzaDecorator;
    
    public AbstractPizzaOption(Pizza pizza){
        super(pizza.getValor());
        this.pizzaDecorator = pizza;
    }
    
}
