/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication9;

import java.util.Scanner;

/**
 *
 * @author oscar
 */
public class JavaApplication9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dato = new Scanner (System.in);
        //Pedir nombre y appellidos al usuario
        System.out.println("Ingrese su nombre y apellidos: ");
        String nombre = dato.nextLine();
        
        System.out.println("El nombre y apellido del usuario es: " + nombre);
    }
    
}
