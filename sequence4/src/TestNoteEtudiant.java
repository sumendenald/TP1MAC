public class TestNoteEtudiant {
    public static void  main(String[] args){
        Etudiant et1 = new Etudiant("estevo","pierre","pierrer","grenoble","paris");
        Etudiant et2 = new Etudiant("picolo","jean","jeanr");
        et1.addNote(15);
        et1.addNote(10);
        System.out.println("note :"+ et1.getNotes());
        System.out.println("moyenne :"+ et1.getMoyenne());

    }

}
