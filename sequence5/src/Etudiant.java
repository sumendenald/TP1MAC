import java.util.*;

public class Etudiant extends Personne implements Comparable<Etudiant> {

    private String adresseParents;
    private ArrayList<Note> notes;
    private Groupe groupe;

    public Etudiant(String nom, String prenom, String login) {
        super(nom, prenom, login);
        this.notes = new ArrayList<Note>();

    }

    public Etudiant(String nom, String prenom, String login, String adresseE, String adresseP) {
        super(nom, prenom, login, adresseE);
        this.adresseParents = adresseP;
        this.notes = new ArrayList<Note>();

    }

    public String getMail() {
        return (super.getNom() + "" + super.getPrenom() + "@etu.univ-grenoble-alpes.fr");

    }

    public String getAdresseParents() {
        return adresseParents;
    }

    public String setAdresse(String adresseE, String adresseP) {
        super.setAdresse(adresseE);
        this.adresseParents = adresseP;
        return adresseParents;
    }

    public float getMoyenne() {
        float sum = 0;
        for (int i = 0; i < notes.size(); i++) {
            sum = sum + notes.get(i).getValeur();
        }
        float moyenne = sum / notes.size();
        return moyenne;
    }

    public ArrayList<Note> getNotes() {
        return notes;
    }

    public void addNote(float uneNote) {
        Note not1 = new Note(uneNote);
        notes.add(not1);
    }

    public void affiche() {
        super.affiche();
        System.out.println("adresse des parents : " + adresseParents );
        if(this.groupe!=null){
            System.out.println( " grp : " + groupe.getLibelle());
        }

    }

    @Override
    public int compareTo(Etudiant others_Etudiants) {
        int compare_noms = (others_Etudiants.getNom().compareTo(this.getNom()) == 0) ?
                others_Etudiants.getPrenom().compareTo(this.getPrenom()) :
                others_Etudiants.getNom().compareTo(this.getNom());
        return compare_noms;
    }

    public Groupe getGroupe() {
        return groupe;
    }

    public void setGroupe(Groupe groupe) {
        if (this.groupe == null) {
            this.groupe = groupe;
            groupe.addEtudiant(this);
        }
    }

    public boolean estDansGroupe(Groupe groupe) {
        int estDansLeMemeGroupe = (groupe.getLibelle().compareTo(this.getGroupe().getLibelle()));
        return (estDansLeMemeGroupe == 0);
    }

    public static class comparateurdemoyenne implements Comparator<Etudiant> {
        @Override
        public int compare(Etudiant o1, Etudiant o2) {
            if (o1.getMoyenne() < o2.getMoyenne()) {
                return -1;
            } else if (o1.getMoyenne() == o2.getMoyenne()) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
