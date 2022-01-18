package no.hvl.dat102.klient;

import no.hvl.dat102.Film;
import no.hvl.dat102.Sjanger;
import no.hvl.dat102.adt.FilmarkivADT;
import no.hvl.dat102.Filmarkiv;

import javax.swing.*;
import java.util.Arrays;

public class Tekstgrensesnitt {

    public Tekstgrensesnitt() {

    }

    // lese opplysningene om en FILM fra tastatur
    public Film lesFilm(){

        int nr = Integer.parseInt(JOptionPane.showInputDialog("Filmnummer: "));
        String prod = JOptionPane.showInputDialog("Produsent: ");
        String tittel = JOptionPane.showInputDialog("Filmtittel: ");
        int lansering = Integer.parseInt(JOptionPane.showInputDialog("Utgitt år: "));
        String selskap = JOptionPane.showInputDialog("Filmselskap: ");
        Sjanger sjanger = Sjanger.valueOf(JOptionPane.showInputDialog("Sjanger: ").toUpperCase());

      return new Film (nr, prod, tittel, lansering, selskap, sjanger);
    }

    // vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
    public void visFilm(Film film) {

        System.out.println("Tittel: \t" + film.getTittel() + "\n" + "Produsent: \t" +
                film.getProdusent() + "\n" + "Filmselskap: \t" + film.getFilmselskap() + "\n" +
                "Utgitt år: \t" + film.getLansering() + "Sjanger: " + film.getSjanger().toString() + "\n");

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
