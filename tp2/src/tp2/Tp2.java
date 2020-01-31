
package tp2;
public class Tp2 {
    public static void main(String[] args) {
        System.out.println("Numéro de l'ordinateur :");
        String num = Clavier.lireString();
        System.out.println("Salle dans laquelle il se trouve :");
        String salle = Clavier.lireString();
        System.out.println("Dans quel état est-il : (1=OK, 2=à dépanner, 3=en dépannage :");
        int etat = Clavier.lireInt();
        
        Ordinateur ordi = new Ordinateur();
        ordi.setNumero(num);
        ordi.setSalle(salle);
        ordi.setEtat(etat);
        
        
        System.out.println("Numero de l'ordinateur : " + ordi.getNumero());
        System.out.println("Dans la salle : " + ordi.getSalle());
        if (ordi.getEtat() == 1)
        {
            System.out.println("En fonctionnement");
        }
        else
        {  
            if (ordi.getEtat() == 2)
            
            {
                System.out.println("A dépanner");
            }
        
            else
            
            {
                System.out.println("En dépannage");
            }
        }
        
        System.out.println("Vers quelle salle transférer cet ordinateur ?");
        salle = Clavier.lireString();
        ordi.changerDeSalle(salle);
        System.out.println("L'ordi se trouve dans la salle : " + ordi.getSalle());
        
        System.out.println("Voulez-vous envoyer l'ordinateur en dépannage (o/n) ?");
        char rep = Clavier.lireString().charAt(0);
        if (rep == 'o')
        {
            ordi.depanner();
        }
        System.out.println("Etat de l'ordinateur = " + ordi.getEtat());
        
        
        
        
        System.out.println("Nom de l'élève:");
        String nom = Clavier.lireString();
        System.out.println("Prénom de l'élève:");
        String prenom = Clavier.lireString();
        System.out.println("Dans quel ville ?:");
        String ville = Clavier.lireString();
        System.out.println("Combien de note l'élève à eu ?");
        int nbNote = Clavier.lireInt();
        
        
        Eleve eleve1 = new Eleve();
        eleve1.setNom(nom);
        eleve1.setPrenom(prenom);
        eleve1.setVille(ville);
        eleve1.saisirNotes(nbNote);
        
        System.out.println("Moyenne de l'élève: " + eleve1.calculerMoyenne());
    }
}
