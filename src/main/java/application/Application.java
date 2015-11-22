/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package application;

import cdp.Pizza;
import util.FabricaPizza;

/**
 *
 * @author Bruno
 */
public class Application {
    public static void main(String args[]) throws Exception {
        
        Pizza pizza = FabricaPizza.criarPizza("Quatro Queijos Cone");
        System.out.println("Valor da pizza :" + pizza.getValor());
        
    }
}
