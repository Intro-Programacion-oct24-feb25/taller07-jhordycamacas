/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
       double suma = 0;  
        int den = 1;  
        int signo = 1; 
        int contador = 0;  

      
        while (contador < 8) {
            suma = suma + signo * (1.0 / den);  
            den = den + 2;  
            signo = signo * -1; 
            contador = contador + 1; 
        }

      
        System.out.printf("El resultado de la serie es: %.4f\n", suma);
     
    }
    
}
