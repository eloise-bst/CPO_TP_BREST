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
public class Magicien extends Personnage{
    
    private boolean confirme;
        private boolean estConfirme;
    
    public Magicien(String nom, int niveauVie, boolean estConfirme) {
        super(nom, niveauVie);
        this.confirme = estConfirme;
        nbMagiciens++;
    }
    
    @Override
    protected void finalize() throws Throwable {
        try {
            nbMagiciens--; 
        } finally {
            super.finalize();
        }
    }

    public void setConfirme(boolean estConfirme) {
        confirme = estConfirme;
    }

    public String toString() {
        return "Magicien : " + nom + " (vie : " + niveauVie + ", confirmé : " + confirme + ")";
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
    
    if (arme instanceof Baton) {
            Baton baton = (Baton) arme;
            degats *= baton.getAge();
            seFatiguer();
        }
    
    if (estConfirme) {
            degats /= 2;
        }
        System.out.println(getNom() + " attaque " + cible.getNom() + " et inflige " + degats + " points de dégâts.");
        cible.estAttaque(degats);
    }



    @Override
    public int compterArmesDePredilection() {
        int nbBatons = 0;

        return 0; // Placeholder car l'accès est privé
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
