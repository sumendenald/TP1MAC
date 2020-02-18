/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ezzinew
 */
public class TestPersonneEtudiant {
    public static  void main (String[] args) {
        Etudiant et1 = new Etudiant("estevo","pierre","pierrer","grenoble","paris");
        Etudiant et2 = new Etudiant("picolo","jean","jeanr");
        //Personne Pe1 = new Personne("carro","mathis","mathisc","grenoble 1");
       // Personne Pe2 = new Personne("melo","remi","melom","grenoble 2");
        et1.affiche();
        et2.affiche();
        et2.setAdresse("lile","tolouse");
        et2.affiche();
       // Pe1.affiche();
        
         
    }
    
}
