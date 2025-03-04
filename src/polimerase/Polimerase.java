package polimerase;
class rumusbangundatar{
    //luas lingkaraannn
    public double luaslingkaran(double jarijari) {
    return Math.PI * jarijari * jarijari; 
    }

//keliling lingkaran
    public double kelilinglingkaran(double jarijari) {
        return 2 * Math.PI * jarijari;
    }

    //luas persegi
    public double luaspersegi(int sisi) {
        return sisi * sisi;
}
    //keliling persegi
    public double kelilingpersegi(int sisi) {
        return 4 * sisi;
    }
    
    // luas segitiga 
    public double luassegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }
    
    //keliling segitiga
    public double kelilingsegitiga(double sisi1, double sisi2, double sisi3){
        return sisi1 + sisi2 + sisi3;
    }
}
// Kelas untuk menjalankan programnyaaa
public class Polimerase {
    public static void main(String[] args) {
        rumusbangundatar bd = new rumusbangundatar();
        
        System.out.println("Luas dan Keliling Lingkaran");
        System.out.println("Luas: " + bd.luaslingkaran(8.5));
        System.out.println("Keliling: " + bd.kelilinglingkaran(8.5));
        
        System.out.println("Luas dan Keliling Persegi");
        System.out.println("Luas: " + bd.luaspersegi(6));
        System.out.println("Keliling: " + bd.kelilingpersegi(6));
        
        System.out.print("Luas dan Keliling Segitiga");
        System.out.println("Luas: " + bd.luassegitiga(4, 7));
        System.out.println("Keliling: " + bd.kelilingsegitiga(3, 4, 6));
        
    }
}