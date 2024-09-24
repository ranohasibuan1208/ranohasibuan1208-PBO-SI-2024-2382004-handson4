public class ContohMethod {
    // Method untuk menghitung luas persegi
    public static int hitungLuasPersegi(int sisi) {
        int luas = sisi * sisi;
        return luas;
    }

    public static void main(String[] args) { // Perbaikan di sini
        int sisi = 5;
        int luas = hitungLuasPersegi(sisi);
        System.out.println("Luas Persegi Dengan Sisi " + sisi + " adalah " + luas); // Tambahkan spasi
    }
}
