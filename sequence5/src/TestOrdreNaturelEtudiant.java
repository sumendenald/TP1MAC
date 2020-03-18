import java.util.ArrayList;
import java.util.TreeSet;

public class TestOrdreNaturelEtudiant {
    public static void main(String[] args) {
        ArrayList<Etudiant> mesEtudiantsOrdreQcq = null;
        TreeSet<Etudiant> mesEtudiantsTries= null ;
        Etudiant et1 = new Etudiant("estevo", "pierre", "pierrer", "grenoble", "paris");
        Etudiant et2 = new Etudiant("picolo", "jean", "jeanr");
        Etudiant et3 = new Etudiant("bastista", "Loreol", "jnnnn", "grnnenoble", "parnnnis");
        Etudiant et4 = new Etudiant("kim", "Aranaba", "jeanr");
        Etudiant et5 = new Etudiant("estevo", "noooo", "pierriier", "grennnoble", "parniiis");
        mesEtudiantsOrdreQcq = new ArrayList<>();
        mesEtudiantsTries = new TreeSet<>();
        mesEtudiantsOrdreQcq.add(et1);
        mesEtudiantsOrdreQcq.add(et2);
        mesEtudiantsOrdreQcq.add(et3);
        mesEtudiantsOrdreQcq.add(et4);
        mesEtudiantsOrdreQcq.add(et5);

        mesEtudiantsTries.add(et1);
        mesEtudiantsTries.add(et2);
        mesEtudiantsTries.add(et3);
        mesEtudiantsTries.add(et4);
        mesEtudiantsTries.add(et5);
        for (Etudiant unetu : mesEtudiantsOrdreQcq) {
            unetu.affiche();
        }
        System.out.println("----------------------------------");
        for (Etudiant unetu : mesEtudiantsTries) {
            unetu.affiche();
        }
    }
}
