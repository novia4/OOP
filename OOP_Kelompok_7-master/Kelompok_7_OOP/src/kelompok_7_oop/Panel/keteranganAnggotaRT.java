/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop.Panel;

/**
 *
 * @author USER-PC
 */
public class keteranganAnggotaRT extends javax.swing.JPanel {

    /**
     * Creates new form keteranganAnggotaRT
     */
    public keteranganAnggotaRT() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenisKelaminbuttonGroup = new javax.swing.ButtonGroup();
        judulAPanel = new javax.swing.JLabel();
        judulAPanel1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        hubDgKepRTComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jKLakiLakiRadioButton = new javax.swing.JRadioButton();
        jKPerempuanRadioButton = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        partisipasiSekolahComboBox = new javax.swing.JComboBox<>();
        namaTextField = new javax.swing.JTextField();
        bulanLahirTextField = new javax.swing.JTextField();
        tahunLahirTextField = new javax.swing.JTextField();
        umurTextField = new javax.swing.JTextField();
        statusKawinComboBox = new javax.swing.JComboBox<>();

        judulAPanel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        judulAPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulAPanel.setText("ANGGOTA RUMAH TANGGA");

        judulAPanel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        judulAPanel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulAPanel1.setText("IV. KETERANGAN");

        jLabel1.setText("No Urut ke i");

        jLabel2.setText(" Nama : ");

        jLabel3.setText("Hubungan dengan Kepala RT : ");

        hubDgKepRTComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Kepala Rumah Tangga", "2. Istri/Suami", "3. Anak", "4. Menantu", "5. Cucu", "6. Orang tua/ Mertua", "7. Famili Lain", "8. Pembantu Rumah Tangga", "9. SUpir/Tukang Kebun", "0. Lainnya" }));

        jLabel4.setText("Jenis Kelamin : ");

        jenisKelaminbuttonGroup.add(jKLakiLakiRadioButton);
        jKLakiLakiRadioButton.setText("Laki-Laki");

        jenisKelaminbuttonGroup.add(jKPerempuanRadioButton);
        jKPerempuanRadioButton.setText("Perempuan");
        jKPerempuanRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jKPerempuanRadioButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Bulan dan Tahun Lahir : ");

        jLabel6.setText("Umur : ");

        jLabel7.setText("Status Perkawinan : ");

        jLabel8.setText("Partisipasi Sekolah : ");

        partisipasiSekolahComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Tidak / Belum Pernah Sekolah", "2. Masih Bersekolah", "3. Tidak Bersekolah Lagi", " " }));

        namaTextField.setToolTipText("");

        bulanLahirTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bulanLahirTextFieldActionPerformed(evt);
            }
        });

        umurTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umurTextFieldActionPerformed(evt);
            }
        });

        statusKawinComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1. Belum Kawin", "2. Kawin", "3. Cerai Hidup", "4. Cerai Mati", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(judulAPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(judulAPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(namaTextField)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jKLakiLakiRadioButton)
                                            .addComponent(hubDgKepRTComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jKPerempuanRadioButton)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(umurTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                                                    .addComponent(bulanLahirTextField, javax.swing.GroupLayout.Alignment.LEADING))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(tahunLahirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(statusKawinComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(partisipasiSekolahComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 49, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel1)
                        .addGap(299, 299, 299)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(judulAPanel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(judulAPanel)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(hubDgKepRTComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jKLakiLakiRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jKPerempuanRadioButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(bulanLahirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tahunLahirTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(umurTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statusKawinComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(partisipasiSekolahComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jKPerempuanRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jKPerempuanRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jKPerempuanRadioButtonActionPerformed

    private void bulanLahirTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bulanLahirTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bulanLahirTextFieldActionPerformed

    private void umurTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_umurTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_umurTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bulanLahirTextField;
    private javax.swing.JComboBox<String> hubDgKepRTComboBox;
    private javax.swing.JRadioButton jKLakiLakiRadioButton;
    private javax.swing.JRadioButton jKPerempuanRadioButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.ButtonGroup jenisKelaminbuttonGroup;
    private javax.swing.JLabel judulAPanel;
    private javax.swing.JLabel judulAPanel1;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JComboBox<String> partisipasiSekolahComboBox;
    private javax.swing.JComboBox<String> statusKawinComboBox;
    private javax.swing.JTextField tahunLahirTextField;
    private javax.swing.JTextField umurTextField;
    // End of variables declaration//GEN-END:variables
}