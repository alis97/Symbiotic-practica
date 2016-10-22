/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adrian Mendoza Araya
 */
public class Class_Ordenar {
    int[] numvector = null;
    int posicionllenar;
    public String llenarvector(int numero,int tamaño)
    {
        numvector = new int[tamaño];
        for(int i = 0;i<numvector.length;i++)
        {
            numvector[i]=numero;
        }
        return String.valueOf(numvector);
    }
    public String Ordenamiento()
    {
        
        for(int i = 0;i<numvector.length;i++)
        {
            if(numvector[i+1]>numvector[i])
            {
                
            }
            else
            {
                numvector[i+1]=numvector[i];
                numvector[i]=numvector[i+1];
            }
        }
        return String.valueOf(numvector);
    }
    
}
