/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiNetbean;

import Encryption.ChuyenManHinhController;

/**
 *
 * @author Admin
 */
public class guiAccountManager extends javax.swing.JFrame {

    /**
     * Creates new form guiAccountManager
     */
    public guiAccountManager() {
        initComponents();

        ChuyenManHinhController controller = new ChuyenManHinhController(panelView);
        controller.setView(AccountManager, lbAccount);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        paneRoot = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AccountManager = new javax.swing.JPanel();
        lbAccount = new javax.swing.JLabel();
        StaticChart = new javax.swing.JPanel();
        lbStatic = new javax.swing.JLabel();
        logoutButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        panelView = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelMenu.setBackground(new java.awt.Color(102, 102, 102));
        panelMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("UTM Androgyne", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ACCOUNT  MANAGEMENT");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        panelMenu.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        AccountManager.setBackground(new java.awt.Color(0, 153, 0));

        lbAccount.setFont(new java.awt.Font("UTM Androgyne", 1, 18)); // NOI18N
        lbAccount.setForeground(new java.awt.Color(255, 255, 255));
        lbAccount.setText("Account Management");

        javax.swing.GroupLayout AccountManagerLayout = new javax.swing.GroupLayout(AccountManager);
        AccountManager.setLayout(AccountManagerLayout);
        AccountManagerLayout.setHorizontalGroup(
            AccountManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountManagerLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(lbAccount)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        AccountManagerLayout.setVerticalGroup(
            AccountManagerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AccountManagerLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(lbAccount)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        panelMenu.add(AccountManager, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 128, 315, -1));

        StaticChart.setBackground(new java.awt.Color(0, 153, 0));

        lbStatic.setFont(new java.awt.Font("UTM Androgyne", 1, 18)); // NOI18N
        lbStatic.setForeground(new java.awt.Color(255, 255, 255));
        lbStatic.setText("Statistical chart");

        javax.swing.GroupLayout StaticChartLayout = new javax.swing.GroupLayout(StaticChart);
        StaticChart.setLayout(StaticChartLayout);
        StaticChartLayout.setHorizontalGroup(
            StaticChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaticChartLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(lbStatic)
                .addContainerGap(101, Short.MAX_VALUE))
        );
        StaticChartLayout.setVerticalGroup(
            StaticChartLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StaticChartLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lbStatic)
                .addContainerGap(47, Short.MAX_VALUE))
        );

        panelMenu.add(StaticChart, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 246, 315, -1));

        logoutButton.setText("Logout");
        panelMenu.add(logoutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 650, -1, -1));

        jLabel4.setText("Carrot team @2021");
        panelMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 680, -1, -1));

        panelView.setBackground(new java.awt.Color(204, 204, 204));

        jLabel5.setText("jLabel5");

        javax.swing.GroupLayout panelViewLayout = new javax.swing.GroupLayout(panelView);
        panelView.setLayout(panelViewLayout);
        panelViewLayout.setHorizontalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addContainerGap(765, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        panelViewLayout.setVerticalGroup(
            panelViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );

        javax.swing.GroupLayout paneRootLayout = new javax.swing.GroupLayout(paneRoot);
        paneRoot.setLayout(paneRootLayout);
        paneRootLayout.setHorizontalGroup(
            paneRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneRootLayout.createSequentialGroup()
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        paneRootLayout.setVerticalGroup(
            paneRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(paneRoot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
            java.util.logging.Logger.getLogger(guiAccountManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiAccountManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiAccountManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiAccountManager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiAccountManager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel AccountManager;
    private javax.swing.JPanel StaticChart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbAccount;
    private javax.swing.JLabel lbStatic;
    private javax.swing.JButton logoutButton;
    private javax.swing.JPanel paneRoot;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelView;
    // End of variables declaration//GEN-END:variables
}
