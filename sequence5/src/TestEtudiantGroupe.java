import java.util.ArrayList;

public class TestEtudiantGroupe {
    public static void main(String[] args) {
        Etudiant et1 = new Etudiant("estevo", "pierre", "pierrer", "grenoble", "paris");
        Etudiant et2 = new Etudiant("picolo", "jean", "jeanr");
        Etudiant et3 = new Etudiant("bastista", "Loreol", "jnnnn", "grnnenoble", "parnnnis");
        Etudiant et4 = new Etudiant("picolo","jennan","jeanr");
        Groupe gpA = new Groupe("A");
        Groupe gpB = new Groupe("B");
        et1.setGroupe(gpA);
        et2.setGroupe(gpB);
        et3.setGroupe(gpB);
        et3.setGroupe(gpB);
        for(Etudiant etudiant : gpA.getEtudiants()){
            etudiant.affiche();
        }


        System.out.println("============================");

        for(Etudiant etudiant : gpB.getEtudiants()){
            etudiant.affiche();
        }
    }
}
