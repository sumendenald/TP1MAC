
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ezzinew
 */
public class Vecteurs {

    private static int[] v;
    private static int max(int[] v) {
        // {v.length>0} => {résultat = plus grande des valeurs contenues dans v}
        // c’est un parcours complet
         int mx = 0;
        for (int i = 0; i < v.length  ; i++) {
            if (v[i]> mx ) {
             mx = v[i];
            }
        }
        return mx ;
    }
    private static boolean estpresent(int[] v) {
        int valcherchee;
        boolean present = false ;
        Scanner entree = new Scanner(System.in); 
        System.out.print("Saisir un entier : ");
        valcherchee = entree.nextInt();
         for (int i = 0; i < v.length  ; i++) {
                if (v[i] == valcherchee ) {
                    present = true ;
                }
            }
   
        return present ;
    }
     public static void main (String[] args ){
      // creating Random object
       int[] arr = new int[5];
       for (int i = 0; i < arr.length; i++) {
         arr[i] = (int) (Math.random() * 100); // storing random integers in an array
      
        }
        
       
            
   
        System.out.print(estpresent(arr));
     
}
}
