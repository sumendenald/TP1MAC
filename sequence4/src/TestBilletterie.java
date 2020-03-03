import java.util.ArrayList;

public class TestBilletterie {
    public static  void main (String[] args){
        Trajet trajet1 = new Trajet("marseille", "paris", 800);
        Trajet trajet2 = new Trajet("paris", "toulouse", 600);
        Trajet trajet3 = new Trajet("marseille", "lyon", 300);
        Trajet trajet4 = new Trajet("lyon", "paris", 600);
        Trajet trajet5 = new Trajet("lile", "paris", 200);
        Billet billet1 = new Billet(trajet1,(float)2.0);
        Billet billet2 = new Billet(trajet2,(float)1.0);
        Billet billet3 = new Billet(trajet3,(float)0.5);
        Billet billet4 = new Billet(trajet4,(float)0.2);
        Billet billet5 = new Billet(trajet5,(float)4.0);

        BilletReduit billetRe1 = new BilletReduit(trajet1,(float)2.0,(float)0.05);
        BilletReduit billetRe2 = new BilletReduit(trajet2,(float)1.0,(float)0.50);
        BilletReduit billetRe3 = new BilletReduit(trajet3,(float)0.5,(float)1.05);
        BilletReduit billetRe4 = new BilletReduit(trajet4,(float)0.2,(float)0.00);
        BilletReduit billetRe5 = new BilletReduit(trajet5,(float)4.0,(float)0.8);
        ArrayList<Billet> billets = new ArrayList<>();
        billets.add(billet1);
        billets.add(billet2);
        billets.add(billet3);
        billets.add(billet4);
        billets.add(billet5);
        billets.add(billetRe1);
        billets.add(billetRe2);
        billets.add(billetRe3);
        billets.add(billetRe4);
        billets.add(billetRe5);
        for (Billet b : billets){

            b.affiche();
        }



    }
}
