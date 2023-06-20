
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dokter extends javax.swing.JFrame {
private Connection con;
private Statement st;
private ResultSet RsDoktor;
private String sql="";

private String kode, nama, nohp, keahlian, alamat;
    public dokter() {
        initComponents();
        koneksitabel();
        tampildata("SELECT * FROM tabel_doktor");
    }
    private void form_awal(){
        form_disable();
        form_clear(); 
        Btn_Simpan.setText("simpan");
        Btn_Tambah.requestFocus(true);
        Btn_Tambah.setEnabled(true);
        Btn_Simpan.setEnabled(false);
        Btn_Batal.setEnabled(false);
        Btn_Hapus.setEnabled(false);
        Btn_Ubah.setEnabled(false);
        
    }
  private void form_disable(){
        Txt_kode.setEnabled(false);
        Txt_nama.setEnabled(false);
        Txt_alamat.setEnabled(false);
        Txt_keahlian.setEnabled(false);
       Txt_nohp.setEnabled(false);
       }
  private void form_enable(){
      Txt_alamat.setEnabled(true);
        Txt_keahlian.setEnabled(true);
        Txt_kode.setEnabled(true);
        Txt_nama.setEnabled(true);
       Txt_nohp.setEnabled(true);
        }
      private void form_clear(){
       Txt_kode.setText("");
       Txt_alamat.setText("");
       Txt_keahlian.setText("");
         Txt_nama.setText("");
         Txt_nohp.setText("");
         }
      
        private void aksi_tambah(){
        form_enable();
        Btn_Tambah.setEnabled(true);
        Btn_Simpan.setEnabled(true);
        Btn_Ubah.setEnabled(true);
        Btn_Batal.setEnabled(true);
        Btn_Hapus.setEnabled(false);
        Btn_Tambah.setEnabled(true);
        
        Txt_kode.setEnabled(true);
        Txt_kode.requestFocus(true);
        }
    private void koneksitabel (){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql:"
                    + "//localhost:3306/db_rumahsakit", "root", "");
            System.out.println("KONEKSI BERHASIL");
            JOptionPane.showMessageDialog(null, "SELAMAT DATANG");
            
        } catch (Exception e) {
            System.out.println("KONEKSI GAGAL \n"+e);
        }
    }
    private void tampildata(String sql){
        DefaultTableModel datalist = new DefaultTableModel();
        datalist.addColumn("No");
        datalist.addColumn("Kode Doktor");
        datalist.addColumn("Nama Doktor");
        datalist.addColumn("Alamat Doktor");
        datalist.addColumn("Keahlian");
        datalist.addColumn("Handphone");
        try {
            int i = 1;
            st=con.createStatement();
            RsDoktor=st.executeQuery("SELECT * FROM tabel_doktor");
            while (RsDoktor.next()){
                datalist.addRow(new Object[]{
                    (""+i++),RsDoktor.getString(1), RsDoktor.getString(2), 
                    RsDoktor.getString(3), RsDoktor.getString(4), RsDoktor.getString(5)
                });
                Griddokter.setModel(datalist);
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "GAGAL TAMPIL \n"+e.getMessage());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        Txt_kode = new javax.swing.JTextField();
        Txt_nama = new javax.swing.JTextField();
        Txt_nohp = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Griddokter = new javax.swing.JTable();
        Btn_Simpan = new javax.swing.JButton();
        Btn_Ubah = new javax.swing.JButton();
        Btn_Hapus = new javax.swing.JButton();
        Btn_Batal = new javax.swing.JButton();
        Btn_Keluar = new javax.swing.JButton();
        Btn_Tambah = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        Txt_keahlian = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        Txt_alamat = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/rs.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 110));

        jLabel3.setFont(new java.awt.Font("Tempus Sans ITC", 1, 36)); // NOI18N
        jLabel3.setText("Puskesmas Balikpapan");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 510, 40));

        jLabel4.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel4.setText("Siap Melayani Anda 24 Jam");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 70, 176, 12));

        jLabel5.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel5.setText("jalan km 15");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, 20));

        jLabel6.setFont(new java.awt.Font("Tempus Sans ITC", 1, 12)); // NOI18N
        jLabel6.setText("no tlp 0811223344");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 90, -1, 30));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 970, 10));

        jLabel7.setText("idDokter");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel8.setText("Nama Dokter");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel11.setText("No Handphone");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        Txt_kode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Txt_kodeKeyPressed(evt);
            }
        });
        jPanel1.add(Txt_kode, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 160, 120, -1));
        jPanel1.add(Txt_nama, new org.netbeans.lib.awtextra.AbsoluteConstraints(129, 190, 120, -1));
        jPanel1.add(Txt_nohp, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 280, 120, -1));

        Griddokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(Griddokter);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(262, 160, 710, 180));

        Btn_Simpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon3/export-16x16.png"))); // NOI18N
        Btn_Simpan.setText("SIMPAN");
        Btn_Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_SimpanActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Simpan, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 350, -1, -1));

        Btn_Ubah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon3/cut-16x16.png"))); // NOI18N
        Btn_Ubah.setText("UBAH");
        Btn_Ubah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_UbahActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Ubah, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, -1, -1));

        Btn_Hapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon3/cancel-16x16.png"))); // NOI18N
        Btn_Hapus.setText("HAPUS");
        Btn_Hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_HapusActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Hapus, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 350, -1, -1));

        Btn_Batal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon3/refresh-16x16.png"))); // NOI18N
        Btn_Batal.setText("BATAL");
        Btn_Batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_BatalActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Batal, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 350, 90, -1));

        Btn_Keluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon3/forward-16x16.png"))); // NOI18N
        Btn_Keluar.setText("KELUAR");
        Btn_Keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_KeluarActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Keluar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 350, 90, -1));

        Btn_Tambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ikon3/add-16x16.png"))); // NOI18N
        Btn_Tambah.setText("TAMBAH");
        Btn_Tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_TambahActionPerformed(evt);
            }
        });
        jPanel1.add(Btn_Tambah, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, -1, -1));

        jLabel12.setText("speasialis");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));
        jPanel1.add(Txt_keahlian, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, 120, -1));

        jLabel13.setText("Alamat Dokter");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));
        jPanel1.add(Txt_alamat, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 120, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/home.png"))); // NOI18N
        jButton1.setText("Menu");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 120, 60));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/rs/dokter.png"))); // NOI18N
        jLabel1.setText("Dokter");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 20, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 980, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Txt_kodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Txt_kodeKeyPressed
        // TODO add your handling code here:
        kode=Txt_kode.getText();
        int tekanenter=evt.getKeyCode();
        if (tekanenter==10){
            try {
                sql="Select * from tabel_doktor "
                + "where kode_doktor='"+ kode +"'";
                st=con.createStatement();
                RsDoktor=st.executeQuery(sql);
                while (RsDoktor.next()) {
                    Txt_nama.setText(RsDoktor.getString("nama_dokter"));
                    Txt_alamat.setText(RsDoktor.getString("alamat_dokter"));
                    Txt_keahlian.setText(RsDoktor.getString("keahlian"));
                    Txt_nohp.setText(RsDoktor.getString("no_handphone"));
                    JOptionPane.showMessageDialog(null,
                        "Data Ditemukan");
                    Btn_Tambah.setEnabled(false);
                    Btn_Simpan.setEnabled(false);
                    Btn_Hapus.setEnabled(true);
                    Txt_kode.setEnabled(false);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Data Tidak Ditemukan \n"+e.getMessage());
                Txt_kode.requestFocus();
            }
        }
    }//GEN-LAST:event_Txt_kodeKeyPressed

    private void Btn_SimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_SimpanActionPerformed
        // TODO add your handling code here:
        
        kode=String.valueOf(Txt_kode.getText());
        nama=String.valueOf(Txt_nama.getText());
        nohp=String.valueOf(Txt_nohp.getText());
        keahlian=String.valueOf(Txt_keahlian.getText());
        alamat=String.valueOf(Txt_alamat.getText());

        try {
            sql="INSERT INTO tabel_doktor(kode_doktor, "
            + "nama_dokter, "
            + "alamat_dokter, "
            + "keahlian, "
            + "no_handphone)VALUES"
            + "('"+ kode +"',"
            + "'"+ nama +"',"
            + "'"+ alamat +"',"
            + "'"+ keahlian +"',"
            + "'"+ nohp +"')";
            st=con.createStatement();
            st.execute(sql);
            tampildata("Select * from tabel_doktor");
            form_awal();
            JOptionPane.showMessageDialog(null,
                "Data Tersimpan");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Disimpan \n"+e.getMessage());
        }
    }//GEN-LAST:event_Btn_SimpanActionPerformed

    private void Btn_UbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_UbahActionPerformed
        // TODO add your handling code here:
        kode=String.valueOf(Txt_kode.getText());
        nama=String.valueOf(Txt_nama.getText());
        nohp=String.valueOf(Txt_nohp.getText());
        keahlian=String.valueOf(Txt_keahlian.getText());
        alamat=String.valueOf(Txt_alamat.getText());
        try {
            sql ="UPDATE tabel_doktor set nama_dokter= '"+nama+"', "
            + "alamat_dokter = '"+alamat+"', "
            + "keahlian = '"+keahlian+"', no_handphone = '"+nohp+"' "
            + "where kode_doktor ='"+kode+"'";
            st=con.createStatement();
            st.execute(sql);
            tampildata("Select * from tabel_doktor");
            form_awal();
            JOptionPane.showMessageDialog(null,
                "Data Berhasil Diubah");
            
        Txt_kode.requestFocus();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Diubah \n"+e.getMessage());
        }
    }//GEN-LAST:event_Btn_UbahActionPerformed

    private void Btn_HapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_HapusActionPerformed
        // TODO add your handling code here:
        kode=String.valueOf(Txt_kode.getText());

        try {
            sql= "DELETE from tabel_doktor where kode_doktor = '"+kode+"'";
            st=con.createStatement();
            st.execute(sql);
            tampildata("Select * from tabel_doktor");
            form_awal();
            JOptionPane.showMessageDialog(null,
                "Data Berhasil Dihapus");
            Txt_kode.requestFocus();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus \n"+e.getMessage());
        }
    }//GEN-LAST:event_Btn_HapusActionPerformed

    private void Btn_BatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_BatalActionPerformed
        // TODO add your handling code here:
        form_clear();
        Btn_Tambah.setEnabled(true);
        Btn_Simpan.setEnabled(true);
        Txt_kode.requestFocus();
        Btn_Hapus.setEnabled(true);
        Txt_kode.setEnabled(true);
    }//GEN-LAST:event_Btn_BatalActionPerformed

    private void Btn_KeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_KeluarActionPerformed
        // TODO add your handling code here:
        int keluar = JOptionPane.showConfirmDialog(null,"Apakah Anda  yakin mau keluar?","Question",JOptionPane.YES_NO_OPTION);
        if(keluar==0){
            System.exit(0);
        } else{ return;

        }
    }//GEN-LAST:event_Btn_KeluarActionPerformed

    private void Btn_TambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_TambahActionPerformed
        // TODO add your handling code here:
        aksi_tambah();
        Txt_kode.requestFocus();
    }//GEN-LAST:event_Btn_TambahActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        new menu().setVisible(true);        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Batal;
    private javax.swing.JButton Btn_Hapus;
    private javax.swing.JButton Btn_Keluar;
    private javax.swing.JButton Btn_Simpan;
    private javax.swing.JButton Btn_Tambah;
    private javax.swing.JButton Btn_Ubah;
    private javax.swing.JTable Griddokter;
    private javax.swing.JTextField Txt_alamat;
    private javax.swing.JTextField Txt_keahlian;
    private javax.swing.JTextField Txt_kode;
    private javax.swing.JTextField Txt_nama;
    private javax.swing.JTextField Txt_nohp;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
