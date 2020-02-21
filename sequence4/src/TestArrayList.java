import java.util.*;


public class TestArrayList {
    public static void main (String[] args ){
        ArrayList<Integer> alInteger = new ArrayList<Integer>();
        ArrayList<String> alString = new ArrayList<String>();

        alInteger.add(15);
        alInteger.add(38);
        alInteger.add(1);
        alInteger.add(0);
        alInteger.add(28);

        System.out.println("alinteger = "+alInteger);
        Collections.sort(alInteger);
        System.out.println("alinteger trier = "+alInteger);
        alString.add(" aaaaa");
        alString.add(" paris");
        alString.add(" new york ");
        alString.add(" marseille ");
        alString.add(" grenoble ");
        System.out.println("alString = "+alString);



    }
}
