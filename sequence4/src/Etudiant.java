import java.util.*;

public class Etudiant extends Personne {


    private String adresseParents ;
    private  ArrayList<Note> notes ;

    public Etudiant(String nom, String prenom, String login){
        super(login,nom,prenom);
        this.notes = new ArrayList<Note>();

    }
    public Etudiant(String nom, String prenom, String login, String adresseE, String adresseP){
        super(login,nom,prenom,adresseE);
        this.adresseParents=adresseP;
        this.notes = new ArrayList<Note>();

    }
    public String getMail(){

        return (super.getNom()+ "" +super.getPrenom()+"@etu.univ-grenoble-alpes.fr");

    }


    public String getAdresseParents() {
           
        return adresseParents ;
    }
    public String setAdresse(String adresseE ,String adresseP){
       super.setAdresse(adresseE);
        this.adresseParents = adresseP ;
        return adresseParents ;

    }
    public float getMoyenne(){
        float sum= 0;


        for (int i=0; i<notes.size();i++){
            sum=sum+notes.get(i).getValeur();
        }
        float moyenne = sum / notes.size();
        return moyenne;
    }
    public ArrayList<Note> getNotes(){

        return notes;

    }
    public void addNote(float uneNote){
        Note not1 = new Note(uneNote);
        notes.add(not1);
    }
    public void affiche(){
        super.affiche();
        System.out.println("adresse des parents : " + adresseParents  );

    }
}

