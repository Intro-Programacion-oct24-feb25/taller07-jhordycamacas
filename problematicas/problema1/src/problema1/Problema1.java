/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String edades = "";
        String posicion;
        String cadenafinal = "";
        
        int edad;
        double sumaedad = 0;
        double estatura;
        double sumaes = 0;
        boolean criterio = true;
        String letra;
        int contador = 0;
        double promedioed;
        double promedioes;
        double calculo = 0;

        while (criterio == true) {
            System.out.println("Ingrese el nombre del jugador");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la posicion del jugador");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador");
            edad = entrada.nextInt();
            System.out.println("Ingrese la estatura del jugador");
            estatura = entrada.nextDouble();
            entrada.nextLine();

            contador = contador + 1;
            calculo = calculo + 1;
            cadenafinal = String.format("%s%d. %s -%s- ,edad %d,estatura %.2f\n",
                    cadenafinal,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            edades = String.format("%s%d\n",
                    edades,
                    edad);

            sumaedad = sumaedad + edad;
            sumaes = sumaes + estatura;
            System.out.println("Si desea terminar digite si");
            letra = entrada.nextLine();
            letra = letra.toLowerCase();
            if (letra.equals("si")) {

                criterio = false;

            }

        }

        promedioed = sumaedad / calculo;
        promedioes = sumaes / calculo;

        System.out.printf("Listado de jugadores\n%sListado de edades\n%s"
                + "Promedio de edades:\t%.2f\nPromedio de estaturas:\t%.2f",
                cadenafinal,
                edades,
                promedioed,
                promedioes);
    }

}
