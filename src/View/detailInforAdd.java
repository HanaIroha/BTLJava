/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Dimension;
import java.awt.Toolkit;
import DAO.implement.NhanSu;
import Model.BacLuongModel;
import Model.ChucVuModel;
import Model.ComboItem;
import Model.PhongBanModel;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Iroha
 */
public class detailInforAdd extends javax.swing.JDialog {

    hosoPanel previousPanel;
    ButtonGroup btn_gioitinh = new ButtonGroup();
    ButtonGroup btn_congchuc = new ButtonGroup();
    List<ChucVuModel> cv = new DAO.implement.ChucVu().getChucVu();
    List<PhongBanModel> pb = new DAO.implement.PhongBan().getPhongBan();
    String filename;
    String tenUser;
    boolean imageChange = false;
    
    /**
     * Creates new form detailInfor
     */
    public detailInforAdd(hosoPanel pF, java.awt.Frame parent, boolean modal, String tenTK) {
        super(parent, modal);
        initComponents();
        previousPanel = pF;
        tenUser = tenTK;
        prepare();
    }
    
    public void prepare(){
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
        jPanel1.setBackground(new java.awt.Color(255, 255, 255, 0));
        this.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_chinhtri.setLineWrap(true);
        txt_doanthe.setLineWrap(true);
        congchuc_yes.addItemListener(new ItemListener(){
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (e.getStateChange() == ItemEvent.SELECTED) {
                    jdate_hopdong.getCalendarButton().setEnabled(false);
                }
                else if (e.getStateChange() == ItemEvent.DESELECTED) {
                    jdate_hopdong.getCalendarButton().setEnabled(true);
                }
            }
            
        });
        btn_gioitinh.add(gioitinh_nam);
        btn_gioitinh.add(gioitinh_nu);
        btn_congchuc.add(congchuc_yes);
        btn_congchuc.add(congchuc_no);
        jdate_ngaysinh.setDateFormatString("yyyy-MM-dd");
        jdate_hopdong.setDateFormatString("yyyy-MM-dd");
        jdate_ngaythamgia.setDateFormatString("yyyy-MM-dd");
        for(PhongBanModel s:pb)
        {
            txt_phongban.addItem(new ComboItem(s.getTenPB(),s.getMaPB()));
        }
        for(ChucVuModel s:cv)
            txt_chucvu.addItem(new ComboItem(s.getTenCV(),s.getMaCV()));
        congchuc_yes.setSelected(true);
        gioitinh_nam.setSelected(true);
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
        btn_changeAvatar = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        btn_cancel = new javax.swing.JButton();
        lb_avt = new javax.swing.JLabel();
        txt_chuyennganh = new javax.swing.JTextField();
        txt_mans = new javax.swing.JTextField();
        txt_dantoc = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        txt_trinhdo = new javax.swing.JTextField();
        txt_quequan = new javax.swing.JTextField();
        txt_hoten = new javax.swing.JTextField();
        txt_phongban = new javax.swing.JComboBox<>();
        txt_chucvu = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        gioitinh_nu = new javax.swing.JRadioButton();
        gioitinh_nam = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        jdate_ngaythamgia = new com.toedter.calendar.JDateChooser();
        jdate_ngaysinh = new com.toedter.calendar.JDateChooser();
        jSeparator3 = new javax.swing.JSeparator();
        txt_cancuoc = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jdate_hopdong = new com.toedter.calendar.JDateChooser();
        jLabel18 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        congchuc_yes = new javax.swing.JRadioButton();
        congchuc_no = new javax.swing.JRadioButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_chinhtri = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_doanthe = new javax.swing.JTextArea();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_changeAvatar.setBackground(new java.awt.Color(24, 98, 151));
        btn_changeAvatar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_changeAvatar.setForeground(new java.awt.Color(255, 255, 255));
        btn_changeAvatar.setText("Thay Avatar");
        btn_changeAvatar.setBorder(null);
        btn_changeAvatar.setBorderPainted(false);
        btn_changeAvatar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_changeAvatar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_changeAvatarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_changeAvatar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 140, 40));

        btn_add.setBackground(new java.awt.Color(24, 98, 151));
        btn_add.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_add.setForeground(new java.awt.Color(255, 255, 255));
        btn_add.setText("Thêm");
        btn_add.setBorder(null);
        btn_add.setBorderPainted(false);
        btn_add.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });
        jPanel1.add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 500, 110, 50));

        btn_cancel.setBackground(new java.awt.Color(24, 98, 151));
        btn_cancel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Huỷ");
        btn_cancel.setBorder(null);
        btn_cancel.setBorderPainted(false);
        btn_cancel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelActionPerformed(evt);
            }
        });
        jPanel1.add(btn_cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 500, 110, 50));

        lb_avt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel1.add(lb_avt, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 180, 240));

        txt_chuyennganh.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_chuyennganh.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_chuyennganh.setForeground(new java.awt.Color(255, 255, 255));
        txt_chuyennganh.setBorder(null);
        txt_chuyennganh.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_chuyennganh.setOpaque(false);
        jPanel1.add(txt_chuyennganh, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 230, 220, -1));

        txt_mans.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_mans.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_mans.setForeground(new java.awt.Color(255, 255, 255));
        txt_mans.setBorder(null);
        txt_mans.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_mans.setOpaque(false);
        jPanel1.add(txt_mans, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 220, -1));

        txt_dantoc.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_dantoc.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_dantoc.setForeground(new java.awt.Color(255, 255, 255));
        txt_dantoc.setBorder(null);
        txt_dantoc.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_dantoc.setOpaque(false);
        jPanel1.add(txt_dantoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 320, 250, -1));

        txt_sdt.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_sdt.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_sdt.setForeground(new java.awt.Color(255, 255, 255));
        txt_sdt.setBorder(null);
        txt_sdt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_sdt.setOpaque(false);
        jPanel1.add(txt_sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 220, -1));

        txt_trinhdo.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_trinhdo.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_trinhdo.setForeground(new java.awt.Color(255, 255, 255));
        txt_trinhdo.setBorder(null);
        txt_trinhdo.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_trinhdo.setOpaque(false);
        jPanel1.add(txt_trinhdo, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 200, 260, -1));

        txt_quequan.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_quequan.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_quequan.setForeground(new java.awt.Color(255, 255, 255));
        txt_quequan.setBorder(null);
        txt_quequan.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_quequan.setOpaque(false);
        jPanel1.add(txt_quequan, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 260, 240, -1));

        txt_hoten.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_hoten.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_hoten.setForeground(new java.awt.Color(255, 255, 255));
        txt_hoten.setBorder(null);
        txt_hoten.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_hoten.setOpaque(false);
        jPanel1.add(txt_hoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, 260, -1));

        txt_phongban.setBackground(new java.awt.Color(255, 204, 204));
        txt_phongban.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_phongban.setOpaque(false);
        jPanel1.add(txt_phongban, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 240, -1));

        txt_chucvu.setBackground(new java.awt.Color(255, 204, 204));
        txt_chucvu.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_chucvu.setOpaque(false);
        jPanel1.add(txt_chucvu, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 170, 260, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 260, -1));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 280, 240, -1));
        jPanel1.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, 250, -1));
        jPanel1.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 220, -1));
        jPanel1.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 260, -1));
        jPanel1.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 250, 220, -1));
        jPanel1.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, 220, -1));

        gioitinh_nu.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gioitinh_nu.setForeground(new java.awt.Color(255, 255, 255));
        gioitinh_nu.setText("Nữ");
        gioitinh_nu.setOpaque(false);
        jPanel1.add(gioitinh_nu, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 290, -1, -1));

        gioitinh_nam.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        gioitinh_nam.setForeground(new java.awt.Color(255, 255, 255));
        gioitinh_nam.setText("Nam");
        gioitinh_nam.setOpaque(false);
        jPanel1.add(gioitinh_nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, -1, -1));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Ngày Sinh:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        jdate_ngaythamgia.setBackground(new java.awt.Color(255, 255, 255, 0));
        jdate_ngaythamgia.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jdate_ngaythamgia.setOpaque(false);
        jPanel1.add(jdate_ngaythamgia, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 260, 220, 30));

        jdate_ngaysinh.setBackground(new java.awt.Color(255, 255, 255, 0));
        jdate_ngaysinh.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jdate_ngaysinh.setOpaque(false);
        jPanel1.add(jdate_ngaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, 230, 30));
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 220, 240, -1));

        txt_cancuoc.setBackground(new java.awt.Color(255, 255, 255, 0));
        txt_cancuoc.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        txt_cancuoc.setForeground(new java.awt.Color(255, 255, 255));
        txt_cancuoc.setBorder(null);
        txt_cancuoc.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        txt_cancuoc.setOpaque(false);
        jPanel1.add(txt_cancuoc, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 240, 20));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Số CCND:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 200, -1, -1));

        jdate_hopdong.setBackground(new java.awt.Color(255, 255, 255, 0));
        jdate_hopdong.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jdate_hopdong.setOpaque(false);
        jPanel1.add(jdate_hopdong, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 320, 220, 30));

        jLabel18.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Hạn hợp đồng:");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 320, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Loại nhân sự:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 290, -1, -1));

        congchuc_yes.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        congchuc_yes.setForeground(new java.awt.Color(255, 255, 255));
        congchuc_yes.setText("Công chức");
        congchuc_yes.setOpaque(false);
        jPanel1.add(congchuc_yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 290, -1, -1));

        congchuc_no.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        congchuc_no.setForeground(new java.awt.Color(255, 255, 255));
        congchuc_no.setText("Hợp đồng");
        congchuc_no.setOpaque(false);
        jPanel1.add(congchuc_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 290, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 26)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("THÊM NHÂN SỰ");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 80, 210, 40));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Họ tên:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, -1, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Quê quán:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Giới tính:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dân tộc:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 320, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Số điện thoại:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Trình độ:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Chuyên ngành:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 230, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Phòng ban:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 140, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Đoàn thể:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Mã nhân sự:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Chức vụ:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 170, -1, -1));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Ngày tham gia:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Chính trị:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, -1, -1));

        txt_chinhtri.setColumns(20);
        txt_chinhtri.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_chinhtri.setRows(5);
        txt_chinhtri.setWrapStyleWord(true);
        jScrollPane1.setViewportView(txt_chinhtri);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 380, 240, 90));

        txt_doanthe.setColumns(20);
        txt_doanthe.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_doanthe.setRows(5);
        txt_doanthe.setWrapStyleWord(true);
        jScrollPane2.setViewportView(txt_doanthe);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 350, 250, 120));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/detailInfor.png"))); // NOI18N
        jPanel1.add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 1000, 500));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        try{
                boolean isOK;
                byte[] person_image;
                if(imageChange){
                    File image = new File(filename);
                    FileInputStream fis = new FileInputStream(image);
                    ByteArrayOutputStream bos = new ByteArrayOutputStream();
                    byte[] buf = new byte[1024];
                    for(int readNum; (readNum=fis.read(buf))!=-1;){
                        bos.write(buf,0,readNum);
                }
                person_image=bos.toByteArray();
                }
                else
                {
                    person_image=null;
                }
                isOK = new NhanSu().addNS(((JTextField)jdate_ngaythamgia.getDateEditor().getUiComponent()).getText(),
                        txt_mans.getText(),
                        txt_hoten.getText(),
                        ((JTextField)jdate_ngaysinh.getDateEditor().getUiComponent()).getText(),
                        txt_quequan.getText(),
                        txt_dantoc.getText(),
                        txt_sdt.getText(),
                        txt_trinhdo.getText(),
                        txt_chuyennganh.getText(),
                        ((ComboItem)txt_phongban.getSelectedItem()).getValue(),
                        ((ComboItem)txt_chucvu.getSelectedItem()).getValue(),
                        txt_chinhtri.getText(),
                        txt_doanthe.getText(),
                        gioitinh_nam.isSelected()?true:false,
                        person_image,
                        tenUser,
                        txt_cancuoc.getText(),
                        congchuc_yes.isSelected()?true:false,
                        congchuc_no.isSelected()?((JTextField)jdate_hopdong.getDateEditor().getUiComponent()).getText():null
                );
                if (isOK)
                {
                    JOptionPane.showMessageDialog(this,"Thêm thành công!");
                    this.dispose();
                    previousPanel.LoadData();
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Thêm thất bại!");
                }
            }
            catch(Exception e){
                
            }
    }//GEN-LAST:event_btn_addActionPerformed

    private void btn_cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelActionPerformed
        this.dispose();
    }//GEN-LAST:event_btn_cancelActionPerformed

    private void btn_changeAvatarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_changeAvatarActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(this);
        File f = chooser.getSelectedFile();
        String filenamez = f.getAbsolutePath();
        if(filenamez!=null)
        {
            ImageIcon imageIcon = new ImageIcon(new ImageIcon(filenamez).getImage().getScaledInstance(lb_avt.getWidth(), lb_avt.getHeight(), Image.SCALE_SMOOTH));
            lb_avt.setIcon(imageIcon);
            imageChange = true;
            filename = filenamez;
        }
    }//GEN-LAST:event_btn_changeAvatarActionPerformed

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
            java.util.logging.Logger.getLogger(detailInforAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(detailInforAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(detailInforAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(detailInforAdd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                detailInforAdd dialog = new detailInforAdd(new hosoPanel(new java.awt.Frame(),null), new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_cancel;
    private javax.swing.JButton btn_changeAvatar;
    private javax.swing.JRadioButton congchuc_no;
    private javax.swing.JRadioButton congchuc_yes;
    private javax.swing.JRadioButton gioitinh_nam;
    private javax.swing.JRadioButton gioitinh_nu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private com.toedter.calendar.JDateChooser jdate_hopdong;
    private com.toedter.calendar.JDateChooser jdate_ngaysinh;
    private com.toedter.calendar.JDateChooser jdate_ngaythamgia;
    private javax.swing.JLabel lb_avt;
    private javax.swing.JTextField txt_cancuoc;
    private javax.swing.JTextArea txt_chinhtri;
    private javax.swing.JComboBox<ComboItem> txt_chucvu;
    private javax.swing.JTextField txt_chuyennganh;
    private javax.swing.JTextField txt_dantoc;
    private javax.swing.JTextArea txt_doanthe;
    private javax.swing.JTextField txt_hoten;
    private javax.swing.JTextField txt_mans;
    private javax.swing.JComboBox<ComboItem> txt_phongban;
    private javax.swing.JTextField txt_quequan;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_trinhdo;
    // End of variables declaration//GEN-END:variables
}
