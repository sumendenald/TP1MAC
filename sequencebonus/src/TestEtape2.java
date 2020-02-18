public class TestEtape2 {
    public static void main (String[] args){
        Nain nain1 = new Nain();
        Elf  elf1 = new Elf() ;

        while (nain1.estVivant() &&  elf1.estVivant() ) {

            elf1.attaquer(nain1);
        System.out.print("nain1 vie : "+ nain1.getpointsDeVie());
        System.out.println( " elf1 vie : "+elf1.getpointsDeVie());
        nain1.attaquer(elf1);
        System.out.print(" nain1 vie : "+ nain1.getpointsDeVie());
        System.out.println( " elf1 vie : "+elf1.getpointsDeVie());
        }
        if (!nain1.estVivant()){
            System.out.print("le nain1 est mort :(");
        }else{
            System.out.print("l'elfe est mort :(");
        }


    }
}
