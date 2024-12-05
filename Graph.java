class Graph {
    Simpul head;

    public Graph() {
        this.head = null;
    }

    void tambahSimpul(String nama) {
        Simpul simpulBaru = new Simpul(nama);
        if (head == null) {
            head = simpulBaru;
        } else {
            Simpul temp = head;
            while (temp.berikut != null) {
                temp = temp.berikut;
            }
            temp.berikut = simpulBaru;
        }
    }

    Simpul find(String nama) {
        Simpul temp = head;
        while (temp != null) {
            if (temp.nama.equals(nama)) {
                return temp;
            }
            temp = temp.berikut;
        }
        return null;
    }

    void tambahSisi(String host, String tujuan, int bobot) {
        Simpul simpulHost = find(host);
        Simpul simpulTujuan = find(tujuan);

        if (simpulHost != null && simpulTujuan != null) {
            Tetangga tetanggaBaru = new Tetangga(simpulTujuan, bobot);
            if (simpulHost.kepalaTetangga == null) {
                simpulHost.kepalaTetangga = tetanggaBaru;
            } else {
                Tetangga temp = simpulHost.kepalaTetangga;
                while (temp.berikut != null) {
                    temp = temp.berikut;
                }
                temp.berikut = tetanggaBaru;
            }
        }
    }

    void Dijkstra(String host, String tujuan, boolean useFenrir, boolean useEMP) {
        Simpul start = find(host);
        Simpul end = find(tujuan);
        Simpul fenrir = find("Fenrir");
        Simpul emp = find("EMP");

        if (start == null || end == null)
            return;

        resetVertices();
        start.jarak = 0;

        Simpul current = start;
        while (current != null) {
            Tetangga tetangga = current.kepalaTetangga;

            while (tetangga != null) {
                int totalBobot = current.jarak + tetangga.bobot;
                if (totalBobot < tetangga.simpul.jarak) {
                    tetangga.simpul.jarak = totalBobot;
                    tetangga.simpul.jalur = current;
                }
                tetangga = tetangga.berikut;
            }
            current.dikunjungi = true;
            current = findSimpulJarakkecil();
        }

        if (useFenrir && fenrir != null) {
            if (fenrir.jarak < end.jarak) {
                int jarakViaFenrir = fenrir.jarak + getDistance(fenrir, end);
                if (jarakViaFenrir < end.jarak) {
                    end.jarak = jarakViaFenrir;
                    end.jalur = fenrir;
                }
            }
        }

        if (useEMP && emp != null) {
            if (emp.jarak < end.jarak) {
                int jarakViaEMP = emp.jarak + getDistance(emp, end);
                if (jarakViaEMP < end.jarak) {
                    end.jarak = jarakViaEMP;
                    end.jalur = emp;
                }
            }
        }

        if (end.jarak == Integer.MAX_VALUE) {
            System.out.println("Tidak ada jalur dari " + host + " ke " + tujuan);
        } else {
            printPath(end);
            System.out.println();
        }
    }

    int getDistance(Simpul from, Simpul to) {
        Tetangga tetangga = from.kepalaTetangga;
        while (tetangga != null) {
            if (tetangga.simpul == to) {
                return tetangga.bobot;
            }
            tetangga = tetangga.berikut;
        }
        return Integer.MAX_VALUE;
    }

    Simpul findSimpulJarakkecil() {
        Simpul temp = head;
        Simpul vertexEfisien = null;
        int jarakTerkecil = Integer.MAX_VALUE;

        while (temp != null) {
            if (!temp.dikunjungi && temp.jarak < jarakTerkecil) {
                jarakTerkecil = temp.jarak;
                vertexEfisien = temp;
            }
            temp = temp.berikut;
        }
        return vertexEfisien;
    }

    void resetVertices() {
        Simpul temp = head;
        while (temp != null) {
            temp.jarak = Integer.MAX_VALUE;
            temp.dikunjungi = false;
            temp.jalur = null;
            temp = temp.berikut;
        }
    }

    void printPath(Simpul simpul) {
        if (simpul.jalur != null) {
            printPath(simpul.jalur);
            System.out.print(" => ");
        }
        System.out.print(simpul.nama);
    }
}