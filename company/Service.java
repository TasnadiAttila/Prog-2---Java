package com.company;

public class Service implements Feladat{


    @Override
    public void Feladat1() {
        for(int i = 1; i<=100;i++)
                System.out.println(i);
        }

    @Override
    public void Feladat2() {
        for(int i = 1; i<=100;i++) {
            if(i % 5 == 0 & i % 3 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0) {
                System.out.println("Fizz");
            }
            else if(i % 5 == 0){
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }

        }
    }

    @Override
    public boolean Feladat3(int num) {
        if(num <= 1)
        {
            return  false;
        }
        for (int i = 2;i<=num/2;i++)
        {
            if((num%i)==0)
                return false;
        }
        return true;
    }

    @Override
    public void Feladat4(int limit) {
        int a = 0;
        int b = 1;
        while (a < limit){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }
    }

    @Override
    public void Feladat5(double szam1, double szam2) {
        while (szam2 != 0){
            double temp = szam2;
            szam2 = szam1 % szam2;
            szam1 = temp;
        }
        double gcd = szam1;
        System.out.println(gcd);
    }
}
