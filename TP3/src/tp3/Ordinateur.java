/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author slam
 */
public class Ordinateur {
        
        private String numero;
        private int etat;

        // restitue le numéro de l'ordinateur
        public String getNumero()
        {
            return numero;
        }

        // restitue l'état de fonctionnement (1 2 ou 3)
        public int getEtat()
        {
            return etat;
        }

        // donne la valeur passée en paramètre au numéro de l'ordinateur
        public void setNumero(String unNumero)
        {
            numero = unNumero;
        }

        // donne la valeur passée en paramètre à l'état de fonctionnement
        public void setEtat(int unEtat)
        {
            etat = unEtat;
        }

        // - permet de changer l'état de l'ordinateur de "à dépanner" à "en dépannage"
        // - produit une erreur si l'ordinateur n'est pas à dépanner ou s'il est déjà en dépannage
        public void depanner()
        {
            if (etat == 3)
            {
                System.out.println("Erreur : l'ordinateur est déjà en réparation");
            }
            else
            {
                if (etat == 1)
                {
                    System.out.println("Erreur : l'ordinateur fonctionne correctement");
                }
                else
                {
                    etat = 3;
                }
            }
        }

}
