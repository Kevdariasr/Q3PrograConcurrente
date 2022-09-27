/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.main;

/**
 *
 * @author kevda
 */
public class Main {

    public static void main(String[] args) {
        
        Persona P = new Persona();
        P.setNombre("Kevin");
	String nombre = P.getNombre();
                
	System.out.println("El nombre es: "+nombre);
    }
}
