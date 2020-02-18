public class Etudiant {
    private String login;
    private String Prenom;
    private String Adresse;
    private String Nom ;
    private float[] notes;
    private int nbnote ;
    private float moyenne  ;
    private String mail ;
    private float noteaj ;
    
   public  Etudiant(String Nom, String Prenom, String login) {
        setLogin(login);
        this.Nom= Nom;
        this.Prenom = Prenom;
        nbnote = 0 ;
       moyenne =0 ;
       noteaj =0;
       this.notes= new float[5];
    }
    public String getLogin() {
        return login;
    }
    public String getNom() {
        return Nom;
    }
    public String getPrenom()  {
        return Prenom;
    }
    public String getAdresse() {
        return Adresse;
    }
    public String getMail() {
          
        return mail ;
    }
    public String getNomComplet() {
        
        return Nom+Prenom;
    }



    public void setLogin(String login) {
        this.login = login.toLowerCase();
    }
    
    public  String setAdresse(String adresse){
       
        return adresse;
    }
    
    public  void addNote( float notei) {
       
        if (nbnote<6){
       
           if (notei < 0 ) {
               notei = 0;
           } else if (notei>20) {
               notei = 20 ;
           }
        notes[nbnote] = notei  ;
        nbnote++;
        } else {
             System.out.println("trop de note  derniere note ajouter " + notes[nbnote]);
         }
        
    }
    public  float getMoyenne(){
       
       
       
       for (int i = 0; i < nbnote; i++){
            noteaj = noteaj + notes[i];
        }
       
        moyenne = noteaj / nbnote;
           
       
        return moyenne;
    }
    
    public  void affiche(){
        System.out.print("nom : "+Nom+ " -  prenom: " +Prenom + " -  login: "+ login + "- email de l'etudiant " + mail );
        if( nbnote>0) {
        System.out.print(" -moyenne de l'eleve :"+ moyenne);
        }else {
            System.out.print(" l'eleve n'a pas encore de note");
        }
        System.out.println(" ");
             
        
         
    }

    
    

}
