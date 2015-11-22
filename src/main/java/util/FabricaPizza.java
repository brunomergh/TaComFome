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
public class FabricaPizza {
    
    /* O padrão Fachada Ja esta sendo utilizado nessa classe */
    
    public static Pizza criarPizza(String tipoPizza) throws Exception{
        
        PizzaFlyweightFactory menuBuilders = PizzaFlyweightFactory.getInstance();
        Pizzaiolo pizzaiolo = new Pizzaiolo();
        Builder builder;
        
        try{
            builder = menuBuilders.getBuilder(tipoPizza);
        }catch (Exception e){
            throw new Exception(e.getMessage());
        }
        ImpBrigdeBuilder b = new ImpBrigdeBuilder(builder);
        Pizza pizza = pizzaiolo.criarPizza(b);
        return pizza;
}
    
}
