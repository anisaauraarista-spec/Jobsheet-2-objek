public class Dosen04 {
    String idDosen;
    String nama;
    boolean statusAktif;
    int tahunBergabung;
    String bidangKeahlian;

public Dosen04() {
}
public Dosen04(String idDosen, String nama, boolean statusAktif,int tahunBergabung, String bidangKeahlian) {
    this.idDosen = idDosen;
    this.nama = nama;
    this.statusAktif = statusAktif;
    this.tahunBergabung = tahunBergabung;
    this.bidangKeahlian = bidangKeahlian;
}
    void tampilInformasi() {
        System.out.println("ID Dosen        : " + idDosen);
        System.out.println("Nama            : " + nama);
        System.out.println("Status Aktif    : " + (statusAktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Tahun Bergabung : " + tahunBergabung);
        System.out.println("Bidang Keahlian : " + bidangKeahlian);
        System.out.println();
    }
    void setStatusAktif(boolean status) {
        statusAktif = status;
        System.out.println("Status dosen berhasil diubah.");
        System.out.println();
    }
    int hitungMasaKerja(int thnSekarang) {
        return thnSekarang - tahunBergabung;
    }
    void ubahKeahlian(String bidang) {
        bidangKeahlian = bidang;
        System.out.println("Bidang keahlian berhasil diubah.");
        System.out.println();
    }
}