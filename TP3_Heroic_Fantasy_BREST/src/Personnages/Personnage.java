/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Personnages;

import Armes.*;
import Personnages.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author elois
 */
public abstract class Personnage implements etreVivant {
    String nom;
    int niveauVie;
    private List<Arme> inventaireArmes;
    private Arme armeEnMain;
    
    private static int nbPersonnages = 0;
    static int nbGuerriers = 0;
    static int nbMagiciens = 0;
    
    public Personnage(String nom, int niveauVie) {
        this.nom = nom;
        this.niveauVie = niveauVie;
        this.inventaireArmes = new ArrayList<>();
        this.armeEnMain = null;
        nbPersonnages++;
    }
    
    public int getNiveauVie() {
        return niveauVie;
    }
    public String getNom() {
        return nom;
    }
    public Arme getArmeEnMain() {
        return armeEnMain;
    }
    
    public void ajouterArme(Arme arme) {
        if (inventaireArmes.size() < 5) {
            inventaireArmes.add(arme);
            System.out.println(this.nom + " a ajouté " + arme.getNom() + " à son inventaire. (" + inventaireArmes.size() + "/5)");
        } else {
            System.out.println(this.nom + " a déjà 5 armes. Impossible d'ajouter " + arme.getNom());
        }
    }
    
    public void equiperArme(String nomArme) {
        for (Arme arme : inventaireArmes) {
            if (arme.getNom().equalsIgnoreCase(nomArme)) {
                this.armeEnMain = arme;
                System.out.println(this.nom + " a bien équipé l'arme: " + nomArme);
                return;
            }
        }
        System.out.println("Erreur: L'arme " + nomArme + " n'a pas été trouvée dans l'inventaire de " + this.nom);
    }

    @Override
    public void seFatiguer() {
        this.niveauVie -= 10;
        System.out.println(this.nom + " est fatigué et perd 10 points de vie. Vie actuelle: " + this.niveauVie);
    }

    @Override
    public boolean estVivant() {
        return this.niveauVie > 0;
    }

    @Override
    public void estAttaque(int points) {
        this.niveauVie -= points;
        System.out.println(this.nom + " est attaqué et perd " + points + " points de vie. Vie actuelle: " + this.niveauVie);
    }
        
    public abstract void attaquer(Personnage adversaire);

    @Override
    protected void finalize() throws Throwable {
         try {
            nbPersonnages--; 
            System.out.println(this.nom + " a été détruit. Personnages restants : " + nbPersonnages);
        } finally {
            super.finalize();
        }
    }
    
    @Override
    public String toString() {
        String armeStr = (armeEnMain != null) ? "\n - Arme en main : " + armeEnMain.toString() : "\n - Non armé";
        return "Personnage [Nom=" + nom + ", Niveau de vie=" + niveauVie + armeStr + "]";
    }
    public static int getTotalPersonnages() {
        return nbPersonnages;
    }

    public static void afficherStatistiquesGlobales() {
        System.out.println("\nStatistiques Globales");
        System.out.println("Personnages totaux créés : " + nbPersonnages);
        System.out.println("Guerriers créés : " + nbGuerriers);
        System.out.println("Magiciens créés : " + nbMagiciens);
    }
}


