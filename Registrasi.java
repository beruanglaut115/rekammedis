public class Registrasi extends Pasien {
    private String IdPetugas;
    private String IdPasien;

    public Registrasi( String idpasien, String gejalapenyakit){
        super(gejalapenyakit, idpasien, gejalapenyakit, gejalapenyakit, gejalapenyakit, idpasien);
        this.IdPetugas = IdPetugas;
        this.IdPasien = IdPasien;
    }

    public String getIdPetugas() {
        return IdPetugas;
    }

    public void setIdPetugas(String idPetugas) {
        IdPetugas = idPetugas;
    }

    public String getIdPasien() {
        return IdPasien;
    }

    public void setIdPasien(String idPasien) {
        IdPasien = idPasien;
    }

    public void DisplayForm() {
        System.out.println("Registrasi");
        System.out.println("Petugas ID: " + IdPetugas);
        System.out.println("Pasien ID: " + IdPasien);
    }

}
