/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author elois
 */
public class Epee extends Arme {
    int finesse;
    
    public Epee(String unNom, int unNiveauAttaque, int uneFinesse) {
        super(unNom, unNiveauAttaque);
         if (uneFinesse < 100) {
            finesse = uneFinesse;
        } else {
            finesse = 99;
        }
    }
    
    public int getIndiceFinesse() {
        return finesse;
    }

    @Override
    public String toString() {
        return "Epee : " + nom + " (niveau " + niveauAttaque + ", finesse " + finesse + ")";
    }
    
}
