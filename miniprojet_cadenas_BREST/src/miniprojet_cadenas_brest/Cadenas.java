/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miniprojet_cadenas_brest;

/**
 *
 * @author eloisebrest
 */
public class Cadenas {
    
    private final int[] codeSecret = new int[4];
    private final int maxTentatives = 5;
    private int tentativeActuelle = 0;
    
    private int nbExacts = 0; 
    private int nbTropHauts = 0; 
    private int nbTropBas = 0; 
    private boolean partieGagnee = false;
    
    public Cadenas() {
        genererCodeSecret();
    }
    
    public void genererCodeSecret() {
    tentativeActuelle = 0; 
    nbExacts = 0;
    nbTropHauts = 0;
    nbTropBas = 0;
    partieGagnee = false;
    
    java.util.Random rand = new java.util.Random();
    for (int i = 0; i < 4; i++) {
        codeSecret[i] = rand.nextInt(10); 
    }   
}
    public int gettentativeActuelle() { 
        return tentativeActuelle; 
    }

    public int getmaxTentatives() { 
        return maxTentatives; 
    }

    public int getnbExacts() { 
        return nbExacts; 
    }

    public int getnbTropHauts() { 
        return nbTropHauts; 
    }

    public int getnbTropBas() { 
        return nbTropBas; 
    }

    public boolean estPartieGagnee() { 
        return partieGagnee; 
    }

    public boolean estPartieTerminee() { 
        return partieGagnee || tentativeActuelle >= maxTentatives; 
    }
    
    public void soumettreProposition(int[] proposition) {
    if (estPartieTerminee()) {
        return; 
    }

    tentativeActuelle++; 
    nbExacts = 0;
    nbTropHauts = 0;
    nbTropBas = 0;
    
    for (int i = 0; i < 4; i++) {
        if (proposition[i] == codeSecret[i]) {
            nbExacts++;
        } else if (proposition[i] > codeSecret[i]) {
            nbTropHauts++;
        } else {
            nbTropBas++;
        }
    }
    
    if (nbExacts == 4) {
        partieGagnee = true;
    }
    
}
    public String getCodeSecretEnChaine() {
        return String.format("%d%d%d%d", codeSecret[0], codeSecret[1], codeSecret[2], codeSecret[3]);
    }

    }
    

