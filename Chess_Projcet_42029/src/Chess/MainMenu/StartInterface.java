/*
 * Name: Alec Farfan, Jiwon Yoo, Luis Pena, Wenbo Yang
 * Date: 04/07/15
 * Purpose: ChessUI Class
 */

package Chess.MainMenu;

import java.awt.Color;

public class StartInterface extends javax.swing.JFrame {

    /**
     * Creates new form ChessUI
     */
    public StartInterface() {
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

        selectDialog = new javax.swing.JDialog();
        jPanel2 = new javax.swing.JPanel();
        PvsPButton = new javax.swing.JButton();
        PvsCButton = new javax.swing.JButton();
        selectCancelButton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        mainChessLabel = new javax.swing.JLabel();
        mainQuitButton = new javax.swing.JButton();
        mainEnterButton = new javax.swing.JButton();
        mainImgLabel = new javax.swing.JLabel();

        selectDialog.setTitle("Chess - Select");
        selectDialog.setAutoRequestFocus(false);
        selectDialog.setFocusCycleRoot(false);
        selectDialog.setFocusable(false);
        selectDialog.setFocusableWindowState(false);
        selectDialog.setMinimumSize(new java.awt.Dimension(420, 220));
        selectDialog.setUndecorated(true);
        selectDialog.setPreferredSize(new java.awt.Dimension(420, 220));
        selectDialog.setResizable(false);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanel2.setMinimumSize(new java.awt.Dimension(420, 230));
        jPanel2.setName(""); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(420, 230));

        PvsPButton.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        PvsPButton.setText("Player VS Player");
        PvsPButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PvsPButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PvsPButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PvsPButtonMouseExited(evt);
            }
        });
        PvsPButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PvsPButtonActionPerformed(evt);
            }
        });

        PvsCButton.setFont(new java.awt.Font("Ubuntu", 1, 36)); // NOI18N
        PvsCButton.setText("Player VS Computer");
        PvsCButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PvsCButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PvsCButtonMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PvsCButtonMouseExited(evt);
            }
        });
        PvsCButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PvsCButtonActionPerformed(evt);
            }
        });

        selectCancelButton.setText("Cancel");
        selectCancelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        selectCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PvsPButton, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(PvsCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addComponent(selectCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PvsPButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(PvsCButton, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(selectCancelButton)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout selectDialogLayout = new javax.swing.GroupLayout(selectDialog.getContentPane());
        selectDialog.getContentPane().setLayout(selectDialogLayout);
        selectDialogLayout.setHorizontalGroup(
            selectDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        selectDialogLayout.setVerticalGroup(
            selectDialogLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chess");
        setAutoRequestFocus(false);
        setMinimumSize(new java.awt.Dimension(775, 450));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setForeground(new java.awt.Color(154, 154, 154));

        mainChessLabel.setFont(new java.awt.Font("Ubuntu", 1, 72)); // NOI18N
        mainChessLabel.setForeground(new java.awt.Color(172, 172, 172));
        mainChessLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainChessLabel.setText("CHESS");

        mainQuitButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainQuitButton.setLabel("Quit");
        mainQuitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainQuitButtonActionPerformed(evt);
            }
        });

        mainEnterButton.setBackground(new java.awt.Color(255, 255, 255));
        mainEnterButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mainEnterButton.setLabel("Enter");
        mainEnterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mainEnterButtonActionPerformed(evt);
            }
        });

        mainImgLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Chess/img/rsz_3rsz_lone-white-king.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainChessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 714, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(533, 533, 533)
                            .addComponent(mainQuitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(mainImgLabel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(mainEnterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(33, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(28, 28, 28)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(mainChessLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(349, 349, 349)
                            .addComponent(mainQuitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(102, 102, 102)
                            .addComponent(mainImgLabel))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(349, 349, 349)
                            .addComponent(mainEnterButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(29, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mainQuitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainQuitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_mainQuitButtonActionPerformed

    private void mainEnterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mainEnterButtonActionPerformed
        // TODO add your handling code here:
        selectDialog.setLocationRelativeTo(null);
        selectDialog.setSize(400,225);
        selectDialog.setVisible(true);
    }//GEN-LAST:event_mainEnterButtonActionPerformed

    private void selectCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectCancelButtonActionPerformed
        // TODO add your handling code here:
        selectDialog.setVisible(false);
    }//GEN-LAST:event_selectCancelButtonActionPerformed

    private void PvsPButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PvsPButtonActionPerformed
        // TODO add your handling code here:
        //selectDialog.setVisible(false);
        this.setVisible(false);
        LoginInterface login = new LoginInterface(0);
        login.isOnePlayer(false);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_PvsPButtonActionPerformed

    private void PvsCButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PvsCButtonActionPerformed
        // TODO add your handling code here:
        selectDialog.setVisible(false);
        this.setVisible(false);
        LoginInterface login = new LoginInterface(1);
        login.isOnePlayer(true);
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_PvsCButtonActionPerformed

    private void PvsPButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PvsPButtonMouseEntered
        PvsPButton.setForeground(new Color(109,53,26));
    }//GEN-LAST:event_PvsPButtonMouseEntered

    private void PvsPButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PvsPButtonMouseExited
        PvsPButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_PvsPButtonMouseExited

    private void PvsCButtonMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PvsCButtonMouseEntered
        PvsCButton.setForeground(new Color(109,53,26));
    }//GEN-LAST:event_PvsCButtonMouseEntered

    private void PvsCButtonMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PvsCButtonMouseExited
        PvsCButton.setForeground(Color.BLACK);
    }//GEN-LAST:event_PvsCButtonMouseExited

//     /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(LoginInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        StartInterface screen = new StartInterface();
//        screen.setVisible(true);
//        screen.setLocationRelativeTo(null);
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PvsCButton;
    private javax.swing.JButton PvsPButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel mainChessLabel;
    private javax.swing.JButton mainEnterButton;
    private javax.swing.JLabel mainImgLabel;
    private javax.swing.JButton mainQuitButton;
    private javax.swing.JButton selectCancelButton;
    private javax.swing.JDialog selectDialog;
    // End of variables declaration//GEN-END:variables
}