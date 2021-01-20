package com.company;


import static com.company.Human.newHum;

public class Main {

    public static void main(String[] args) {
        System.out.println("Укажите данные первого человека");
        Human human1= newHum();
        System.out.println("Укажите данные второго человека");
        Human human2= newHum();
//     human1.speak(human1,human2);
//     human1.obshestvo(human1,human2);
//     human1.vmeste(human1,human2);
        System.out.println(human1.getClass());
        System.out.println(human2.getClass());
        human1.relat(human1,human2);


    }
}
