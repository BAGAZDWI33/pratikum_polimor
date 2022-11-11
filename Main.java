public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar = new BangunDatar();

        Persegi persegi = new Persegi(4);

        Segitiga segitiga = new Segitiga(8, 6);

        Lingkaran lingkaran = new Lingkaran(30);

        bangunDatar.Luas();
        bangunDatar.keliling();

        System.out.println("Luas persegi=" + persegi.Luas());
        System.out.println("Keliling Persegi=" + persegi.keliling());
        System.out.println("Luas segitiga=" + segitiga.Luas());
        System.out.println("Keliling segitiga=" + segitiga.keliling());
        System.out.println("Luas Lingkaran=" + lingkaran.Luas());
        System.out.println("Keliling Lingkaran=" + lingkaran.keliling());
    }
}


