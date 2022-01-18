package no.hvl.dat102;

import no.hvl.dat102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {

    private Film[] tabell;
    private int antall;


    public Filmarkiv (int antall) {

        antall = 0;
        tabell = new Film[antall];

    }

    /**
     * Øker tabellen med det dobbelte
     * @return Ny tabell
     */
    private Film[] utvid() {

        Film[] nyTab = new Film[antall*2];

        for (int i = 0; i < antall; i++) {

            nyTab[i] = tabell[i];

        }

        return nyTab;
    }

    @Override
    public void visFilm(int nr) {



    }

    @Override
    public void leggTilFilm(Film nyFilm) {

    }

    @Override
    public boolean slettFilm(int filmnr) {
        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {
        return new Film[0];
    }

    @Override
    public int antall(Sjanger sjanger) {
        return 0;
    }

    @Override
    public int antall() {
        return 0;
    }


    private Film[] trimTab (Film[] tab, int n) {
        // n er antall elementer

        Film[] nytab = new Film[n];
        int i = 0;

        while (i < n) {

            nytab[i] = tab[i];
            i++;

        }

        return nytab;

    }
}
