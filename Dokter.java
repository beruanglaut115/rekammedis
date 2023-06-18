public class Dokter extends Person {
    String Spesialisasi;

    public Dokter(String id, String nama, String alamat, String nomorKontak, String spesialisasi) {
        super(id, nama, alamat, nomorKontak);
        this.Spesialisasi = spesialisasi;
    }

    public void diagnosa(){
        System.out.println(nama + "hasil diagnosa");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpesialisasi(){
        return Spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.Spesialisasi = spesialisasi;
    }
}
