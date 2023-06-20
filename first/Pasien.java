public class Pasien extends Person {
    String gejalaPenyakit;
    String idPasien;

    public Pasien(String gejalaPenyakit, String id, String nama, String alamat, String nomorKontak, String idPasien){
        super(id, nama, alamat, nomorKontak);
        this.gejalaPenyakit = gejalaPenyakit;
        this.idPasien = idPasien;
    }

    public String getidPasien() {
        return idPasien;
    }

    public void setidPasien(String idPasien) {
        this.idPasien = idPasien;
    }

    public String getgejalaPenyakit() {
        return gejalaPenyakit;
    }

    public void setgejalaPenyakit(String gejalaPenyakit){
        this.gejalaPenyakit = gejalaPenyakit;
    }

}
