public class polimerase {
    public static void main(String[] args) {
        //Menggunakan polymorphism dimana objek subclass diakses lewat superclass
        bangundatar lingkaran = new lingkaran(14.21);
        bangundatar persegi = new persegi(12);
        bangundatar segitiga = new segitiga(12, 21, 6, 9, 12);

        System.out.println("Luas dan Keliling Lingkaran:");
        System.out.println("Luas: " + lingkaran.luas());
        System.out.println("Keliling: " + lingkaran.keliling());

        System.out.println("\nLuas dan Keliling Persegi:");
        System.out.println("Luas: " + persegi.luas());
        System.out.println("Keliling: " + persegi.keliling());

        System.out.println("\nLuas dan Keliling Segitiga:");
        System.out.println("Luas: " + segitiga.luas());
        System.out.println("Keliling: " + segitiga.keliling());
    }
}