/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author elois
 */
public abstract class Arme {
    String nom;
    int niveauAttaque;

    public Arme(String unNom, int unNiveauAttaque) {
        nom = unNom;
        if (unNiveauAttaque <= 100) {
            niveauAttaque = unNiveauAttaque;
        } else {
            niveauAttaque = 100;
        }
    }

    public String nom() {
        return nom;
    }
    
    public int niveau() {
        return niveauAttaque;
    }

    @Override
    public String toString() {
        return nom + " (niveau d'attaque : " + niveauAttaque + ")";
        
    }

    public String getNom() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
 

    }





