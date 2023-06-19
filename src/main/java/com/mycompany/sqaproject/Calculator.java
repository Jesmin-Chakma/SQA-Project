
package com.mycompany.sqaproject;

/**
 *
 * @author HP
 */
public class Calculator{
        private int CurrentValue;
        
        //Constructor
        public  Calculator(int a){
            CurrentValue = a;
        }
        public void Add(int a){
            CurrentValue = CurrentValue + a;
            
        }
         public void Subtract(int a){
            CurrentValue = CurrentValue - a;
            
        }
        public void Mul(int a){
            CurrentValue = CurrentValue * a;
            
        }
        public void Div(int a){
            CurrentValue = CurrentValue / a;
            
        }
         public void ModuloDivision(int a){
            CurrentValue = CurrentValue % a;
            
        }
 
        public int GetCurrentValue(){
            return CurrentValue;
        }




     
    
}
