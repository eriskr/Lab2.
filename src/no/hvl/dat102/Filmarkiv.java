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

        Film film = null;

        for (int i = 0; i < antall; i++) {

            if (tabell[i].getFilmnr() == nr) {

                film = tabell[i];

            }
        }

        if (film == null) {

            System.out.println("Filmen finnes ikke i arkivet.");

        }

        else {

            System.out.println("Tittel: \t" + film.getTittel() + "\n" + "Produsent: \t" +
                    film.getProdusent() + "\n" + "Filmselskap: \t" + film.getFilmselskap() +
                    "Utgitt år: \t" + film.getLansering());

        }

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

        int sum = 0;

        for (int i = 0; i < antall; i++) {

            if (tabell[i].getSjanger() == sjanger) {

                sum ++;

            }
        }

        return sum;

    }

    @Override
    public int antall() {
        return 0;
    }


    private Film[] trimTab () {
        // n er antall elementer

        Film[] nytab = new Film[antall];
        int i = 0;

        while (i < antall) {

            nytab[i] = tabell[i];
            i++;

        }

        return nytab;

    }
}
