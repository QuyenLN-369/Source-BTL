
package Controller;

import Model.*;
import java.sql.SQLException;
import java.util.ArrayList;

public class PhieuKham {
    private String maPhieuKham, maNhanVien, maBenhNhan, lyDoKham, ghiChu, tenBenhNhan, tenBacSi;
    private Double thanhToan;
     
    public PhieuKham() {
    }
   
    public PhieuKham(String maPhieuKham, String maNhanVien, String maBenhNhan, String lyDoKham, String ghiChu, String tenBacSi, Double thanhToan) {
        this.maPhieuKham = maPhieuKham;
        this.maNhanVien = maNhanVien;
        this.maBenhNhan = maBenhNhan;
        this.lyDoKham = lyDoKham;
        this.ghiChu = ghiChu;
        this.tenBacSi = tenBacSi;
        this.thanhToan = thanhToan;
    }

    public String getMaPhieuKham() {
        return maPhieuKham;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public String getLyDoKham() {
        return lyDoKham;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public String getTenBenhNhan() {
        return tenBenhNhan;
    }

    public String getTenBacSi() {
        return tenBacSi;
    }

    public Double getThanhToan() {
        return thanhToan;
    }

    public void setMaPhieuKham(String maPhieuKham) {
        this.maPhieuKham = maPhieuKham;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public void setLyDoKham(String lyDoKham) {
        this.lyDoKham = lyDoKham;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public void setTenBenhNhan(String tenBenhNhan) {
        this.tenBenhNhan = tenBenhNhan;
    }

    public void setTenBacSi(String tenBacSi) {
        this.tenBacSi = tenBacSi;
    }

    public void setThanhToan(Double thanhToan) {
        this.thanhToan = thanhToan;
    }
    
}
