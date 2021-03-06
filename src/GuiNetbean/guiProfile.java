/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiNetbean;

import Storage.Account;
import Storage.AccountList;
import Storage.Avatar;
import java.awt.Image;
import java.io.File;
import javax.swing.JOptionPane;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Admin
 */
public class guiProfile extends javax.swing.JFrame {

    /**
     * Creates new form guiLogin
     *
     * @param login_
     */
    public guiProfile(Account login_) {
        this.login = login_;
        initComponents();
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, login.getBirthday_().getYear());
        cal.set(Calendar.MONTH, login.getBirthday_().getMonthValue() - 1);
        cal.set(Calendar.DAY_OF_MONTH, login.getBirthday_().getDayOfMonth());
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        dateChooser.setDate(date);
        Image img = Avatar.readPicture(login.getUsername());
        if (img != null) {
            Image resize = img.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            pic.setIcon(new ImageIcon(resize));
        } else {
            pic.setIcon(null);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        Btchooserpic = new javax.swing.JToggleButton();
        pic = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        birthday = new javax.swing.JTextField();
        dateChooser = new com.toedter.calendar.JDateChooser();
        address = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        fblink = new javax.swing.JTextField();
        editProfileButton = new javax.swing.JButton();
        agreeButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        work = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        gender = new javax.swing.JComboBox();
        sexField = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        View = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        changePwMenuItem = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiNetbean/Pic/4882066.jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profile");
        setLocation(new java.awt.Point(600, 250));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Btchooserpic.setText("Chooser Picturer");
        Btchooserpic.setVisible(false);
        Btchooserpic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtchooserpicActionPerformed(evt);
            }
        });
        getContentPane().add(Btchooserpic, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        pic.setForeground(new java.awt.Color(255, 153, 0));
        pic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pic.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Avatar", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tempus Sans ITC", 1, 14), new java.awt.Color(255, 153, 0))); // NOI18N
        getContentPane().add(pic, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 20, 230, 230));

        jLabel3.setForeground(new java.awt.Color(255, 153, 0));
        jLabel3.setText("Carrot team @ 2021");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 520, -1, -1));

        fullname.setText(login.getFullName());
        fullname.setEditable(false);
        fullname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        getContentPane().add(fullname, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 280, -1));

        birthday.setText(login.getBirthday());
        birthday.setEditable(false);
        getContentPane().add(birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 130, -1));

        dateChooser.setVisible(false);
        getContentPane().add(dateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 180, -1));
        dateChooser.setDateFormatString("dd/MM/yyyy");

        address.setText(login.getAddress());
        address.setEditable(false);
        getContentPane().add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 270, 50));

        phone.setText(login.getPhoneNum());
        phone.setEditable(false);
        getContentPane().add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 270, -1));

        fblink.setText(login.getFb());
        fblink.setEditable(false);
        getContentPane().add(fblink, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 190, -1));

        editProfileButton.setForeground(new java.awt.Color(255, 153, 0));
        editProfileButton.setText("Edit profile");
        editProfileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editProfileButtonActionPerformed(evt);
            }
        });
        getContentPane().add(editProfileButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 480, -1, -1));

        agreeButton.setForeground(new java.awt.Color(255, 153, 0));
        agreeButton.setText("Agreee");
        agreeButton.setVisible(false);
        agreeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agreeButtonActionPerformed(evt);
            }
        });
        getContentPane().add(agreeButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 480, -1, -1));

        cancelButton.setForeground(new java.awt.Color(255, 153, 0));
        cancelButton.setText("Cancel");
        cancelButton.setVisible(false);
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cancelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 480, -1, -1));

        work.setText(login.getWork());
        work.setEditable(false);
        getContentPane().add(work, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 270, 60));

        jLabel4.setFont(new java.awt.Font("UTM Ambrose", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Facebook");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 370, 140, -1));

        jLabel5.setFont(new java.awt.Font("UTM Ambrose", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, 50, -1));

        jLabel6.setFont(new java.awt.Font("UTM Ambrose", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Date of birth");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, 120, -1));

        jLabel7.setFont(new java.awt.Font("UTM Ambrose", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Gender");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 100, 20));

        jLabel8.setFont(new java.awt.Font("UTM Ambrose", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Address   _____________________");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 270, -1));

        jLabel9.setFont(new java.awt.Font("UTM Ambrose", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Phone number   ________________");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 270, -1));

        jLabel11.setFont(new java.awt.Font("UTM Ambrose", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 153, 0));
        jLabel11.setText("Work  ________________________");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 420, 270, -1));

        jLabel12.setFont(new java.awt.Font("UTM Ambrose", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 153, 0));
        jLabel12.setText("----------About----------");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 160, -1));

        jLabel13.setFont(new java.awt.Font("UTM Ambrose", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 153, 0));
        jLabel13.setText("Email");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 100, -1));

        gender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Male", "Female" }));
        gender.setToolTipText("");
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        getContentPane().add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));
        gender.setVisible(false);

        sexField.setEditable(false);
        sexField.setText("jTextField1");
        getContentPane().add(sexField, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));
        sexField.setText(login.getSex() ? "Male" : "Female");

        email.setEditable(false);
        email.setText(login.getEmail());
        getContentPane().add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 340, 190, -1));

        View.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GuiNetbean/Pic/background.png"))); // NOI18N
        getContentPane().add(View, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 540));

        jMenu1.setText("Hello "+login.getUsername());

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        changePwMenuItem.setText("Change password");
        changePwMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePwMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(changePwMenuItem);

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

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed

    }//GEN-LAST:event_genderActionPerformed

    private void BtchooserpicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtchooserpicActionPerformed
        JFileChooser FileChooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        String link;
        FileChooser.setDialogTitle("Select an image");
        FileChooser.setAcceptAllFileFilterUsed(false);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PNG JPG JPEG and GIF images", "png", "gif", "jpg", "jpeg");
        FileChooser.addChoosableFileFilter(filter);
        FileChooser.setMultiSelectionEnabled(false);
        int returnValue = FileChooser.showOpenDialog(null);
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File f = FileChooser.getSelectedFile();
            link = f.getPath();
            pic.setIcon(new ImageIcon(f.getAbsolutePath()));
            int output = JOptionPane.showConfirmDialog(Btchooserpic, "Do you want to change", "", JOptionPane.YES_NO_OPTION);
            if (output == 0) {
                Avatar.updatePicture(login.getUsername(), link);
            } else {
                Image img = Avatar.readPicture(login.getUsername());
                if (img != null) {
                    Image resize = img.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
                    pic.setIcon(new ImageIcon(resize));
                } else {
                    pic.setIcon(null);
                }
            }
        }
    }//GEN-LAST:event_BtchooserpicActionPerformed

    private void changePwMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePwMenuItemActionPerformed
        javax.swing.JPasswordField field0 = new javax.swing.JPasswordField();
        field0.setEchoChar('\u2022');
        javax.swing.JPasswordField field1 = new javax.swing.JPasswordField();
        field1.setEchoChar('\u2022');
        javax.swing.JPasswordField field2 = new javax.swing.JPasswordField();
        field2.setEchoChar('\u2022');
        Object[] message = {"Old password:", field0, "New password:", field1, "Re-enter new pass:", field2};
        int option = JOptionPane.showConfirmDialog(rootPane, message, "Change password",
                JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            char[] value0 = field0.getPassword();
            if (login.check(new String(value0))) {
                char[] value1 = field1.getPassword();
                char[] value2 = field2.getPassword();
                if ((new String(value1)).equals(new String(value2)) && value1.length != 0) {
                    login.setNewPassword(new String(value1));
                    JOptionPane.showMessageDialog(rootPane, "Change password successfully", "",
                            JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(rootPane, "New password does not match", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Password incorrect", "Warning",
                        JOptionPane.WARNING_MESSAGE);
            }
        }
    }//GEN-LAST:event_changePwMenuItemActionPerformed

    Date date = new Date();

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_phoneActionPerformed
    }// GEN-LAST:event_phoneActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem2ActionPerformed
        int output = JOptionPane.showConfirmDialog(jMenuItem2, "Do you want to exit?", "Logout",
                JOptionPane.YES_NO_OPTION);
        if (output == 0) {
            dispose();
        }
    }// GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1ActionPerformed
        int output = JOptionPane.showConfirmDialog(jMenuItem2, "Do you want to sign out?", "Logout",
                JOptionPane.YES_NO_OPTION);
        if (output == 0) {
            guiMain frm1 = new guiMain();
            frm1.setVisible(true);
            dispose();
        }
    }// GEN-LAST:event_jMenuItem1ActionPerformed

    private void editProfileButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editProfileButtonActionPerformed
        agreeButton.setVisible(true);
        cancelButton.setVisible(true);
        editProfileButton.setVisible(false);
        Btchooserpic.setVisible(true);
        fullname.setEditable(true);
        phone.setEditable(true);
        address.setEditable(true);
        work.setEditable(true);
        fblink.setEditable(true);
        email.setEditable(true);
        gender.setEditable(true);
        birthday.setVisible(false);
        dateChooser.setVisible(true);
        gender.setVisible(true);
        sexField.setVisible(false);
        //       pic.setVisible(false);

    }// GEN-LAST:event_editProfileButtonActionPerformed

    private void agreeButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_agreeButtonActionPerformed
        agreeButton.setVisible(false);
        cancelButton.setVisible(false);
        editProfileButton.setVisible(true);
        Btchooserpic.setVisible(false);
        fullname.setEditable(false);
        phone.setEditable(false);
        address.setEditable(true);
        work.setEditable(true);
        fblink.setEditable(true);
        email.setEditable(true);
        birthday.setVisible(true);
        dateChooser.setVisible(false);
        gender.setVisible(false);
        sexField.setVisible(true);
        String fullName = fullname.getText();
        String phone_ = phone.getText();
        String address_ = address.getText();
        String work_ = work.getText();
        String fblink_ = fblink.getText();
        String email_ = email.getText();
        Date birthday_ = dateChooser.getCalendar().getTime();
        if (!isValidPhone(phone_)) {
            JOptionPane.showMessageDialog(agreeButton,
                    "Not a Vietnamese phone number", "InvalidPhoneNumberError",
                    JOptionPane.WARNING_MESSAGE);
        } else {
            if (fullName == null ? login.getFullName() != null : !fullName.equals(login.getFullName())) {
                login.setFullName(fullName);
            }
            if (birthday_ != new Date()) {
                login.setBirthday(convertToLocalDateViaMilisecond(birthday_));
            }
            if (phone_ == null ? login.getPhoneNum() != null : !phone_.equals(login.getPhoneNum())) {
                login.setPhoneNum(phone_);
            }
            if (address_ == null ? login.getAddress() != null : !address_.equals(login.getAddress())) {
                login.setAddress(address_);
            }
            if (work_ == null ? login.getWork() != null : !work_.equals(login.getWork())) {
                login.setWork(work_);
            }
            if (fblink_ == null ? login.getFb() != null : !fblink_.equals(login.getFb())) {
                login.setFblink(fblink_);
            }
            if (email_ == null ? login.getEmail() != null : !email_.equals(login.getEmail())) {
                login.setEmail(email_);
            }
            login.setSex(gender.getSelectedItem() == "Male");
            sexField.setText(login.getSex() ? "Male" : "Female");
            AccountList a = new AccountList();
            a.editAccount(login);
        }
    }// GEN-LAST:event_agreeButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cancelButtonActionPerformed
        agreeButton.setVisible(false);
        cancelButton.setVisible(false);
        editProfileButton.setVisible(true);
        Btchooserpic.setVisible(false);
        fullname.setText(login.getFullName());
        phone.setText(login.getPhoneNum());
        address.setText(login.getAddress());
        work.setText(login.getWork());
        fblink.setText(login.getFb());
        email.setText(login.getEmail());
        birthday.setVisible(true);
        dateChooser.setVisible(false);
        gender.setVisible(false);
        sexField.setVisible(true);
        Image img = Avatar.readPicture(login.getUsername());
        if (img != null) {
            Image resize = img.getScaledInstance(200, 200, Image.SCALE_DEFAULT);
            pic.setIcon(new ImageIcon(resize));
        } else {
            pic.setIcon(null);
        }
    }// GEN-LAST:event_cancelButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiProfile.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiProfile.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiProfile.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiProfile.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Account a = new Account("fudio", "Ng01637202484", "Nguyen Do The Nguyen",
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

    private final Account login;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Btchooserpic;
    private javax.swing.JLabel View;
    private javax.swing.JTextField address;
    private javax.swing.JButton agreeButton;
    private javax.swing.JTextField birthday;
    private javax.swing.JButton cancelButton;
    private javax.swing.JMenuItem changePwMenuItem;
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton editProfileButton;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fblink;
    private javax.swing.JTextField fullname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel pic;
    private javax.swing.JTextField sexField;
    private javax.swing.JTextField work;
    // End of variables declaration//GEN-END:variables
}
