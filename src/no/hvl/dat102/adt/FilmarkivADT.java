package no.hvl.dat102.adt;

import no.hvl.dat102.filmarkiv.Film;
import no.hvl.dat102.filmarkiv.Sjanger;

public interface FilmarkivADT {

    /**
     * Hente en film med gitt nr fra arkivet
     * @param nr nummer på film som skal hentes.
     * @return film med gitt nr. Om nr ikke finnes, returneres null.
     */

    Film finnFilm(int nr);

    /**
     * Legger til en ny film
     * @param nyFilm Ny film
     */
    void leggTilFilm(Film nyFilm);

    /**
     * Sletter en film
     * @param filmnr Nummer til film som skal slettes
     * @return true dersom filmen ble slettet, false ellers
     */
    boolean slettFilm(int filmnr);

    /**
     * Søker og henter Filmer med en gitt delstreng i tittelen.
     * @param delstreng som må være i tittel
     * @return tabell med filmer som har delstreng i tittel
     */
    Film[] soekTittel(String delstreng);

    /**
     * Finner antall filmer med gitt sjanger
     * @param sjanger
     * @return antall filmer av gitt sjanger.
     */
    int antall(Sjanger sjanger);

    /**
     *
     * @return antall filmer i arkivet
     */
    int antall();

    default Film[] getTabell() {
        throw new UnsupportedOperationException();
    }

}
