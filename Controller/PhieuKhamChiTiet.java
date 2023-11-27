
package Controller;

import Model.*;
import java.sql.SQLException;
import java.util.Date;

public class PhieuKhamChiTiet {
    private String maPhieuKham,maBenhNhan, maNhanVien, ketLuan, KhuyenNghi;
    private Date ngayKham;  
    
    public PhieuKhamChiTiet() {
    }

    public PhieuKhamChiTiet(String maPhieuKham, String maBenhNhan, String maNhanVien, String ketLuan, String KhuyenNghi, Date ngayKham) {
        this.maPhieuKham = maPhieuKham;
        this.maBenhNhan = maBenhNhan;
        this.maNhanVien = maNhanVien;
        this.ketLuan = ketLuan;
        this.KhuyenNghi = KhuyenNghi;
        this.ngayKham = ngayKham;
    }

    public String getMaPhieuKham() {
        return maPhieuKham;
    }

    public void setMaPhieuKham(String maPhieuKham) {
        this.maPhieuKham = maPhieuKham;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public String getKetLuan() {
        return ketLuan;
    }

    public void setKetLuan(String ketLuan) {
        this.ketLuan = ketLuan;
    }

    public String getKhuyenNghi() {
        return KhuyenNghi;
    }

    public void setKhuyenNghi(String KhuyenNghi) {
        this.KhuyenNghi = KhuyenNghi;
    }

    public Date getNgayKham() {
        return ngayKham;
    }

    public void setNgayKham(Date ngayKham) {
        this.ngayKham = ngayKham;
    }
    
    
}
