
package Controller;

import Model.*;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class BenhNhan {
    private String maBenhNhan, tenBenhNhan,gioiTinh, ngheNghiep, diaChi, tieuSuBenhAn, soDienThoai, SoCMND;
    private Date ngaySinh;  
    private Integer tinhTrangHonNhan;
   
    public BenhNhan() {
    }   
    
    public BenhNhan(String maBenhNhan, String tenBenhNhan, String gioiTinh, Date ngaySinh, String ngheNghiep, Integer tinhTrangHonNhan, String diaChi, String tieuSuBenhAn, String soDienThoai, String SoCMND) {
        this.maBenhNhan = maBenhNhan;
        this.tenBenhNhan = tenBenhNhan;
        this.gioiTinh = gioiTinh;
        this.ngaySinh = ngaySinh;
        this.ngheNghiep = ngheNghiep;
        this.tinhTrangHonNhan = tinhTrangHonNhan;
        this.diaChi = diaChi;
        this.tieuSuBenhAn = tieuSuBenhAn;
        this.soDienThoai = soDienThoai;
        this.SoCMND = SoCMND;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
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

    public Integer getTinhTrangHonNhan() {
        return tinhTrangHonNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
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

    public void setTinhTrangHonNhan(Integer tinhTrangHonNhan) {
        this.tinhTrangHonNhan = tinhTrangHonNhan;
    }
    
}
