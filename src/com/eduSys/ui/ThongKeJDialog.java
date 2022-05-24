/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eduSys.ui;

import com.eduSys.Utils.Auth;
import com.eduSys.dao.KhoaHocDAO;
import com.eduSys.dao.ThongKeDAO;
import com.eduSys.entity.KhoaHoc;
import com.lowagie.text.Document;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfTable;
import com.lowagie.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileSystemView;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author USUS
 */
public class ThongKeJDialog extends javax.swing.JDialog {

    public ThongKeJDialog() {
    }
   
    public ThongKeJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();
    }
    
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        pnlBangDiem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblBangDiem = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        lblKhoaHoc = new javax.swing.JLabel();
        cboKhoaHoc = new javax.swing.JComboBox<>();
        btnExcelBangDiem = new javax.swing.JButton();
        btnPDFBangDiem = new javax.swing.JButton();
        pnlNguoiHoc = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNguoiHoc = new javax.swing.JTable();
        btnExcelNguoiHoc = new javax.swing.JButton();
        btnPDFNguoiHoc = new javax.swing.JButton();
        pnlDiemChuyenDe = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDiemChuyenDe = new javax.swing.JTable();
        btnExcelDiemChuyenDe = new javax.swing.JButton();
        btnPDFDiemChuyenDe = new javax.swing.JButton();
        pnlDoanhThu = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDoanhThu = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        lblNam = new javax.swing.JLabel();
        cboNam = new javax.swing.JComboBox<>();
        btnExcelDoanhThu = new javax.swing.JButton();
        btnPDFDoanhThu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("TỔNG HỢP THỐNG KÊ");

        tblBangDiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ NH", "HỌ VÀ TÊN", "ĐIỂM", "XẾP LOẠI"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblBangDiem.setRowHeight(25);
        jScrollPane1.setViewportView(tblBangDiem);

        lblKhoaHoc.setText("KHÓA HỌC: ");

        cboKhoaHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboKhoaHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(lblKhoaHoc)
                .addGap(0, 0, 0)
                .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(cboKhoaHoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnExcelBangDiem.setBackground(new java.awt.Color(255, 255, 255));
        btnExcelBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/2.jpg"))); // NOI18N
        btnExcelBangDiem.setText("EXCEL");
        btnExcelBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelBangDiemActionPerformed(evt);
            }
        });

        btnPDFBangDiem.setBackground(new java.awt.Color(255, 255, 255));
        btnPDFBangDiem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/1.jpg"))); // NOI18N
        btnPDFBangDiem.setText("PDF");
        btnPDFBangDiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFBangDiemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlBangDiemLayout = new javax.swing.GroupLayout(pnlBangDiem);
        pnlBangDiem.setLayout(pnlBangDiemLayout);
        pnlBangDiemLayout.setHorizontalGroup(
            pnlBangDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnlBangDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(pnlBangDiemLayout.createSequentialGroup()
                    .addComponent(btnPDFBangDiem)
                    .addGap(18, 18, 18)
                    .addComponent(btnExcelBangDiem))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnlBangDiemLayout.setVerticalGroup(
            pnlBangDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBangDiemLayout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlBangDiemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcelBangDiem, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPDFBangDiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        tabs.addTab("BẢNG ĐIỂM", pnlBangDiem);

        tblNguoiHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NĂM", "SỐ NH", "ĐK SỚM NHẤT", "ĐK MUỘN NHẤT"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNguoiHoc.setRowHeight(25);
        jScrollPane2.setViewportView(tblNguoiHoc);

        btnExcelNguoiHoc.setBackground(new java.awt.Color(255, 255, 255));
        btnExcelNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/2.jpg"))); // NOI18N
        btnExcelNguoiHoc.setText("EXCEL");
        btnExcelNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelNguoiHocActionPerformed(evt);
            }
        });

        btnPDFNguoiHoc.setBackground(new java.awt.Color(255, 255, 255));
        btnPDFNguoiHoc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/1.jpg"))); // NOI18N
        btnPDFNguoiHoc.setText("PDF");
        btnPDFNguoiHoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFNguoiHocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlNguoiHocLayout = new javax.swing.GroupLayout(pnlNguoiHoc);
        pnlNguoiHoc.setLayout(pnlNguoiHocLayout);
        pnlNguoiHocLayout.setHorizontalGroup(
            pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlNguoiHocLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnPDFNguoiHoc)
                .addGap(18, 18, 18)
                .addComponent(btnExcelNguoiHoc, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlNguoiHocLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 29, Short.MAX_VALUE))
        );
        pnlNguoiHocLayout.setVerticalGroup(
            pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNguoiHocLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlNguoiHocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcelNguoiHoc)
                    .addComponent(btnPDFNguoiHoc))
                .addContainerGap())
        );

        tabs.addTab("NGƯỜI HỌC", pnlNguoiHoc);

        tblDiemChuyenDe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CHUYÊN ĐỀ", "SL HV", "ĐIỂM TN", "ĐIỂM CN", "ĐIỂM TB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDiemChuyenDe.setRowHeight(25);
        jScrollPane3.setViewportView(tblDiemChuyenDe);

        btnExcelDiemChuyenDe.setBackground(new java.awt.Color(255, 255, 255));
        btnExcelDiemChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/2.jpg"))); // NOI18N
        btnExcelDiemChuyenDe.setText("EXCEL");
        btnExcelDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelDiemChuyenDeActionPerformed(evt);
            }
        });

        btnPDFDiemChuyenDe.setBackground(new java.awt.Color(255, 255, 255));
        btnPDFDiemChuyenDe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/1.jpg"))); // NOI18N
        btnPDFDiemChuyenDe.setText("PDF");
        btnPDFDiemChuyenDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFDiemChuyenDeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDiemChuyenDeLayout = new javax.swing.GroupLayout(pnlDiemChuyenDe);
        pnlDiemChuyenDe.setLayout(pnlDiemChuyenDeLayout);
        pnlDiemChuyenDeLayout.setHorizontalGroup(
            pnlDiemChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pnlDiemChuyenDeLayout.createSequentialGroup()
                .addComponent(btnPDFDiemChuyenDe)
                .addGap(18, 18, 18)
                .addComponent(btnExcelDiemChuyenDe))
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        pnlDiemChuyenDeLayout.setVerticalGroup(
            pnlDiemChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDiemChuyenDeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlDiemChuyenDeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcelDiemChuyenDe)
                    .addComponent(btnPDFDiemChuyenDe))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        tabs.addTab("ĐIỂM CHUYÊN ĐỀ", pnlDiemChuyenDe);

        tblDoanhThu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CHUYÊN ĐỀ", "SỐ KH", "SỐ HV", "D. THU", "HP. TN", "HP. CN", "HP. TB"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDoanhThu.setGridColor(new java.awt.Color(0, 0, 204));
        tblDoanhThu.setRowHeight(25);
        jScrollPane4.setViewportView(tblDoanhThu);

        lblNam.setText("NĂM: ");

        cboNam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboNamActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(lblNam)
                .addGap(0, 0, 0)
                .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblNam, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(cboNam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        btnExcelDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/2.jpg"))); // NOI18N
        btnExcelDoanhThu.setText("EXCEL");
        btnExcelDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelDoanhThuActionPerformed(evt);
            }
        });

        btnPDFDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/1.jpg"))); // NOI18N
        btnPDFDoanhThu.setText("PDF");
        btnPDFDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPDFDoanhThuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlDoanhThuLayout = new javax.swing.GroupLayout(pnlDoanhThu);
        pnlDoanhThu.setLayout(pnlDoanhThuLayout);
        pnlDoanhThuLayout.setHorizontalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnPDFDoanhThu)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcelDoanhThu))
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(19, 19, 19))
        );
        pnlDoanhThuLayout.setVerticalGroup(
            pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoanhThuLayout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlDoanhThuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPDFDoanhThu)
                    .addComponent(btnExcelDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tabs.addTab("DOANH THU", pnlDoanhThu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(tabs)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboKhoaHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboKhoaHocActionPerformed
        this.fillTableBangDiem();
    }//GEN-LAST:event_cboKhoaHocActionPerformed

    private void cboNamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboNamActionPerformed
        this.fillTableDoanhThu();
    }//GEN-LAST:event_cboNamActionPerformed

    private void btnExcelDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelDoanhThuActionPerformed
        this.excelDoanhThu();
       
    }//GEN-LAST:event_btnExcelDoanhThuActionPerformed

    private void btnExcelNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelNguoiHocActionPerformed
       this.excelNguoiHoc();
    }//GEN-LAST:event_btnExcelNguoiHocActionPerformed

    private void btnExcelBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelBangDiemActionPerformed
        this.excelBangDiem();
    }//GEN-LAST:event_btnExcelBangDiemActionPerformed

    private void btnPDFBangDiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFBangDiemActionPerformed
        this.pdfBangDiem();
        
    }//GEN-LAST:event_btnPDFBangDiemActionPerformed

    private void btnPDFNguoiHocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFNguoiHocActionPerformed
        this.pdfNguoiHoc();
    }//GEN-LAST:event_btnPDFNguoiHocActionPerformed

    private void btnPDFDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFDoanhThuActionPerformed
        this.pdfDoanhThu();
    }//GEN-LAST:event_btnPDFDoanhThuActionPerformed

    private void btnExcelDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelDiemChuyenDeActionPerformed
        this.excelDiemChuyenDe();
    }//GEN-LAST:event_btnExcelDiemChuyenDeActionPerformed

    private void btnPDFDiemChuyenDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPDFDiemChuyenDeActionPerformed
        this.pdfDiemChuyenDe();
    }//GEN-LAST:event_btnPDFDiemChuyenDeActionPerformed

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
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThongKeJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ThongKeJDialog dialog = new ThongKeJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnExcelBangDiem;
    private javax.swing.JButton btnExcelDiemChuyenDe;
    private javax.swing.JButton btnExcelDoanhThu;
    private javax.swing.JButton btnExcelNguoiHoc;
    private javax.swing.JButton btnPDFBangDiem;
    private javax.swing.JButton btnPDFDiemChuyenDe;
    private javax.swing.JButton btnPDFDoanhThu;
    private javax.swing.JButton btnPDFNguoiHoc;
    private javax.swing.JComboBox<String> cboKhoaHoc;
    private javax.swing.JComboBox<String> cboNam;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JLabel lblKhoaHoc;
    private javax.swing.JLabel lblNam;
    private javax.swing.JPanel pnlBangDiem;
    private javax.swing.JPanel pnlDiemChuyenDe;
    private javax.swing.JPanel pnlDoanhThu;
    private javax.swing.JPanel pnlNguoiHoc;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblBangDiem;
    private javax.swing.JTable tblDiemChuyenDe;
    private javax.swing.JTable tblDoanhThu;
    private javax.swing.JTable tblNguoiHoc;
    // End of variables declaration//GEN-END:variables
KhoaHocDAO khdao = new KhoaHocDAO();
    ThongKeDAO tkdao = new ThongKeDAO();

    private void init() {
        this.setLocationRelativeTo(null);
        this.fillComBoxKhoaHoc();
        this.fillTableBangDiem();
        this.fillTableNguoiHoc();
        this.fillTableDiemChuyenDe();
        this.fillComboxBoxNam();
        this.fillTableDoanhThu();
        this.selectTab(0);
        //Không phải trưởng phòng thì xóa tab doanh thu
        if (!Auth.isManager()) {
            tabs.remove(3);
        }
    }

    public void selectTab(int index) {
        tabs.setSelectedIndex(index);
    }

    private void fillComBoxKhoaHoc() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboKhoaHoc.getModel();
        model.removeAllElements();
        List<KhoaHoc> list = khdao.selectAll();
        for (KhoaHoc kh : list) {
            model.addElement(kh);
        }
    }

    private void fillTableBangDiem() {
        DefaultTableModel model = (DefaultTableModel) tblBangDiem.getModel();
        model.setRowCount(0);
        KhoaHoc kh = (KhoaHoc) cboKhoaHoc.getSelectedItem();
        List<Object[]> list = tkdao.getBangDiem(kh.getMaKH());
        for (Object[] row : list) {
            double diem = (double) row[2];
            model.addRow(new Object[]{row[0], row[1],diem, getXepLoai(diem)});
        }

    }

    private String getXepLoai(double diem) {
        if (diem < 5) {
            return "Chưa đạt";
        }
        if (diem < 6.5) {
            return "Trung bình";
        }
        if (diem < 7.5) {
            return "Khá";
        }
        if (diem < 9) {
            return "Giỏi";
        }
        return "Xuất sắc";
    }

    private void fillTableNguoiHoc() {
        DefaultTableModel model = (DefaultTableModel) tblNguoiHoc.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkdao.getLuongNguoiHoc();
        for (Object[] row : list) {
            model.addRow(row);
        }
    }

    private void fillTableDiemChuyenDe() {
        DefaultTableModel model = (DefaultTableModel) tblDiemChuyenDe.getModel();
        model.setRowCount(0);
        List<Object[]> list = tkdao.getDiemChuyenDe();
        for (Object[] row : list) {
            model.addRow(new Object[]{row[0], row[1], row[2], row[3], row[4]});
           
        }
    }
   

    private void fillComboxBoxNam() {
        DefaultComboBoxModel model = (DefaultComboBoxModel) cboNam.getModel();
        model.removeAllElements();
        List<Integer> list = khdao.selectYears();
        for (Integer year : list) {
            model.addElement(year);
        }
    }

    private void fillTableDoanhThu() {
        DefaultTableModel model = (DefaultTableModel) tblDoanhThu.getModel();
        model.setRowCount(0);
        int nam = (Integer) cboNam.getSelectedItem();
        List<Object[]> list = tkdao.getDoanhThu(nam);
        for (Object[] row : list) {
            model.addRow(row);
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
    public void excelDoanhThu(){
        try {
            JFileChooser fileChooser=new JFileChooser();
            fileChooser.showSaveDialog(this);
            File saveFile=fileChooser.getSelectedFile();
            if(saveFile !=null){
                saveFile=new File(saveFile.toString()+".xlsx");
                Workbook wb=new XSSFWorkbook();
                Sheet s=wb.createSheet("Doanh thu");
                Row rowcol=s.createRow(0);
                for (int i = 0; i < tblDoanhThu.getColumnCount(); i++) {
                    Cell cell=rowcol.createCell(i);
                    cell.setCellValue(tblDoanhThu.getColumnName(i));
                }
                for (int j = 0; j < tblDoanhThu.getRowCount(); j++) {
                      Row row=s.createRow(j+1);
                      for (int k = 0; k < tblDoanhThu.getColumnCount(); k++) {
                        Cell cell=row.createCell(k);
                        if(tblDoanhThu.getValueAt(j, k)!=null){
                            cell.setCellValue(tblDoanhThu.getValueAt(j, k).toString());
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
    public void excelDiemChuyenDe(){
        try {
            JFileChooser fileChooser=new JFileChooser();
            fileChooser.showSaveDialog(this);
            File saveFile=fileChooser.getSelectedFile();
            if(saveFile !=null){
                saveFile=new File(saveFile.toString()+".xlsx");
                Workbook wb=new XSSFWorkbook();
                Sheet s=wb.createSheet("Điểm Chuyên đề");
                Row rowcol=s.createRow(0);
                for (int i = 0; i < tblDiemChuyenDe.getColumnCount(); i++) {
                    Cell cell=rowcol.createCell(i);
                    cell.setCellValue(tblDiemChuyenDe.getColumnName(i));
                }
                for (int j = 0; j < tblDiemChuyenDe.getRowCount(); j++) {
                      Row row=s.createRow(j+1);
                      for (int k = 0; k < tblDiemChuyenDe.getColumnCount(); k++) {
                        Cell cell=row.createCell(k);
                        if(tblDiemChuyenDe.getValueAt(j, k)!=null){
                            cell.setCellValue(tblDiemChuyenDe.getValueAt(j, k).toString());
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
    public void excelNguoiHoc(){
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
    public void excelBangDiem(){
         try {
            JFileChooser fileChooser=new JFileChooser();
            fileChooser.showSaveDialog(this);
            File saveFile=fileChooser.getSelectedFile();
            if(saveFile !=null){
                saveFile=new File(saveFile.toString()+".xlsx");
                Workbook wb=new XSSFWorkbook();
                Sheet s=wb.createSheet("Bảng điểm");
                Row rowcol=s.createRow(0);
                for (int i = 0; i < tblBangDiem.getColumnCount(); i++) {
                    Cell cell=rowcol.createCell(i);
                    cell.setCellValue(tblBangDiem.getColumnName(i));
                }
                for (int j = 0; j < tblBangDiem.getRowCount(); j++) {
                      Row row=s.createRow(j+1);
                      for (int k = 0; k < tblBangDiem.getColumnCount(); k++) {
                        Cell cell=row.createCell(k);
                        if(tblBangDiem.getValueAt(j, k)!=null){
                            cell.setCellValue(tblBangDiem.getValueAt(j, k).toString());
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
   
    public void pdfBangDiem(){
        String path="";
        JFileChooser filechooser=new JFileChooser();
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=filechooser.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION){
            path=filechooser.getSelectedFile().getPath();
        }
        Document doc=new Document();
        try {
            PdfWriter.getInstance(doc,new FileOutputStream(path+".pdf"));
            
            doc.open();
        
            PdfPTable tbl=new PdfPTable(4);
            //Adding header
            tbl.addCell("Ma NH");
            tbl.addCell("Ho ten");
            tbl.addCell("Diem");
            tbl.addCell("Xep loai");
        
            for (int i = 0; i < tblBangDiem.getRowCount(); i++) {
                String MaNH=tblBangDiem.getValueAt(i,0).toString();
                String HoTen=tblBangDiem.getValueAt(i,1).toString();
                String Diem=tblBangDiem.getValueAt(i,2).toString();
                String XepLoai=tblBangDiem.getValueAt(i,3).toString();
                
                tbl.addCell(MaNH);
                tbl.addCell(HoTen);
                tbl.addCell(Diem);
                tbl.addCell(XepLoai);
            }
            doc.add(tbl);
        } catch (Exception ex) {

        }
        doc.close();
    }
    public void pdfNguoiHoc(){
        String path="";
        JFileChooser filechooser=new JFileChooser();
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=filechooser.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION){
            path=filechooser.getSelectedFile().getPath();
        }
        Document doc=new Document();
        try {
            PdfWriter.getInstance(doc,new FileOutputStream(path+".pdf"));
            
            doc.open();
        
            PdfPTable tbl=new PdfPTable(4);
            //Adding header
            tbl.addCell("Nam");
            tbl.addCell("So NH");
            tbl.addCell("DK som nhat");
            tbl.addCell("DK muon nhat");
        
            for (int i = 0; i < tblNguoiHoc.getRowCount(); i++) {
                String Nam=tblNguoiHoc.getValueAt(i,0).toString();
                String SoNH=tblNguoiHoc.getValueAt(i,1).toString();
                String DKSom=tblNguoiHoc.getValueAt(i,2).toString();
                String DKMuon=tblNguoiHoc.getValueAt(i,3).toString();
                
                tbl.addCell(Nam);
                tbl.addCell(SoNH);
                tbl.addCell(DKSom);
                tbl.addCell(DKMuon);
            }
            doc.add(tbl);
        } catch (Exception ex) {

        }
        doc.close();
    }
    public void pdfDiemChuyenDe(){
         String path="";
        JFileChooser filechooser=new JFileChooser();
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=filechooser.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION){
            path=filechooser.getSelectedFile().getPath();
        }
        Document doc=new Document();
        try {
            PdfWriter.getInstance(doc,new FileOutputStream(path+".pdf"));
            
            doc.open();
        
            PdfPTable tbl=new PdfPTable(4);
            //Adding header
            tbl.addCell("Chuyen de");
            tbl.addCell("So luong hoc vien");
            tbl.addCell("Diem thap nhat");
            tbl.addCell("Diem cao nhat");
            tbl.addCell("Diem trung binh");
        
            for (int i = 0; i < tblDiemChuyenDe.getRowCount(); i++) {
                String ChuyenDe=tblDiemChuyenDe.getValueAt(i,0).toString();
                String SLHV=tblDiemChuyenDe.getValueAt(i,1).toString();
                String DiemTN=tblDiemChuyenDe.getValueAt(i,2).toString();
                String DiemCN=tblDiemChuyenDe.getValueAt(i,3).toString();
                String DiemTB=tblDiemChuyenDe.getValueAt(i,4).toString();
                
                tbl.addCell(ChuyenDe);
                tbl.addCell(SLHV);
                tbl.addCell(DiemTN);
                tbl.addCell(DiemCN);
                tbl.addCell(DiemTB);
            }
            doc.add(tbl);
        } catch (Exception ex) {

        }
        doc.close();
    }
    public void pdfDoanhThu(){
         String path="";
        JFileChooser filechooser=new JFileChooser();
        filechooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x=filechooser.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION){
            path=filechooser.getSelectedFile().getPath();
        }
        Document doc=new Document();
        try {
            PdfWriter.getInstance(doc,new FileOutputStream(path+".pdf"));
            
            doc.open();
        
            PdfPTable tbl=new PdfPTable(4);
            //Adding header
            tbl.addCell("Chuyen de");
            tbl.addCell("So KH");
            tbl.addCell("So HV");
            tbl.addCell("Doanh thu");
            tbl.addCell("Hoc phi thap nhat");
            tbl.addCell("Hoc phi cao nhat");
            tbl.addCell("Hoc phi trung binh");
        
            for (int i = 0; i < tblDoanhThu.getRowCount(); i++) {
                String ChuyenDe=tblDoanhThu.getValueAt(i,0).toString();
                String SoKH=tblDoanhThu.getValueAt(i,1).toString();
                String SoHV=tblDoanhThu.getValueAt(i,2).toString();
                String DoanhThu=tblDoanhThu.getValueAt(i,3).toString();
                String HocPhiTN=tblDoanhThu.getValueAt(i,4).toString();
                String HocPhiCN=tblDoanhThu.getValueAt(i,5).toString();
                String HocPhiTB=tblDoanhThu.getValueAt(i,6).toString();
                
                tbl.addCell(ChuyenDe);
                tbl.addCell(SoKH);
                tbl.addCell(SoHV);
                tbl.addCell(DoanhThu);
                tbl.addCell(HocPhiTN);
                tbl.addCell(HocPhiCN);
                tbl.addCell(HocPhiTB);
            }
            doc.add(tbl);
        } catch (Exception ex) {

        }
        doc.close();
    }
    
}
