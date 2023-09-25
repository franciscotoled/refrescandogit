/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexception;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    /*1.
Definir una Clase que contenga algún tipo de dato de tipo array y agregue el código para
generar y capturar una excepción ArrayIndexOutOfBoundsException (índice de arreglo fuera
de rango).
*/
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String[] listaprueba = new String[4];
        
        for (int i = 0; i < listaprueba.length; i++) {
            System.out.println("Ingreso "+(i+1));
            listaprueba[i] = leer.nextLine();
        }
        try{
        System.out.println("Ingrese el lugar donde esta la palabra que ingreso");
        int lugar = leer.nextInt()-1;
        
        String palabra = listaprueba[lugar];
        
            System.out.println("La palabra es "+palabra);
        
        }catch(ArrayIndexOutOfBoundsException lugar)
        {
            System.out.println("te saliste del array");
        }
        
        
    }
    
}
