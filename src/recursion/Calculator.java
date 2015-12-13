/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;

/**
 *
 * @author sdurko
 */
public class Calculator 
{
    public void Run(int number)
    {
        System.out.println(Integer.toString(Factorial(number)));
    }
    
    private int Factorial(int number)
    {   
        if(number == 0)
        {
            return  1;    
        }
        
        System.out.println("Number is currently: " + Integer.toString(number));
        return number * Factorial(number - 1);
    }
}
