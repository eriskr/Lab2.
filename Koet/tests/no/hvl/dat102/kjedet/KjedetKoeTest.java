package no.hvl.dat102.kjedet;

import no.hvl.dat102.adt.KoeADT;
import no.hvl.dat102.adt.koeADTTest;

public class KjedetKoeTest extends koeADTTest {


    @Override
    protected KoeADT<Integer> reset() {
        return new KjedetKoe<>();
    }
}
