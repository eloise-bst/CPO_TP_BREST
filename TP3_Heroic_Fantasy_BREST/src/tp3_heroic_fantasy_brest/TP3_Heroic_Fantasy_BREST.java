/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heroic_fantasy_brest;

import Personnages.*;
import Armes.*;
import java.util.ArrayList;

/**
 *
 * @author elois
 */
public class TP3_Heroic_Fantasy_BREST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("1.3 TEST DES ARMES");
        
        Epee epee1 = new Epee("Excalibur", 7, 5);
        Epee epee2 = new Epee("Durandal", 4, 7);
        
        Baton baton1 = new Baton("Chêne", 4, 5);
        Baton baton2 = new Baton("Charme", 5, 6);
        
        ArrayList<Arme> inventaireArmesGlobal = new ArrayList<>();
        inventaireArmesGlobal.add(epee1);
        inventaireArmesGlobal.add(epee2);
        inventaireArmesGlobal.add(baton1);
        inventaireArmesGlobal.add(baton2);
        
        System.out.println("\nInventaire Global d'Armes :");
        for (int i = 0; i < inventaireArmesGlobal.size(); i++) {
            Arme arme = inventaireArmesGlobal.get(i);
            System.out.println("Arme " + (i + 1) + ": " + arme.toString());
        }
        
        System.out.println("\n2.3 TEST DES PERSONNAGES");
        
        Magicien garcimore = new Magicien("Garcimore", 44, false);
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        
        Guerrier conan = new Guerrier("Conan", 78, false);
        Guerrier lannister = new Guerrier("Lannister", 45, true);



        for (int i = 0; i < listeArmes.size(); i++) {
            System.out.println(listeArmes.get(i));
        }
        
        ArrayList<Personnage> troupe = new ArrayList<>();
        troupe.add(garcimore);
        troupe.add(gandalf);
        troupe.add(conan);
        troupe.add(lannister);
        
        Magicien gandalf = new Magicien("Gandalf", 65, true);
        Magicien garcimore = new Magicien("Garcimore", 44, false);

        Guerrier conan = new Guerrier("Conan", 78, false);
        Guerrier lannister = new Guerrier("Lannister", 45, true);
        
        ArrayList<Personnage> troupe = new ArrayList<>();
        troupe.add(garcimore);
        troupe.add(gandalf);
        troupe.add(conan);
        troupe.add(lannister);
        
        System.out.println("\nLa Troupe d'Héros :");
        for (Personnage p : troupe) {
            System.out.println(p.toString());
        }

        System.out.println("\n3.2 TEST DE LA GESTION DES ARMES");
        
        Guerrier guerrierPrincipal = new Guerrier("Aragorn", 100, true);
        Magicien magicienPrincipal = new Magicien("Merlin", 80, true);
        
        Epee epeeA = new Epee("Épée d'Acier", 10, 8);
        Epee epeeB = new Epee("Lame Sombre", 15, 6);
        Epee epeeC = new Epee("Katana", 12, 9);
        
        Baton batonX = new Baton("Bois de Saule", 5, 10);
        Baton batonY = new Baton("Sceptre", 8, 12);
        Baton batonZ = new Baton("Baguette", 3, 15);

        guerrierPrincipal.ajouterArme(batonX);
        guerrierPrincipal.ajouterArme(epeeA);
        guerrierPrincipal.ajouterArme(epeeB);
        guerrierPrincipal.equiperArme("Épée d'Acier");

        magicienPrincipal.ajouterArme(batonY);
        magicienPrincipal.ajouterArme(batonZ);
        magicienPrincipal.ajouterArme(epeeC);
        
        System.out.println("\nCaractéristiques des Héros Armés");
        System.out.println(guerrierPrincipal.toString());
        System.out.println(magicienPrincipal.toString());

        System.out.println("\n5.2 TEST DES MÉTHODES AVANT COMBAT");
        
        Magicien mageTest = new Magicien("Zimzar", 50, false);
        Guerrier guerrierTest = new Guerrier("Barak", 100, false);
        Personnage.afficherStatistiquesGlobales();
        System.out.println(mageTest);
        System.out.println(guerrierTest);

        System.out.println("\nBarak se fatigue...");
        guerrierTest.seFatiguer();

        System.out.println(guerrierTest);
        System.out.println("Barak est-il vivant ? " + guerrierTest.estVivant());

        System.out.println("\nBarak attaque Zimzar (dégâts de base 30)...");
        guerrierTest.attaquer(mageTest);

        System.out.println("\nCaractéristiques après attaque");
        System.out.println(mageTest);
        System.out.println(guerrierTest);

        System.out.println("\n5.4 TEST D'UN MORTAL COMBAT");
        
        Epee epeeF = new Epee("Excalibur", 7, 5);
        Epee epeeG = new Epee("Durandal", 4, 7);
        Baton batonH = new Baton("Chêne", 4, 5);
        Baton batonI = new Baton("Charme", 5, 6);

        Magicien mageDeCombat = new Magicien("Novice", 70, false); 
        Guerrier guerrierDeCombat = new Guerrier("Chevalier", 90, true); 
        
        mageDeCombat.ajouterArme(epeeG);
        mageDeCombat.ajouterArme(batonI);

        guerrierDeCombat.ajouterArme(epeeF);
        guerrierDeCombat.ajouterArme(batonH);

        mageDeCombat.equiperArme("Charme");
        guerrierDeCombat.equiperArme("Excalibur");

        System.out.println("\nÉtat initial du combat :");
        System.out.println(mageDeCombat);
        System.out.println(guerrierDeCombat);
]
        System.out.println("\nTour 1 : " + mageDeCombat.getNom() + " attaque");
        mageDeCombat.attaquer(guerrierDeCombat);
        System.out.println("\nCaractéristiques après attaque du magicien :");
        System.out.println(mageDeCombat);
        System.out.println(guerrierDeCombat);

        System.out.println("\n Tour 2 : " + guerrierDeCombat.getNom() + " attaque ");
        guerrierDeCombat.attaquer(mageDeCombat);
        System.out.println("\nCaractéristiques après attaque du guerrier :");
        System.out.println(mageDeCombat);
        System.out.println(guerrierDeCombat);

        System.out.println("\n--- État de vie ---");
        System.out.println(mageDeCombat.getNom() + " est vivant : " + mageDeCombat.estVivant());
        System.out.println(guerrierDeCombat.getNom() + " est vivant : " + guerrierDeCombat.estVivant());
    }
    }

        System.out.println("\nLa Troupe d'Héros :");
        for (Personnage p : troupe) {
            System.out.println(p.toString());
            System.out.println("---");
        }
