public class Segitiga extends BangunDatar{
    int alas;
    int tinggi;

    public Segitiga(int alas,int tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }
    public float Luas(){
        return  (float) (0.5*alas*tinggi);
    }
    public float keliling(){
        return (float) (3*alas);
    }
}

