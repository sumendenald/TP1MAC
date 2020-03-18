import java.util.TreeSet;

public class Groupe {
    private  String libelle ;
    private TreeSet<Etudiant> listeEtudiant  ;

    public  Groupe (String libelle){
        this.libelle = libelle;
        listeEtudiant = new TreeSet<>() ;
    }

    public String getLibelle() {

        return libelle;
    }

    public void setLibelle(String libelle){

        this.libelle = libelle;
    }

    public void addEtudiant(Etudiant etudiant){
        listeEtudiant.add(etudiant);


    }

    public boolean  contientEtudiant(Etudiant etudiant){

       return listeEtudiant.contains(etudiant);

    }

    public TreeSet<Etudiant> getEtudiants(){

        return listeEtudiant ;

    }
}
/*
   – libelle : String
Groupe(String libelle) // constructeur
+ getLibelle() : String
+ setLibelle(String Libelle)
+ addEtudiant(Etudiant etudiant)
+ contientEtudiant(Etudiant etudiant) : boolean
 + getEtudiants() : TreeSet<Etudiant>
 */