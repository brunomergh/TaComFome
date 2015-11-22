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
import cdp.QueijoMargherita;
import cdp.QueijoMussarela;
import cdp.QueijoParmesao;
import java.util.ArrayList;

/**
 *
 * @author Bruno
 */
public class FabricaPizzaQuatroQueijosCone implements FabricaPizzaAbstrata {
    
    @Override
    public Pizza criarMassa(Pizza pizza){
        pizza = new MassaCone(pizza);
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
