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
public class AbstractBuilder implements Builder {
    
    Pizza pizza = new Pizza();
    protected FabricaPizzaAbstrata fabrica;
    
    @Override
    public void fazerMassa(){
        pizza = fabrica.criarMassa(pizza);
    }
    
    @Override
    public void fazerRecheio(){
        pizza = fabrica.criarRecheio(pizza);
    }
    
    @Override
    public void fazerMolho(){
        pizza = fabrica.criarMolho(pizza);
    }
    
    @Override
    public Pizza colocarForno(){
        return pizza;
    }
    
}
