import java.util.Date;

public class RekamMedis {
    private Date tanggal;
    private String idPasien;
    private String idDokter;
    private String idPetugas;
    private String kodePenyakit;

    public RekamMedis(Date tanggal, String idPasien, String idDokter, String idPetugas, String kodePenyakit) {
        this.tanggal = tanggal;
        this.idPasien = idPasien;
        this.idDokter = idDokter;
        this.idPetugas = idPetugas;
        this.kodePenyakit = kodePenyakit;
    }

    public Date getTanggal() {
        return tanggal;
    }

    public void setTanggal(Date tanggal) {
        this.tanggal = tanggal;
    }

    public String getIdPasien() {
        return idPasien;
    }

    public void setIdPasien(String idPasien) {
        this.idPasien = idPasien;
    }

    public String getIdDokter() {
        return idDokter;
    }

    public void setIdDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    public String getIdPetugas() {
        return idPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        this.idPetugas = idPetugas;
    }

    public String getKodePenyakit() {
        return kodePenyakit;
    }

    public void setKodePenyakit(String kodePenyakit) {
        this.kodePenyakit = kodePenyakit;
    }

    public void simpan() {
        System.out.println("Rekam Medis disimpan.");
    }

    public void ubahData() {
        System.out.println("Data Rekam Medis diubah.");
    }
}
