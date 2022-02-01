package no.hvl.dat102.filmarkiv;

import no.hvl.dat102.adt.FilmarkivADT;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public abstract class FilmarkivADTTest {

    protected FilmarkivADT filmArkiv;
    protected Film f1, f2, f3, f4, f5;

    protected abstract FilmarkivADT reset();

    @BeforeEach
    public void setup() {
        filmArkiv = reset();
        f1 = new Film();
        f2 = new Film(1, "produsent122", "tittel", 1997, "filmselskap", Sjanger.ACTION);
        f3 = new Film(3, "produsent2", "tittel3", 2005, "filmselskap1", Sjanger.DRAMA);
        f4 = new Film(5, "produsent1", "tittel4", 2200, "filmselskap3", Sjanger.SCIENCE_FICTON);
        f5 = new Film(2, "Produsent", "Detteerenfilm", 1968, "filmselskap69", Sjanger.KOMEDIE);
    }

    protected void leggTilFilmer() {
        filmArkiv.leggTilFilm(f1);
        filmArkiv.leggTilFilm(f2);
        filmArkiv.leggTilFilm(f3);
        filmArkiv.leggTilFilm(f4);
        filmArkiv.leggTilFilm(f5);
    }

    @Test
    public void leggTilOgFjern() {
        setup();
        Assertions.assertEquals(0, filmArkiv.antall());
        leggTilFilmer();
        Assertions.assertEquals(5, filmArkiv.antall());
        Assertions.assertTrue(filmArkiv.slettFilm(1));
        Assertions.assertTrue(filmArkiv.slettFilm(2));
        Assertions.assertTrue(filmArkiv.slettFilm(3));
        Assertions.assertTrue(filmArkiv.slettFilm(5));
    }

    @Test
    public void finnFilmTest() {
        setup();
        leggTilFilmer();
        Assertions.assertEquals(f2,filmArkiv.finnFilm(1));
        Assertions.assertEquals(f5,filmArkiv.finnFilm(2));
        Assertions.assertEquals(f3,filmArkiv.finnFilm(3));
        Assertions.assertEquals(f4,filmArkiv.finnFilm(5));
    }

    @Test
    public void antallSjangerTest() {
        setup();
        leggTilFilmer();
        leggTilFilmer();

        Assertions.assertEquals(2, filmArkiv.antall(Sjanger.ACTION));
        Assertions.assertEquals(2, filmArkiv.antall(Sjanger.DRAMA));
        Assertions.assertEquals(2, filmArkiv.antall(Sjanger.KOMEDIE));
        Assertions.assertEquals(2, filmArkiv.antall(Sjanger.SCIENCE_FICTON));
    }
}
