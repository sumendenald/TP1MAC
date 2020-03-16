public class ChefElfe extends Elf {
    private static final int   Ressourcedebase = 4;

    public int getForce(){

        return (2* super.getForce()) ;
    }
    public  int getRessourcesPourEntrainement(){
        return Ressourcedebase;

    }
}
