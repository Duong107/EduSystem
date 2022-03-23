/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import MODEL.Quanliuser;
import java.awt.Color;
import java.awt.Event;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class LOGINFORM extends javax.swing.JFrame {

    ArrayList<Quanliuser> listuser = new ArrayList<>();

    /**
     * Creates new form QUANLYSINHVIEN
     */
    public LOGINFORM() {
        initComponents();
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/DAO/ICON/iconlogo.png"));
        this.setIconImage(icon);
        setLocationRelativeTo(null);
        setResizable(false);
        getuserdatabase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        framerepass = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtgetuser = new javax.swing.JTextField();
        btnsendpass = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        pnform = new javax.swing.JPanel();
        lblogin = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        txtgetusername = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtgetpassword = new javax.swing.JPasswordField();
        lbshowhide = new javax.swing.JLabel();
        lbquenpass = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Nhập User:");

        btnsendpass.setText("Gửi Mật Khẩu");
        btnsendpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsendpassActionPerformed(evt);
            }
        });

        btncancel.setText("Cancel");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnsendpass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtgetuser, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtgetuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(btnsendpass))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(btncancel)))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout framerepassLayout = new javax.swing.GroupLayout(framerepass.getContentPane());
        framerepass.getContentPane().setLayout(framerepassLayout);
        framerepassLayout.setHorizontalGroup(
            framerepassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(framerepassLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        framerepassLayout.setVerticalGroup(
            framerepassLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN");

        pnform.setBackground(new java.awt.Color(255, 255, 255));

        lblogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAO/ICON/BTNLOGIN1.png"))); // NOI18N
        lblogin.setText("lblogin");
        lblogin.setPreferredSize(new java.awt.Dimension(250, 50));
        lblogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbloginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbloginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbloginMouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("UTM Neutra", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOGIN");

        txtgetusername.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        txtgetusername.setText("USERNAME");
        txtgetusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtgetusernameFocusGained(evt);
            }
        });
        txtgetusername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtgetusernameMouseClicked(evt);
            }
        });
        txtgetusername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtgetusernameKeyPressed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAO/ICON/logofpt.png"))); // NOI18N

        txtgetpassword.setText("**********");
        txtgetpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtgetpasswordFocusGained(evt);
            }
        });
        txtgetpassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtgetpasswordMouseClicked(evt);
            }
        });
        txtgetpassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtgetpasswordKeyPressed(evt);
            }
        });

        lbshowhide.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DAO/ICON/lbhide.png"))); // NOI18N
        lbshowhide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbshowhideMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbshowhideMouseExited(evt);
            }
        });

        lbquenpass.setText("Quên Mật Khẩu?");
        lbquenpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbquenpassMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbquenpassMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbquenpassMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnformLayout = new javax.swing.GroupLayout(pnform);
        pnform.setLayout(pnformLayout);
        pnformLayout.setHorizontalGroup(
            pnformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnformLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(pnformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnformLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(lbquenpass))
                    .addGroup(pnformLayout.createSequentialGroup()
                        .addGroup(pnformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtgetusername)
                            .addComponent(lblogin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtgetpassword))
                        .addGap(0, 0, 0)
                        .addComponent(lbshowhide)))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        pnformLayout.setVerticalGroup(
            pnformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnformLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(txtgetusername, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnformLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtgetpassword)
                    .addComponent(lbshowhide, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(15, 15, 15)
                .addComponent(lbquenpass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblogin, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnform, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lbloginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbloginMouseEntered
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon("src/DAO/ICON/BTNLOGIN2.png");
        lblogin.setIcon(img);
    }//GEN-LAST:event_lbloginMouseEntered

    private void lbloginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbloginMouseExited
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon("src/DAO/ICON/BTNLOGIN1.png");
        lblogin.setIcon(img);
    }//GEN-LAST:event_lbloginMouseExited

    private void txtgetusernameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtgetusernameMouseClicked
        // TODO add your handling code here:
        txtgetusername.setText("");
    }//GEN-LAST:event_txtgetusernameMouseClicked

    private void lbloginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbloginMouseClicked
        // TODO add your handling code here:
        validateform();
    }//GEN-LAST:event_lbloginMouseClicked

    private void txtgetpasswordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtgetpasswordMouseClicked
        // TODO add your handling code here:
        txtgetpassword.setText("");
    }//GEN-LAST:event_txtgetpasswordMouseClicked

    private void lbshowhideMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbshowhideMouseEntered
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon("src/DAO/ICON/lbshow.png");
        lbshowhide.setIcon(img);
        txtgetpassword.setEchoChar((char) 0);
    }//GEN-LAST:event_lbshowhideMouseEntered

    private void lbshowhideMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbshowhideMouseExited
        // TODO add your handling code here:
        ImageIcon img = new ImageIcon("src/DAO/ICON/lbhide.png");
        lbshowhide.setIcon(img);
        txtgetpassword.setEchoChar('*');
    }//GEN-LAST:event_lbshowhideMouseExited

    private void txtgetusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtgetusernameFocusGained
        // TODO add your handling code here:
        txtgetusername.setText("");
    }//GEN-LAST:event_txtgetusernameFocusGained

    private void txtgetpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtgetpasswordFocusGained
        // TODO add your handling code here:
        txtgetpassword.setText("");
    }//GEN-LAST:event_txtgetpasswordFocusGained

    private void txtgetusernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgetusernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            validateform();
        }
    }//GEN-LAST:event_txtgetusernameKeyPressed

    private void txtgetpasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtgetpasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            validateform();
        }
    }//GEN-LAST:event_txtgetpasswordKeyPressed

    private void lbquenpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbquenpassMouseClicked
        // TODO add your handling code here:
        framerepass.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        framerepass.setLocationRelativeTo(this);
        framerepass.setSize(316, 205);
        framerepass.setVisible(true);
    }//GEN-LAST:event_lbquenpassMouseClicked

    private void lbquenpassMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbquenpassMouseEntered
        // TODO add your handling code here:
        lbquenpass.setForeground(Color.blue);
    }//GEN-LAST:event_lbquenpassMouseEntered

    private void lbquenpassMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbquenpassMouseExited
        // TODO add your handling code here:
        lbquenpass.setForeground(Color.black);
    }//GEN-LAST:event_lbquenpassMouseExited

    private void btnsendpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsendpassActionPerformed
        // TODO add your handling code here:
        int ix = -1;
        if (txtgetuser.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Vui Lòng Nhập User!");
        } else {
            for (int i = 0; i < listuser.size(); i++) {
                if (txtgetuser.getText().toUpperCase().equals(listuser.get(i).getUsername().toUpperCase())) {
                    ix = i;
                    break;
                } else {
                    ix = -1;
                }
            }
        }
        if (ix == -1) {
            JOptionPane.showMessageDialog(this, "Sai Username");
        }
        if (ix != -1) {
            try {
                String m = "duongvhps17859@fpt.edu.vn";
                String passw = "anhduong8";
                Properties p = new Properties();
                p.put("mail.smtp.auth", "true");
                p.put("mail.smtp.starttls.enable", "true");
                p.put("mail.smtp.host", "smtp.gmail.com");
                p.put("mail.smtp.port", 587);
                Session s = Session.getInstance(p,
                        new javax.mail.Authenticator() {
                            protected PasswordAuthentication getPasswordAuthentication() {
                                return new PasswordAuthentication(m, passw);
                            }
                        });
                Message msg = new MimeMessage(s);
                msg.setFrom(new InternetAddress(m));
                msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(listuser.get(ix).getEmail()));
                msg.setSubject("Thông Báo Mật Khẩu!");
                msg.setText("Mật Khẩu Của Bạn Là:" + listuser.get(ix).getPassword());
                Transport.send(msg);
                JOptionPane.showMessageDialog(null, "Mật Khẩu Đã Được Gửi Về Mail Của Bạn!\n", "Alert", javax.swing.JOptionPane.INFORMATION_MESSAGE);
                framerepass.dispose();
            } catch (MessagingException | HeadlessException e) {
                Logger.getLogger(SENDMAIL.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }//GEN-LAST:event_btnsendpassActionPerformed

    public void validateform() {
        if (txtgetusername.getText().equals("USERNAME")
                || txtgetpassword.getText().equals("**********")
                || txtgetusername.getText().equals("")
                || txtgetpassword.getText().equals("")) {
            ImageIcon img = new ImageIcon("src/DAO/ICON/ERROR.png");
            JOptionPane.showMessageDialog(this, "Chưa Nhập Đủ Thông Tin", "ERROR", 0, img);
        } else {
            try {
                check();
            } catch (SQLException ex) {
                System.out.println("err1");
            }
        }
    }

    private void check() throws SQLException {
        String xas = "";
        for (int i = 0; i < listuser.size(); i++) {
            if (txtgetusername.getText().equals(listuser.get(i).getUsername())
                    && txtgetpassword.getText().equals(listuser.get(i).getPassword())) {
                ImageIcon img = new ImageIcon("src/DAO/ICON/SMILE.png");
                JOptionPane.showMessageDialog(this, "Đăng Nhập Thành Công!<3", "THẦY QUÁ NGẦU QUÁ ĐẸP TRAI", 0, img);
                if (listuser.get(i).getRole().equals("giangvien")) {
                    QUANLYDIEMSINHVIEN qldsv = new QUANLYDIEMSINHVIEN();
                    qldsv.setname(listuser.get(i).getName(), listuser.get(i).getUsername(), listuser.get(i).getPassword(), listuser.get(i).getEmail());
                    qldsv.setVisible(true);
                    this.dispose();
                    xas = "";
                    break;
                }
                if (listuser.get(i).getRole().equals("canbo")) {
                    QUANLYSINHVIEN qlsv = new QUANLYSINHVIEN();
                    qlsv.setname(listuser.get(i).getName(), listuser.get(i).getUsername(), listuser.get(i).getPassword(), listuser.get(i).getEmail());
                    qlsv.setVisible(true);
                    this.dispose();
                    xas = "";
                    break;
                }
            } else {
                xas = "1";
            }

        }
        if (xas.equals("1") == true) {
            ImageIcon img = new ImageIcon("src/DAO/ICON/ERROR.png");
            JOptionPane.showMessageDialog(this, "Sai Thông Tin Hoặc Tài Khoản!", "ERROR", 0, img);
        }
    }

    private void getuserdatabase() {

        try {
            String user = "sa";
            String pass = "123";
            String url = "jdbc:sqlserver://localhost:1433;databaseName=QUANLISINHVIEN";
            Connection con = DriverManager.getConnection(url, user, pass);
            String commandquery = "select * from userlist";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(commandquery);
            while (rs.next() == true) {
                Quanliuser a = new Quanliuser();
                a.setUsername(rs.getString("username"));
                a.setPassword(rs.getString("passwords"));
                a.setRole(rs.getString("roleuser"));
                a.setName(rs.getString("name"));
                a.setEmail(rs.getString("email"));
                listuser.add(a);
            }
            for (int i = 0; i < listuser.size(); i++) {
                System.out.println(listuser.get(i).getUsername());
                System.out.println(listuser.get(i).getPassword());
                System.out.println(listuser.get(i).getRole());
                System.out.println(listuser.get(i).getName());
            }
            System.out.println("Liên Kết Database Thành Công!");
            con.close();
        } catch (Exception e) {
            ImageIcon img = new ImageIcon("src/DAO/ICON/ERROR.png");
            JOptionPane.showMessageDialog(this, "Liên Kết DATABASE CÓ VẤN ĐỀ\n" + e, "ERROR", 0, img);
            this.dispose();
        }
    }

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
            java.util.logging.Logger.getLogger(LOGINFORM.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGINFORM.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGINFORM.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGINFORM.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGINFORM().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsendpass;
    private javax.swing.JFrame framerepass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblogin;
    private javax.swing.JLabel lbquenpass;
    private javax.swing.JLabel lbshowhide;
    private javax.swing.JPanel pnform;
    private javax.swing.JPasswordField txtgetpassword;
    private javax.swing.JTextField txtgetuser;
    private javax.swing.JTextField txtgetusername;
    // End of variables declaration//GEN-END:variables
}
