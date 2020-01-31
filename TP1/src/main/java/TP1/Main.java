package TP1;
import java.io.*;

/**
 *
 * @author alexi
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println ("saisis un nombre entier:");
        int nbSaisi;
        // nbSaisi = 2;
        nbSaisi = Clavier.lireInt();
        System.out.println ("tu as saisi le nombre : " + nbSaisi);
        System.out.println ("saisis aussi une chaine de caractères :");
        String maChaine;
        maChaine = Clavier.lireString();
        System.out.println ("tu as saisi la chaine : " + maChaine);
    }
    
}
