/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrian Mendoza Araya
 */
public class Class_Metodos {
    public int posicionfibonachi(int numero)
    {
        if (numero == 1 || numero == 2)
        {
            return 1;
        }
        
        else
        {
            return posicionfibonachi(numero - 2) + posicionfibonachi(numero -1);
        }
     
       
    }
    
}
