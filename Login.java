public class Login extends Person {

    private String nama;
    private String email;
    private int password;


    public Login(String id, String nama, String alamat, String nomorKontak) {
        super(id, nama, alamat, nomorKontak);
        this.nama = nama;
        this.email = email;
        this.password = password;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }


    public void personLogin(){
        System.out.println(nama+ "Nama");
        System.out.print(email+ "Email");
        System.out.println(password+ "Password");
    }
}