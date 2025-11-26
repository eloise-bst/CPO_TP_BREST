/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.*;

/**
 *
 * @author elois
 */
public class Guerrier extends Personnage{
    
    boolean cheval;
    private boolean estACheval;
    
    public Guerrier(String nom, int niveauVie, boolean estACheval) {
        super(nom, niveauVie);
        this.estACheval = estACheval;
        nbGuerriers++;
    }
    
    @Override
    protected void finalize() throws Throwable {
        try {
            nbGuerriers--;
        } finally {
            super.finalize();
        }
    }
    
    public void setestACheval(boolean estACheval) {
        this.estACheval = estACheval;
    }

    public String toString() {
        return "Guerrier : " + nom + " (vie : " + niveauVie + ", à cheval : " + estACheval + ")";
    }

    @Override
    public void attaquer(Personnage adversaire) {
        int degats = 0;
        Arme arme = getArmeEnMain();
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    if (arme != null) {
            degats = arme.getNiveauAttaque();
        } else {
            degats = 1;
        }
    
    if (arme instanceof Epee) {
            Epee epee = (Epee) arme;
            degats *= epee.getIndiceFinesse();
            seFatiguer(); 
        }
    
    if (estACheval) {
            degats /= 2;
        }
    
    System.out.println(getNom() + " attaque " + cible.getNom() + " et inflige " + degats + " points de dégâts.");
        cible.estAttaque(degats);

    @Override
    public int compterArmesDePredilection() {
        int nbEpees = 0;
        return 0;
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

