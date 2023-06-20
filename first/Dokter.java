public class Dokter extends Person {
    String Spesialisasi;
    String idDokter;
    Resepobat resepObat;

    public Dokter(String idDokter, String nama, String alamat, String nomorKontak, String spesialisasi, String id) {
        super(id, nama, alamat, nomorKontak);
        this.Spesialisasi = spesialisasi;
        this.resepObat = null;
    }

    public void diagnosa(){
        System.out.println(getNama() + "hasil diagnosa");
            if (resepObat != null) {
        System.out.println("Doctor: " + getNama());
        System.out.println("Specialization: " + Spesialisasi);
        System.out.println("Prescription Details:");
        System.out.println("Tanggal Resep: " + resepObat.gettanggalResep());
        System.out.println("ID Pasien: " + resepObat.getIdPasien());
        System.out.println("Kode Obat: " + resepObat.getKodeObat());
        System.out.println("Dosis Obat: " + resepObat.getDosisObat());
    } else {
        System.out.println("No prescription available.");
    }
    }

    public String getId() {
        return idDokter;
    }

    public void setId(String id) {
        this.idDokter = id;
    }

    public String getSpesialisasi(){
        return Spesialisasi;
    }

    public void setSpesialisasi(String spesialisasi) {
        this.Spesialisasi = spesialisasi;
    }
}
