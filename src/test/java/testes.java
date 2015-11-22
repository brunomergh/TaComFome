/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import cdp.Pizza;
import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import util.FabricaPizza;
import util.Pizzaiolo;

/**
 *
 * @author Bruno
 */
public class testes {
    
    Pizza pizza;
    Pizzaiolo ajudante;
    
    public testes() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        pizza = new Pizza();
        ajudante = new Pizzaiolo();
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void Testar_Pizza_4Queijos_Cone() throws Exception {
        Pizza pizza = FabricaPizza.criarPizza("Quatro Queijos Cone");
        Assert.assertEquals(24.0, pizza.getValor());
    }
    
    @Test
    public void Testar_Pizza_4Queijos_Trad() throws Exception {
        Pizza pizza = FabricaPizza.criarPizza("Quatro Queijos Tradicional");
        Assert.assertEquals(19.0, pizza.getValor());
    }
    
    @Test
    public void Testar_Pizza_Mussarela_Cone() throws Exception {
        Pizza pizza = FabricaPizza.criarPizza("Mussarela Cone");
        Assert.assertEquals(21.0, pizza.getValor());
    }
    
    @Test
    public void Testar_Pizza_Mussarela_Trad() throws Exception {
        Pizza pizza = FabricaPizza.criarPizza("Mussarela Tradicional");
        Assert.assertEquals(16.0, pizza.getValor());
    }
}
