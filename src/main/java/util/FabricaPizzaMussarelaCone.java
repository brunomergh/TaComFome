/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import cdp.Cebola;
import cdp.MassaCone;
import cdp.Molho;
import cdp.Pizza;
import cdp.Presunto;
import cdp.QueijoGorgonzola;
import cdp.QueijoMussarela;

/**
 *
 * @author Bruno
 */
public class FabricaPizzaMussarelaCone implements FabricaAbstrata {
    
    @Override
    public Pizza criarMassa(Pizza pizza){
        pizza = new MassaCone(pizza);
        return pizza;
    }
    
    @Override
    public Pizza criarRecheio(Pizza pizza){
        
        pizza = new Cebola(pizza);
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
