package no.hvl.dat102.klient;

import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;
import no.hvl.dat102.adt.FilmarkivADT;

public class Meny {

    private Tekstgrensesnitt tekstgr;
    private FilmarkivADT filmarkiv;

    public Meny(FilmarkivADT filmarkiv) {
        this.filmarkiv = filmarkiv;
        tekstgr = new Tekstgrensesnitt();
    }

    public void start() {
        filmarkiv.leggTilFilm(new Film(0, "Produsent1", "Action film 2", 2022, "Filmselskap1", Sjanger.ACTION));
        filmarkiv.leggTilFilm(new Film(1,"Produsent1","Hotel Caesar the Movie",2021,"Filmselskap2",Sjanger.DRAMA));
        filmarkiv.leggTilFilm(new Film(2,"Produsent2","Action film",1999,"Filmselskap1",Sjanger.ACTION));
        filmarkiv.leggTilFilm(new Film(3,"Produsent3","Ringenes mester",2013,"Filmselskap3",Sjanger.FANTASY));
        filmarkiv.leggTilFilm(tekstgr.lesFilm());
    }


}
