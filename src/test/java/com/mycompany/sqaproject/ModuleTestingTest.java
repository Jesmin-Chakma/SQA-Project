package com.mycompany.sqaproject;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;


/**
 *
 * @author HP
 */
public class ModuleTestingTest {
    public ModuleTesting cal;
    @Before
    public void setup() throws Exception{
       
        cal = new ModuleTesting();
    }
    //Test Case
    @Test
    public void ModuleTest(){
        
        assertEquals(11,cal.Add(5, 6));
        assertEquals(4,cal.Subtract(10, 6));
        assertEquals(30,cal.Mul(5, 6));
        assertEquals(1,cal.Div(6, 6));
        assertEquals(5,cal.ModuloDivision(5, 6));
          
    }     
}
