package org.lessons.java.valutazioni;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Corso corso = new Corso();
        Random random = new Random();
        int numeroPartecipanti = random.nextInt(10, 20);

        for (int i = 0; i < numeroPartecipanti; i++) {
            int numeroAssenze = random.nextInt(0, 100);
            double media = random.nextDouble(0, 5);
            Studente studente = new Studente(numeroAssenze, media);
            corso.addStudenti(studente);
            System.out.println(studente);
        }


    }
}
