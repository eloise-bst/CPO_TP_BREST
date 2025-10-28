/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_guessmynumber;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elois
 */
public class TP1_guessMyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Random generateurAleat = new Random();
        int nombreAleatoire = generateurAleat.nextInt(100);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choisissez un niveau de difficulté :");
        System.out.println("1) Facile (15 essais)");
        System.out.println("2) Moyen  (10 essais)");
        System.out.println("3) Difficile (5 essais)");
        
        int choix = sc.nextInt();
        int difficulte = 0;
        int max = 100;
        
        if (choix == 1) {
            difficulte = 15;
        } else if (choix == 2) {
            difficulte = 10;
        } else if (choix == 3) {
            difficulte = 5;
        } 
        
        int nombreChoisi = 0;
        int compteur =0;
        
        while (nombreChoisi!=nombreAleatoire && compteur < difficulte){
   
        System.out.println("Devinez un nombre compris entre 0 et 100 : " );
        nombreChoisi = sc.nextInt();
        compteur++;
        
        if (nombreChoisi<nombreAleatoire){
            System.out.println("Trop petit ! ");
            System.out.println("Il vous reste "+(difficulte-compteur)+" coups");
        } else if (nombreAleatoire<nombreChoisi){
            System.out.println("Trop grand !");
            System.out.println("Il vous reste "+(difficulte-compteur)+" coups");
        } else {
            System.out.println("Gagne !");
            System.out.println("Vous avez trouve en "+compteur+" coups !");
        }
        }
        if (nombreChoisi != nombreAleatoire) {
            System.out.println("Dommage ! Vous avez perdu");
            System.out.println("Le nombre a trouver était : " + nombreAleatoire);
        }
    }
    
}
