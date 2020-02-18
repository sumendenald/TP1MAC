/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ezzinew
 */
public class TestCercle {
     public static void main(String[] args) {
         Cercle cercle00 = new Cercle(18);
         Cercle cercleQcq = new Cercle(0,0,18);
         cercle00.affiche();
         cercleQcq.affiche();
         cercle00.deplaceCentre(27,33);
         cercle00.affiche();
     }
    
}
