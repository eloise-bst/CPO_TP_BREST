/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_stats;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elois
 */
public class TP1_stats {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int tab[] = new int[6];

        Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez un nombre entier m compris entre 1 et 6 :");
        int m = sc.nextInt();
        
        Random generateurAleat = new Random();

        for (int i = 0; i < m; i++) {
            int tirage = generateurAleat.nextInt(6);
            tab[tirage]++;
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("Face " + (i + 1) + " : " + tab[i] + " fois, " + ((double) tab[i] / m * 100) + " %");
        }
        
    }
    
}
