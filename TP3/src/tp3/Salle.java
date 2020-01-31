/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

import java.util.ArrayList;

/**
 *
 * @author slam
 */
public class Salle {

        private String nom;
        private ArrayList<Ordinateur> lesOrdis;

        public Salle()
        {
            lesOrdis = new ArrayList<Ordinateur>();
        }

        // initialise le nom de la salle
        public void setNom(String unNom)
        {
            nom = unNom;
        }

        // donne le nombre d'ordinateurs dans la salle
        public int getNbOrdi()
        {
            return lesOrdis.size();
        }
        
        // donne le nom de la salle
        public String getNom()
        {
            return nom;
        }

        // donne la liste des ordinateurs sous forme de List
        public ArrayList<Ordinateur> getLesOrdis()
        {
            return lesOrdis;
        }

        // ajoute un ordinateur dans la salle
        public void ajouterOrdi(Ordinateur unOrdi)
        {
            lesOrdis.add(unOrdi);
        }

        // change un ordinateur de salle
        // l'ordinateur et la salle destinataire sont en paramètres 
        public void changerdeSalle(Ordinateur unOrdi, Salle uneAutreSalle)
        {
            lesOrdis.remove(unOrdi);
            uneAutreSalle.getLesOrdis().add(unOrdi);
        }

		// retourne l'objet Ordinateur de position rang
        public Ordinateur donnerOrdi(int rang)
        {
            return lesOrdis.get(rang-1);
        }

}
