/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_brest;

/**
 *nom : TP2_Bieres_BREST
 * @author eloise
 * présentation du projet : ce tp permet d'afficher les attributs propre à chaque bière et de voir si les bouteilles sont décapsulées ou non
 */
public class TP2_Bieres_BREST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvee des Trolls", 7.0, "Brasserie Dubuisson");
        BouteilleBiere uneSecondeBiere = new BouteilleBiere("Leffe", 6.6, "Abbaye de Leffe");
        BouteilleBiere uneTroisiemeBiere = new BouteilleBiere("Mont Blanc Genepi", 5.9, "Brasserie du Mont blanc");
        BouteilleBiere uneQuatriemeBiere = new BouteilleBiere("La Chouffe", 8.0, "Brasserie Chouffe");
        
        uneBiere.decapsuler();
        uneQuatriemeBiere.decapsuler();
        
        uneBiere.lireEtiquette();
        uneSecondeBiere.lireEtiquette();
        uneTroisiemeBiere.lireEtiquette();
        uneQuatriemeBiere.lireEtiquette();
        
        
    }
    
}
