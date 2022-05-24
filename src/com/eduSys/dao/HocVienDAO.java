package com.eduSys.dao;

import com.eduSys.Utils.jdbcHelper;
import com.eduSys.entity.HocVien;
import com.eduSys.entity.NguoiHoc;
import java.util.List;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class HocVienDAO extends EduSysDAO<HocVien, Integer> {

    String INSERT_SQL = "insert into HocVien(MaKH,MaNH,Diem) values(?,?,?)";
    String UPDATE_SQL = "update HocVien set MaKH=?,MaNH=?,Diem=? where MaHV=?";
    String DELETE_SQL = "delete from HocVien where MaHV=?";
    String SELECT_ALL_SQL = "select * from HocVien";
    String SELECT_BY_ID = "select * from HocVien where MaHV=?";

    @Override
    public void insert(HocVien entity) {
        jdbcHelper.update(INSERT_SQL, entity.getMaKH(), entity.getMaNH(), entity.getDiem());
    }

    @Override
    public void update(HocVien entity) {
        jdbcHelper.update(UPDATE_SQL, entity.getMaKH(), entity.getMaNH(), entity.getDiem(), entity.getMaHV());
    }

    @Override
    public void delete(Integer key) {
        jdbcHelper.update(DELETE_SQL, key);
    }

    @Override
    public List<HocVien> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public HocVien selectID(Integer key) {
        List<HocVien> list = this.selectBySql(SELECT_BY_ID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);

    }

    @Override
    protected List<HocVien> selectBySql(String sql, Object... args) {
        try {
            List<HocVien> list = new ArrayList<HocVien>();
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                HocVien hv = new HocVien();
                hv.setMaHV(rs.getInt("MaHV"));
                hv.setMaKH(rs.getInt("MaKH"));
                hv.setMaNH(rs.getString("MaNH"));
                hv.setDiem(rs.getFloat("Diem"));
                list.add(hv);
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }
    //Truy vấn những học viên nằm trong khóa học 
    public List<HocVien>selectByKhoaHoc(int maKH){
        String sql="SELECT * FROM HocVien where MaKH=?";
        return this.selectBySql(sql,maKH);
    }

}
