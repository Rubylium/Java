/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author slam
 */
public class Eleve {

    private String nom;
    private String prenom;
    private String ville;
    private int[] notes;
    private int nbNotes;

    public int getnbNotes() {
        return nbNotes;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getVille() {
        return ville;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void saisirNotes(int N) {
        notes = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Note n°" + (i + 1) + " : ");
            notes[i] = Clavier.lireInt();
        }
        nbNotes = N;
        System.out.println("Saisie des notes terminée");
    }

    public float calculerMoyenne() {
        float Total = 0;
        for (int i = 0; i < nbNotes; i++) {
            Total = Total + notes[i];
        }
        float Moyenne = Total / nbNotes;
        return Moyenne;
    }
}
