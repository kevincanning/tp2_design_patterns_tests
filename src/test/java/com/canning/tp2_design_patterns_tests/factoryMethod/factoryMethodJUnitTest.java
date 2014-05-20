/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.canning.tp2_design_patterns_tests.factoryMethod;

import com.canning.tp2_design_patterns_tests.factory_method.Cat;
import com.canning.tp2_design_patterns_tests.factory_method.Dog;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kevin
 */
public class factoryMethodJUnitTest {
    
    public factoryMethodJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
          Cat cat = Cat.getInstance();
        Dog dog = Dog.getInstance();
        
        String animal1 = cat.makeSound();
        String animal2 = dog.makeSound();
        
        System.out.println("Cat: " + animal1);
        System.out.println("Dog: " + animal2);
    }
}
