public class Etudiant extends Personne {


    private String adresseParents ;

    public Etudiant(String nom, String prenom, String login){
        super(login,nom,prenom);

    }
    public Etudiant(String nom, String prenom, String login, String adresseE, String adresseP){
        super(login,nom,prenom,adresseE);
        this.adresseParents=adresseP;

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
    public void affiche(){
        super.affiche();
        System.out.println("adresse des parents : " + adresseParents  );

    }
}

