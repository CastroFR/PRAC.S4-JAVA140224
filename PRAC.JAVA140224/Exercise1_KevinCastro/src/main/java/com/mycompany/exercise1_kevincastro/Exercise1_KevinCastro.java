/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercise1_kevincastro;

/**
 *
 * @author MINEDUCYT
 */


import javax.swing.JOptionPane;

public class Exercise1_KevinCastro {

    public static void main(String[] args) {
     
        String añox = JOptionPane.showInputDialog("Introduzca un año:");
        int año = Integer.parseInt(añox);

        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0) {
            JOptionPane.showMessageDialog(null, año + " es bisiesto.");
        } else {
            JOptionPane.showMessageDialog(null, año + " no es bisiesto.");
        }
    }
}



