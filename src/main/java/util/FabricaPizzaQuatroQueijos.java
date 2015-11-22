/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import cdp.Cebola;
import cdp.MassaTradicional;
import cdp.Molho;
import cdp.Pizza;
import cdp.Presunto;
import cdp.QueijoGorgonzola;
import cdp.QueijoMargherita;
import cdp.QueijoMussarela;
import cdp.QueijoParmesao;

/**
 *
 * @author Bruno
 */
public class FabricaPizzaQuatroQueijos implements FabricaAbstrata {
    
    @Override
    public Pizza criarMassa(Pizza pizza){
        pizza = new MassaTradicional(pizza);
        return pizza;
    }
    
    @Override
    public Pizza criarRecheio(Pizza pizza){
        
        pizza = new Cebola(pizza);
        pizza = new QueijoParmesao(pizza);
        pizza = new QueijoMussarela(pizza);
        pizza = new QueijoMargherita(pizza);
        pizza = new QueijoGorgonzola(pizza);
        pizza = new Presunto(pizza);
        pizza = new QueijoMussarela(pizza);
        return pizza;
        
    }
    
    @Override
    public Pizza criarMolho(Pizza pizza){
        pizza = new Molho(pizza);
        return pizza;
    }
    
}
