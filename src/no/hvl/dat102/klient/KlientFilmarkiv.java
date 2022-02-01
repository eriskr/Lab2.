package no.hvl.dat102.klient;

import no.hvl.dat102.Filmarkiv;

public class KlientFilmarkiv {
    public static void main(String[] args) {

        Filmarkiv arkiv = new Filmarkiv(100);
        Meny meny = new Meny(arkiv);
        meny.start();

        for (int i = 0; i < arkiv.antall(); i++) {
            System.out.println(arkiv.finnFilm(arkiv.getTabell()[i].getFilmnr()));
        }

        System.out.println();

    }

}
