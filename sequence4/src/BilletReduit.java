public class BilletReduit extends Billet {
  private float tauxDeReduction;
    public BilletReduit(Trajet trajet, float prixAuKm, float tauxDeReduction){
        super(trajet,prixAuKm);
        setTauxDeReduction(tauxDeReduction);
        super.getPrix();

    }

    public float getTauxDeReduction() {

        return tauxDeReduction ;
    }

    public void setTauxDeReduction(float tauxDeReduction) {
        if (tauxDeReduction< (float) 0.05){
            this.tauxDeReduction = (float)0.05 ;
        }else if(tauxDeReduction>0.5){
            this.tauxDeReduction  = (float) 0.5 ;
        }else
        this.tauxDeReduction=tauxDeReduction;
    }
    public float getPrix(){

        return (super.getPrix()*(1-tauxDeReduction)) ;
    }
    public void  affiche(){

        System.out.println("ville depart : "+super.getDepart());
        System.out.println(" ville arrivee: "+ super.getArrivee());
        System.out.println(" distance : "+ super.getDistance());

        System.out.println("taux de reduction :"+ tauxDeReduction +" prix sans reduction : "+super.getPrix() +" prix avec reduction : "+getPrix());
        System.out.println("==============================================");
    }

}

