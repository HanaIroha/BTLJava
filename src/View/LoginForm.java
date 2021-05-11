package View;

import Model.AccountModel;
import DAO.implement.Account;
import DAO.implement.NhanSu;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author Iroha
 */
public class LoginForm extends javax.swing.JFrame {
    
    private int mouseX,mouseY;
    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        this.getRootPane().setDefaultButton(btn_login);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        this.setBackground(new java.awt.Color(255, 255, 255, 0));
        JPanel1.setBackground(new java.awt.Color(255, 255, 255, 0));
        JPanel2.setBackground(new java.awt.Color(255, 255, 255, 0));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel1 = new javax.swing.JPanel();
        txt_username = new javax.swing.JTextField();
        txt_password = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btn_exit = new javax.swing.JButton();
        lb_status = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        btn_login = new javax.swing.JButton();
        btn_minimize = new javax.swing.JButton();
        JPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        JPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_username.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_username.setFont(new java.awt.Font("UVN Tin Tuc", 1, 15)); // NOI18N
        txt_username.setForeground(new java.awt.Color(255, 255, 255));
        txt_username.setText("Nhập tài khoản...");
        txt_username.setBorder(null);
        txt_username.setOpaque(false);
        txt_username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_usernameFocusLost(evt);
            }
        });
        JPanel1.add(txt_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 400, 230, -1));

        txt_password.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_password.setFont(new java.awt.Font("UVN Tin Tuc", 1, 15)); // NOI18N
        txt_password.setForeground(new java.awt.Color(255, 255, 255));
        txt_password.setBorder(null);
        txt_password.setOpaque(false);
        txt_password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_passwordFocusGained(evt);
            }
        });
        JPanel1.add(txt_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 440, 230, -1));

        jLabel2.setFont(new java.awt.Font("UVN Tin Tuc", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Tài khoản:");
        JPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 400, -1, 20));

        jLabel3.setFont(new java.awt.Font("UVN Tin Tuc", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Mật khẩu:");
        JPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, -1, -1));

        btn_exit.setBackground(new java.awt.Color(255, 255, 255));
        btn_exit.setFont(new java.awt.Font("UVN Tin Tuc", 1, 14)); // NOI18N
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exitIco.png"))); // NOI18N
        btn_exit.setBorderPainted(false);
        btn_exit.setContentAreaFilled(false);
        btn_exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_exitMouseExited(evt);
            }
        });
        btn_exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_exitActionPerformed(evt);
            }
        });
        JPanel1.add(btn_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 70, 30, 30));

        lb_status.setFont(new java.awt.Font("UVN Tin Tuc", 1, 14)); // NOI18N
        lb_status.setForeground(new java.awt.Color(255, 51, 51));
        lb_status.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JPanel1.add(lb_status, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 480, 320, -1));
        JPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 460, 230, 10));

        jSeparator2.setForeground(new java.awt.Color(255, 255, 255));
        JPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, 230, 10));

        btn_login.setBackground(new java.awt.Color(255, 255, 255));
        btn_login.setFont(new java.awt.Font("UVN Tin Tuc", 1, 14)); // NOI18N
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/loginButton.png"))); // NOI18N
        btn_login.setBorderPainted(false);
        btn_login.setContentAreaFilled(false);
        btn_login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_loginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_loginMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_loginMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_loginMouseReleased(evt);
            }
        });
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });
        JPanel1.add(btn_login, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 530, 140, 40));

        btn_minimize.setBackground(new java.awt.Color(255, 255, 255));
        btn_minimize.setFont(new java.awt.Font("UVN Tin Tuc", 1, 14)); // NOI18N
        btn_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimizeIco.png"))); // NOI18N
        btn_minimize.setBorderPainted(false);
        btn_minimize.setContentAreaFilled(false);
        btn_minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_minimizeMouseExited(evt);
            }
        });
        JPanel1.add(btn_minimize, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 70, 30, 30));

        JPanel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                JPanel2MouseDragged(evt);
            }
        });
        JPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                JPanel2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout JPanel2Layout = new javax.swing.GroupLayout(JPanel2);
        JPanel2.setLayout(JPanel2Layout);
        JPanel2Layout.setHorizontalGroup(
            JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );
        JPanel2Layout.setVerticalGroup(
            JPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        JPanel1.add(JPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 410, 40));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login.png"))); // NOI18N
        JPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, -1, -1));

        getContentPane().add(JPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 0, 560, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btn_exitActionPerformed

    private void txt_usernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusGained
        if(txt_username.getText().equals("Nhập tài khoản...")){
            txt_username.setText("");
        }
    }//GEN-LAST:event_txt_usernameFocusGained

    private void txt_usernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_usernameFocusLost
        if(txt_username.getText().equals("")){
            txt_username.setText("Nhập tài khoản...");
        }
    }//GEN-LAST:event_txt_usernameFocusLost

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        try{
            if(txt_username.getText().equals("")||txt_username.getText().equals("Nhập tài khoản..."))
            {
                lb_status.setText("Vui lòng nhập tài khoản");
                txt_username.requestFocus();
            }
            else if(String.valueOf(txt_password.getPassword()).equals(""))
            {
                lb_status.setText("Vui lòng nhập mật khẩu");
                txt_password.requestFocus();
            }
            else
            {
                Account accDAO = new Account();
                AccountModel acc = accDAO.loginAccount(txt_username.getText(), String.valueOf(txt_password.getPassword()));
                if (acc == null){
                    lb_status.setText("Sai tài khoản hoặc mật khẩu!");
                }
                else{
                    MainForm f = new MainForm(acc);
                    f.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
                    f.setLocationRelativeTo(null);
                    f.setResizable(false);
                    f.setVisible(true);
                    this.dispose();
                } 
    //            try{
    //                NhanSu accDAO = new NhanSu();
    //                File image = new File("avt.png");
    //                FileInputStream fis = new FileInputStream(image);
    //                ByteArrayOutputStream bos = new ByteArrayOutputStream();
    //                byte[] buf = new byte[1024];
    //                for(int readNum; (readNum=fis.read(buf))!=-1;){
    //                    bos.write(buf,0,readNum);
    //                }
    //                byte[] person_image=bos.toByteArray();
    //                System.out.println(accDAO.upadteAVT("NS01", person_image));
    //            }
    //            catch(Exception e){
    //                
    //            }
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_loginActionPerformed

    private void txt_passwordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_passwordFocusGained
        
    }//GEN-LAST:event_txt_passwordFocusGained

    private void JPanel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanel2MousePressed
        mouseX = evt.getX();
        mouseY = evt.getY();
    }//GEN-LAST:event_JPanel2MousePressed

    private void JPanel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanel2MouseDragged
        this.setLocation(this.getX() + evt.getX() - mouseX, this.getY() + evt.getY() - mouseY);
    }//GEN-LAST:event_JPanel2MouseDragged

    private void btn_loginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseEntered
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/loginButton1.png")));
    }//GEN-LAST:event_btn_loginMouseEntered

    private void btn_loginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseExited
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/loginButton.png")));
    }//GEN-LAST:event_btn_loginMouseExited

    private void btn_loginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMousePressed
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/loginButton2.png")));
    }//GEN-LAST:event_btn_loginMousePressed

    private void btn_loginMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_loginMouseReleased
        btn_login.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/loginButton.png")));
    }//GEN-LAST:event_btn_loginMouseReleased

    private void btn_minimizeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseEntered
        btn_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimizeIco1.png")));
    }//GEN-LAST:event_btn_minimizeMouseEntered

    private void btn_minimizeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_minimizeMouseExited
        btn_minimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/minimizeIco.png")));
    }//GEN-LAST:event_btn_minimizeMouseExited

    private void btn_exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseEntered
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exitIco1.png")));
    }//GEN-LAST:event_btn_exitMouseEntered

    private void btn_exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_exitMouseExited
        btn_exit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exitIco.png")));
    }//GEN-LAST:event_btn_exitMouseExited

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel1;
    private javax.swing.JPanel JPanel2;
    private javax.swing.JButton btn_exit;
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_minimize;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lb_status;
    private javax.swing.JPasswordField txt_password;
    private javax.swing.JTextField txt_username;
    // End of variables declaration//GEN-END:variables
}
