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
        o1.setNumero("o1");
        o2.setNumero("o2");
        o3.setNumero("o3");
        o4.setNumero("o4");
        o5.setNumero("o5");
        o6.setNumero("o6");
        o7.setNumero("o7");
                
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
        
        s2.changerdeSalle(o4, s1);
        s2.changerdeSalle(o5, s1);
        
        System.out.println("Nombre ordi "+ s1.getNom() +": " + s1.getNbOrdi());
        System.out.println("Nombre ordi "+ s2.getNom() +": " + s2.getNbOrdi());
        
        Salle s3 = new Salle();
        
        System.out.println("Nom de la salle n°3");
        num = Clavier.lireString();
        s3.setNom(num);
        
        s1.changerdeSalle(o1, s3);
        s1.changerdeSalle(o2, s3);
      
        s2.changerdeSalle(o3, s3);
        s1.changerdeSalle(o4, s3);
        s1.changerdeSalle(o5, s3);
        s2.changerdeSalle(o6, s3);
        s2.changerdeSalle(o7, s3);
        
        System.out.println("Nombre ordi "+ s1.getNom() +": " + s1.getNbOrdi());
        System.out.println("Nombre ordi "+ s2.getNom() +": " + s2.getNbOrdi());
        System.out.println("Nombre ordi "+ s3.getNom() +": " + s3.getNbOrdi());
    }
    
    
    
}
