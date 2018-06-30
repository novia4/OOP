/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop.Panel;

import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JScrollPane;
import kelompok_7_oop.Kelas.AnggotaRuta;
import kelompok_7_oop.Kelas.JamKerja;
import kelompok_7_oop.Kelas.Ruta;
import kelompok_7_oop.Kelas.WaktuBekerja;

/**
 *
 * @author Nashir
 */
public class JamKerjaKeseluruhanPanel extends javax.swing.JPanel {

    private JScrollPane mainScrollPane;
    private AnggotaRuta art;
    private WaktuBekerja waktuBekerja = new WaktuBekerja();
    /**
     * Creates new form JamKerjaKeseluruhanPanel
     */
    public JamKerjaKeseluruhanPanel(JScrollPane mainScrollPane, AnggotaRuta art) {
        initComponents();
        this.mainScrollPane = mainScrollPane;
        this.art = art;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    private String getSelected(ButtonGroup bg) {
        for (Enumeration<AbstractButton> buttons = bg.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }
        return "tidak valid";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tambahJamKerjaButtonGroup = new javax.swing.ButtonGroup();
        siapTambahJamButtonGroup = new javax.swing.ButtonGroup();
        alasanButtonGroup = new javax.swing.ButtonGroup();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        judulAPanel = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        tambahJamNegatifRadioButton1 = new javax.swing.JRadioButton();
        tambahJamPositiveRadioButton = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        tidakSiapTambahJamRadioButton = new javax.swing.JRadioButton();
        siapTambahJamRadioButton = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jamKerjaBiasaTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        siapTambahJamRadioButton1 = new javax.swing.JRadioButton();
        tidakSiapTambahJamRadioButton1 = new javax.swing.JRadioButton();
        nextButton = new javax.swing.JButton();
        seninJamKerjaSpinner = new javax.swing.JSpinner();
        selasaJamKerjaSpinner = new javax.swing.JSpinner();
        rabuJamKerjaSpinner = new javax.swing.JSpinner();
        kamisJamKerjaSpinner = new javax.swing.JSpinner();
        jumatJamKerjaSpinner = new javax.swing.JSpinner();
        sabtuJamKerjaSpinner = new javax.swing.JSpinner();
        mingguJamKerjaSpinner = new javax.swing.JSpinner();

        jLabel12.setText("Sabtu:");

        jLabel13.setText("Rabu:");

        jLabel8.setText("Selasa:");

        jLabel7.setText("Senin:");

        jLabel10.setText("Kamis:");

        jLabel11.setText("Jum'at:");

        jLabel9.setText("Minggu:");

        jLabel6.setText("Jumlah jam kerja keseluruhan pekerjaan:");

        judulAPanel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        judulAPanel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judulAPanel.setText("V.F. JAM KERJA KESELURUHAN");

        jLabel14.setText("Keinginan untuk menambah jam kerja:");

        tambahJamKerjaButtonGroup.add(tambahJamNegatifRadioButton1);
        tambahJamNegatifRadioButton1.setText("Tidak");
        tambahJamNegatifRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahJamNegatifRadioButton1ActionPerformed(evt);
            }
        });

        tambahJamKerjaButtonGroup.add(tambahJamPositiveRadioButton);
        tambahJamPositiveRadioButton.setText("Ya");

        jLabel15.setText("Siap/bersedia menambah jam kerja rentang dua minggu kedepan:");

        siapTambahJamButtonGroup.add(tidakSiapTambahJamRadioButton);
        tidakSiapTambahJamRadioButton.setText("Tidak");
        tidakSiapTambahJamRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidakSiapTambahJamRadioButtonActionPerformed(evt);
            }
        });

        siapTambahJamButtonGroup.add(siapTambahJamRadioButton);
        siapTambahJamRadioButton.setText("Ya");

        jLabel16.setText("Jumlah jam kerja biasanya dalam seminggu:");

        jamKerjaBiasaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jamKerjaBiasaTextFieldActionPerformed(evt);
            }
        });

        jLabel17.setText("<html>Apa penurunan aktivitas ekonomi menjadi alasan bekerja < 40<br> jam seminggu lalu:</html>");

        alasanButtonGroup.add(siapTambahJamRadioButton1);
        siapTambahJamRadioButton1.setText("Ya");

        alasanButtonGroup.add(tidakSiapTambahJamRadioButton1);
        tidakSiapTambahJamRadioButton1.setText("Tidak");
        tidakSiapTambahJamRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tidakSiapTambahJamRadioButton1ActionPerformed(evt);
            }
        });

        nextButton.setText("NEXT");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(siapTambahJamRadioButton1)
                                .addGap(49, 49, 49)
                                .addComponent(tidakSiapTambahJamRadioButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tambahJamPositiveRadioButton)
                                .addGap(49, 49, 49)
                                .addComponent(tambahJamNegatifRadioButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(siapTambahJamRadioButton)
                                .addGap(49, 49, 49)
                                .addComponent(tidakSiapTambahJamRadioButton))
                            .addComponent(jamKerjaBiasaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(252, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(seninJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(selasaJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(rabuJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(40, 40, 40)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(kamisJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jumatJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(sabtuJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(jLabel6))
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(mingguJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(judulAPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(nextButton)
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(judulAPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(seninJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kamisJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mingguJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11)
                    .addComponent(selasaJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumatJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(rabuJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sabtuJamKerjaSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jamKerjaBiasaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tambahJamPositiveRadioButton)
                    .addComponent(tambahJamNegatifRadioButton1))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siapTambahJamRadioButton)
                    .addComponent(tidakSiapTambahJamRadioButton))
                .addGap(18, 18, 18)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(siapTambahJamRadioButton1)
                    .addComponent(tidakSiapTambahJamRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(nextButton)
                .addContainerGap(31, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tambahJamNegatifRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahJamNegatifRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tambahJamNegatifRadioButton1ActionPerformed

    private void tidakSiapTambahJamRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidakSiapTambahJamRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidakSiapTambahJamRadioButtonActionPerformed

    private void tidakSiapTambahJamRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tidakSiapTambahJamRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tidakSiapTambahJamRadioButton1ActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        // TODO add your handling code here:
        JamKerja jamKerja = new JamKerja();
        int[] con = new int[7];
        con[0] = (int) seninJamKerjaSpinner.getValue();
        con[1] = (int) selasaJamKerjaSpinner.getValue();
        con[2] = (int) rabuJamKerjaSpinner.getValue();
        con[3] = (int) kamisJamKerjaSpinner.getValue();
        con[4] = (int) jumatJamKerjaSpinner.getValue();

        con[5] = (int) sabtuJamKerjaSpinner.getValue();
        con[6] = (int) mingguJamKerjaSpinner.getValue();
        jamKerja.setJamKerjaPerHari(con);
        jamKerja.setJamKerjaBiasa(Integer.parseInt(jamKerjaBiasaTextField.getText()));
        waktuBekerja.setJamKerja(jamKerja);

        waktuBekerja.setSiapTambahJamKerja(getSelected(siapTambahJamButtonGroup));
        waktuBekerja.setTambahJamKerja(getSelected(tambahJamKerjaButtonGroup));
        waktuBekerja.setPenurunanEkonomi(getSelected(alasanButtonGroup));
        
        mainScrollPane.setViewportView(new PengalamanKerjaPanel(mainScrollPane, art));
    }//GEN-LAST:event_nextButtonActionPerformed

    private void jamKerjaBiasaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jamKerjaBiasaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jamKerjaBiasaTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup alasanButtonGroup;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jamKerjaBiasaTextField;
    private javax.swing.JLabel judulAPanel;
    private javax.swing.JSpinner jumatJamKerjaSpinner;
    private javax.swing.JSpinner kamisJamKerjaSpinner;
    private javax.swing.JSpinner mingguJamKerjaSpinner;
    private javax.swing.JButton nextButton;
    private javax.swing.JSpinner rabuJamKerjaSpinner;
    private javax.swing.JSpinner sabtuJamKerjaSpinner;
    private javax.swing.JSpinner selasaJamKerjaSpinner;
    private javax.swing.JSpinner seninJamKerjaSpinner;
    private javax.swing.ButtonGroup siapTambahJamButtonGroup;
    private javax.swing.JRadioButton siapTambahJamRadioButton;
    private javax.swing.JRadioButton siapTambahJamRadioButton1;
    private javax.swing.ButtonGroup tambahJamKerjaButtonGroup;
    private javax.swing.JRadioButton tambahJamNegatifRadioButton1;
    private javax.swing.JRadioButton tambahJamPositiveRadioButton;
    private javax.swing.JRadioButton tidakSiapTambahJamRadioButton;
    private javax.swing.JRadioButton tidakSiapTambahJamRadioButton1;
    // End of variables declaration//GEN-END:variables
}
