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
public class AbstractBridgeBuilder {
    
    private Builder build;
    
    public AbstractBridgeBuilder(Builder build){
        this.build = build;
    }
    public Pizza criarPizza(){
        this.build.fazerMassa();
        this.build.fazerRecheio();
        this.build.fazerMolho();
        return this.build.colocarForno();
    }
    
    
    
}
