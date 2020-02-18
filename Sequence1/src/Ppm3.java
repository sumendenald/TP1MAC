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
public class Ppm3 {
    private static int ppm3(int monInt) {
        // {} => {résultat = plus proche multiple de 3 de val}}
        
       
        if (monInt % 3 == 1) {
            monInt = monInt - 1;
        } else if (monInt % 3 == 2) {
            monInt = monInt + 1;
        }
        System.out.println("L'entier le plus proche est : " + monInt);
        return monInt ;
    }
    
    public static void main (String[] args ){
        int nombre;
        Scanner entree = new Scanner(System.in); 
        System.out.print("Saisir un entier : ");
        nombre = entree.nextInt();
        ppm3(nombre);
    }
}
