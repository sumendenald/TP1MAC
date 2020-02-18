/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Random;
/**
 *
 * @author ezzinew
 */
public  abstract class Guerrier {
    private int  force ;
    private int pointsDeVie ;
    
    public Guerrier(){
        force=10;
        pointsDeVie=100;
    }
    public int getForce(){
        
        return force ;
    }
    
    public int getpointsDeVie(){
        return pointsDeVie;
        
    }
    
    public int setPointsDeVie(int pointDeVie){
        pointsDeVie=pointDeVie;
        
        return pointsDeVie;
    }
    
    public boolean estVivant(){
        
        return (pointsDeVie >0) ;
    }
    public void attaquer (Guerrier guerrier){
       Random ramdom = new Random() ;
       
       int degats = 0;
       for( int  i = 0; i < force  ; i++){
           int v = ramdom.nextInt(3)+1;
           degats = degats+v;
       } 
       guerrier.subirDegats(degats);
       
    }
    protected void subirDegats(int degats){
        pointsDeVie = pointsDeVie -degats ;
       
    }
    
}
