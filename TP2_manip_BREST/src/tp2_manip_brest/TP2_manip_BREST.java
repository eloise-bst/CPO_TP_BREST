/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_brest;

/**
 *nom : manip
 * @author eloise
 * présentation : L’objectif de ce TP est de manipuler les références objets comprendre un peu mieux les mécanismes 
de référence des objets.
 */
public class TP2_manip_BREST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette(600);
        Tartiflette assiette3 = assiette2;
        
        System.out.println("Avant modification des calories :");
        System.out.println("nb de calories de assiette1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de assiette2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de assiette3 : " + assiette3.nbCalories);
        
        assiette2.nbCalories += 100;
        
        System.out.println("Apres modification des calories : ");
        System.out.println("nb de calories de assiette2 : " + assiette2.nbCalories);
        System.out.println("nb de calories de assiette3 : " + assiette3.nbCalories);
        
        Tartiflette temp = assiette1;
        assiette1 = assiette2;
        assiette2 = temp;
        
        System.out.println("nb de calories de assiette1 : " + assiette1.nbCalories);
        System.out.println("nb de calories de assiette2 : " + assiette2.nbCalories);
        
        Moussaka[] tabMoussaka = new Moussaka[10];
        for (int i = 0; i < 10; i++) {
            tabMoussaka[i] = new Moussaka(400 + i*100); 
        }

        System.out.println("Calories des Moussakas :");
        for (int i = 0; i < 10; i++) {
            System.out.println("nb de calories de Moussaka " + (i+1) + " : " + tabMoussaka[i].nbCalories);
        }
    }
    
}
