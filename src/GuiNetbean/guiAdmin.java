/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiNetbean;
//addd

import Storage.Avatar;
import Storage.Account;
import Storage.AccountList;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.Queue;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class guiAdmin extends javax.swing.JFrame {

    /**
     * Creates new form guiAdmin
     */
    public guiAdmin() {
        initComponents();

        initComponentsCustom();
        setValueTable(list.getAccountList());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainJPanel = new javax.swing.JPanel();
        panelAdmin = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        osearch = new javax.swing.JTextField();
        delete = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        ofullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        obirthday = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ophonenum = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        oemail = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        osex = new javax.swing.JTextField();
        owork = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        oaddress = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ofb = new javax.swing.JTextField();
        lbAvatar = new javax.swing.JLabel();
        softByName = new javax.swing.JButton();
        softByUsername = new javax.swing.JButton();
        searchByUsername = new javax.swing.JButton();
        searchByName1 = new javax.swing.JButton();
        resetTable = new javax.swing.JButton();
        copyModeBtn = new javax.swing.JRadioButton();
        jpnView = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(650, 250));

        panelAdmin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User information");
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        panelAdmin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 370, 54));
        jLabel1.getAccessibleContext().setAccessibleName("");

        jLabel2.setFont(new java.awt.Font("UTM Avo", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search");
        panelAdmin.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 62, -1));

        osearch.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        panelAdmin.add(osearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 190, -1));

        delete.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        delete.setText("Delete");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        panelAdmin.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 390, -1, -1));

        logout.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        panelAdmin.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 10, 95, -1));
        logout.getAccessibleContext().setAccessibleName("ButtonDX");

        ofullname.setEditable(false);
        ofullname.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ofullnameMouseClicked(evt);
            }
        });
        panelAdmin.add(ofullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 150, 200, -1));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("UTM Avo", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Name");
        panelAdmin.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 70, -1));

        jLabel4.setFont(new java.awt.Font("UTM Avo", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Birthday");
        panelAdmin.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, -1, -1));

        obirthday.setEditable(false);
        obirthday.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                obirthdayMouseClicked(evt);
            }
        });
        panelAdmin.add(obirthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 200, 200, -1));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("UTM Avo", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Phone");
        panelAdmin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 70, -1));

        ophonenum.setEditable(false);
        ophonenum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ophonenumMouseClicked(evt);
            }
        });
        panelAdmin.add(ophonenum, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 200, -1));

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("UTM Avo", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Email");
        panelAdmin.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, 70, -1));

        oemail.setEditable(false);
        oemail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oemailMouseClicked(evt);
            }
        });
        panelAdmin.add(oemail, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 200, -1));

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("UTM Avo", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Gender");
        panelAdmin.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 70, -1));

        osex.setEditable(false);
        panelAdmin.add(osex, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 200, -1));

        owork.setEditable(false);
        owork.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oworkMouseClicked(evt);
            }
        });
        panelAdmin.add(owork, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 200, 200, -1));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("UTM Avo", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Work");
        panelAdmin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 200, 70, -1));

        oaddress.setEditable(false);
        oaddress.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oaddressMouseClicked(evt);
            }
        });
        panelAdmin.add(oaddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 200, -1));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("UTM Avo", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Address");
        panelAdmin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 250, 70, -1));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("UTM Avo", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Facebook");
        panelAdmin.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 300, 80, -1));

        ofb.setEditable(false);
        ofb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ofbMouseClicked(evt);
            }
        });
        panelAdmin.add(ofb, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 300, 200, -1));

        lbAvatar.setBackground(new java.awt.Color(255, 255, 255));
        lbAvatar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lbAvatar.setForeground(new java.awt.Color(255, 255, 255));
        lbAvatar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAvatar.setText("Avatar");
        lbAvatar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelAdmin.add(lbAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 200, 200));

        softByName.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        softByName.setText("Sort by name");
        softByName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softByNameActionPerformed(evt);
            }
        });
        panelAdmin.add(softByName, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 390, 110, -1));

        softByUsername.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        softByUsername.setText("Sort by username");
        softByUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                softByUsernameActionPerformed(evt);
            }
        });
        panelAdmin.add(softByUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 390, 140, -1));

        searchByUsername.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        searchByUsername.setText("Search by username");
        searchByUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByUsernameActionPerformed(evt);
            }
        });
        panelAdmin.add(searchByUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 150, -1));

        searchByName1.setFont(new java.awt.Font("UTM Avo", 0, 12)); // NOI18N
        searchByName1.setText("Search by name");
        searchByName1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByName1ActionPerformed(evt);
            }
        });
        panelAdmin.add(searchByName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 130, -1));

        resetTable.setText("Reset table");
        resetTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetTableActionPerformed(evt);
            }
        });
        panelAdmin.add(resetTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 390, -1, -1));

        copyModeBtn.setBackground(new java.awt.Color(255, 255, 255));
        copyModeBtn.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        copyModeBtn.setForeground(new java.awt.Color(255, 255, 255));
        copyModeBtn.setText("Copy Mode");
        copyModeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyModeBtnActionPerformed(evt);
            }
        });
        panelAdmin.add(copyModeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, -1));

        jpnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiNetbean/Pic/ABSTRACT_BACKGROUND_01.jpg"))); // NOI18N
        panelAdmin.add(jpnView, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 420));

        jCheckBox1.setText("jCheckBox1");
        panelAdmin.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, -1, -1));

        jt.setModel(new DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Username", "Full Name", "Birthday", "Phone Number", "Sex", "Email", "Facebook", "Work", "Address"
            })
        );
        jt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt);

        javax.swing.GroupLayout mainJPanelLayout = new javax.swing.GroupLayout(mainJPanel);
        mainJPanel.setLayout(mainJPanelLayout);
        mainJPanelLayout.setHorizontalGroup(
            mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
            .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainJPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(panelAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1))
                    .addContainerGap()))
        );
        mainJPanelLayout.setVerticalGroup(
            mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 721, Short.MAX_VALUE)
            .addGroup(mainJPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainJPanelLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                    .addGap(1, 1, 1)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainJPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int output = JOptionPane.showConfirmDialog(logout, "Do you want to sign out?", "Logout",
                JOptionPane.YES_NO_OPTION);
        if (output == 0) {
            guiMain f1 = new guiMain();
            f1.setVisible(true);
            dispose();
        }

    }//GEN-LAST:event_logoutActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
//        final DefaultTableModel model = (DefaultTableModel) jt.getModel();
//        AccountList a = new AccountList();
//        int index = jt.getSelectedRow();
//        if (index == -1) {
//            return;
//        }
//        String choice = (String) jt.getValueAt(index, 0);
//        a.delete(choice);
//        model.removeRow(index);
        int index = jt.getSelectedRow();
        if (index == -1) {
            return;
        }
        String choice = (String) jt.getValueAt(index, 0);
        list.delete(choice);
        model.removeRow(index);
    }//GEN-LAST:event_deleteActionPerformed

    private void jtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtMouseClicked
        int index = jt.getSelectedRow();
        ofullname.setText((String) jt.getValueAt(index, 1));
        obirthday.setText((String) jt.getValueAt(index, 2));
        ophonenum.setText((String) jt.getValueAt(index, 3));
        oemail.setText((String) jt.getValueAt(index, 5));
        osex.setText((String) jt.getValueAt(index, 4));
        owork.setText((String) jt.getValueAt(index, 7));
        oaddress.setText((String) jt.getValueAt(index, 8));
        ofb.setText((String) jt.getValueAt(index, 6));
        Image img = Avatar.readPicture((String) jt.getValueAt(index, 0));
        if (img != null) {
            Image resize = img.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            lbAvatar.setIcon(new ImageIcon(resize));
        } else {
            lbAvatar.setIcon(null);
        }
        if (copyMode) {
            StringSelection stringSelection = new StringSelection((String) jt.getValueAt(index, 0));
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
        }
    }//GEN-LAST:event_jtMouseClicked

    private void searchByName1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByName1ActionPerformed
        list.searchByFullNameSort(osearch.getText());
        setValueTable(list.getSearchList());
    }//GEN-LAST:event_searchByName1ActionPerformed

    private void searchByUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByUsernameActionPerformed
        list.searchByUsernameSort(osearch.getText());
        setValueTable(list.getSearchList());
    }//GEN-LAST:event_searchByUsernameActionPerformed

    private void resetTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetTableActionPerformed
        setValueTable(list.getAccountList());
    }//GEN-LAST:event_resetTableActionPerformed

    private void softByUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softByUsernameActionPerformed
        if (sortUsernameFlag) {
            list.sortByUsernameZA();
            setValueTable(list.getAccountList());
            sortUsernameFlag = false;
        } else {
            list.sortByUsernameAZ();
            setValueTable(list.getAccountList());
            sortUsernameFlag = true;
        }
    }//GEN-LAST:event_softByUsernameActionPerformed

    private void softByNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_softByNameActionPerformed
        if (sortNameFlag) {
            list.sortByNameZA();
            setValueTable(list.getAccountList());
            sortNameFlag = false;
        } else {
            list.sortByNameAZ();
            setValueTable(list.getAccountList());
            sortNameFlag = true;
        }
    }//GEN-LAST:event_softByNameActionPerformed

    private void copyModeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyModeBtnActionPerformed
        copyMode = copyModeBtn.isSelected();
    }//GEN-LAST:event_copyModeBtnActionPerformed

    private void ofullnameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ofullnameMouseClicked
        if (copyMode && evt.getModifiers() == java.awt.event.MouseEvent.BUTTON3_MASK) {
            StringSelection stringSelection = new StringSelection(ofullname.getText());
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
        }
    }//GEN-LAST:event_ofullnameMouseClicked

    private void obirthdayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_obirthdayMouseClicked
        if (copyMode && evt.getModifiers() == java.awt.event.MouseEvent.BUTTON3_MASK) {
            StringSelection stringSelection = new StringSelection(obirthday.getText());
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
        }
    }//GEN-LAST:event_obirthdayMouseClicked

    private void ophonenumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ophonenumMouseClicked
        if (copyMode && evt.getModifiers() == java.awt.event.MouseEvent.BUTTON3_MASK) {
            StringSelection stringSelection = new StringSelection(ophonenum.getText());
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
        }
    }//GEN-LAST:event_ophonenumMouseClicked

    private void oemailMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oemailMouseClicked
        if (copyMode && evt.getModifiers() == java.awt.event.MouseEvent.BUTTON3_MASK) {
            StringSelection stringSelection = new StringSelection(oemail.getText());
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
        }
    }//GEN-LAST:event_oemailMouseClicked

    private void oworkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oworkMouseClicked
        if (copyMode && evt.getModifiers() == java.awt.event.MouseEvent.BUTTON3_MASK) {
            StringSelection stringSelection = new StringSelection(owork.getText());
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
        }
    }//GEN-LAST:event_oworkMouseClicked

    private void oaddressMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oaddressMouseClicked
        if (copyMode && evt.getModifiers() == java.awt.event.MouseEvent.BUTTON3_MASK) {
            StringSelection stringSelection = new StringSelection(oaddress.getText());
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
        }
    }//GEN-LAST:event_oaddressMouseClicked

    private void ofbMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ofbMouseClicked
        if (copyMode && evt.getModifiers() == java.awt.event.MouseEvent.BUTTON3_MASK) {
            StringSelection stringSelection = new StringSelection(ofb.getText());
            Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();
            clpbrd.setContents(stringSelection, null);
        }
    }//GEN-LAST:event_ofbMouseClicked

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
            java.util.logging.Logger.getLogger(guiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//                Account a = new Account("fudio101_admin007", "Ng01637202484", "Nguyen Do The Nguyen",
//                        LocalDate.of(2001, Month.JANUARY, 1), "0337202484");
                new guiAdmin().setVisible(true);
            }
        });
    }

    private boolean copyMode;
    private boolean sortUsernameFlag;
    private boolean sortNameFlag;
    private AccountList list;
    private DefaultTableModel model;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton copyModeBtn;
    private javax.swing.JButton delete;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jpnView;
    private javax.swing.JTable jt;
    private javax.swing.JLabel lbAvatar;
    private javax.swing.JButton logout;
    private javax.swing.JPanel mainJPanel;
    private javax.swing.JTextField oaddress;
    private javax.swing.JTextField obirthday;
    private javax.swing.JTextField oemail;
    private javax.swing.JTextField ofb;
    private javax.swing.JTextField ofullname;
    private javax.swing.JTextField ophonenum;
    private javax.swing.JTextField osearch;
    private javax.swing.JTextField osex;
    private javax.swing.JTextField owork;
    private javax.swing.JPanel panelAdmin;
    private javax.swing.JButton resetTable;
    private javax.swing.JButton searchByName1;
    private javax.swing.JButton searchByUsername;
    private javax.swing.JButton softByName;
    private javax.swing.JButton softByUsername;
    // End of variables declaration//GEN-END:variables

    private void initComponentsCustom() {
        copyMode = false;
        sortNameFlag = false;
        sortUsernameFlag = true;
        list = new AccountList();
        model = (DefaultTableModel) jt.getModel();
//        jt.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jt.getColumnModel().getColumn(0).setPreferredWidth(80);
        jt.getColumnModel().getColumn(1).setPreferredWidth(175);
        jt.getColumnModel().getColumn(2).setPreferredWidth(75);
        jt.getColumnModel().getColumn(3).setPreferredWidth(100);
        jt.getColumnModel().getColumn(4).setPreferredWidth(50);
        jt.getColumnModel().getColumn(5).setPreferredWidth(175);
        jt.getColumnModel().getColumn(6).setPreferredWidth(100);
        jt.getColumnModel().getColumn(7).setPreferredWidth(100);
        jt.getColumnModel().getColumn(8).setPreferredWidth(150);
    }

    private void setValueTable(Queue<Account> accountList) {
        for (int i = model.getRowCount() - 1; i > -1; i--) {
            model.removeRow(i);
        }
        Object[] obj;
        int size = accountList.size();
        for (int i = 0; i < size; i++) {
            Account t = accountList.poll();
            obj = new Object[9];
            obj[0] = t.getUsername();
            obj[1] = t.getFullName();
            obj[2] = t.getBirthday();
            obj[3] = t.getPhoneNum();
            obj[4] = t.getSex() ? "Male" : "Female";
            obj[5] = t.getEmail();
            obj[6] = t.getFb();
            obj[7] = t.getWork();
            obj[8] = t.getAddress();
            model.addRow(obj);
            accountList.add(t);
        }
    }

    public JPanel getJPanel() {
        return mainJPanel;
    }
}
