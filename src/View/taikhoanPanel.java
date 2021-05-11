/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import DAO.implement.Account;
import Model.AccountModel;
import static View.MainForm.applyQualityRenderingHints;
import java.awt.AlphaComposite;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Iroha
 */
public class taikhoanPanel extends javax.swing.JPanel {

    /**
     * Creates new form luongPanel
     */
    java.awt.Frame bb;
    AccountModel acc = new AccountModel();
    public taikhoanPanel(java.awt.Frame mainFrame, AccountModel account) {
        initComponents();
        bb=mainFrame;
        acc=account;
        prepare();
    }
    
    private void prepare(){
        try{
            txt_tentaikhoan.setText(acc.getUsername());
            txt_ten.setText(acc.getTen());
            lb_avt.setSize(350, 350);
            if(acc.getAnh()!=null){
                ImageIcon imageIcon = new ImageIcon(new ImageIcon(acc.getAnh()).getImage().getScaledInstance(lb_avt.getWidth(), lb_avt.getHeight(), Image.SCALE_SMOOTH));
                BufferedImage master = new BufferedImage(
                    imageIcon.getIconWidth(),
                    imageIcon.getIconHeight(),
                    BufferedImage.TYPE_INT_RGB);
                    Graphics g = master.createGraphics();
                imageIcon.paintIcon(null, g, 0,0);
                g.dispose();
                int diameter = Math.min(master.getWidth(), master.getHeight());
                BufferedImage mask = new BufferedImage(master.getWidth(), master.getHeight(), BufferedImage.TYPE_INT_ARGB);

                Graphics2D g2d = mask.createGraphics();
                applyQualityRenderingHints(g2d);
                g2d.fillOval(0, 0, diameter - 1, diameter - 1);
                g2d.dispose();

                BufferedImage masked = new BufferedImage(diameter, diameter, BufferedImage.TYPE_INT_ARGB);
                g2d = masked.createGraphics();
                applyQualityRenderingHints(g2d);
                int x = (diameter - master.getWidth()) / 2;
                int y = (diameter - master.getHeight()) / 2;
                g2d.drawImage(master, x, y, null);
                g2d.setComposite(AlphaComposite.getInstance(AlphaComposite.DST_IN));
                g2d.drawImage(mask, 0, 0, null);
                g2d.dispose();
                lb_avt.setIcon(new ImageIcon(masked));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_logout = new javax.swing.JButton();
        btn_changepass = new javax.swing.JButton();
        txt_matkhaucu = new javax.swing.JPasswordField();
        txt_matkhaumoi = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txt_ten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txt_tentaikhoan = new javax.swing.JTextField();
        lb_avt = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_logout.setBackground(new java.awt.Color(24, 98, 151));
        btn_logout.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_logout.setForeground(new java.awt.Color(255, 255, 255));
        btn_logout.setText("Đăng xuất");
        btn_logout.setBorder(null);
        btn_logout.setBorderPainted(false);
        btn_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        add(btn_logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 360, 140, 40));

        btn_changepass.setBackground(new java.awt.Color(24, 98, 151));
        btn_changepass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_changepass.setForeground(new java.awt.Color(255, 255, 255));
        btn_changepass.setText("Đổi mật khẩu");
        btn_changepass.setBorder(null);
        btn_changepass.setBorderPainted(false);
        btn_changepass.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_changepass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changepassActionPerformed(evt);
            }
        });
        add(btn_changepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 360, 140, 40));

        txt_matkhaucu.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_matkhaucu.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txt_matkhaucu.setForeground(new java.awt.Color(255, 255, 255));
        txt_matkhaucu.setBorder(null);
        txt_matkhaucu.setOpaque(false);
        txt_matkhaucu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_matkhaucuFocusGained(evt);
            }
        });
        add(txt_matkhaucu, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 230, 360, -1));

        txt_matkhaumoi.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_matkhaumoi.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txt_matkhaumoi.setForeground(new java.awt.Color(255, 255, 255));
        txt_matkhaumoi.setBorder(null);
        txt_matkhaumoi.setOpaque(false);
        txt_matkhaumoi.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txt_matkhaumoiFocusGained(evt);
            }
        });
        add(txt_matkhaumoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 350, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Mật khẩu mới:");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 280, -1, -1));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 310, 350, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Họ và tên:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, -1, -1));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 210, 390, -1));

        txt_ten.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_ten.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txt_ten.setForeground(new java.awt.Color(255, 255, 255));
        txt_ten.setBorder(null);
        txt_ten.setDisabledTextColor(new java.awt.Color(0, 51, 255));
        txt_ten.setEnabled(false);
        txt_ten.setOpaque(false);
        add(txt_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 180, 390, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Mật khẩu cũ:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 260, 360, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Tên tài khoản:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 350, -1));

        txt_tentaikhoan.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_tentaikhoan.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        txt_tentaikhoan.setForeground(new java.awt.Color(255, 255, 255));
        txt_tentaikhoan.setBorder(null);
        txt_tentaikhoan.setDisabledTextColor(new java.awt.Color(0, 51, 255));
        txt_tentaikhoan.setEnabled(false);
        txt_tentaikhoan.setOpaque(false);
        add(txt_tentaikhoan, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, 350, -1));

        lb_avt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(lb_avt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 350, 350));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/panelDefault.png"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void txt_matkhaucuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_matkhaucuFocusGained

    }//GEN-LAST:event_txt_matkhaucuFocusGained

    private void txt_matkhaumoiFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_matkhaumoiFocusGained

    }//GEN-LAST:event_txt_matkhaumoiFocusGained

    private void btn_changepassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changepassActionPerformed
        try{
            if(String.valueOf(txt_matkhaucu.getPassword()).equals(""))
                throw new Exception("Mật khẩu cũ không được để trống!");
            if(String.valueOf(txt_matkhaumoi.getPassword()).equals(""))
                throw new Exception("Mật khẩu mới không được để trống!");
            if(new Account().loginAccount(acc.getUsername(),String.valueOf(txt_matkhaucu.getPassword()))==null)
                throw new Exception("Mật khẩu cũ sai");
            new Account().updatePassword(acc.getUsername(), String.valueOf(txt_matkhaumoi.getPassword()));
            JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(), "Đổi mật khẩu thất bại!", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btn_changepassActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        LoginForm f = new LoginForm();
        bb.dispose();
        f.setVisible(true);
    }//GEN-LAST:event_btn_logoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_changepass;
    private javax.swing.JButton btn_logout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lb_avt;
    private javax.swing.JPasswordField txt_matkhaucu;
    private javax.swing.JPasswordField txt_matkhaumoi;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_tentaikhoan;
    // End of variables declaration//GEN-END:variables
}
