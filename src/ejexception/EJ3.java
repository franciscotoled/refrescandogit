/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejexception;

import ejexception.entities.DivisionNumero;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class EJ3 {
    /*Defina una clase llamada DivisionNumero. En el método main utilice un Scanner para leer dos
números en forma de cadena. A continuación, utilice el método parseInt() de la clase Integer,
para convertir las cadenas al tipo int y guardarlas en dos variables de tipo int. Por ultimo realizar
una división con los dos numeros y mostrar el resultado.*/
     public static void main(String[] args) {
         
         DivisionNumero Dn = new DivisionNumero();
     
         Scanner leer = new Scanner(System.in);
         try{
         int num1 = Integer.parseInt(leer.nextLine());
         
         int num2 = Integer.parseInt(leer.nextLine());
         
         float num3 = Dn.dividir(num1,num2);
         
             System.out.println("la division da : "
                     + num3);
         }catch(NumberFormatException num1 )
         {
             System.out.println(" ingreso algo que no es un numero");
         }
         
     
     
     
     
     
     }
}
