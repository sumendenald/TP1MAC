/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ezzinew
 */
public class TestNote { 
    public static  void main (String[] args) {
        Note note1 = new Note(15.75f);
        Note note2 = new Note() ;
      System.out.println(note1.toString());
         System.out.println(note2.toString());
        note2.Saisir();
   System.out.println(note2.toString());        
    }
    
    
}
