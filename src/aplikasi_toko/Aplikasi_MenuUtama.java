/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aplikasi_toko;

/**
 *
 * @author ASUS
 */
public class Aplikasi_MenuUtama extends javax.swing.JFrame {

    /** Creates new form Aplikasi_MenuUtama */
    public Aplikasi_MenuUtama() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lnama = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lkode = new javax.swing.JLabel();
        llevel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        mnLogout = new javax.swing.JMenuItem();
        mnKeluar = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        mnBarang = new javax.swing.JMenuItem();
        mnUser = new javax.swing.JMenuItem();
        mnTransaksi = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        mnLapBarang = new javax.swing.JMenuItem();
        mnLapPelanggan = new javax.swing.JMenuItem();
        mnLapUser = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        mnGantiPassword = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Selamat Datang di APlikasi Penjualan Sdr/i");

        lnama.setText("jLabel2");

        jLabel2.setText("Kode User Anda :");

        jLabel3.setText("Akses Level Anda :");

        lkode.setText("jLabel4");

        llevel.setText("jLabel6");

        jMenu1.setText("File");

        mnLogout.setText("Logout");
        jMenu1.add(mnLogout);

        mnKeluar.setText("Keluar");
        jMenu1.add(mnKeluar);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Master");

        mnBarang.setText("Barang");
        jMenu2.add(mnBarang);

        mnUser.setText("User");
        jMenu2.add(mnUser);

        jMenuBar1.add(jMenu2);

        mnTransaksi.setText("Transaksi");
        jMenuBar1.add(mnTransaksi);

        jMenu3.setText("Laporan");

        mnLapBarang.setText("Data Barang");
        jMenu3.add(mnLapBarang);

        mnLapPelanggan.setText("Data Pelanggan");
        jMenu3.add(mnLapPelanggan);

        mnLapUser.setText("Data User");
        jMenu3.add(mnLapUser);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Utility");

        mnGantiPassword.setText("Ganti Password");
        jMenu4.add(mnGantiPassword);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(llevel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(lkode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31)
                .addComponent(lnama, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lnama))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lkode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(llevel))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Aplikasi_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Aplikasi_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Aplikasi_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Aplikasi_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Aplikasi_MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lkode;
    private javax.swing.JLabel llevel;
    private javax.swing.JLabel lnama;
    private javax.swing.JMenuItem mnBarang;
    private javax.swing.JMenuItem mnGantiPassword;
    private javax.swing.JMenuItem mnKeluar;
    private javax.swing.JMenuItem mnLapBarang;
    private javax.swing.JMenuItem mnLapPelanggan;
    private javax.swing.JMenuItem mnLapUser;
    private javax.swing.JMenuItem mnLogout;
    private javax.swing.JMenu mnTransaksi;
    private javax.swing.JMenuItem mnUser;
    // End of variables declaration//GEN-END:variables

}
