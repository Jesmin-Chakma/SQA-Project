
package com.mycompany.sqaproject;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author HP
 */
public class WhiteBoxTestingTest {
     public ModuleTesting cal;
    @Before
    public void setup() throws Exception{
       
        cal = new ModuleTesting();
    }
    //Test Case
     @Test
    public void AddTest(){
        
        assertEquals(10,cal.Add(5, 5));
       
    }
    //Test Case
    @Test
    public void SubtracTest(){
     
       assertEquals(0,cal.Subtract(5, 5));
       
    } 
    //Test Case
    @Test
    public void Mul(){
       
        assertEquals(25,cal.Mul(5, 5));
       
    }
    //Test Case
    @Test
    public void Div(){
       
         assertEquals(1,cal.Div(5, 5));
    }
    //Test Case   
    @Test
    public void Modulo(){
     
        assertEquals(0,cal.ModuloDivision(5, 5));
      
    }  
    
   
}
