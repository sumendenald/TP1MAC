/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ezzinew
 */
public class Personnel extends Personne {
    private int echelon ;
    private float valeurPointIndice;
    public Personnel(String nom,String prenom,String login ){
        super(nom,prenom,login);
        this.echelon = 1;
        this.valeurPointIndice = 0 ;
    }
     public Personnel(String nom,String prenom,String login, int echelon , int valeurPoint ){
        super(nom,prenom,login);
        this.echelon = echelon ;
        this.valeurPointIndice =  valeurPoint;
    }
    public int getEchelon(){
        return echelon;
    }
    public float getValeurPointIndice () {
       return  valeurPointIndice ;
    }
    public float getSalaire(){
        return (echelon * valeurPointIndice);
        
    }
    public void setEchelon( int echelon ){
        this.echelon=echelon;
       
    }  
    public void setValeurPointIndice(float valeurPoint){
        this.valeurPointIndice=valeurPoint;
    }
    public String getMail(){
       return (getNom()+ "" +getPrenom()+"@iut2.univ-grenoble-alpes.fr");
    }
    public void affiche(){
        super.affiche();
        System.out.println(" echelon :"+ echelon +" valeur point indice : "+ valeurPointIndice + " salaire: "+ getSalaire());
        
    }
}
