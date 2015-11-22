/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cdp;

import util.AbsPizzaOption;

/**
 *
 * @author Bruno
 */
public class Presunto extends AbsPizzaOption {
    
    public Presunto(Pizza pizza){
        super(pizza);
    }
    
    @Override
    public double getValor(){
        return pizzaDecorator.getValor() + 3.00;
    }
    
}
