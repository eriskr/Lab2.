package no.hvl.dat102;

import no.hvl.dat102.adt.FilmarkivADT;

public class Filmarkiv implements FilmarkivADT {

    private Film[] tabell;
    private int antall;


    public Filmarkiv (int size) {
        antall = 0;
        tabell = new Film[size];
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
    public void visFilm(int nr) { //FIXME endret grensesnitt!

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
                    film.getProdusent() + "\n" + "Filmselskap: \t" + film.getFilmselskap() + "\n" +
                    "Utgitt år: \t" + film.getLansering() + "\n" + "Sjanger: " + film.getSjanger().toString() + "\n");

        }

    }

    @Override
    public void leggTilFilm(Film nyFilm) {
        tabell[antall] = nyFilm;
        antall++;
    }

    @Override
    public boolean slettFilm(int filmnr) {
        for (int i = 0; i < antall; i++) {
            if (tabell[i].getFilmnr() == filmnr) {
                antall--;
                tabell[i] = tabell[antall];
                tabell[antall] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Film[] soekTittel(String delstreng) {

        Film[] nyTab = new Film[antall];
        int ant = 0;

        for (int i = 0; i < antall; i++) {
            if (tabell[i].getTittel().contains(delstreng)) {
                nyTab[ant] = tabell[i];
                ant++;
            }
        }
        Film[] filmer = new Film[ant];
        for (int i = 0; i < ant; i++) {
            filmer[i] = nyTab[i];
        }
        return filmer;
    }

    @Override
    public int antall(Sjanger sjanger) {

        int sum = 0;

        for (int i = 0; i < antall; i++) {

            if (tabell[i].getSjanger().equals(sjanger)) {

                sum ++;

            }
        }

        return sum;

    }

    @Override
    public int antall() {
        return antall;
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

    public Film[] getTabell() {
        return tabell;
    }
}
