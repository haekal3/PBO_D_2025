package pertemuan11;

public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran(7);
        Tabung tabung = new Tabung(10, 14);

        System.out.println("Luas Lingkaran: " + lingkaran.luas());
        System.out.println("Luas Tabung: " + tabung.luas());
    }
}

