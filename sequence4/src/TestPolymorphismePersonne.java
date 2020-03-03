import java.util.ArrayList;

public class TestPolymorphismePersonne {
    public static void main (String[] args){
        ArrayList<Personne> personnes ;
        personnes = new   ArrayList<Personne>();
        Etudiant et1 = new Etudiant("estevo","pierre","pierrer","grenoble","paris");
        Etudiant et2 = new Etudiant("picolo","jean","jeanr");
        Etudiant et3 = new Etudiant("BATISTA","ptista","jnnnn","grnnenoble","parnnnis");
        Etudiant et4 = new Etudiant("picolo","jennan","jeanr");
        Etudiant et5 = new Etudiant("estevno","n","pierriier","grennnoble","parniiis");
        Personnel p1 = new Personnel("ezzinne","winnssem","wieennme",3,543);
        Personnel p2 = new Personnel("eznzine","winnssem","wieemnne",3,543);
        Personnel p3 = new Personnel("ezzinne","winnssem","wieemnne",3,543);
        Personnel p4 = new Personnel("eznzine","winnssem","nnnn",3,543);
        Personnel p5 = new Personnel("ezznnnine","wissnnem","nnnn",3,543);
        personnes.add(et1);
        personnes.add(et2);
        personnes.add(et3);
        personnes.add(et4);
        personnes.add(et5);
        personnes.add(p1);
        personnes.add(p2);
        personnes.add(p3);
        personnes.add(p4);
        personnes.add(p5);
        for(int i=0; i< personnes.size();i++){
           System.out.println( " nom complet :" +  personnes.get(i).getNomComplet()+" mail: "+ personnes.get(i).getMail());

        }
        System.out.println(personnes); 





    }
}
