/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ezzinew
 */
public class Point {
    private int X ;
    private int y ;
    
    public Point() {
        X=0;
        y=0;
    }
    public Point(int valX,int valY) {
        setX(valX);
        setY(valY);
        
    }
    public void deplaceXY(int dX,int dY){
         X=X+dX ;
       y=y+dY;
    }
    public int getX(){
        
        return X;
    }
    public int getY(){
        
        return y ;
    }
    public void setX(int valX){
        X=valX;
        if(X<0){
           X=0;
       }
        
    }
    public void setY(int valy){
        y=valy;
        if(y<0){
           y=0;
       }
   
    }
    public void affiche (){
        System.out.println("X "+ X + " Y " + y );
    }
    
}
