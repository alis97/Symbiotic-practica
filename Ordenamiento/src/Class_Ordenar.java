
import java.util.Arrays;

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
    int[] vectorfinal = null;
    int posicionllenar=0;
    String printuservector;
    String printresulvector;
    public String llenarvector(int numero)
    {
//        if(posicionllenar==numvector.length)
//        {
//            
//        }
//        else
//        {
            int tamaño = numvector.length;
            numvector[posicionllenar]= numero;
            vectorfinal=numvector;
            
//        }
        return printuservector = Arrays.toString(numvector);
       
    }
    public void Ordenamiento()
    {
         Arrays.sort(vectorfinal);
//        for(int i = 0;i<numvector.length;i++)
//        {
//            if(numvector[i+1]>numvector[i])
//            {
//                printresulvector = Arrays.toString(numvector);
//            }
//            else
//            {
//                numvector[i+1]=numvector[i];
//                numvector[i]=numvector[i+1];
//                printresulvector = Arrays.toString(numvector);
//            }
//        }
//        return printresulvector;
    }
    public void generarTamaño(int tamaño)
    {
        numvector = new int[tamaño];
    }
    
}
