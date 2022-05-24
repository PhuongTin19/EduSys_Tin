package com.eduSys.ui;

import com.eduSys.Utils.Auth;
import com.eduSys.dao.NhanVienDAO;
import com.eduSys.entity.NhanVien;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import com.eduSys.Utils.MsgBox;
import com.eduSys.dao.NguoiHocDAO;
import com.eduSys.entity.NguoiHoc;
import java.util.ArrayList;
import com.eduSys.ui.NguoiHocJDialog;
public class NhanVienJDialog extends javax.swing.JDialog {

    public NhanVienJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        init();

    }
    public NhanVienJDialog() {
        //super(parent, modal);
        initComponents();
        init();
        
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        tabs = new javax.swing.JTabbedPane();
        pnlCapNhat = new javax.swing.JPanel();
        lblMatKhau = new javax.swing.JLabel();
        lblHoTen = new javax.swing.JLabel();
        txtHoTen = new javax.swing.JTextField();
        rdoNhanVien = new javax.swing.JRadioButton();
        lblVaiTro = new javax.swing.JLabel();
        rdoTruongPhong = new javax.swing.JRadioButton();
        lblMaNV = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        lblXacNhan = new javax.swing.JLabel();
        txtMatKhau = new javax.swing.JPasswordField();
        txtMatKhau2 = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnFirst = new javax.swing.JButton();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        pnlDanhSach = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNhanVien = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EduSys - Quản lý nhân viên");

        lblMatKhau.setText("Mật khẩu");

        lblHoTen.setText("Họ và tên");

        buttonGroup1.add(rdoNhanVien);
        rdoNhanVien.setSelected(true);
        rdoNhanVien.setText("Nhân viên");

        lblVaiTro.setText("Vai trò");

        buttonGroup1.add(rdoTruongPhong);
        rdoTruongPhong.setText("Trưởng phòng");

        lblMaNV.setText("Mã nhân viên");

        lblXacNhan.setText("Xác nhận mật khẩu");

        btnThem.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel1.add(btnThem);

        btnSua.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel1.add(btnSua);

        btnXoa.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel1.add(btnXoa);

        btnMoi.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnMoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/Tick.png"))); // NOI18N
        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });
        jPanel1.add(btnMoi);

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/Button-First-icon.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });
        jPanel2.add(btnFirst);

        btnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/Button-Rewind-icon.png"))); // NOI18N
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });
        jPanel2.add(btnPrev);

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/Button-Forward-icon.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });
        jPanel2.add(btnNext);

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/eduSys/icon/Button-Last-icon.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });
        jPanel2.add(btnLast);

        javax.swing.GroupLayout pnlCapNhatLayout = new javax.swing.GroupLayout(pnlCapNhat);
        pnlCapNhat.setLayout(pnlCapNhatLayout);
        pnlCapNhatLayout.setHorizontalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtMaNV)
                    .addComponent(txtHoTen)
                    .addComponent(txtMatKhau)
                    .addComponent(txtMatKhau2)
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblMaNV)
                            .addComponent(lblMatKhau)
                            .addComponent(lblVaiTro)
                            .addComponent(lblXacNhan)
                            .addComponent(lblHoTen)
                            .addGroup(pnlCapNhatLayout.createSequentialGroup()
                                .addComponent(rdoTruongPhong)
                                .addGap(18, 18, 18)
                                .addComponent(rdoNhanVien)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlCapNhatLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        pnlCapNhatLayout.setVerticalGroup(
            pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCapNhatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMaNV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMatKhau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblXacNhan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMatKhau2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblHoTen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHoTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblVaiTro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoTruongPhong)
                    .addComponent(rdoNhanVien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCapNhatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("CẬP NHẬT", pnlCapNhat);

        tblNhanVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "MÃ NV", "MẬT KHẨU", "HỌ VÀ TÊN", "VAI TRÒ"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNhanVien.setRowHeight(25);
        tblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblNhanVienMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblNhanVien);

        javax.swing.GroupLayout pnlDanhSachLayout = new javax.swing.GroupLayout(pnlDanhSach);
        pnlDanhSach.setLayout(pnlDanhSachLayout);
        pnlDanhSachLayout.setHorizontalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 618, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDanhSachLayout.setVerticalGroup(
            pnlDanhSachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDanhSachLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );

        tabs.addTab("DANH SÁCH", pnlDanhSach);

        tabs.setSelectedIndex(1);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("QUẢN LÝ NHÂN VIÊN QUẢN TRỊ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tabs)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tabs))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        this.clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        this.delete();
        
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        this.update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        this.insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        this.first();
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        this.prev();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        this.next();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        this.last();
    }//GEN-LAST:event_btnLastActionPerformed

    private void tblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblNhanVienMouseClicked
        if (evt.getClickCount() == 2) {
            this.row = tblNhanVien.getSelectedRow();
            this.edit();
        }

    }//GEN-LAST:event_tblNhanVienMouseClicked

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
            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NhanVienJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NhanVienJDialog dialog = new NhanVienJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblHoTen;
    private javax.swing.JLabel lblMaNV;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblVaiTro;
    private javax.swing.JLabel lblXacNhan;
    private javax.swing.JPanel pnlCapNhat;
    private javax.swing.JPanel pnlDanhSach;
    private javax.swing.JRadioButton rdoNhanVien;
    private javax.swing.JRadioButton rdoTruongPhong;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblNhanVien;
    private javax.swing.JTextField txtHoTen;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JPasswordField txtMatKhau2;
    // End of variables declaration//GEN-END:variables
    NhanVienDAO dao = new NhanVienDAO();
    NguoiHocDAO nhdao=new NguoiHocDAO();
    int row = -1;//Hàng được chọn hiện tại trên bảng

    private void init() {
        this.setLocationRelativeTo(null);
        this.fillTable();
        this.row = -1;
        this.updateStatus();
    }
//Lấy thông tin từ ô nhập

    private NhanVien getForm() {
        NhanVien nv = new NhanVien();
        nv.setMaNV(txtMaNV.getText());
        nv.setMatKhau(new String(txtMatKhau.getPassword()));
        nv.setHoTen(txtHoTen.getText());
        nv.setVaiTro(rdoTruongPhong.isSelected());
        return nv;
    }

    private void setForm(NhanVien nv) {
        txtMaNV.setText(nv.getMaNV());
        txtHoTen.setText(nv.getHoTen());
        txtMatKhau.setText(nv.getMatKhau());
        txtMatKhau2.setText(nv.getMatKhau());
        rdoTruongPhong.setSelected(nv.getVaiTro());
        rdoNhanVien.setSelected(!nv.getVaiTro());
    }

    private void insert() {
        String patternhoTen="[0-9 ]+";
        String mk=new String(txtMatKhau.getPassword());
        String mk2 = new String(txtMatKhau2.getPassword());
        NhanVien nv = getForm();
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền thêm nhân viên");
        }else if(txtMaNV.getText().isEmpty() || txtHoTen.getText().isEmpty() || mk.isEmpty() || mk2.isEmpty()){
            MsgBox.alert(this, "Vui lòng không bỏ trống ô nhập");
        } else if (!mk2.equals(nv.getMatKhau())) {
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng");
        } else if (dao.selectID(txtMaNV.getText()) != null) {
            MsgBox.alert(this, "Mã nhân viên đã tồn tại");
        }else if(txtHoTen.getText().matches(patternhoTen)){
            MsgBox.alert(this,"Họ tên phải nhập chữ");
        }else if(txtMaNV.getText().length()>10){
            MsgBox.alert(this,"Mã nhân viên không quá 10 kí tự");
        } else {
            try {
                dao.insert(nv);
                this.fillTable();
                this.clearForm();
                MsgBox.alert(this, "Thêm mới thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Thêm mới thất bại");
            }
        }
    }

    private void update() {
        String hoTen="[0-9 ]+";
        String mk=new String(txtMatKhau.getPassword());
        String mk2 = new String(txtMatKhau2.getPassword());
        NhanVien nv = getForm();
        if (!mk2.equals(nv.getMatKhau())) {
            MsgBox.alert(this, "Xác nhận mật khẩu không đúng");
        }else if(txtMaNV.getText().isEmpty() || txtHoTen.getText().isEmpty() || mk.isEmpty() || mk2.isEmpty()){
            MsgBox.alert(this, "Vui lòng không bỏ trống ô nhập");
        }else if(!txtHoTen.getText().matches(hoTen)){
            MsgBox.alert(this,"Họ tên phải nhập chữ");
        }else if(txtMaNV.getText().length()>10){
            MsgBox.alert(this,"Mã nhân viên không quá 10 kí tự");
        }else {
            try {
                dao.update(nv);
                this.fillTable();
                MsgBox.alert(this, "Cập nhật thành công");
            } catch (Exception e) {
                MsgBox.alert(this, "Cập nhật thất bại");
            }
        }
    }

    private void delete() {
        if (!Auth.isManager()) {
            MsgBox.alert(this, "Bạn không có quyền xóa nhân viên");
        } else {
            String manv = txtMaNV.getText();
            if (manv.equals(Auth.user.getMaNV())) {
                MsgBox.alert(this, "Bạn không có quyền xóa chính bạn");
            } else if (MsgBox.confirm(this, "Bạn có thực sự muốn xóa nhân viên này?")) {
                try {
                    dao.delete(manv);
                    this.fillTable();
                    this.clearForm();
                    MsgBox.alert(this, "Xóa thành công");
                } catch (Exception e) {
                    MsgBox.alert(this, "Xóa thất bại");
                }
            }
        }
    }

    private void clearForm() {
        NhanVien nv = new NhanVien();
        this.setForm(nv);
        this.row = -1;
        this.updateStatus();
    }
//Lấy thông tin nhân viên khi click lên bảng

    private void edit() {
        String manv = (String) tblNhanVien.getValueAt(this.row, 0);
        NhanVien nv = dao.selectID(manv);
        this.setForm(nv);
        tabs.setSelectedIndex(0);
        this.updateStatus();

    }

    private void first() {
        this.row = 0;
        this.edit();
    }

    private void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    private void next() {
        if (this.row < tblNhanVien.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    private void last() {
        this.row = tblNhanVien.getRowCount() - 1;
        this.edit();
    }

    private void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblNhanVien.getModel();
        model.setRowCount(0);
        if (Auth.isManager()) {
            try {
                List<NhanVien> list = dao.selectAll();
                for (NhanVien nv : list) {
                    Object[] row = {nv.getMaNV(), nv.getMatKhau(), nv.getHoTen(), nv.getVaiTro() ? "Trưởng phòng" : "Nhân viên"};
                    model.addRow(row);
                }
            } catch (Exception e) {
                MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
            }
        } else {
            try {

                List<NhanVien> list = dao.selectAll();
                for (NhanVien nv : list) {
                    Object[] row = {nv.getMaNV(), "*****", nv.getHoTen(), nv.getVaiTro() ? "Trưởng phòng" : "Nhân viên"};
                    model.addRow(row);
                }
            } catch (Exception e) {
                MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
            }
        }

    }

    private void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblNhanVien.getRowCount() - 1);
        //Trạng thái form
        txtMaNV.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);
        //Trạng thái điều hướng
        btnFirst.setEnabled(edit && !first);
        btnPrev.setEnabled(edit && !first);
        btnNext.setEnabled(edit && !last);
        btnLast.setEnabled(edit && !last);
    }
    
}