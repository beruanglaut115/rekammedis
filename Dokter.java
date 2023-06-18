public class Dokter extends Person {
    String Spesialisasi;
    String idDokter;

    public Dokter(String id, String nama, String alamat, String nomorKontak, String spesialisasi, String idDokter){
        super(nama, alamat, nomorKontak, id);
        this.Spesialisasi = spesialisasi;
        this.idDokter = idDokter;
    }

    public void diagnosa(){
        System.out.println(nama + "hasil diagnosa");
    }

    public String getidDokter() {
        return idDokter;
    }

    public void setidDokter(String idDokter) {
        this.idDokter = idDokter;
    }

    public String getSpesialisasi(){
        return Spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.Spesialisasi = spesialisasi;
    }
}
