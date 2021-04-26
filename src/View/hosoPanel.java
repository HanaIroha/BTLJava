package View;

import DAO.implement.NhanSu;
import Model.HoSoTableModel;
import Model.NhanSuModel;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
/**
 *
 * @author Iroha
 */
public class hosoPanel extends javax.swing.JPanel {
    
    java.awt.Frame bb;
    hosoPanel aa;
    public hosoPanel(java.awt.Frame mainFrame) {
        initComponents();
        table_ns.getTableHeader().setDefaultRenderer(new HeaderColor());
        table_ns.getTableHeader().setBackground(new Color(82,147,255));
        table_ns.getTableHeader().setBackground(new Color(32, 136, 203));
        table_ns.setBackground(Color.white);
        aa = this;
        bb = mainFrame;
        table_ns.addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent mouseEvent) {
                JTable table =(JTable) mouseEvent.getSource();
                Point point = mouseEvent.getPoint();
                int row = table.rowAtPoint(point);
                if (mouseEvent.getClickCount() == 2 && table.getSelectedRow() != -1) {
                    String a = (String)table_ns.getValueAt(table_ns.getSelectedRow(), 0);
                    detailInfor z = new detailInfor(aa,a,bb,true);
                    z.setAlwaysOnTop(true);
                    z.setVisible(true);
                }
            }
        });
        LoadData();
    }
    
    public class HeaderColor extends DefaultTableCellRenderer {

        public HeaderColor() {
            setOpaque(true);
        }

        public Component getTableCellRendererComponent(JTable table, Object value, boolean selected, boolean focused, int row, int column) {
            super.getTableCellRendererComponent(table, value, selected, focused, row, column);
            setOpaque(false);
            setFont(new Font("Tahoma", Font.BOLD, 14));
            setForeground(new Color(255,255,255));
            setPreferredSize(new Dimension(1230, 35));
            return this;
        }

    }
    
    public void LoadData(){
        jScrollPane1.getViewport().setBackground(Color.white);
        List<NhanSuModel> ls = new NhanSu().getListNhanSu();
        table_ns.setModel(new HoSoTableModel(ls));
        table_ns.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        table_ns.getColumnModel().getColumn(0).setPreferredWidth(60);
        table_ns.getColumnModel().getColumn(1).setPreferredWidth(130);
        table_ns.getColumnModel().getColumn(2).setPreferredWidth(100);
        table_ns.getColumnModel().getColumn(3).setPreferredWidth(80);
        table_ns.getColumnModel().getColumn(4).setPreferredWidth(110);
        table_ns.getColumnModel().getColumn(5).setPreferredWidth(130);
        table_ns.getColumnModel().getColumn(6).setPreferredWidth(90);
        table_ns.getColumnModel().getColumn(7).setPreferredWidth(110);
        table_ns.getColumnModel().getColumn(8).setPreferredWidth(138);
        table_ns.getColumnModel().getColumn(9).setPreferredWidth(130);
        table_ns.getColumnModel().getColumn(10).setPreferredWidth(130);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        reload = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_add = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_ns = new javax.swing.JTable();
        background = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1250, 650));
        setPreferredSize(new java.awt.Dimension(1250, 650));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        reload.setBackground(new java.awt.Color(24, 98, 151));
        reload.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reload.setForeground(new java.awt.Color(255, 255, 255));
        reload.setText("Tải lại");
        reload.setBorder(null);
        reload.setBorderPainted(false);
        reload.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reloadActionPerformed(evt);
            }
        });
        add(reload, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 20, 100, 50));

        btn_delete.setBackground(new java.awt.Color(24, 98, 151));
        btn_delete.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btn_delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_delete.setText("Xóa");
        btn_delete.setBorder(null);
        btn_delete.setBorderPainted(false);
        btn_delete.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        add(btn_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 20, 100, 50));

        btn_add.setBackground(new java.awt.Color(24, 98, 151));
        btn_add.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        add(btn_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, 100, 50));

        table_ns.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        table_ns.setFocusable(false);
        table_ns.setGridColor(new java.awt.Color(204, 204, 204));
        table_ns.setIntercellSpacing(new java.awt.Dimension(0, 0));
        table_ns.setRowHeight(25);
        table_ns.setSelectionBackground(new java.awt.Color(255, 102, 102));
        table_ns.setShowVerticalLines(false);
        table_ns.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(table_ns);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 97, 1230, 540));

        background.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/panelDefault.png"))); // NOI18N
        add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1250, 650));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
        detailInforAdd z = new detailInforAdd(aa,bb,true);
        z.setAlwaysOnTop(true);
        z.setVisible(true);
    }//GEN-LAST:event_btn_addActionPerformed

    private void reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reloadActionPerformed
        LoadData();
    }//GEN-LAST:event_reloadActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        if(JOptionPane.showConfirmDialog (null, "Hành động này sẽ xoá vĩnh viễn hồ sơ","Bạn chắc chứ?",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            int[] index = table_ns.getSelectedRows();
            int count=0;
            for(int a:index)
            {
                if (new NhanSu().deleteNS((String) table_ns.getValueAt(a, 0)))
                    count++;
            }
            JOptionPane.showMessageDialog(this,"Đã xoá "+count+" hồ sơ!");
            LoadData();
        }
    }//GEN-LAST:event_btn_deleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_delete;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton reload;
    private javax.swing.JTable table_ns;
    // End of variables declaration//GEN-END:variables
}
