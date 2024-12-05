class Simpul {
    String nama;
    Simpul berikut;
    Tetangga kepalaTetangga;
    boolean dikunjungi;
    int jarak;
    Simpul jalur;

    public Simpul(String nama) {
        this.nama = nama;
        this.berikut = null;
        this.kepalaTetangga = null;
        this.dikunjungi = false;
        this.jarak = Integer.MAX_VALUE;
        this.jalur = null;
    }
}