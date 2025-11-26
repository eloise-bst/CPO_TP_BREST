/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

/**
 *
 * @author elois
 */
public class Baton extends Arme {
    int age;
    
    public Baton(String unNom, int unNiveauAttaque, int unAge) {
        super(unNom, unNiveauAttaque);
         if (unAge < 100) {
            unAge = age;
        } else {
            unAge = 99;
        }
    }
    
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Baton : " + nom + " (niveau " + niveauAttaque + ", âge " + age + ")";
    }
}
