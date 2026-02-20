public class MataKuliahMain04 {
    public static void main(String[] args) {
        MataKuliah04 mk1 = new MataKuliah04();
        mk1.kodeMK = "IF101";
        mk1.nama = "Pemrograman Dasar";
        mk1.sks = 3;
        mk1.jumlahJam = 6;
        mk1.tampilInformasi();

        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        MataKuliah04 mk2 = new MataKuliah04("IF202", "Struktur Data", 3, 6);
        mk2.ubahSKS(2);
        mk2.tambahJam(1);
        mk2.kurangiJam(8); 
        mk2.tampilInformasi();
    } 
}