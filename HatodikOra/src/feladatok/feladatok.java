package feladatok;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class feladatok {
    //Feladat 1
    public static String palindrome() {
        String szo;
        Scanner scr = new Scanner(System.in);
        szo = scr.next();
        char[] tomb = szo.toCharArray();
        for(int i = 0; i < tomb.length; i++){
            if(tomb[i]!=tomb[tomb.length-1-i])
            {
                return "Nem palindrom";
            }
        }
        return "Palindrome";
    }
    //Feladat 2
    public static double muvelet(String jel, Double szam1, Double szam2){
        switch (jel){
            case "%":
                return szam1/szam2;
            case "*":
                return szam1*szam2;
            case "+":
                return szam1+szam2;
            case "-":
                return szam1-szam2;
            default:
                return 0;
        }
    }

    //Feladat 3
    public static Integer szamolo(String szo, Character keres){
        char[] betuk = szo.toLowerCase().toCharArray();
        int temp = 0;
        for(int i = 0; i <betuk.length; i++)
        {
            if(betuk[i] == keres){
                temp = temp + 1;
            }
        }
        return temp;
    }

    //Feladat 4
    public static char[] converter(String szo){
        char[] betuk = szo.toCharArray();
        for(int i = 1;i<betuk.length;i+=2){
            betuk[i] = Character.toUpperCase(betuk[i]);
        }
        return betuk;
    }

    //feladatCO - 1
    public static String longest(ArrayList<String> szavak){
        String leghosszabb = szavak.get(0);
        for(int i = 0;i<szavak.size();i++)
        {
            if(szavak.get(i).length() > leghosszabb.length()){
                leghosszabb = szavak.get(i);
            }
        }
        return leghosszabb;
    }

    //FeladatCO - 2
    public static Integer summa(ArrayList<Integer> szamok){
        int osszeg = 0;
        for(int i = 0; i<szamok.size();i++){
            osszeg+=szamok.get(i);
        }
        return osszeg;
    }
    //FeladatCO - 3
    public static ArrayList<Integer> filter(ArrayList<Integer> szamok, int filler){
        ArrayList<Integer> filtered = new ArrayList<>();
        for(int i : szamok){
            if(i > filler){
                filtered.add(i);
            }
        }
        return filtered;
    }

    //FeladatCO - 5
}
