/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GuiNetbean;

import Storage.Account;
import Storage.AccountList;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author phamn
 */
public class guiConfirmInformation extends javax.swing.JFrame {

    /**
     * Creates new form guiConfirmInformation
     */
    public guiConfirmInformation(Account account, Boolean mod) {
        initComponents();
        reset = account;
        mode = mod;
        initCustomer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameLb = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        nameLb = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        phoneLb = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        birthdaylLb = new javax.swing.JLabel();
        birthday = new com.toedter.calendar.JDateChooser();
        addressLb = new javax.swing.JLabel();
        address = new javax.swing.JTextField();
        workLb = new javax.swing.JLabel();
        work = new javax.swing.JTextField();
        fbLb = new javax.swing.JLabel();
        fb = new javax.swing.JTextField();
        emailLb = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jButton = new javax.swing.JButton();
        sexLb = new javax.swing.JLabel();
        sex = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 204, 0));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setPreferredSize(new java.awt.Dimension(540, 570));
        jPanel2.setRequestFocusEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 36)); // NOI18N
        jLabel1.setText("Confirm Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, -1, -1));

        usernameLb.setText("Username");
        jPanel1.add(usernameLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 78, 26));
        jPanel1.add(username, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 170, -1));

        nameLb.setText("Fullname");
        jPanel1.add(nameLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 78, 26));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 170, -1));

        phoneLb.setText("Phone");
        jPanel1.add(phoneLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 78, 26));
        jPanel1.add(phone, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 170, -1));

        birthdaylLb.setText("Date of birth");
        jPanel1.add(birthdaylLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 78, 26));

        birthday.setDateFormatString("dd/MM/YYYY");
        birthday.setDateFormatString("dd/MM/yyyy");
        jPanel1.add(birthday, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 170, -1));

        addressLb.setText("Address");
        jPanel1.add(addressLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 78, 26));
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 170, -1));

        workLb.setText("Work");
        jPanel1.add(workLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 78, 26));
        jPanel1.add(work, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 170, -1));

        fbLb.setText("Facebook");
        jPanel1.add(fbLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 78, 26));
        jPanel1.add(fb, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 170, -1));

        emailLb.setText("Email");
        jPanel1.add(emailLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 78, 26));
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 170, -1));

        jButton.setFont(new java.awt.Font("UTM Alberta Heavy", 0, 18)); // NOI18N
        jButton.setText("CONFIRM INFOMATION");
        jButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActionPerformed(evt);
            }
        });
        jPanel1.add(jButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 247, 39));

        sexLb.setText("Sex");
        jPanel1.add(sexLb, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, -1, -1));

        sex.setModel(new javax.swing.DefaultComboBoxModel<String>(new String[] { "Male", "Female" }));
        jPanel1.add(sex, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, -1, -1));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 500, 600));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 560, 630));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonActionPerformed
        String un = username.getText();
        String fn = name.getText();
        String pn = phone.getText();
        String ar = address.getText();
        String w = work.getText();
        String f = fb.getText();
        String e = email.getText();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String bd = dateFormat.format(birthday.getDate());
        if (reset.getUsername().equals(un) && reset.getFullName().equals(fn) && reset.getPhoneNum().equals(pn)
                && reset.getSex() == (sex.getSelectedItem() == "Male") && reset.getAddress().equals(ar)
                && reset.getWork().equals(w) && reset.getFb().equals(f) && reset.getEmail().equals(e)
                && reset.getBirthday().equals(bd)) {
            javax.swing.JPasswordField field1 = new javax.swing.JPasswordField();
            field1.setEchoChar('\u2022');
            javax.swing.JPasswordField field2 = new javax.swing.JPasswordField();
            field2.setEchoChar('\u2022');
            Object[] message = {"New password:", field1, "Re-enter new pass:", field2};
            int option = JOptionPane.showConfirmDialog(rootPane, message, "Enter new password",
                    JOptionPane.OK_CANCEL_OPTION);
            if (option == JOptionPane.OK_OPTION) {
                char[] value1 = field1.getPassword();
                char[] value2 = field2.getPassword();
                if ((new String(value1)).equals(new String(value2))) {
                    reset.setNewPassword(new String(value1));
                    new guiMain().setVisible(true);
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Password incorrect", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(rootPane, "Confirmation information is not correct", "Warning",
                    JOptionPane.WARNING_MESSAGE);
        }
    }// GEN-LAST:event_jButtonActionPerformed

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
            java.util.logging.Logger.getLogger(guiConfirmInformation.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiConfirmInformation.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiConfirmInformation.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiConfirmInformation.class.getName())
                    .log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new guiConfirmInformation(new AccountList().accountSearch("fudi"), false).setVisible(true);
            }
        });
    }

    private Account reset;
    private Boolean mode;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JLabel addressLb;
    private com.toedter.calendar.JDateChooser birthday;
    private javax.swing.JLabel birthdaylLb;
    private javax.swing.JTextField email;
    private javax.swing.JLabel emailLb;
    private javax.swing.JTextField fb;
    private javax.swing.JLabel fbLb;
    private javax.swing.JButton jButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField name;
    private javax.swing.JLabel nameLb;
    private javax.swing.JTextField phone;
    private javax.swing.JLabel phoneLb;
    private javax.swing.JComboBox<String> sex;
    private javax.swing.JLabel sexLb;
    private javax.swing.JTextField username;
    private javax.swing.JLabel usernameLb;
    private javax.swing.JTextField work;
    private javax.swing.JLabel workLb;
    // End of variables declaration//GEN-END:variables

    private void initCustomer() {
        if (mode) {
            phone.setText(reset.getPhoneNum());
            phone.setEditable(false);
        } else {
            username.setText(reset.getUsername());
            username.setEditable(false);
        }
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2001);
        cal.set(Calendar.MONTH, 0);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        Date date = cal.getTime();
        birthday.setDate(date);
//        usernameLb.setVisible(reset.getUsername() != null);
//        username.setVisible(reset.getUsername() != null);
//        nameLb.setVisible(reset.getFullName() != null);
//        name.setVisible(reset.getFullName() != null);
//        phoneLb.setVisible(reset.getPhoneNum() != null);
//        phone.setVisible(reset.getPhoneNum() != null);
//        addressLb.setVisible(reset.getAddress() != null);
//        address.setVisible(reset.getAddress() != null);
//        workLb.setVisible(reset.getWork() != null);
//        work.setVisible(reset.getWork() != null);
//        fbLb.setVisible(reset.getFb() != null);
//        fb.setVisible(reset.getFb() != null);
//        emailLb.setVisible(reset.getEmail() != null);
//        email.setVisible(reset.getEmail() != null);
    }
}
