/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1_fix;
import java.io.*;
/**
 *
 * @author alexi
 */
public class TP1_FIX {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String choix = "o";
        while (choix.equals("o")) {
            System.out.println ("saisis le nom du représentant:");
            String represantant = Clavier.lireString();
            System.out.println ("Saisr puissance du véhicule :");
            int puissance = Clavier.lireInt();
            System.out.println ("Saisir le nombre de kilometres parcouru : ");
            int Km = Clavier.lireInt();
            
            System.out.println ("Nom du representan: " + represantant);
            System.out.println ("Puissance du véhicule: "+ puissance);
            System.out.println ("Kilometres parcouru: "+ Km);
            
            System.out.println ("Voulez-vous saisir un autre representant (O/N) ?");
            choix = Clavier.lireString();
            System.out.println (choix);
        }
    }
    
}
