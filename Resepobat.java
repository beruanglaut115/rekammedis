import java.util.Date;

public class Resepobat{

    public Date tanggalResep;
    public String idPasien;
    public String idDokter;
    public String kodeObat;
    public String dosisObat;

    public Resepobat(Date tanggalResep, String idPasien, String idDokter, String kodeObat, String dosisObat) {
    this.tanggalResep = tanggalResep;
    this.idPasien = idPasien;
    this.idDokter = idDokter;
    this.kodeObat = kodeObat;
    this.dosisObat = dosisObat;
    }

    public void tambahObat(String kodeObat, String dosisObat) {
    this.kodeObat = kodeObat;
    this.dosisObat = dosisObat;
    }

    public void editObat(String kodeObat, String dosisObat) {
    this.kodeObat = kodeObat;
    this.dosisObat = dosisObat;
    }

    public String gettanggalResep() {
        return null;
    }

    public String getIdPasien() {
        return null;
    }

    public String getKodeObat() {
        return null;
    }

    public String getDosisObat() {
        return null;
    }

    public void settanggalResep(Date tanggalResep){
        this.tanggalResep = tanggalResep;
    }

        public void setidPasien(String idPasien){
        this.idPasien = idPasien;
    }

        public void setkodeObat(String kodeObat){
        this.kodeObat = kodeObat;
    }

        public void setdosisObat(String dosisObat){
        this.dosisObat = dosisObat;
    }

}

