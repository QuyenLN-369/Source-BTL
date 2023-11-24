
package Controller;

import Model.*;
import java.sql.SQLException;
import java.util.Date;

public class PhieuKhamChiTiet {
    private String maPhieuKhamChiTiet,maBenhNhan, maBacSi, chiSoSucKhoe, ketLuan, yeuCau, maPhieuKham, tenBacSi;
    private Date ngayKham;  
    
    public PhieuKhamChiTiet() {
    }
    
    public PhieuKhamChiTiet(String maPhieuKhamChiTiet, String maBenhNhan, String maBacSi, Date ngayKham, String chiSoSucKhoe, String ketLuan, String yeuCau, String maPhieuKham) {
        this.maPhieuKhamChiTiet = maPhieuKhamChiTiet;
        this.maBenhNhan = maBenhNhan;
        this.maBacSi = maBacSi;
        this.ngayKham = ngayKham;
        this.chiSoSucKhoe = chiSoSucKhoe;
        this.ketLuan = ketLuan;
        this.yeuCau = yeuCau;
        this.maPhieuKham = maPhieuKham;
    }

    public String getMaPhieuKhamChiTiet() {
        return maPhieuKhamChiTiet;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public String getMaBacSi() {
        return maBacSi;
    }

    public String getChiSoSucKhoe() {
        return chiSoSucKhoe;
    }

    public String getKetLuan() {
        return ketLuan;
    }

    public String getYeuCau() {
        return yeuCau;
    }

    public String getMaPhieuKham() {
        return maPhieuKham;
    }

    public String getTenBacSi() {
        return tenBacSi;
    }

    public Date getNgayKham() {
        return ngayKham;
    }

    public void setMaPhieuKhamChiTiet(String maPhieuKhamChiTiet) {
        this.maPhieuKhamChiTiet = maPhieuKhamChiTiet;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public void setMaBacSi(String maBacSi) {
        this.maBacSi = maBacSi;
    }

    public void setChiSoSucKhoe(String chiSoSucKhoe) {
        this.chiSoSucKhoe = chiSoSucKhoe;
    }

    public void setKetLuan(String ketLuan) {
        this.ketLuan = ketLuan;
    }

    public void setYeuCau(String yeuCau) {
        this.yeuCau = yeuCau;
    }

    public void setMaPhieuKham(String maPhieuKham) {
        this.maPhieuKham = maPhieuKham;
    }

    public void setTenBacSi(String tenBacSi) {
        this.tenBacSi = tenBacSi;
    }

    public void setNgayKham(Date ngayKham) {
        this.ngayKham = ngayKham;
    }
    
}
