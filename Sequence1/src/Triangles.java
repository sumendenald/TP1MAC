
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
public class Triangles {
    
    private static void afficheLigne(int val) {
       // {} => {affiche une ligne comportant val caractères *}
       for (int i = 1; i <= val ; i++) {   // afficher la ligne correspondant à i
           System.out.print("* "); 
        }

    }
    private static void demiTriangleIsocele(int val) {
      // {} => {affiche le demi triangle isocèle de hauteur val}
       int X = 0 ;
       while (X < val) { 
         X=X+1;
         for (int i = 0; i < X  ; i++) {
            System.out.print("*");
             
           }
         val= val-1 ; 
         System.out.println("");
       } 
    }
    public static void main (String[] args ){
       int nombre;
       Scanner entree = new Scanner(System.in); 
       System.out.print("Saisir un entier : ");
       nombre = entree.nextInt();
       //afficheLigne(nombre);
       demiTriangleIsocele(nombre);
       triangleIsocele(nombre-1);
    }
    private static void triangleIsocele(int val) {
        // {} => {affiche le triangle isocèle de hauteur val}
        
         int X = val;
       while (X > 0) { 
         X=X-1;
         for (int i = 0; i < X  ; i++) {
            System.out.print("*");
             
           }
         val= val-1 ; 
         System.out.println("");
       } 
    }
    
   
}

