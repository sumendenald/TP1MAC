public class Nain  extends Guerrier {
    private static final int   Ressourcedebase = 1;

    protected void subirDegats(int degats) {
            super.subirDegats(degats/2);
    }
    public  int getRessourcesPourEntrainement(){
        return Ressourcedebase;

    }
}
