import java.util.Scanner;
public abstract class ReelContraint {
    private float min;
    private float max;
    private float valeur ;

    public ReelContraint(float min ,float max){
        this.min = min;
        this.max=max ;
    }
    public float getValeur(){
        return valeur ;

    }
    public void setValeur(float valeur){
        if (valeur<20 && valeur>0 ){
            
            this.valeur = valeur ;
        }    
    }
    public void Saisir(){
        float note = max+1 ;
        while(note> max || note<min){
      
        Scanner entree = new Scanner(System.in); 
       System.out.print("Saisir une note entre " +min+" et "+ max );
       note  = entree.nextFloat();
       this.valeur=note;
           }

    }
    public String toString(){
            String a ;
            a="valeur :"+String.valueOf(valeur)+" min " + String.valueOf(min)+ " max " +String.valueOf(max);
        return a;
    }
}
