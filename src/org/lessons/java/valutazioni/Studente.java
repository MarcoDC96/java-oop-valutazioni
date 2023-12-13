package org.lessons.java.valutazioni;

import java.math.BigDecimal;

public class Studente {

    //Attributi
    private int id;
    private int percAssenze;
    private double mediaVoti;
    private static int counter = 10;
    //Costruttore
    public Studente(int percAssenze, double mediaVoti){
        this.id = counter++;
        this.percAssenze = percAssenze;
        this.mediaVoti = mediaVoti;
    }
    //GETTER E SETTER
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getPercAssenze() {
        return percAssenze;
    }
    public void setPercAssenze(int percAssenze) {
        this.percAssenze = percAssenze;
    }
    public double getMediaVoti() {
        return mediaVoti;
    }
    public void setMediaVoti(double mediaVoti) {
        this.mediaVoti = mediaVoti;
    }
    //Metodo
    public boolean Promosso() {
        if (percAssenze > 50) {
            return false;
        } else if (percAssenze >= 25 && mediaVoti > 2) {
            return true;
        } else if (percAssenze < 25 && mediaVoti >= 2) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return "id:"+id+ " percentuale assenze= "+ percAssenze+"%"+ " media voti: "+mediaVoti;

    }
}
