package no.hvl.dat102.filmarkiv;

public class Film {

    private int filmnr;
    private String produsent;
    private String tittel;
    private int lansering;
    private String filmselskap;
    private Sjanger sjanger;

    public Film(){
        filmnr = 0;
        produsent = "";
        tittel = "";
        lansering = 0;
        filmselskap = "";
        sjanger = null;
    }

    public Film(int filmnr, String produsent, String tittel, int lansering, String filmselskap, Sjanger sjanger){
        this.filmnr = filmnr;
        this.produsent = produsent;
        this.tittel = tittel;
        this.lansering = lansering;
        this.filmselskap = filmselskap;
        this.sjanger = sjanger;
    }

    @Override
    public String toString() {
        return "Tittel: \t" + tittel + "\n" + "Produsent: \t" +
                produsent + "\n" + "Filmselskap: \t" + filmselskap + "\n" +
                "Utgitt år: \t" + lansering + "\n" + "Sjanger: \t" + sjanger.toString() + "\n";
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

    public void setSjanger (Sjanger sjanger) {

        this.sjanger = sjanger;

    }

    public Sjanger getSjanger () {

        return sjanger;

    }

    public boolean equals(Film film) {
        return film == this || filmnr == film.filmnr;
    }

    @Override
    public int hashCode() {
        Integer temp = filmnr;
        return temp.hashCode();
    }



}
