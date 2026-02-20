public class DosenMain04 {
    public static void main(String[] args) {
        Dosen04 dsn1 = new Dosen04();
        dsn1.idDosen = "DS001";
        dsn1.nama = "Dr. Budi Santoso";
        dsn1.statusAktif = true;
        dsn1.tahunBergabung = 2015;
        dsn1.bidangKeahlian = "Pemrograman";
        dsn1.setStatusAktif(false);
        dsn1.ubahKeahlian("Struktur Data");
        int masaKerja1 = dsn1.hitungMasaKerja(2025);
        System.out.println("Masa Kerja: " + masaKerja1 + " tahun");
        dsn1.tampilInformasi();

        Dosen04 dsn2 = new Dosen04("DS002","Prof. Siti Aminah",true,2010,"Basis Data");
        int masaKerja2 = dsn2.hitungMasaKerja(2025);
        System.out.println("Masa Kerja: " + masaKerja2 + " tahun");
        dsn2.setStatusAktif(true);
        dsn2.ubahKeahlian("Artificial Intelligence");
        dsn2.tampilInformasi();
    
    }  
}