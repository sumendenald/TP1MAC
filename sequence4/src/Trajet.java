public class Trajet {
    private String depart ;
    private String arrivee ;
    private int distance ;

    public Trajet ( String depart , String arrivee , int distance){
        this.depart = depart;
        this.arrivee = arrivee;
        this.distance = distance;
    }

    public String getDepart() {
        return depart;
    }

    public String getArrivee() {
        return arrivee;
    }

    public int getDistance() {
        return distance;
    }

    public void setDepart(String depart) {
        this.depart = depart.toUpperCase();
    }

    public void setArrivee(String arrivee) {
        this.arrivee = arrivee.toUpperCase();
    }

    public void setDistance(int distance) {
        if (distance< 5){
            distance=5;
        }else if (distance> 2000){
            distance= 2000;
        }
        this.distance = distance;
    }
    public void affiche (){
        System.out.println("ville depart : "+getDepart());
        System.out.println(" ville arrivee: "+ getArrivee());
        System.out.println(" distance : "+ getDistance());
    }
}
/*
– depart : String – arrivee : String – distance : int
Trajet(String depart, String arrivee, int distance)
+ getDepart() : String + getArrivee() : String + getDistance() : int
+ setDepart(String depart) + setArrivee(String arrivee) + setDistance(int distance)
+ affiche()
 */