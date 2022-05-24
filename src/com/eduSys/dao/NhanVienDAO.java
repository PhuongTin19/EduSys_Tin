package com.eduSys.dao;

import com.eduSys.Utils.jdbcHelper;
import com.eduSys.entity.ChuyenDe;
import com.eduSys.entity.KhoaHoc;
import com.eduSys.entity.NhanVien;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class NhanVienDAO extends EduSysDAO<NhanVien, String> {

    String INSERT_SQL = "INSERT INTO NhanVien(MaNV,MatKhau,HoTen,VaiTro) Values(?,?,?,?)";
    String UPDATE_SQL = "UPDATE NhanVien set MatKhau=?,HoTen=?,VaiTro=? where MaNV=?";
    String DELETE_SQL = "DELETE FROM NhanVien where MaNV=?";
    String SELECT_ALL_SQL = "SELECT * FROM NhanVien";
    String SELECT_BY_ID = "SELECT * FROM NhanVien where MaNV=?";

    @Override
    public void insert(NhanVien entity) {
        jdbcHelper.update(INSERT_SQL, entity.getMaNV(), entity.getMatKhau(), entity.getHoTen(), entity.getVaiTro());
    }

    @Override
    public void update(NhanVien entity) {
        jdbcHelper.update(UPDATE_SQL, entity.getMatKhau(), entity.getHoTen(), entity.getVaiTro(), entity.getMaNV());
    }

    @Override
    public void delete(String id) {
        jdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public NhanVien selectID(String id) {
        List<NhanVien> list = this.selectBySql(SELECT_BY_ID, id);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<NhanVien>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                NhanVien entity = new NhanVien();
                entity.setMaNV(rs.getString("MaNV"));
                entity.setHoTen(rs.getString("HoTen"));
                entity.setMatKhau(rs.getString("MatKhau"));
                entity.setVaiTro(rs.getBoolean("VaiTro"));
                list.add(entity);
            }
            rs.getStatement().getConnection().close();
            return list;

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
     

}
