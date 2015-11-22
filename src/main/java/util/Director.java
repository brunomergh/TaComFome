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
public interface Director {
    
    public Pizza criarPizza(ImpBrigdeBuilder cozinheiro);
    
}
