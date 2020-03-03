public class Billet {
   private float prixAuKm;
   private Trajet trajet;

    public Billet(Trajet trajet, float prixAuKm){
        this.prixAuKm=prixAuKm;
        this.trajet=trajet;


    }
    public String getDepart (){
        return trajet.getDepart();
    }
    public String getArrivee(){
        return trajet.getArrivee();
    }
    public int getDistance(){
        return trajet.getDistance();
    }
    public float getPrix (){
        return trajet.getDistance() * prixAuKm ;
    }

    public float getPrixAuKm() {
        return prixAuKm;
    }

    public void setPrixAuKm(float prixAuKm) {
        if (prixAuKm>(float)2.0){
            prixAuKm= (float) 2.0;
        }else if (prixAuKm< (float) 0.1){
            prixAuKm= (float)0.1 ;
        }
        this.prixAuKm = prixAuKm;
    }
    public void affiche (){
        System.out.println("==============================================");
        trajet.affiche();
        System.out.println("prix: "+getPrix());
    }
}

/*
– prixAuKm : float
Billet(Trajet trajet, float prixAuKm)
+ getDepart() : String
+ getArrivee() : String
+ getDistance() : int
+ getPrixAuKm() : float
 + getPrix() : float
+ setPrixAuKm(float prixAuKm) + affiche()
 */