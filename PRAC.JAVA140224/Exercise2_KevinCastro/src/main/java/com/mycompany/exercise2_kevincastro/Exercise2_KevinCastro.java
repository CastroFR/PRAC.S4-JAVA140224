/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise2_kevincastro;

/**
 *
 * @author MINEDUCYT
 */

import java.util.Scanner;

public class Exercise2_KevinCastro 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        do {
            System.out.println("Ingrese un número positivo entero: ");
            num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println("El número " + num + " es par.");
            } else {
                System.out.println("El número " + num + " es impar.");
            }
        } while (num > 50);
        scanner.close();
    }
}


