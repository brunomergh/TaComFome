/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;
import java.util.HashMap;

/**
 *
 * @author Bruno
 */
public class PizzaFlyweightFactory {
    
    private static PizzaFlyweightFactory fabricMagic;
    private HashMap<String, Builder> menuPizzas;
    
    private PizzaFlyweightFactory(){
        
        this.menuPizzas = new HashMap<>();
        menuPizzas.put("Mussarela Tradicional" , new BuilderPizzaMussarela());
        menuPizzas.put("Mussarela Cone" , new BuilderPizzaConeMussarela());
        menuPizzas.put("Quatro Queijos Tradicional" , new BuilderPizzaQuatroQueijos());
        menuPizzas.put("Quatro Queijos Cone" , new BuilderPizzaConeQuatroQueijos());
    }
    
    public synchronized static PizzaFlyweightFactory getInstance(){
        
        if(fabricMagic == null){
            
            fabricMagic = new PizzaFlyweightFactory();
        }
        return fabricMagic;
    }
        
    public Builder getBuilder(String tipoPizza) throws Exception {
        Builder build;
        try{
            build = menuPizzas.get(tipoPizza);
        }catch(Exception e){
            System.out.println("Erro");
            throw new Exception("Erro ... Não foi encontrado o Builder dessa Pizza :D ...");
        }
        
        return build;
    }
    
    
}
