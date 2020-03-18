import java.sql.ClientInfoStatus;
import java.util.*;

public class TestEtudiantTriMoyenne {
    public static void main(String[] args) {
        Etudiant et1 = new Etudiant("estevo", "pierre", "pierrer", "grenoble", "paris");
        Etudiant et2 = new Etudiant("picolo", "jean", "jeanr");
        Etudiant et3 = new Etudiant("bastista", "Loreol", "jnnnn", "grnnenoble", "parnnnis");
        Etudiant et4 = new Etudiant("picolo","jennan","jeanr");
        et1.addNote(15);
        et1.addNote(10);
        et1.addNote(12);
        et2.addNote(0);
        et2.addNote(5);
        et2.addNote(20);
        et3.addNote(20);
        et3.addNote(18);
        et3.addNote(14);
        List<Etudiant> mesEtudiantsTriesMoyenne = new ArrayList<>() ;
        mesEtudiantsTriesMoyenne.add(et1);
        mesEtudiantsTriesMoyenne.add(et2);
        mesEtudiantsTriesMoyenne.add(et3);

        Collections.sort(mesEtudiantsTriesMoyenne,new Etudiant.comparateurdemoyenne());
        Iterator<Etudiant> it = mesEtudiantsTriesMoyenne.iterator();
        while(it.hasNext()){

            Etudiant tmpObject = (Etudiant) it.next();
            tmpObject.affiche() ;
            System.out.println("moyenne: "+ tmpObject.getMoyenne());
        }

    }
}
