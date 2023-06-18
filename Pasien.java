public class Pasien extends Person {
    String gejalaPenyakit;

    public Pasien(String gejalaPenyakit, String id, String nama, String alamat, String nomorKontak){
        super(id, nama, alamat, nomorKontak);
        this.gejalaPenyakit = gejalaPenyakit;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getgejalaPenyakit() {
        return gejalaPenyakit;
    }

    public void setgejalaPenyakit(String gejalaPenyakit){
        this.gejalaPenyakit = gejalaPenyakit;
    }

}
