/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ezzinew
 */
public class Note extends ReelContraint{
   public Note(){
        super(0,20);
    }
   public Note(float valeur){
       super(0,20);
       super.setValeur(valeur);
   }
    
}
