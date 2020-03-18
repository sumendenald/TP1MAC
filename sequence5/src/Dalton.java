import java.util.*;

public class Dalton  implements Comparable<Dalton> {
    private String nom ;
    private Taille taille ;

    public Dalton(String nom ,Taille taille){
        this.nom=nom;
        this.taille=taille;
    }

    public  String getNom(){
        return nom;
    }
    public void setNom(String Nom){
        this.nom=nom;
    }

    public Taille getTaille() {
        return taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

    public void affiche(){
        System.out.println("Nom : "+nom+" Taille: "+getTaille());
    }


    @Override
    public int compareTo(Dalton other_dalton) {
        int compare_taille = other_dalton.taille.compareTo(this.taille);
        if(compare_taille==0){
            compare_taille = other_dalton.nom.compareTo(this.nom);
        }

        return compare_taille;
    }
    public static class comparateurNom implements Comparator<Dalton>{
        @Override
        public int compare(Dalton d1, Dalton d2) {

            return d1.getNom().compareTo(d2.getNom());
        }
    }
    public static class comparateurTaille implements Comparator<Dalton>{
        @Override
        public int compare(Dalton d1, Dalton d2) {  // methode de comarator

            return d1.getTaille().compareTo(d2.getTaille()); // compare taille -1 si inferieur 0 si egale 1 si superieur
        }
    }
}