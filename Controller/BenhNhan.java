
package Controller;

import Model.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class BenhNhan {
    private String maBenhNhan, tenBenhNhan, maPhieuKham, gioiTinh, ngheNghiep, diaChi, TrieuChung, ghiChu, tieuSuBenhAn, soDienThoai, SoCMND;
    private Date ngaySinh;  
    private String tinhTrangHonNhan;
   
    public BenhNhan() {
    }   

    public BenhNhan(String maBenhNhan, String tenBenhNhan, String maPhieuKham, String gioiTinh, String ngheNghiep, String diaChi, String TrieuChung, String ghiChu, String tieuSuBenhAn, String soDienThoai, String SoCMND, Date ngaySinh, String tinhTrangHonNhan) {
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.maPhieuKham = maPhieuKham;
        this.gioiTinh = gioiTinh;
        this.ngheNghiep = ngheNghiep;
        this.diaChi = diaChi;
        this.TrieuChung = TrieuChung;
        this.ghiChu = ghiChu;
        this.tieuSuBenhAn = tieuSuBenhAn;
        this.soDienThoai = soDienThoai;
        this.SoCMND = SoCMND;
        this.ngaySinh = ngaySinh;
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public String getMaPhieuKham() {
        return maPhieuKham;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getTrieuChung() {
        return TrieuChung;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public String getTieuSuBenhAn() {
        return tieuSuBenhAn;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getSoCMND() {
        return SoCMND;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public String getTinhTrangHonNhan() {
        return tinhTrangHonNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public void setMaPhieuKham(String maPhieuKham) {
        this.maPhieuKham = maPhieuKham;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setTrieuChung(String TrieuChung) {
        this.TrieuChung = TrieuChung;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setTieuSuBenhAn(String tieuSuBenhAn) {
        this.tieuSuBenhAn = tieuSuBenhAn;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setSoCMND(String SoCMND) {
        this.SoCMND = SoCMND;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public void setTinhTrangHonNhan(String tinhTrangHonNhan) {
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }
}
