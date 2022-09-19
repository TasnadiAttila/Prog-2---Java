package com.company;
import java.util.*;
public class Main {

    public static void main(String[] args) {

    Student s1 = new Student("Elso","elso@gmail.com",21,"A street");
    Student s2 = new Student("Masodik","maosidk@gmail.com",24,"B street");
    Student s3 = new Student("Harmadik","harmadik@gmail.com",27,"C street");
    Student s4 = new Student("Negyedik","negyedik@gmail.com",30,"D street");


    Set<Student> studentSet = new HashSet<>(Set.of(s1,s2,s3,s4));



    }
}
/*
* Ide   int a  = 5; Innen
*  Unboxing                   autoboxing
* Innen Intiger a = 5; Ide
*
*
* 2, String: char[] van mögötte
* 3, String a = "valam" <-  eltárolja a memóriába
*                           jobb mint a String a = new String("valami")
* 4, Array egy static tömb - ugyan olyan tipusú elemek tárolására
* 5, Public,Protected,Private,Default
* 6, Static és Final
*       var + final = const
*       final: class, method
*       method+final: nem lehet felülírni
*       class+final: nem lehet örökölni
* 7, Class - Blueprint
*    Object - memóriában létező obj amit a blueprint alapján hozunk létre
*
* 8, Inheritance
*    Encapsulation
*    Polymorphism
*       -Ugyanabban osztályban,metódus névvel de kölönböző paraméterekkel
*       -Másik osztály a többi ugyanaz
*    Abstraction
* LISTA: engedi a duplikált elemeket
* Array list vs Linked list (FIX INTERJÚ KÉRDÉS)
* */