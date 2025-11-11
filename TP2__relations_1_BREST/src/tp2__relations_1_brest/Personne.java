/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2__relations_1_brest;

/**
 *nom : relation 1
 * @author eloise
 * présentation : L’objectif de ce TP est de mettre en place une relation simple entre deux ou plusieurs objets
 */
public class Personne {
    String nom;
    String prenom;
    int nbVoitures;
    Voiture[] liste_voitures;

    public Personne(String unNom, String unPrenom) {
        nom = unNom;
        prenom = unPrenom;
        nbVoitures = 0;
        liste_voitures = new Voiture[3];
    }

      public boolean ajouter_voiture(Voiture voiture_a_ajouter) {
        if (voiture_a_ajouter.proprietaire != null) {
            return false;
        }
        if (nbVoitures >= 3) {
            return false;
        }
        liste_voitures[nbVoitures] = voiture_a_ajouter;
        nbVoitures = nbVoitures + 1;
        voiture_a_ajouter.proprietaire = new Personne(nom, prenom); 
        return true;
    }

    @Override
    public String toString() {
        return nom + " " + prenom;
    }
}
