/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kelompok_7_oop.Panel;

import java.awt.Color;
import javax.swing.JScrollPane;

/**
 *
 * @author Nashir
 */
public class LandingPanel extends javax.swing.JPanel {

    private JScrollPane mainScrollPane;

    /**
     * Creates new form LandingPanel
     */
    public LandingPanel(JScrollPane mainScrollPane) {
        
        initComponents();
        this.mainScrollPane=mainScrollPane;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        pencacahButtonPanel = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        pengawasButtonPanel = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(30, 47, 92));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 24)); // NOI18N
        jLabel2.setText("SURVEI ANGKATAN KERJA NASIONAL 2016");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addContainerGap(380, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(214, 217, 224));

        jLabel3.setFont(new java.awt.Font("Segoe UI Light", 0, 36)); // NOI18N
        jLabel3.setText("Kelompok 7");

        jLabel4.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel4.setText("<html><ol><li>Nama 1</li><li>Nama 2</li><li>Nama 3</li><li>Nama 4</li><li>Nama 5</li></ol></html>");

<<<<<<< HEAD
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/ic_launcher.png"))); // NOI18N

=======
>>>>>>> 8c1b18a338cdab206797e0a24b44bd1cc17bf35b
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
<<<<<<< HEAD
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 460, Short.MAX_VALUE)
=======
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 556, Short.MAX_VALUE)
>>>>>>> 8c1b18a338cdab206797e0a24b44bd1cc17bf35b
                .addComponent(jLabel6)
                .addGap(30, 30, 30))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pencacahButtonPanel.setBackground(new java.awt.Color(107, 116, 147));
        pencacahButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pencacahButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pencacahButtonPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pencacahButtonPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pencacahButtonPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pencacahButtonPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pencacahButtonPanelMouseReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel7.setText("Pencacah");

<<<<<<< HEAD
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Hand With Pen_96px.png"))); // NOI18N

=======
>>>>>>> 8c1b18a338cdab206797e0a24b44bd1cc17bf35b
        javax.swing.GroupLayout pencacahButtonPanelLayout = new javax.swing.GroupLayout(pencacahButtonPanel);
        pencacahButtonPanel.setLayout(pencacahButtonPanelLayout);
        pencacahButtonPanelLayout.setHorizontalGroup(
            pencacahButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pencacahButtonPanelLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(pencacahButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pencacahButtonPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel7))
                    .addComponent(jLabel9))
                .addGap(48, 48, 48))
        );
        pencacahButtonPanelLayout.setVerticalGroup(
            pencacahButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pencacahButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        pengawasButtonPanel.setBackground(new java.awt.Color(107, 116, 147));
        pengawasButtonPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pengawasButtonPanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pengawasButtonPanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pengawasButtonPanelMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pengawasButtonPanelMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pengawasButtonPanelMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pengawasButtonPanelMouseReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        jLabel10.setText("Pengawas");

<<<<<<< HEAD
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Male User_96px.png"))); // NOI18N

=======
>>>>>>> 8c1b18a338cdab206797e0a24b44bd1cc17bf35b
        javax.swing.GroupLayout pengawasButtonPanelLayout = new javax.swing.GroupLayout(pengawasButtonPanel);
        pengawasButtonPanel.setLayout(pengawasButtonPanelLayout);
        pengawasButtonPanelLayout.setHorizontalGroup(
            pengawasButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pengawasButtonPanelLayout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addGroup(pengawasButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pengawasButtonPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel10))
                    .addComponent(jLabel11))
                .addGap(48, 48, 48))
        );
        pengawasButtonPanelLayout.setVerticalGroup(
            pengawasButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pengawasButtonPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 18, 53));

<<<<<<< HEAD
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User_48px.png"))); // NOI18N

=======
>>>>>>> 8c1b18a338cdab206797e0a24b44bd1cc17bf35b
        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(1, 1, 1)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(132, 132, 132)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(310, 310, 310)
                                .addComponent(pengawasButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(pencacahButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel1, jPanel2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pengawasButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pencacahButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 66, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void pencacahButtonPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pencacahButtonPanelMouseEntered
        // TODO add your handling code here:
        pencacahButtonPanel.setBackground(new Color(156, 162, 183));
    }//GEN-LAST:event_pencacahButtonPanelMouseEntered

    private void pencacahButtonPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pencacahButtonPanelMouseExited
        // TODO add your handling code here:
        pencacahButtonPanel.setBackground(new Color(107, 116, 147));
    }//GEN-LAST:event_pencacahButtonPanelMouseExited

    private void pengawasButtonPanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengawasButtonPanelMouseEntered
        // TODO add your handling code here:
        pengawasButtonPanel.setBackground(new Color(156, 162, 183));

    }//GEN-LAST:event_pengawasButtonPanelMouseEntered

    private void pengawasButtonPanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengawasButtonPanelMouseExited
        // TODO add your handling code here:
        pengawasButtonPanel.setBackground(new Color(107, 116, 147));

    }//GEN-LAST:event_pengawasButtonPanelMouseExited

    private void pencacahButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pencacahButtonPanelMouseClicked
        // TODO add your handling code here:
//        System.out.println("masuk");
        mainScrollPane.setViewportView(new PengenalanTempatPanel(mainScrollPane));
    }//GEN-LAST:event_pencacahButtonPanelMouseClicked

    private void pengawasButtonPanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengawasButtonPanelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pengawasButtonPanelMouseClicked

    private void pengawasButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengawasButtonPanelMousePressed
        // TODO add your handling code here:
        pengawasButtonPanel.setBackground(new Color(20, 31, 61));
    }//GEN-LAST:event_pengawasButtonPanelMousePressed

    private void pengawasButtonPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pengawasButtonPanelMouseReleased
        // TODO add your handling code here:
        pengawasButtonPanel.setBackground(new Color(107, 116, 147));

    }//GEN-LAST:event_pengawasButtonPanelMouseReleased

    private void pencacahButtonPanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pencacahButtonPanelMousePressed
        // TODO add your handling code here:
        pencacahButtonPanel.setBackground(new Color(20, 31, 61));

    }//GEN-LAST:event_pencacahButtonPanelMousePressed

    private void pencacahButtonPanelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pencacahButtonPanelMouseReleased
        // TODO add your handling code here:
        pencacahButtonPanel.setBackground(new Color(107, 116, 147));

    }//GEN-LAST:event_pencacahButtonPanelMouseReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel pencacahButtonPanel;
    private javax.swing.JPanel pengawasButtonPanel;
    // End of variables declaration//GEN-END:variables
}
