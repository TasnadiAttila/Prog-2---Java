/*
package com.company;
import static java.lang.System.out;
public class Main {

    static <T> void print(T a){
        System.out.println(a.toString());
    }
    public static void main(String[] args) {

        // Primitives
        int number1 = 0;
        long number2 = 1L;
        double number3 = 3.0;
        float number4 = 4.0f;

        System.out.println(number1 + number2);
        System.out.println(number2 + number3);
        System.out.println(number3 + number4);

        Object result = number1 + number2;
        System.out.println(result.getClass().getSimpleName() + ": " + result);

        System.out.println("\n-------------------------------\n");

        // Strings
        String text = "Hello There";
        String newText = new String("Hello There");

        System.out.println(text == newText);
        System.out.println(text.equals(newText));

        System.out.println(text.charAt(0));
        System.out.println(text.length());
        System.out.println(String.format("%d, %s, %c", 2, "epam", 'x')); // https://www.javatpoint.com/java-string-format
        System.out.println(text.substring(0,5));
        System.out.println(text.contains("e"));
        System.out.println(String.valueOf(234));
        System.out.println(text.replace("e","a"));
        System.out.println(text.split(" ")); // Array
        System.out.println(text.indexOf("e"));
        System.out.println(text.trim());

        System.out.println("\n-------------------------------\n");

        // IF

        int a = 2;
        int b = 3;

        if(a == b) {
            System.out.println("a equals b");
        } else {
            System.out.println("a not equals b");
        }

        if(a < b) {
            System.out.println("a is less then b");
        } else if(a > b) {
            System.out.println("a is greater then b");
        } else if(a == b) {
            System.out.println("a equals b");
        } else {
            System.out.println("IMPOSSIBLE");
        }

        System.out.println("\n-------------------------------\n");

        // FOR
        String test = "Hello There";
        int[] testArray = {1,2,3,4,5,6,7,8,9,10,11};

        for(int i = 0; i < test.length(); i++) {
            System.out.print(test.charAt(i) + " ");
        }

        System.out.println();

        for(int i: testArray) {
            System.out.printf("%d ", i);
        }

        System.out.println("\n-------------------------------\n");

        // WHILE

        int i = 0;
        while(i < testArray.length) {
            System.out.printf("%d ", i);
            i++;
        }

        System.out.println("\n-------------------------------\n");

        // SWITCH

        switch (a) {
            case 1:
                System.out.println("case 1");
                break;
            case 2:
                System.out.println("case 2");
                break;
            case 3:
                System.out.println("case 3");
                break;
            default:
                System.out.println("Default");
        }


    }
}
*/
package com.company;

public class Main{
    public static void main(String[] args) {
        /*
        String ex = "First Lesson";
        for(int i = 0; i < ex.length(); i++) {
            System.out.println(ex.charAt(i) + " " + (i+1) );
        */

        /*------------------------------------------------*/

        /*
        String s = "My name is Tasnádi Attila";
        for( String z : s.split(" ")){
            if(z.toLowerCase().contains("t")){
                System.out.println(z);
                break;
                }
            }

        */

        /*------------------------------------------------*/

        int a = 0;
        int b = 1;
        while (a<100){
            System.out.println(a);
            int c = a + b;
            a = b;
            b = c;
        }

    }
}

