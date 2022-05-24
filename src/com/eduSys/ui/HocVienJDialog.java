/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduSys.ui;

import com.eduSys.Utils.Auth;
import com.eduSys.Utils.MsgBox;
import com.eduSys.dao.ChuyenDeDAO;
import com.eduSys.dao.HocVienDAO;
import com.eduSys.dao.KhoaHocDAO;
import com.eduSys.dao.NguoiHocDAO;
import com.eduSys.entity.ChuyenDe;
import com.eduSys.entity.HocVien;
import com.eduSys.entity.KhoaHoc;
import com.eduSys.entity.NguoiHoc;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.FileDataSource;
import javax.mail.Message;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author USUS
 */
public class HocVienJDialog extends javax.swing.JDialog {

    /**
     * Creates new form HocVienJDialog
     */
    public HocVienJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        cboChuyenDe = new javax.swing.JComboBox<>();
        lblChuyenDe = new javax.swing.JLabel();
        lblKhoaHoc = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        tabs = new javax.swing.JTabbedPane();
        pnlHocVien = new javax.swing.JPanel();
        btnCapNhat = new javax.swing.JButton();
        bntXoa = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHocVien = new javax.swing.JTable();
        btnExcelHocVien = new javax.swing.JButton();
        pnlNguoiHoc = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        txtTimKiem = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        btnExcelNguoiHoc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys-Quản lý học viên");

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        cboChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboChuyenDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblChuyenDe.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblChuyenDe.setText("CHUYÊN ĐỀ");

        lblKhoaHoc.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblKhoaHoc.setText("KHOÁ HỌC");

        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("")));

        cboKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 307, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCapNhat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/Edit.png"))); // NOI18N
        btnCapNhat.setText("Cập nhật điểm");
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        bntXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/Delete.png"))); // NOI18N
        bntXoa.setText("Xoá khỏi khoá học");
        bntXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntXoaActionPerformed(evt);
            }
        });

        tblHocVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null}
            },
            new String [] {
                "TT", "MÃ HV", "MÃ NH", "HỌ TÊN", "ĐIỂM"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHocVien.setRowHeight(25);
        jScrollPane1.setViewportView(tblHocVien);

        btnExcelHocVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/2.jpg"))); // NOI18N
        btnExcelHocVien.setText("EXCEL");
        btnExcelHocVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelHocVienActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHocVienLayout = new javax.swing.GroupLayout(pnlHocVien);
        pnlHocVien.setLayout(pnlHocVienLayout);
        pnlHocVienLayout.setHorizontalGroup(
            pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlHocVienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnExcelHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bntXoa)
                .addGap(18, 18, 18)
                .addComponent(btnCapNhat)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 711, Short.MAX_VALUE)
        );
        pnlHocVienLayout.setVerticalGroup(
            pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHocVienLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlHocVienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCapNhat)
                    .addComponent(bntXoa)
                    .addComponent(btnExcelHocVien, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        tabs.addTab("HỌC VIÊN", pnlHocVien);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("Tìm kiếm")));

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTimKiem)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(338, 338, 338))
        );

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/Accept.png"))); // NOI18N
        btnThem.setText("Thêm vào khoá học");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ NH", "HỌ VÀ TÊN", "GIỚI TÍNH", "NGÀY SINH", "ĐIỆN THOẠI", "EMAIL"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNguoiHoc.setRowHeight(22);
        jScrollPane3.setViewportView(tblNguoiHoc);

        btnExcelNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/2.jpg"))); // NOI18N
        btnExcelNguoiHoc.setText("EXCEL");
        btnExcelNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelNguoiHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNguoiHocLayout = new javax.swing.GroupLayout(pnlNguoiHoc);
        pnlNguoiHoc.setLayout(pnlNguoiHocLayout);
        pnlNguoiHocLayout.setHorizontalGroup(
            pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguoiHocLayout.createSequentialGroup()
                .addGroup(pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNguoiHocLayout.createSequentialGroup()
                        .addContainerGap(349, Short.MAX_VALUE)
                        .addComponent(btnExcelNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(btnThem))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(pnlNguoiHocLayout.createSequentialGroup()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 701, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        pnlNguoiHocLayout.setVerticalGroup(
            pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguoiHocLayout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(230, 230, 230)
                .addGroup(pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnExcelNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlNguoiHocLayout.createSequentialGroup()
                    .addContainerGap(77, Short.MAX_VALUE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(77, Short.MAX_VALUE)))
        );

        tabs.addTab("NGƯỜI HỌC", pnlNguoiHoc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabs)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblChuyenDe, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(27, 27, 27)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboChuyenDeActionPerformed
        this.fillComboBoxKhoaHoc();
    }//GEN-LAST:event_cboChuyenDeActionPerformed

    private void bntXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntXoaActionPerformed
        this.removeHocVien();
    }//GEN-LAST:event_bntXoaActionPerformed

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        this.updateDiem();
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void cboKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaHocActionPerformed
        this.fillTableHocVien();
    }//GEN-LAST:event_cboKhoaHocActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.addHocVien();
    }//GEN-LAST:event_btnThemActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        this.fillTableNguoiHoc();
    }//GEN-LAST:event_txtTimKiemKeyReleased

    private void btnExcelHocVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelHocVienActionPerformed
        this.excelHocVien();
    }//GEN-LAST:event_btnExcelHocVienActionPerformed

    private void btnExcelNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelNguoiHocActionPerformed
        this.excelNguoiHoc();
    }//GEN-LAST:event_btnExcelNguoiHocActionPerformed

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
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HocVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                HocVienJDialog dialog = new HocVienJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton bntXoa;
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnExcelHocVien;
    private javax.swing.JButton btnExcelNguoiHoc;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cboChuyenDe;
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblChuyenDe;
    private javax.swing.JLabel lblKhoaHoc;
    private javax.swing.JPanel pnlHocVien;
    private javax.swing.JPanel pnlNguoiHoc;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblHocVien;
    private javax.swing.JTable tblNguoiHoc;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
    ChuyenDeDAO cddao = new ChuyenDeDAO();
    KhoaHocDAO khdao = new KhoaHocDAO();
    NguoiHocDAO nhdao = new NguoiHocDAO();
    HocVienDAO hvdao = new HocVienDAO();

    private void init() {
        this.setLocationRelativeTo(null);
        this.fillComboBoxChuyenDe();
    }

    private void fillComboBoxChuyenDe() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboChuyenDe.getModel();
        model.removeAllElements();
        List<ChuyenDe> list = cddao.selectAll();
        for (ChuyenDe cd : list) {
            model.addElement(cd);
        }
        this.fillComboBoxKhoaHoc();
    }

    private void fillComboBoxKhoaHoc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhoaHoc.getModel();
        model.removeAllElements();
        ChuyenDe cd = (ChuyenDe) cboChuyenDe.getSelectedItem();//Chuyên đề được chọn trong combobox
        if (cd != null) {
            List<KhoaHoc> list = khdao.selectByChuyenDe(String.valueOf(cd.getMaCD()));//Lấy ra những khóa học liên quan đến chuyên đề đc chọn 
            for (KhoaHoc kh : list) {
                model.addElement(kh);
            }
            this.fillTableHocVien();
        }
    }

    private void fillTableHocVien() {
        DefaultTableModel model = (DefaultTableModel) tblHocVien.getModel();
        model.setRowCount(0);
        KhoaHoc kh = (KhoaHoc) cboKhoaHoc.getSelectedItem();//Chọn khóa học trên cboKhoaHoc
        
        if (kh != null) {
           List<HocVien> list = hvdao.selectByKhoaHoc(kh.getMaKH());//Lấy ra những học viên có MaKH đc chọn trên cbo
            for (int i = 0; i < list.size(); i++) {
                HocVien hv = list.get(i);
                String hoTen = nhdao.selectID(hv.getMaNH()).getHoTen();
                model.addRow(new Object[]{i + 1, hv.getMaHV(), hv.getMaNH(), hoTen, hv.getDiem()});
            }
            this.fillTableNguoiHoc();
        }
    }

    private void fillTableNguoiHoc() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0);
        KhoaHoc kh = (KhoaHoc) cboKhoaHoc.getSelectedItem();//Chọn khóa học trên cboKhoaHoc
        
        String keyword = txtTimKiem.getText();
        List<NguoiHoc> list = nhdao.selectNotInCourse(kh.getMaKH(),keyword);//Truy vấn những người học không có trong học viên
        List<NguoiHoc> list1 = nhdao.selectByKeyword(keyword);
        for (NguoiHoc nh : list) {
            model.addRow(new Object[]{nh.getMaNH(), nh.getHoTen(), nh.getGioiTinh() ? "Nam" : "Nữ",
                nh.getNgaySinh(), nh.getDienThoai(), nh.getEmail()
            });
        }
        for (NguoiHoc nh : list1) {
            model.addRow(new Object[]{nh.getMaNH(), nh.getHoTen(), nh.getGioiTinh() ? "Nam" : "Nữ",
                nh.getNgaySinh(), nh.getDienThoai(), nh.getEmail()
            });
        }

    }

    //Thêm người học từ bảng người học sang bảng học viên
    private void addHocVien() {
        KhoaHoc kh = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        int[] rows = tblNguoiHoc.getSelectedRows();//Lấy giá trị các hàng được chọn trên bảng
        for (int row : rows) {
            HocVien hv = new HocVien();
            String manh = (String) tblNguoiHoc.getValueAt(row, 0);
            hv.setMaNH(manh);
            hv.setMaKH(kh.getMaKH());
            hv.setDiem(0);
            hvdao.insert(hv);
        }
        this.fillTableHocVien();
        this.tabs.setSelectedIndex(0);
    }

    //Xóa học viên trong bảng học viên và cho học viên trở lại bảng người học
    private void removeHocVien() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa!");
        } else {
            int[] rows = tblHocVien.getSelectedRows();
            if (rows.length > 0 && MsgBox.confirm(this, "Bạn có muốn xóa học viên?")) {
                for (int row : rows) {
                    int mahv = (Integer) tblHocVien.getValueAt(row, 1);
                    hvdao.delete(mahv);
                }
                MsgBox.alert(this, "xóa thành công");
                this.fillTableHocVien();
            } else {
                MsgBox.alert(this, "Bạn chưa chọn học viên nào");
            }
        }
    }

    private void updateDiem() {
        for (int i = 0; i < tblHocVien.getRowCount(); i++) {
            int mahv = (Integer) tblHocVien.getValueAt(i, 1);
            HocVien hv = hvdao.selectID(mahv);
            float diem = (Float) tblHocVien.getValueAt(i, 4);
            hv.setDiem(diem);
            hvdao.update(hv);
        }
    }
    public void openFile(String file){
        try {
            File path=new File(file);
            Desktop.getDesktop().open(path);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    private void excelNguoiHoc(){
        try {
            JFileChooser fileChooser=new JFileChooser();
            fileChooser.showSaveDialog(this);
            File saveFile=fileChooser.getSelectedFile();
            if(saveFile !=null){
                saveFile=new File(saveFile.toString()+".xlsx");
                Workbook wb=new XSSFWorkbook();
                Sheet s=wb.createSheet("Người học");
                Row rowcol=s.createRow(0);
                for (int i = 0; i < tblNguoiHoc.getColumnCount(); i++) {
                    Cell cell=rowcol.createCell(i);
                    cell.setCellValue(tblNguoiHoc.getColumnName(i));
                }
                for (int j = 0; j < tblNguoiHoc.getRowCount(); j++) {
                      Row row=s.createRow(j+1);
                      for (int k = 0; k < tblNguoiHoc.getColumnCount(); k++) {
                        Cell cell=row.createCell(k);
                        if(tblNguoiHoc.getValueAt(j, k)!=null){
                            cell.setCellValue(tblNguoiHoc.getValueAt(j, k).toString());
                        }
                    }
                }
                
                FileOutputStream out=new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                openFile(saveFile.toString());
                
            }else{
                JOptionPane.showMessageDialog(null,"Error");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }catch(IOException io){
            System.out.println(io);
        }
    }
     private void excelHocVien(){
        try {
            JFileChooser fileChooser=new JFileChooser();
            fileChooser.showSaveDialog(this);
            File saveFile=fileChooser.getSelectedFile();
            if(saveFile !=null){
                saveFile=new File(saveFile.toString()+".xlsx");
                Workbook wb=new XSSFWorkbook();
                Sheet s=wb.createSheet("Học viên");
                Row rowcol=s.createRow(0);
                for (int i = 0; i < tblHocVien.getColumnCount(); i++) {
                    Cell cell=rowcol.createCell(i);
                    cell.setCellValue(tblHocVien.getColumnName(i));
                }
                for (int j = 0; j < tblHocVien.getRowCount(); j++) {
                      Row row=s.createRow(j+1);
                      for (int k = 0; k < tblHocVien.getColumnCount(); k++) {
                        Cell cell=row.createCell(k);
                        if(tblHocVien.getValueAt(j, k)!=null){
                            cell.setCellValue(tblHocVien.getValueAt(j, k).toString());
                        }
                    }
                }
                
                FileOutputStream out=new FileOutputStream(new File(saveFile.toString()));
                wb.write(out);
                wb.close();
                out.close();
                openFile(saveFile.toString());
                removeHocVien();
            }else{
                JOptionPane.showMessageDialog(null,"Error");
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }catch(IOException io){
            System.out.println(io);
        }
    }
}
