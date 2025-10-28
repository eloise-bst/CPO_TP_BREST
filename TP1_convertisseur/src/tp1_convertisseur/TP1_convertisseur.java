/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_convertisseur;

import java.util.Scanner;
import static tp1_convertisseur.TP1_convertisseur.CelsiusVersFarhenheit;
import static tp1_convertisseur.TP1_convertisseur.CelsiusVersKelvin;
import static tp1_convertisseur.TP1_convertisseur.KelvinVersCelsius;

/**
 *
 * @author elois
 */
public class TP1_convertisseur {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bonjour, saisissez une valeur : ");
        double temperature = sc.nextDouble();
        
        System.out.println("Saisissez la conversion que vous souhaitez effectuer : ");
        System.out.println("1) De Celsius vers Kelvin");
        System.out.println("2) De Kelvin vers Celsius");
        System.out.println("3) De Farhenheit vers Celsius");
        System.out.println("4) De Celsius vers Farhenheit");
        System.out.println("5) De Kelvin vers Farhenheit");
        System.out.println("6) De Farhenheit vers Kelvin");
        
        int choix = sc.nextInt();
        
        double conversion = 0.0;
        String temperatureDeBase = "";
        String temperatureFinale = "";
        
        if (choix==1){
            conversion = CelsiusVersKelvin(temperature);
            temperatureDeBase = "degre Celsius";
            temperatureFinale = "degre Kelvin";
        }
        if (choix==2){
            conversion = KelvinVersCelsius(temperature);
            temperatureDeBase = "degre Kelvin";
            temperatureFinale = "degre Celsius";
        }
        if (choix==3){
            conversion = FarhenheitVersCelsius(temperature);
            temperatureDeBase = "degre Farhenheit";
            temperatureFinale = "degre Celsius";
        }
        if (choix==4){
            conversion = CelsiusVersFarhenheit(temperature);
            temperatureDeBase = "degre Celsius";
            temperatureFinale = "degre Farhenheit";
        }
        if (choix==5){
            conversion = KelvinVersFarhenheit(temperature);
            temperatureDeBase = "degre Kelvin";
            temperatureFinale = "degre Farhenheit";
        }
        if (choix==6){
            conversion = FarhenheitVersKelvin(temperature);
            temperatureDeBase = "degre Farhenheit";
            temperatureFinale = "degre Kelvin";
        }
        
        System.out.println(temperature+" "+temperatureDeBase+" est egal a "+ conversion +" " + temperatureFinale);
        
    }
    public static double CelsiusVersKelvin (double tCelsius) {
        double tKelvin = tCelsius + 273;
        return tKelvin;
    }
    public static double KelvinVersCelsius (double tKelvin) {
        double tCelsius = tKelvin - 273;
        return tCelsius;
    }
    public static double FarhenheitVersCelsius (double tFarhenheit){
        double tCelsius = (tFarhenheit - 32)*5/9;
        return tCelsius;
    }
    public static double CelsiusVersFarhenheit (double tCelsius) {
        double tFarhenheit = ( tCelsius * 9/5 )+32;
        return tFarhenheit;               
    }
    public static double KelvinVersFarhenheit (double tKelvin) {
        double tCelsius = KelvinVersCelsius(tKelvin);
        return CelsiusVersFarhenheit(tCelsius);
    }
    public static double FarhenheitVersKelvin (double tFarhenheit) {
        double tCelsius = FarhenheitVersCelsius(tFarhenheit);
        return CelsiusVersKelvin(tCelsius);
    
}
    
    
}
