/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author Bruno
 */
public class BuilderPizzaConeMussarela extends AbstractBuilder {
    
    public BuilderPizzaConeMussarela(){
        this.fabrica = new FabricaPizzaMussarelaCone();
    }
    
}
