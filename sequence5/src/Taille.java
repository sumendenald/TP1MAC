public enum Taille {
    PETIT,MOYEN,GRAND;

    public String toString(){
        if(this==PETIT){
            return" Taille = PETIT";
        }else if(this==MOYEN){
            return "Taille = MOYEN" ;
        }else {
            return "Taille = Grand";
        }
    }



}
