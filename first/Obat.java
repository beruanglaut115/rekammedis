public class Obat extends ResepObat{
    private String kodeObat;
    private String namaObat;
    private double harga;

    public Obat(String idDokter, String idPasien, String iddokter, String idPetugas, String kodeobat) {
        super(getTanggalResep(), idPasien, iddokter, idPetugas, kodeobat);
        this.kodeObat = kodeObat;
        this.namaObat = namaObat;
        this.harga = harga;  


    }

    public String getKodeObat() {
        return kodeObat;
    }

    public void setKodeObat(String kodeObat) {
        this.kodeObat = kodeObat;
    }

    public String getNamaObat() {
        return namaObat;
    }

    public void setNamaObat(String namaObat) {
        this.namaObat = namaObat;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tambahObat() {
        System.out.println("Obat ditambahkan.");
    }

    public void editObat() {
        System.out.println("Informasi obat diubah.");
    }
}