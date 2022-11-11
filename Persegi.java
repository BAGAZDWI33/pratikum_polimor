public class Persegi extends BangunDatar {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public float Luas() {
        return (float) (sisi*sisi);
    }

    public float keliling() {
        return (float) (4*sisi);
    }
}
