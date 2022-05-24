
package com.eduSys.entity;

import java.util.Date;


public class KhoaHoc {
    private int maKH;	
    private String maCD;
    private float hocPhi;	
    private int thoiLuong;	
    private Date ngayKG;	
    private String ghiChu;	
    private String maNV;	
    private Date ngayTao= new Date();

    @Override
    public String toString() {
        return maCD + " (" + this.ngayKG + ")";
    }
    public int getMaKH() {
        return maKH;
    }

    public void setMaKH(int maKH) {
        this.maKH = maKH;
    }

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public float getHocPhi() {
        return hocPhi;
    }

    public void setHocPhi(float hocPhi) {
        this.hocPhi = hocPhi;
    }

    public int getThoiLuong() {
        return thoiLuong;
    }

    public void setThoiLuong(int thoiLuong) {
        this.thoiLuong = thoiLuong;
    }

    public Date getNgayKG() {
        return ngayKG;
    }

    public void setNgayKG(Date NgayKG) {
        this.ngayKG = NgayKG;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public Date getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(Date NgayTao) {
        this.ngayTao = NgayTao;
    }
 
}
