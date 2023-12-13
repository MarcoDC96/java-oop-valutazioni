package org.lessons.java.valutazioni;

import java.util.ArrayList;
public class Corso {
    //Attributi
    private ArrayList<Studente> studenti = new ArrayList<>();
    private ArrayList<Studente> studentiPromossi = new ArrayList<>();

    public ArrayList<Studente> getStudents() {
        return studenti;
    }

    public void elencoStudenti() {
        for (Studente studente : studenti) {
            System.out.println("ID: " + studente.getId());
        }
    }

    public void addStudenti(Studente studenteAggiunto) {
        studenti.add(studenteAggiunto);
    }

    public void removeStudenti(Studente studenteTolto) {
        studenti.remove(studenteTolto);
    }

    private void percentualePromossi() {
        for (Studente studente : studenti) {
            if (studente.Promosso()) {
                studenti.add(studente);
            }
        }
    }

    public ArrayList<Studente> ElencoPromossi() {

        return studentiPromossi;
    }

    public double PercentualeStudentiPromossi() {

        for (Studente studente : studenti) {
            if (studente.Promosso()) {
                studentiPromossi.add(studente);
            }
        }
        double promossi =(studentiPromossi.size()*100.0/studenti.size());

        return promossi;
    }
}




