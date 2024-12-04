class Graph {
    Simpul kepala;

    public Graph() {
        this.kepala = null;
    }

    void tambahSimpul(String nama) {
        Simpul simpulBaru = new Simpul(nama);
        if (kepala == null) {
            kepala = simpulBaru;
        } else {
            Simpul temp = kepala;
            while (temp.berikut != null) {
                temp = temp.berikut;
            }
            temp.berikut = simpulBaru;
        }
    }

    Simpul cariSimpul(String nama) {
        Simpul temp = kepala;
        while (temp != null) {
            if (temp.nama.equals(nama)) {
                return temp;
            }
            temp = temp.berikut;
        }
        return null;
    }
    
    void tambahSisi(String asal, String tujuan) {
        Simpul simpulAsal = cariSimpul(asal);
        Simpul simpulTujuan = cariSimpul(tujuan);

        if (simpulAsal != null && simpulTujuan != null) {
            Tetangga tetanggaBaru = new Tetangga(simpulTujuan);
            if (simpulAsal.kepalaTetangga == null) {
                simpulAsal.kepalaTetangga = tetanggaBaru;
            } else {
                Tetangga temp = simpulAsal.kepalaTetangga;
                while (temp.berikut != null) {
                    temp = temp.berikut;
                }
                temp.berikut = tetanggaBaru;
            }
        }
    }


    void tampilkanGraph() {
        Simpul temp = kepala;
        while (temp != null) {
            System.out.print(temp.nama + " => ");
            Tetangga tetanggaTemp = temp.kepalaTetangga;
            while (tetanggaTemp != null) {
                System.out.print(tetanggaTemp.simpul.nama + " ");
                tetanggaTemp = tetanggaTemp.berikut;
            }
            System.out.println();
            temp = temp.berikut;
        }
    }
}
