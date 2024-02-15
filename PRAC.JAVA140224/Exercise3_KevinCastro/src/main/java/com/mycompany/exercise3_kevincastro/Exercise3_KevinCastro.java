/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise3_kevincastro;

/**
 *
 * @author MINEDUCYT
 */
  
import java.util.Scanner;

public class Exercise3_KevinCastro 
{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numb1, numb2, resultado;
        int opcion;

        System.out.println("Ingrese el primer número:");
        numb1 = scanner.nextDouble();

        System.out.println("Ingrese el segundo número:");
        numb2 = scanner.nextDouble();

        System.out.println("Seleccione la operación a realizar:");
        System.out.println("1 - Suma");
        System.out.println("2 - Resta");
        System.out.println("3 - Multiplicación");
        System.out.println("4 - División");
        opcion = scanner.nextInt();

        switch (opcion) {
            case 1:
                resultado = numb1 + numb2;
                System.out.println("La suma es: " + resultado);
                break;
            case 2:
                resultado = numb1 - numb2;
                System.out.println("La resta es: " + resultado);
                break;
            case 3:
                resultado = numb1 * numb2;
                System.out.println("La multiplicación es: " + resultado);
                break;
            case 4:
                if (numb2 != 0) {
                    resultado = numb1 / numb2;
                    System.out.println("La división es: " + resultado);
                } else {
                    System.out.println("¡Error! No se puede dividir por cero.");
                }
                break;
            default:
                System.out.println("Opción inválida.");
        }
    }
}


