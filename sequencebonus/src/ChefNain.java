public class ChefNain  extends  Nain{
    private static final int   Ressourcedebase = 3;



    protected void subirDegats(int degats) {

            super.subirDegats(degats / 2);
    }
    public  int getRessourcesPourEntrainement(){
        return Ressourcedebase;

    }


}
