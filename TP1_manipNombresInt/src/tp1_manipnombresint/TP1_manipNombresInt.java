/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manipnombresint;

import java.util.Scanner;

/**
 *
 * @author elois
 */
public class TP1_manipNombresInt {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Saisissez un nombre entier : ");
        int nombre1 = sc.nextInt();
        
        System.out.println("Saisissez un second nombre entier : ");
        int nombre2 = sc.nextInt();
        
        System.out.println("Vous avez choisi les nombres "+ nombre1 + " et "+ nombre2);
        
        int somme = nombre1 + nombre2;
        System.out.println("La somme des deux nombres est : " + somme);
        
        int difference = nombre1 - nombre2;
        System.out.println("La difference des deux nombres est : " + difference);
        
        int produit = nombre1 * nombre2;
        System.out.println("Le produit des deux nombres est : " + produit);
        
        int quotient = nombre1 / nombre2;
        int reste = nombre1 % nombre2;
        System.out.println("Le resultat de la division de "+ nombre1 + " par "+ nombre2 + " est : "+ quotient);
        System.out.println("Le reste de cette division est : " + reste);
        

    }
    
}
