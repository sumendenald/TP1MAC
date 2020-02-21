public abstract class Personne {
    private String login;
    private String nom;
    private String prenom;
    private String adresse ;

    public Personne(String nom, String prenom, String login){
        this.nom = nom;
        this.prenom= prenom;
        this.login= login;

    }
    public Personne(String nom, String prenom, String login, String adresse){
        this.nom = nom;
        this.prenom= prenom;
        this.login= login;
        this.adresse= adresse ;

    }
    public String getNom(){

        return nom;
    }
    public String getPrenom(){

        return prenom;
    }
    public String getLogin(){

        return login;
    }
    public String getNomComplet(){
        return nom+prenom;
    }
    public  abstract String getMail();
    //  return (nom+"."+prenom+"@iut2.univ-grenoble-alpes.fr");
    
    public String getAdresse(){
        return adresse ;

    }
    public String setAdresse(String Adresse1){

        return (adresse= Adresse1);
    }
    public void affiche(){


        System.out.println("nom : "+nom +" prenom : " + prenom + " mail :" + getMail() + " login: " + login + " adresse: " + adresse);

    }
}


