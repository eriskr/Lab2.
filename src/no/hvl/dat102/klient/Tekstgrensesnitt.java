package no.hvl.dat102.klient;

import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;
import no.hvl.dat102.adt.FilmarkivADT;
import no.hvl.dat102.Filmarkiv;

import javax.swing.*;
import java.util.Arrays;

public class Tekstgrensesnitt {

    private static final String ugyldig = "Ugyldig input!\n";
    private static String mld = "";

    public Tekstgrensesnitt() {

    }

    // lese opplysningene om en FILM fra tastatur
    public Film lesFilm() {

        int nr = userInput("Filmnummer: ");
        String prod = JOptionPane.showInputDialog("Produsent: ");
        String tittel = JOptionPane.showInputDialog("Filmtittel: ");
        int lansering = userInput("Utgitt år: ");
        String selskap = JOptionPane.showInputDialog(mld + "Filmselskap: ");

        Sjanger sjanger = null;
        boolean ok;
        do {
            ok = true;
            try {
                sjanger = Sjanger.valueOf(JOptionPane.showInputDialog(mld + "Sjanger: ").toUpperCase());
            }
            catch (IllegalArgumentException e) {
                ok = false;
                mld = ugyldig;
            }
        } while (!ok);

      return new Film (nr, prod, tittel, lansering, selskap, sjanger);
    }

    private int userInput(String dialog) {

        boolean ok;
        int i = 0;

        do {
            ok = true;
            try {
                i = Integer.parseInt(JOptionPane.showInputDialog(mld + dialog));
            }
            catch (NumberFormatException e) {
                ok = false;
                mld = ugyldig;
            }
        } while (!ok);

        mld = "";
        return i;
    }

    // vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
    public void visFilm(Film film) {
        System.out.println(film);
    }

    // Skrive ut alle Filmer med en spesiell delstreng i tittelen
    public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {
        System.out.println(Arrays.toString(filma.soekTittel(delstreng)));
    }

    // Skriver ut alle Filmer av en produsent / en gruppe
    public void skrivUtFilmProdusent(Filmarkiv filma, String delstreng) {

        for (int i = 0; i < filma.antall(); i++) {
            if (filma.getTabell()[i].getProdusent().contains(delstreng)) {
                visFilm(filma.getTabell()[i]);
            }
        }
    }

    // O-notasjon
    // Skrive ut en enkel statistikk som inneholder antall Filmer totalt
    // og hvor mange det er i hver sjanger
    public void skrivUtStatistikk(FilmarkivADT filma) {

        System.out.println("Antall filmer: " + filma.antall());
        System.out.println();

        System.out.println("Antall filmer per sjanger: ");

        int action = filma.antall(Sjanger.ACTION);
        int drama = filma.antall(Sjanger.DRAMA);
        int fantasy = filma.antall(Sjanger.FANTASY);
        int historie = filma.antall(Sjanger.HISTORIE);
        int komedie = filma.antall(Sjanger.KOMEDIE);
        int scifi = filma.antall(Sjanger.SCIENCE_FICTON);

        System.out.println("Action: \t" + action + "\n" + "Drama: \t" + drama + "\n" +
                "Fantasy: \t" + fantasy + "\n" + "Historie: \t" + historie + "\n" +
                "Komedie: \t" + komedie + "\n" + "Science Fiction: \t" + scifi);

    }
}
