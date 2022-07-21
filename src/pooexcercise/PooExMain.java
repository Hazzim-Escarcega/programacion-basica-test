package pooexcercise;

import pooexcercise.clases.ClassHija;

public class PooExMain {

    public static void main(String[] args) {
        ClassHija claseHija = new ClassHija("Este es mi atributo uno", "Este es mi atributo dos");
        claseHija.metodoHijaUno();
        claseHija.metodoHijaDos();
    }


}
