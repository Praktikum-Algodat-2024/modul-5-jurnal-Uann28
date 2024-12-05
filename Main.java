public class Main {
    public static void main(String[] args) {
        Graph graphEva = new Graph();
        
        graphEva.tambahSimpul("Eva");
        graphEva.tambahSimpul("Ash");
        graphEva.tambahSimpul("Rhongo");
        graphEva.tambahSimpul("PSY");
        graphEva.tambahSimpul("Curius");
        graphEva.tambahSimpul("Fenrir");
        graphEva.tambahSimpul("WH");
        graphEva.tambahSimpul("Zen");
        graphEva.tambahSimpul("Redox");
        graphEva.tambahSimpul("Manadium");
        graphEva.tambahSimpul("Tau");
        graphEva.tambahSimpul("EMP");
        graphEva.tambahSimpul("Primeval");
        graphEva.tambahSimpul("Sol");
        graphEva.tambahSimpul("Eldwurm");
        graphEva.tambahSimpul("Unicorn");
        graphEva.tambahSimpul("Axel");
        
        graphEva.tambahSisi("Eva", "Ash", 9);
        graphEva.tambahSisi("Eva", "Rhongo", 11);
        graphEva.tambahSisi("Ash", "PSY", 9);
        graphEva.tambahSisi("Rhongo", "Curius", 8);
        graphEva.tambahSisi("Rhongo", "Fenrir",11);
        graphEva.tambahSisi("PSY", "WH", 5);
        graphEva.tambahSisi("WH", "Zen", 2);
        graphEva.tambahSisi("PSY", "Redox", 8);
        graphEva.tambahSisi("Zen", "Manadium", 2);
        graphEva.tambahSisi("WH", "Tau", 7);
        graphEva.tambahSisi("Eva", "EMP", 30);
        graphEva.tambahSisi("WH", "Primeval", 8);
        graphEva.tambahSisi("WH", "Sol", 9);
        graphEva.tambahSisi("Zen", "Eldwurm", 6);
        graphEva.tambahSisi("Primeval", "Unicorn", 10);
        graphEva.tambahSisi("Eldwurm", "Axel", 9);

        graphEva.Dijkstra("Eva", "Eva", false, false);
        graphEva.Dijkstra("Eva", "Ash", false, false);
        graphEva.Dijkstra("Eva", "Rhongo", false, false);
        graphEva.Dijkstra("Eva", "PSY", false, false);
        graphEva.Dijkstra("Eva", "Curius", false, false);
        graphEva.Dijkstra("Eva", "Fenrir", false, false);
        graphEva.Dijkstra("Eva", "WH", false, false);
        graphEva.Dijkstra("Eva", "Zen", false, false);
        graphEva.Dijkstra("Eva", "Redox", false, false);
        graphEva.Dijkstra("Eva", "Manadium", false, false);
        graphEva.Dijkstra("Eva", "Tau", false, false);
        graphEva.Dijkstra("Eva", "EMP", false, false);
        graphEva.Dijkstra("Eva", "Primeval", false, false);
        graphEva.Dijkstra("Eva", "Sol", false, false);
        graphEva.Dijkstra("Eva", "Eldwurm", false, false);
        graphEva.Dijkstra("Eva", "Unicorn", false, false);
        graphEva.Dijkstra("Eva", "Axel", false, false);

        
        System.out.println();
        
        Graph graphManadium = new Graph();
        
        graphManadium.tambahSimpul("Eva");
        graphManadium.tambahSimpul("Ash");
        graphManadium.tambahSimpul("Rhongo");
        graphManadium.tambahSimpul("PSY");
        graphManadium.tambahSimpul("Curius");
        graphManadium.tambahSimpul("Fenrir");
        graphManadium.tambahSimpul("WH");
        graphManadium.tambahSimpul("Zen");
        graphManadium.tambahSimpul("Redox");
        graphManadium.tambahSimpul("Manadium");
        graphManadium.tambahSimpul("Tau");
        graphManadium.tambahSimpul("EMP");
        graphManadium.tambahSimpul("Primeval");
        graphManadium.tambahSimpul("Sol");
        graphManadium.tambahSimpul("Eldwurm");
        graphManadium.tambahSimpul("Unicorn");
        graphManadium.tambahSimpul("Axel");

        graphManadium.tambahSisi("Manadium", "Zen", 2);
        graphManadium.tambahSisi("Zen", "WH", 2);
        graphManadium.tambahSisi("WH", "PSY", 5);
        graphManadium.tambahSisi("Zen", "Eldwurm", 6);
        graphManadium.tambahSisi("WH", "Tau", 7);
        graphManadium.tambahSisi("WH", "Primeval", 8);
        graphManadium.tambahSisi("WH", "Sol", 9);
        graphManadium.tambahSisi("WH", "Redox", 11);
        graphManadium.tambahSisi("Tau", "EMP", 4);
        graphManadium.tambahSisi("Eldwurm", "Axel", 9);
        graphManadium.tambahSisi("PSY", "Ash", 9);
        graphManadium.tambahSisi("PSY", "Curius", 9);
        graphManadium.tambahSisi("Primeval", "Unicorn", 10);
        graphManadium.tambahSisi("Curius", "Rhongo", 8);
        graphManadium.tambahSisi("Ash", "Eva", 9);
        graphManadium.tambahSisi("Rhongo", "Fenrir", 11);
        
        graphManadium.Dijkstra("Manadium", "Manadium", false, false);
        graphManadium.Dijkstra("Manadium", "Zen", false, false);
        graphManadium.Dijkstra("Manadium", "WH", false, false);
        graphManadium.Dijkstra("Manadium", "PSY", false, false);
        graphManadium.Dijkstra("Manadium", "Eldwurm", false, false);
        graphManadium.Dijkstra("Manadium", "Tau", false, false);
        graphManadium.Dijkstra("Manadium", "Primeval", false, false);
        graphManadium.Dijkstra("Manadium", "Sol", false, false);
        graphManadium.Dijkstra("Manadium", "Redox", false, false);
        graphManadium.Dijkstra("Manadium", "EMP", false, false);
        graphManadium.Dijkstra("Manadium", "Axel", false, false);
        graphManadium.Dijkstra("Manadium", "Ash", false, false);
        graphManadium.Dijkstra("Manadium", "Curius", false, false);
        graphManadium.Dijkstra("Manadium", "Unicorn", false, false);
        graphManadium.Dijkstra("Manadium", "Rhongo", false, false);
        graphManadium.Dijkstra("Manadium", "Eva", false, false);
        graphManadium.Dijkstra("Manadium", "Fenrir", false, false);

        System.out.println("\nJalur setelah menggunakan teleportation device");
        System.out.println("= = = = = = = = = = = = = = = = = = = = = = = =\n");
        
        graphEva.Dijkstra("Eva", "Eva", true, false);
        graphEva.Dijkstra("Eva", "Ash", true, false);
        graphEva.Dijkstra("Eva", "Rhongo", true, false);
        graphEva.Dijkstra("Eva", "PSY", true, false);
        graphEva.Dijkstra("Eva", "Curius", true, false);
        graphEva.Dijkstra("Eva", "Fenrir", true, false);
        graphEva.Dijkstra("Eva", "Unicorn", true, false);
        graphEva.Dijkstra("Eva", "Primeval", true, false);
        graphEva.Dijkstra("Eva", "EMP", true, false);
        graphEva.Dijkstra("Eva", "WH", true, false);
        graphEva.Dijkstra("Eva", "Tau", true, false);
        graphEva.Dijkstra("Eva", "Sol", true, false);
        graphEva.Dijkstra("Eva", "Manadium", true, false);
        graphEva.Dijkstra("Eva", "Eldwurm", true, false);
        graphEva.Dijkstra("Eva", "Zen", true, false);
        graphEva.Dijkstra("Eva", "Redox", true, false);
        graphEva.Dijkstra("Eva", "Axel", true, false);

        System.out.println();

        graphManadium.Dijkstra("Manadium", "Manadium", false, true);
        graphManadium.Dijkstra("Manadium", "Zen", false, true);
        graphManadium.Dijkstra("Manadium", "WH", false, true);
        graphManadium.Dijkstra("Manadium", "PSY", false, true);
        graphManadium.Dijkstra("Manadium", "Eldwurm", false, true);
        graphManadium.Dijkstra("Manadium", "Tau", false, true);
        graphManadium.Dijkstra("Manadium", "Primeval", false, true);
        graphManadium.Dijkstra("Manadium", "Sol", false, true);
        graphManadium.Dijkstra("Manadium", "Redox", false, true);
        graphManadium.Dijkstra("Manadium", "EMP", false, true);
        graphManadium.Dijkstra("Manadium", "Fenrir", false, true);
        graphManadium.Dijkstra("Manadium", "Unicorn", false, true);
        graphManadium.Dijkstra("Manadium", "Rhongo", false, true);
        graphManadium.Dijkstra("Manadium", "Eva", false, true);
        graphManadium.Dijkstra("Manadium", "Curius", false, true);
        graphManadium.Dijkstra("Manadium", "Ash", false, true);
        graphManadium.Dijkstra("Manadium", "Axel", false, true);
    }
}
