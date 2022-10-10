package feladatok;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        //System.out.println(feladatok.palindrome());
        //System.out.println(feladatok.muvelet("%",2.0,3.0));
        //System.out.println(feladatok.szamolo("Elemental Hero",'e'));
        //System.out.println(feladatok.converter("Elemental Hero"));
        //System.out.println(feladatok.longest(new ArrayList<>(List.of("asd","asdasd","a","b"))));
        //System.out.println(feladatok.summa(new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10))));
        System.out.println(feladatok.filter(new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10)),6));
    }
}