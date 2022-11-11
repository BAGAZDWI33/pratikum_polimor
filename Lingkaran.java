public class Lingkaran extends BangunDatar{
    int r;

    public Lingkaran(int r){
        this.r = r;
    }
    public  float Luas(){
        return(float) (Math.PI*r*r);
    }
    public float keliling(){
        return (float) (2*Math.PI*r);
    }
}
