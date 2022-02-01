package no.hvl.dat102.filmarkiv;

import no.hvl.dat102.adt.FilmarkivADT;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class FilmarkivTest extends FilmarkivADTTest {

    @Override
    protected FilmarkivADT reset() {
        return new Filmarkiv(3);
    }

    @Test
    public void soekTittel() {
        setup();
        leggTilFilmer();

        Film[] tab = filmArkiv.soekTittel("tt");

        Assertions.assertEquals(f5, tab[3]);
        Assertions.assertEquals(f4, tab[2]);
        Assertions.assertEquals(f3, tab[1]);
        Assertions.assertEquals(f2, tab[0]);
    }

}
