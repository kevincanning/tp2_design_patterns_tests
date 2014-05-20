package com.canning.tp2_design_patterns_tests.builder;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Kevin
 */
public class BuilderJUnitTest {
    
    public BuilderJUnitTest() {
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
    public void testBuilder() {
        MealBuilder mealBuilder = new ItalianMealBuilder();
        MealDirector mealDirector = new MealDirector(mealBuilder);
        mealDirector.contructMeal();
        
        Meal meal = mealDirector.getMeal();
        System.out.println("Meal is: " + meal);
        
        mealBuilder = new JapaneseMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.contructMeal();
        meal = mealDirector.getMeal();
        System.out.println("Meal is: " + meal);
        
        mealBuilder = new McDonladsMealBuilder();
        mealDirector = new  MealDirector(mealBuilder);
        mealDirector.contructMeal();
        meal = mealDirector.getMeal();
        System.out.println("Meal is: " + meal);
        
        mealBuilder = new SpurMealBuilder();
        mealDirector = new MealDirector(mealBuilder);
        mealDirector.contructMeal();
        meal = mealDirector.getMeal();
        System.out.println("Meal is: " + meal);
    }
}
