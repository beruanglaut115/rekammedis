public class Petugas extends Person{
    String idPetugas;

    public Petugas(String idPetugas, String nama, String alamat, String nomorKontak, String id){
        super( nama, alamat, nomorKontak, id);
        this.idPetugas = idPetugas;
    }
    
}
