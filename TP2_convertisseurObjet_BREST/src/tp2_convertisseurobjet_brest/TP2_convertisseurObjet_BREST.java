/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_brest;

import java.util.Scanner;

/**
 *Nom : convertisseur objet
 * @author elois
 * présentation : Ce TP permet d'effectuer des conversions de températures entre Celsius, Kelvin et Fahrenheit. Chaque conversion agrémente un compteur de conversions.
 */
public class TP2_convertisseurObjet_BREST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Convertisseur convertisseur1 = new Convertisseur(); 
        Convertisseur convertisseur2 = new Convertisseur();

        System.out.println("Saisissez la conversion que vous saouhaitez effectuer :");
        System.out.println("1) Celsius vers Kelvin");
        System.out.println("2) Kelvin vers Celsius");
        System.out.println("3) Celsius vers Fahrenheit");
        System.out.println("4) Fahrenheit vers Celsius");
        System.out.println("5) Kelvin vers Fahrenheit");
        System.out.println("6) Fahrenheit vers Kelvin");

            int choix = sc.nextInt();
            float valeur, resultat;

            if (choix == 1){
                System.out.print("Entrez la temperature en Celsius : ");
                valeur = sc.nextFloat();
                resultat = convertisseur1.CelsiusVersKelvin(valeur);
                System.out.println(valeur + "°C = " + resultat + " K");
            }
            else if (choix == 2) {
                System.out.print("Entrez la temperature en Kelvin : ");
                valeur = sc.nextFloat();
                resultat = convertisseur1.KelvinVersCelsius(valeur);
                System.out.println(valeur + " K = " + resultat + "°C");
            }
            else if (choix == 3) {
                System.out.print("Entrez la temperature en Celsius : ");
                valeur = sc.nextFloat();
                resultat = convertisseur1.CelsiusVersFarenheit(valeur);
                System.out.println(valeur + "°C = " + resultat + "°F");
            }
            else if (choix == 4) {
                System.out.print("Entrez la temperature en Fahrenheit : ");
                valeur = sc.nextFloat();
                resultat = convertisseur1.FarenheitVersCelsius(valeur);
                System.out.println(valeur + "°F = " + resultat + "°C");
            }
            else if (choix == 5) {
                System.out.print("Entrez la temperature en Kelvin : ");
                valeur = sc.nextFloat();
                resultat = convertisseur1.KelvinVersFarenheit(valeur);
                System.out.println(valeur + " K = " + resultat + "°F");
            }
            else if (choix == 6) {
                System.out.print("Entrez la temperature en Fahrenheit : ");
                valeur = sc.nextFloat();
                resultat = convertisseur1.FarenheitVersKelvin(valeur);
                System.out.println(valeur + "°F = " + resultat + " K");
            }
            else {
                System.out.println("Choix invalide, reessayez !");
            }
        System.out.println("Conversions effectuées par le premier convertisseur : " + convertisseur1);
        System.out.println("Conversions effectuées par le second convertisseur : " + convertisseur2);
    }
    
}
