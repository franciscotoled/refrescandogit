/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexception.entities;

import ejexception.exceptions.Ej3exception;

/**
 *
 * @author User
 */
public class DivisionNumero {

    public DivisionNumero() {
    }
    
    
    
    public float dividir(int num1,int num2)throws Ej3exception{
        
        try{
         
            float result = num1/num2;
            
            return result;
            
        
        }
        catch(ArithmeticException r)
        {
           throw r; 
        }
        
}
}
