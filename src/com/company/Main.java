package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Укажите данные первого человека");
     Human human1= Human.newHum();
        System.out.println("Укажите данные второго человека");
        Human human2= Human.newHum();
     human1.speak(human1,human2);
     human1.obshestvo(human1,human2);
     human1.vmeste(human1,human2);
     human1.relat(human1,human2);

    }
}
