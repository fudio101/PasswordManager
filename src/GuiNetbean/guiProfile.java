/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiNetbean;

import Storage.Account;
import Storage.AccountList;
import javax.swing.JOptionPane;
import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author Admin
 */
public class guiProfile extends javax.swing.JFrame {

    /**
     * Creates new form guiLogin
     */
    public guiProfile(final Account login) {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        sex = new javax.swing.JTextField();
        birthday = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        editProfileButton = new javax.swing.JButton();
        agreeButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiNetbean/Pic/4882066.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(600, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("UTM Americana EB", 0, 24)); // NOI18N
        jLabel2.setText("PROFILE");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 20, -1, -1));

        fullname.setText(login.getFullName());
        getContentPane().add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 280, -1));

        sex.setText("sex");
        getContentPane().add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 230, 280, -1));

        birthday.setText(login.getBirthday());
        getContentPane().add(birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 280, -1));

        address.setText("address");
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 280, -1));

        phone.setText(login.getPhoneNum());
        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 280, -1));

        email.setText("email");
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 280, -1));

        jLabel3.setText("Carrot team @ 2021");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 490, -1, -1));

        editProfileButton.setText("Edit profile");
        editProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, -1, -1));

        agreeButton.setText("Agree");
        agreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(agreeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, -1, -1));

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 400, -1, -1));
        getContentPane().add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, 280, -1));

        jMenu1.setText("File");

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Exit");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    Date date = new Date();
    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:   
        int output = JOptionPane.showConfirmDialog(jMenuItem2, "Do you want to sign out?", "Logout",
                JOptionPane.YES_NO_OPTION);
        if (output == 0) {
            dispose();
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        int output = JOptionPane.showConfirmDialog(jMenuItem2, "Do you want to sign out?", "Logout",
                JOptionPane.YES_NO_OPTION);
        if (output == 0) {
            guiMain frm1 = new guiMain();
            frm1.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void editProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editProfileButtonActionPerformed
        // TODO add your handling code here:
        agreeButton.setVisible(true);
        cancelButton.setVisible(true);
        editProfileButton.setVisible(false);
        fullname.setEditable(true);
        phone.setEditable(true);
        birthday.setVisible(false);
        //       dateChooser.setVisible(true);

    }//GEN-LAST:event_editProfileButtonActionPerformed

    private void agreeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agreeButtonActionPerformed
        // TODO add your handling code here:
        agreeButton.setVisible(false);
        cancelButton.setVisible(false);
        editProfileButton.setVisible(true);
        fullname.setEditable(false);
        phone.setEditable(false);
        birthday.setVisible(true);
        dateChooser.setVisible(false);
        String fullName = fullname.getText();
        String phone_ = phone.getText();
        Date birthday_ = dateChooser.getCalendar().getTime();
//        if (!isValidPhone(phone_)) {
//            JOptionPane.showMessageDialog(agreeButton,
//                    "S? ?i?n tho?i b?n nh?p kh�ng ph?i c?a nh� m?ng Vi?t Nam", "InvalidPhoneNumberError",
//                    JOptionPane.WARNING_MESSAGE);
//        } else {
//            if (fullName != login.getFullname()) {
//                login.setFullName(fullName);
//            }
//            if (birthday_ != new Date()) {
//                login.setBirthday(convertToLocalDateViaMilisecond(birthday_));
//            }
//            if (phone_ != login.getPhoneNum()) {
//                login.setPhoneNum(phone_);
//            }
//            AccountList a = new AccountList();
//            a.editAccount(login);
//        }
    }//GEN-LAST:event_agreeButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
        agreeButton.setVisible(false);
        cancelButton.setVisible(false);
        editProfileButton.setVisible(true);
        fullname.setEditable(false);
        phone.setEditable(false);
        birthday.setVisible(true);
        dateChooser.setVisible(false);
    }//GEN-LAST:event_cancelButtonActionPerformed

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
            java.util.logging.Logger.getLogger(guiProfile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiProfile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiProfile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiProfile.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Account a = new Account("fudio", "Ng01637202484", "Nguy?n ?? Th? Nguy�n",
                        LocalDate.of(2001, Month.JANUARY, 1), "0337202484");
                new guiProfile(a).setVisible(true);
            }
        });
    }

    private boolean isValidPhone(String phoneNum) {
        String regex = "(84[3|5|7|8|9]|0[3|5|7|8|9])+([0-9]{8})";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phoneNum);
        return m.matches();
    }

    public LocalDate convertToLocalDateViaMilisecond(Date dateToConvert) {
        return Instant.ofEpochMilli(dateToConvert.getTime()).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JButton agreeButton;
    private javax.swing.JTextField birthday;
    private javax.swing.JButton cancelButton;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton editProfileButton;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField sex;
    // End of variables declaration//GEN-END:variables
}
