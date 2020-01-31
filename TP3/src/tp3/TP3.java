/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp3;

/**
 *
 * @author alexi
 */
public class TP3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Ordinateur o1 = new Ordinateur();
        Ordinateur o2 = new Ordinateur();
        Ordinateur o3 = new Ordinateur();
        Ordinateur o4 = new Ordinateur();
        Ordinateur o5 = new Ordinateur();
        Ordinateur o6 = new Ordinateur();
        Ordinateur o7 = new Ordinateur();
        
        String num;
        System.out.println("Num de l'ordinateur n°1");
        num = Clavier.lireString();
        o1.setNumero(num);
        
        System.out.println("Num de l'ordinateur n°2");
        num = Clavier.lireString();
        o2.setNumero(num);
        
        System.out.println("Num de l'ordinateur n°3");
        num = Clavier.lireString();
        o3.setNumero(num);
        
        System.out.println("Num de l'ordinateur n°4");
        num = Clavier.lireString();
        o4.setNumero(num);
        
        System.out.println("Num de l'ordinateur n°5");
        num = Clavier.lireString();
        o5.setNumero(num);
        
        System.out.println("Num de l'ordinateur n°6");
        num = Clavier.lireString();
        o6.setNumero(num);
        
        System.out.println("Num de l'ordinateur n°7");
        num = Clavier.lireString();
        o7.setNumero(num);
                
        Salle s1 = new Salle();
        Salle s2 = new Salle();
        
        System.out.println("Nom de la salle n°1");
        num = Clavier.lireString();
        s1.setNom(num);
        
        System.out.println("Nom de la salle n°2");
        num = Clavier.lireString();
        s2.setNom(num);
        
        
        s1.ajouterOrdi(o1);
        s1.ajouterOrdi(o2);
        
        s2.ajouterOrdi(o3);
        s2.ajouterOrdi(o4);
        s2.ajouterOrdi(o5);
        s2.ajouterOrdi(o6);
        s2.ajouterOrdi(o7);
        
        System.out.println("Nombre ordi "+ s1.getNom() +": " + s1.getNbOrdi());
        System.out.println("Nombre ordi "+ s2.getNom() +": " + s2.getNbOrdi());
        
        s1.ajouterOrdi(o4);
        s1.ajouterOrdi(o5);
        
    }
    
    
    
}
