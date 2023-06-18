public class Person {
    private String id;
    private String nama;
    private String alamat;
    private String nomorKontak;

    public Person(String id, String nama, String alamat, String nomorKontak) {
        this.id = id;
        this.nama = nama;
        this.alamat = alamat;
        this.nomorKontak = nomorKontak;
    }

    // Getter dan setter
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorKontak() {
        return nomorKontak;
    }

    public void setNomorKontak(String nomorKontak) {
        this.nomorKontak = nomorKontak;
    }
}
