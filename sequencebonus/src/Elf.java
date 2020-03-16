public class Elf extends Guerrier {
    private static final int   Ressourcedebase = 2;

    public int getForce(){

        return (2* super.getForce()) ;
    }
    public  int getRessourcesPourEntrainement(){
        return Ressourcedebase;

    }
}
