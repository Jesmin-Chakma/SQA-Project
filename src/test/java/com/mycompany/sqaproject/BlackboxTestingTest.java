/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package com.mycompany.sqaproject;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author HP
 */
public class BlackboxTestingTest {
    public ModuleTesting cal;
    @Before
    public void setup() throws Exception{
       
        cal = new ModuleTesting();
    }
    //Test Case
     @Test
    public void AddTest(){
     
        int result = cal.Add(6, 6);
        assertTrue(result >= 1 && result <= 12);
       
        
    }
    //Test Case
    @Test
    public void SubtracTest(){
     
        int result = cal.Subtract(6, 4);
        assertTrue(result >= 1 && result <= 2);
       
    } 
    //Test Case
    @Test
    public void Mul(){
       
        int result = cal.Mul(6, 6);
        assertTrue(result >= 1 && result <= 36);
       
    }
    //Test Case
    @Test
    public void Div(){
       
         int result = cal.Div(36, 6);
         assertTrue(result >= 1 && result <= 6);
    }
    //Test Case   
    @Test
    public void Modulo(){
     
         int result = cal.ModuloDivision(5, 6);
         assertTrue(result >= 1 && result <= 5);
      
    }  
}
