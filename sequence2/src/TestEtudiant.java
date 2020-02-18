public class TestEtudiant {

    public static void main(String[] args) {
        // Déclaration et construction de deux objets
        Etudiant et1 = new Etudiant("dupont", "pierre", "dupontp");
        Etudiant et2 = new Etudiant("martin", "francis", "martinf");
        et1.addNote((float) 13.00);
        et1.addNote((float) 18.00);
        et1.addNote((float) 18.00);
        et1.addNote((float) 18.00);



        et1.getMoyenne();
   
        // Affichage des objets de type Etudiant
        System.out.println("\nAfficher les deux étudiants créés :");
       et1.affiche();
        et2.affiche();
        

    }
}
