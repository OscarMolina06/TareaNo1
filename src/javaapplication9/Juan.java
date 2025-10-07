/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication9;
import java.util.Scanner;

/**
 *
 * @author juanb
 */
public class Juan {
        public static void main(String[] args) {
        System.out.println("Ingrese su direccion: ");
        Scanner dato = new Scanner (System.in);
        String direccion = dato.nextLine();
        
        System.out.println("La direccion ingresada es: " + direccion);
    }
}
