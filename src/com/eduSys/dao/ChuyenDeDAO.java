package com.eduSys.dao;

import com.eduSys.Utils.jdbcHelper;
import com.eduSys.entity.ChuyenDe;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class ChuyenDeDAO extends EduSysDAO<ChuyenDe, String> {

    String INSERT_SQL = "INSERT INTO ChuyenDe(MaCD,TenCD,HocPhi,ThoiLuong,Hinh,MoTa) Values(?,?,?,?,?,?)";
    String UPDATE_SQL = "UPDATE ChuyenDe set TenCD=?,HocPhi=?,ThoiLuong=?,Hinh=?,MoTa=? where MaCD=?";
    String DELETE_SQL = "DELETE FROM ChuyenDe where MaCD=?";
    String SELECT_ALL_SQL = "SELECT * FROM ChuyenDe";
    String SELECT_BY_ID = "SELECT * FROM ChuyenDe where MaCD=?";

    @Override
    public void insert(ChuyenDe entity) {
        jdbcHelper.update(INSERT_SQL, entity.getMaCD(), entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(), entity.getMoTa());
    }

    @Override
    public void update(ChuyenDe entity) {
        jdbcHelper.update(UPDATE_SQL, entity.getTenCD(), entity.getHocPhi(), entity.getThoiLuong(), entity.getHinh(), entity.getMoTa(), entity.getMaCD());
    }

    @Override
    public void delete(String id) {
        jdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<ChuyenDe> selectAll() {
        return this.selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public ChuyenDe selectID(String key) {
        List<ChuyenDe> list = this.selectBySql(SELECT_BY_ID, key);
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override
    protected List<ChuyenDe> selectBySql(String sql, Object... args) {
        List<ChuyenDe> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            while (rs.next()) {
                ChuyenDe cd = new ChuyenDe();
                cd.setMaCD(rs.getString("MaCD"));
                cd.setTenCD(rs.getString("TenCD"));
                cd.setHocPhi(rs.getFloat("HocPhi"));
                cd.setThoiLuong(rs.getInt("ThoiLuong"));
                cd.setHinh(rs.getString("Hinh"));
                cd.setMoTa(rs.getString("MoTa"));
                list.add(cd);
            }
            rs.getStatement().getConnection().close();
            return list;

        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

}
