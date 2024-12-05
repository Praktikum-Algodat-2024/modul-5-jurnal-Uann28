class Tetangga {
    Simpul simpul;
    Tetangga berikut;
    int bobot;

    public Tetangga(Simpul simpul, int bobot) {
        this.simpul = simpul;
        this.bobot = bobot;
        this.berikut = null;
    }
}