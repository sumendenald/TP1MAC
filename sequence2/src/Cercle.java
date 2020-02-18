/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ezzinew
 */
public class Cercle {
    private Point centre ;
    private int rayon ;
   
    
   public Cercle (int monRayon ){
      this.rayon=monRayon;
      this.centre= new Point();
   }
   public Cercle ( int xOrigine, int yOrigine , int monRayon){
       this.centre= new Point();
      this.rayon=monRayon;
       
   }
 
       
       
   
   public int setRayon ( int nouveauRayon){
       rayon=nouveauRayon ;
       
       return rayon;
   }
  
   public int  getRayon  (){
       
       return rayon ;
        
   }
   public double getPerimetre() {
         
         return 2* Math.PI*rayon  ;
   }
   public double getSurface(){
       
       return Math.PI*rayon*rayon ;
   }
   public void deplaceCentre(int dx , int dy){
     centre.deplaceXY(dx, dy);
      
   } 
   public void affiche(){
       centre.affiche();
       System.out.println(  " surface " + getSurface() + " perimetre " + getPerimetre() + "rayon " +getRayon());
       
   }
}
