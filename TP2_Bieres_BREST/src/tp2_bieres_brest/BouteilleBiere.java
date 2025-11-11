/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_brest;

/**
 *
 * @author elois
 */
public class BouteilleBiere {
    public String nom;
    public double degreAlcool;
    public String brasserie;
    public boolean ouverte;

    public BouteilleBiere(String unNom, double unDegre, String uneBrasserie) {
        nom = unNom;
        degreAlcool = unDegre;
        brasserie = uneBrasserie;
        ouverte = false;
    }

    public void lireEtiquette() {
        System.out.println("Bouteille de " + nom + " (" + degreAlcool + 
                " degres) \nBrasserie : " + brasserie);
    }
    
    public boolean decapsuler() {
        if (!ouverte) {
            ouverte = true;
            System.out.println(nom + " est decapsulee !");
            return true;
        } else {
            System.out.println("La bière est deja ouverte !");
            return false;
        }
    }
    
    @Override
    public String toString() {
        String chaine_a_retourner ;
        chaine_a_retourner = nom + " (" + degreAlcool + " degrés) Ouverte ? ";
        if (ouverte==true) chaine_a_retourner += "oui" ;
        else chaine_a_retourner += "non" ;
        return chaine_a_retourner ;
    }
}


