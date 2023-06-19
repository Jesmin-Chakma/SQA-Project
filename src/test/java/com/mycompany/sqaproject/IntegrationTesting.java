package com.mycompany.sqaproject;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author HP
 */



public class IntegrationTesting {
    
    public Calculator cal;
    
    @Before
    public void setup() throws Exception{
       cal = new Calculator(4);
       
    }
    //Test Case
    @Test
    public void IntegrationTest(){
        
        cal.Add(5);
        assertEquals(9,cal.GetCurrentValue());
        cal.Subtract(5);
        assertEquals(4,cal.GetCurrentValue());
        cal.Mul(10);
        assertEquals(40,cal.GetCurrentValue());
        cal.Div(2);       
        assertEquals(20,cal.GetCurrentValue());
        cal.ModuloDivision(2);       
        assertEquals(0,cal.GetCurrentValue());
        
    }

}
