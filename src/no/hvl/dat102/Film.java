package no.hvl.dat102;

public class Film {

    private int filmnr;
    private String produsent;
    private String tittel;
    private int lansering;
    private String filmselskap;

    public Film(){
        filmnr = 0;
        produsent = "";
        tittel = "";
        lansering = 0;
        filmselskap = "";

    }

    public Film(int filmnr, String produsent, String tittel, int lansering, String filmselskap){
        this.filmnr = filmnr;
        this.produsent = produsent;
        this.tittel = tittel;
        this.lansering = lansering;
        this.filmselskap = filmselskap;

    }

    public int getFilmnr() {
        return filmnr;
    }

    public void setFilmnr(int filmnr) {
        this.filmnr = filmnr;
    }

    public String getProdusent() {
        return produsent;
    }

    public void setProdusent(String produsent) {
        this.produsent = produsent;
    }

    public String getTittel() {
        return tittel;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public int getLansering() {
        return lansering;
    }

    public void setLansering(int lansering) {
        this.lansering = lansering;
    }

    public String getFilmselskap() {
        return filmselskap;
    }

    public void setFilmselskap(String filmselskap) {
        this.filmselskap = filmselskap;
    }

    public boolean equals(Film film) {

        // If the object is compared with itself then return true
        if (film == this || filmnr == film.filmnr) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(film instanceof Film)) {
            return false;
        }

        return false;

    }
    @Override
    public int hashCode() {
        Integer temp = filmnr;
        return temp.hashCode();
    }



}
