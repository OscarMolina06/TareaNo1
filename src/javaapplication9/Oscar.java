/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class Oscar {
    public static void main(String[] args) {
        System.out.println("Ingrese su nombre y appellidos: ");
        Scanner dato2 = new Scanner (System.in);
        String valor = dato2.nextLine();
        
        System.out.println("El nombre y apellidos del la persona es:  " + valor);
    }
}
