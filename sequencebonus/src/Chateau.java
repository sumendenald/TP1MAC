import java.util.*;

public class Chateau {
    private int Ressource_Initial = 3 ;
    private int  Ressource_ajoutee_par_tour = 1 ;
    private int  Ressource ;
    private  Couleur couleur ;
    private LinkedList<Guerrier> guerriers_novice ;


    public Chateau(Couleur couleur){

    }
    public void ajoutGuerrierNovice(Guerrier guerrier){
            guerriers_novice.addLast(guerrier);
    }
    public LinkedList<Guerrier> getGuerriersNovice(){

        return guerriers_novice;
    }
    public  LinkedList<Guerrier> entrainer() {
        LinkedList<Guerrier> guerriers_noviceF = null ;
        if(guerriers_novice.isEmpty()){
            System.out.println("vous n'avez pas selectionner de soldat a entrainer");
        }else {
            while(guerriers_novice.size()>0){
                Guerrier first = guerriers_novice.peekFirst();
                if(Ressource> first.getRessourcesPourEntrainement()){
                    guerriers_noviceF.addLast(first);
                    guerriers_novice.pollFirst();
                }
                else break;
            }
        }
        return guerriers_noviceF;
    }
    private void incrementerRessources() {
        Ressource= Ressource+Ressource_ajoutee_par_tour;

    }
    public Couleur getCouleur(){

        return couleur;

    }
    public boolean estRouge(){
        return couleur.equals("Rouge");

    }
    public boolean estBleu(){
        return couleur.equals("Bleu");

    }

}
/*
+ ajoutGuerrierNovice(Guerrier guerrier)
 + getGuerriersNovices() : Guerrier[]
+ entrainer() : Guerrier[]
- incrementerRessources()
+ getCouleur() : Couleur + estBleu() : boolean
+ estRouge() : boolean
 */