package pl.sdacademy.java.basic.exercises.day3.task7;

import javax.sound.midi.Soundbank;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Burek");
        cats[1] = new Cat("Filemon");
        cats[2] = new Cat("Bonifacy");

        int i = 2;
        for (Cat cat : cats) {
            cat.makeSound();
            cat.eatMice(i++ * i);
            cat.print();
            System.out.println();
        }
    }
}
