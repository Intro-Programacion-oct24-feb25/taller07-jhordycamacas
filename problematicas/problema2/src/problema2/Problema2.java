/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int contador = 2;
        int suma = 4;
        
        while (contador <= 110){
              System.out.printf("%d\n", contador);
              contador = contador + suma;
              suma = suma + 2;
        }
        
    }
    
}
