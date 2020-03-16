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
    private int  force_base = 10;
   private int  PV_MAX_base =100;
   private int  Ressource_base =1 ;
    private int pointsDeVie ;
    private Chateau chateau ;
    
    public Guerrier(){                                              // constructeur
        pointsDeVie= PV_MAX_base;

    }
    public int getForce(){                                          //force du guerrier
        
        return force_base ;
    }
    
    public int getpointsDeVie(){                                    //avoir nb pv du guerrier
        return pointsDeVie;
        
    }
    public abstract int getRessourcesPourEntrainement();               // ?




    public Couleur getCouleur(){                             // avoir la couleur du guerrier Rouge ou Bleu

        return chateau.getCouleur();

    }

    private int setPointsDeVie(int pointDeVie){              // definition de nb de point de vie du Guerrier
        pointsDeVie=pointDeVie;
        
        return pointsDeVie;
    }
    public void setChateau(Chateau chateau){                // setter de chateau

        this.chateau=chateau;
    }
    
    public boolean estVivant(){                             //savoir si le guerrier est toujours en vie
        
        return (pointsDeVie >0) ;
    }
    public boolean estBleu(){                               // true  si Bleu

        return  getCouleur() == Couleur.Bleu;
    }
    public boolean estRouge(){                             // true  si Rouge

        return  getCouleur() == Couleur.Rouge;
    }
    public void attaquer (Guerrier guerrier){              // attaque du GUerrier avec degat aleatoire a n lancé de dés
       Random ramdom = new Random() ;                      // par rapport a la force du guerrier

       int degats = 0;
       for( int  i = 0; i < force_base  ; i++){
           int v = ramdom.nextInt(3)+1;
           degats = degats+v;
       } 
       guerrier.subirDegats(degats);
       
    }
    protected void subirDegats(int degats){
        pointsDeVie = pointsDeVie -degats ;               // soustraction des degats au pv au Guerriers qui les subit
       
    }
    
}
/*
 + Guerrier()
+ getForce() : int k
+ getPointsDeVie() : int k
+ getRessourcesPourEntrainement : int k
+ getCouleur() : Couleur k
- setPointDeVie(int pointDeVie)k
+ setChateau(Chateau chateau)k
+ estVivant() : boolean k
+ estBleu() : boolean k
+ estRouge() : booleank
+ attaquer(Guerrier guerrier)k
 # subirDegats(int degats)k
 */
