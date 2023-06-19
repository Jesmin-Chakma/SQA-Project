
package com.mycompany.sqaproject;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author HP
 */


public class UnitTesting {
    private Calculator cal;
    
    @Before
    public void setup() throws Exception{
       
        cal = new Calculator(4);
    }
    //Test Case
    @Test
    public void AddTest(){
     
        cal.Add(5);
        assertEquals(9,cal.GetCurrentValue());
        cal.Add(3);
        assertEquals(12,cal.GetCurrentValue());
        
    }
    //Test Case
    @Test
    public void SubtracTest(){
     
        cal.Subtract(5);
        assertEquals(-1,cal.GetCurrentValue());
        cal.Subtract(-10);
        assertEquals(9,cal.GetCurrentValue());
    } 
    //Test Case
    @Test
    public void Mul(){
       
        cal.Mul(10);
        assertEquals(40,cal.GetCurrentValue());
        cal.Mul(10);
        assertEquals(400,cal.GetCurrentValue());
    }
    //Test Case
    @Test
    public void Div(){
       
        cal.Div(2);       
        assertEquals(2,cal.GetCurrentValue());
        cal.Div(2);
        assertEquals(1,cal.GetCurrentValue());
    }
    //Test Case
    @Test
    public void Modulo(){
      
        cal.ModuloDivision(2);       
        assertEquals(0,cal.GetCurrentValue());
        cal.ModuloDivision(2);
        assertEquals(0,cal.GetCurrentValue());
    }
    
    
}
