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
        
        System.out.println("Ingrese su nombre y apellidos: ");
        String nombre = dato.nextLine();
        
        System.out.println("Ingrese su direccion: ");
        String direccion = dato.nextLine();
        System.out.println("Ingrese su telefono: ");
        String cel = dato.nextLine();
        System.out.println("Ingrese su email: ");
        String email = dato.nextLine();
        
        
        System.out.println("El nombre y apellidos es usuario es: " + nombre);
        System.out.println("La direccion ingresada es: " + direccion);
        System.out.println("Su Telefono es: " + cel);
        System.out.println("Su email es: " + email);        
       
    }
    
}
