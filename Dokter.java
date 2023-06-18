public class Dokter extends Person {
    String spesialisasi;

    public Dokter(String id, String nama, String alamat, String nomorKontak, String spesialisasi) {
        super(id, nama, alamat, nomorKontak);
        this.spesialisasi = spesialisasi;
    }

    public void diagnosa(){
        System.out.println(nama + "hasil diagnosa");
    }
}
