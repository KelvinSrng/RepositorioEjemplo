package com.mycompany.imccalculadora;

import java.util.Scanner;

public class IMCCalculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Declaracion de variables
        float imc,lb;
        float metros;
        String nombre;
        
        //Ingreso de datos
        System.out.print("\tCALCULADORA DEL IMC");
        System.out.print("=====================================");
        System.out.print("\nIngrese su nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese su peso en libras: ");
        lb = sc.nextFloat();
        System.out.print("Ingrese su altura en metros: ");
        metros = sc.nextFloat();
        
        imc = (float) (lb / Math.pow(metros,2));
        
        System.out.printf("%s su IMC es %,.1f\n" ,nombre, imc);
    }
}