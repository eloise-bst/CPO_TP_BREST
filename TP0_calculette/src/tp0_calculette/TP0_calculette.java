/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp0_calculette;

import java.util.Scanner;

/**
 * Dans ce TP nous allons faire un programme simple dans lequel nous saisissons 2 entiers qui 
seront des opérandes, et un opérateur, au travers d’un menu. Le programme doit calculer le 
résultat de l’opération impliquant les 2 opérandes et l’opérateur sélectionné, et afficher le 
résultat. 
 * @author eloise
 * 20/10/2025
 */
public class TP0_calculette {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the operator :");
        System.out.println("1) add");
        System.out.println("2) Substract");
        System.out.println("3) Multiply");
        System.out.println("4) Divide");
        System.out.println("5) Modulo");
        
        Scanner sc = new Scanner(System.in);
        int operateur = sc.nextInt();
        
        if (operateur<1){
            System.out.println("Vous devez selectionner un nombre compris entre 1 et 5.");
        }
        if (operateur>5){
            System.out.println("Vous devez selectionner un nombre compris entre 1 et 5.");
        }
        
        System.out.println("Veuillez entrer un nombre : ");
        int operande1 = sc.nextInt();
        
        System.out.println("Veuillez entrer un second nombre : ");
        int operande2 = sc.nextInt();
        
        if (operateur==1){
            System.out.println("Le resultat de l'addition vaut "+(operande1+operande2));
        }
        if (operateur==2){
            System.out.println("Le resultat de la soustraction vaut " + (operande1 - operande2));
        }
        if (operateur==3){
            System.out.println("Le resultat de la multiplication vaut "+(operande1*operande2));
        }
        if (operateur==4){
            if (operande2==0){
                System.out.println("La division par 0 n'est pas possible ! Veuillez saisir un autre nombre");
            } else {
            System.out.println("Le resultat de la division vaut " + (operande1/operande2));
            }
        }
        if (operateur==5){
             if (operande2==0){
                System.out.println("La division par 0 n'est pas possible ! Veuillez saisir un autre nombre");
            } else {
            System.out.println("Le reste de la division vaut " + (operande1%operande2));
             }
        }
    }
    
}
