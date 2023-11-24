
package Controller;
import java.util.Date;

public class NhanVien {
    private String maNhanVien, hoTen,gioiTinh, chucVu,diaChi,soDienThoai, email, soCMND, password;
    private Date ngaySinh;

    public String getMaNhanVien() {
        return maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public String getPassword() {
        return password;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }

    public void setMaNhanVien(String maNhanVien) {
        this.maNhanVien = maNhanVien;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setChucVu(String chucVu) {
        this.chucVu = chucVu;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setNgaySinh(Date ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
}
