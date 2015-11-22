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
public interface FabricaPizzaAbstrata {
       
    public Pizza criarMassa(Pizza pizza);
    public Pizza criarRecheio(Pizza pizza);
    public Pizza criarMolho(Pizza pizza);
    
    
}
