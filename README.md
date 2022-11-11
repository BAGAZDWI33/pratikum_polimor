# pratikum_polimor

Polimorfisme terbagi menjadi dua suku kata yaitu, Poly yang berarti banyak dan Morfisme yang berarti bentuk. Dalam ilmu sains, Polimorfisme (polymorphism) adalah sebuah prinsip dalam biologi di mana organisme atau spesies memiliki banyak bentuk serta tahapan (stages). Prinsip tersebut diterapkan juga pada bahasa Java.

Polimorfisme dalam OOP merupakan sebuah konsep OOP di mana class memiliki banyak “bentuk” method yang berbeda, meskipun namanya sama. Maksud dari “bentuk” adalah isinya yang berbeda, namun tipe data dan parameternya berbeda.

Polimorfisme juga dapat diartikan sebagai teknik programming yang mengarahkan kamu untuk memprogram secara general daripada secara spesifik. Contohnya kita memiliki tiga class yang berbeda yaitu: “Kelinci”, “Kucing”, dan “Sapi”. Di mana ketiga class tersebut merupakan turunan dari class “Hewan”.


## Polimorfisme pada Java memiliki 2 macam yaitu diantaranya:

Static Polymorphism (Polimorfisme statis).\n
Dynamic Polymorphism (Polimorfisme dinamis).\n
Perbedaan keduanya terletak pada cara membuat polimorfisme. Polimorfisme statis menggunakan method overloading, sedangkan polimorfisme dinamis menggunakan method overriding. 

### pada code java saya menggunakan Dynamic Polymorphism (Polimorfisme dinamis) yaitu overriding karena mengacu aturan
Aturan Method Overriding
1.Mode akses overriding method harus sama atau lebih luas daripada override method.
Subclass hanya dapat dan boleh meng-override method superclass satu kali saja. Tidak boleh ada lebih dari satu method yang sama pada kelas.
Soal aturan hak akses, setiap subclass tidak boleh mempunyai hak akses method overriding yang ketat dibandingkan dengan hak akses method pada superclass ataupun parent class.

code terkait:


class BangunDatar {
    float keliling(){
        System.out.println("Menghitung Keliling Bangun Datar");
        return  0;
    }
    float Luas(){
        System.out.println("Menghitung Luas Bangun Datar");
        return 0;
    }
}


public class Persegi extends BangunDatar {
    int sisi;

    public Persegi(int sisi) {
        this.sisi = sisi;
    }

    public float Luas() {
        return this.sisi = this.sisi;
    }

    public float keliling() {
        return this.sisi = 4;
    }
}

 pada persegi memanggi method luas dan keliling dengan override method

 kelas kami menggunakan super class di bangundatar

class BangunDatar {
    float keliling(){
        System.out.println("Menghitung Keliling Bangun Datar");
        return  0;
    }
    float Luas(){
        System.out.println("Menghitung Luas Bangun Datar");
        return 0;
    }
}

dengan 3 class turunan yang sama dalam menthod luas keliling

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

dengan pembacaan menggunakan main class


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


hasil bisa dilihat di img = "screenshot1"

by.bagas dwi prasetyo (312110053)




