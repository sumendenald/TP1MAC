import java.util.*;


public class TestDalton {
    public static void main(String[] args) {
         NavigableSet<Dalton> listeDaltonnom = new TreeSet<>(new Dalton.comparateurNom()); // Comparator dans declaration TreeSet
        NavigableSet<Dalton> listeDaltonTaille= new TreeSet<>(new Dalton.comparateurTaille()) ;// Comparator dans declaration TreeSet
        Dalton dalton1 = new Dalton("Joe",Taille.PETIT);// declaration objet
        Dalton dalton2 = new Dalton("Jack",Taille.MOYEN);
        Dalton dalton3 = new Dalton("William",Taille.MOYEN);
        Dalton dalton4 = new Dalton("Averell",Taille.GRAND);
        listeDaltonnom.add(dalton1);  // ajout dans liste
        listeDaltonnom.add(dalton2);
        listeDaltonnom.add(dalton3);
        listeDaltonnom.add(dalton4);
       listeDaltonTaille.add(dalton1);
        listeDaltonTaille.add(dalton2);
        listeDaltonTaille.add(dalton3);
        listeDaltonTaille.add(dalton4);
        System.out.println("liste non trier ");  //affichage non trier (que pour la premiere partie
        for(Dalton undalton : listeDaltonnom){
            undalton.affiche();
        }
        System.out.println("==============================="); //trier par nom
        Iterator<Dalton> it = listeDaltonnom.iterator(); // iterator
        while(it.hasNext()){  // tant que objet suivant existe

            Dalton tmpObject = (Dalton) it.next(); // objet temporaire
            tmpObject.affiche() ; //  methode affiche herité de Dalton
        }
        System.out.println("===============================");//trier par nom
        Iterator<Dalton> it2 = listeDaltonTaille.iterator();
        while(it2.hasNext()){

            Dalton tmpObject = (Dalton) it2.next();
            tmpObject.affiche() ;
        }

    }
}
