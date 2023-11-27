public class DonThuoc{
    private String maThuoc, maBenhNhan, maDuocSi, maBacSi, tenThuoc;
    private int maDonThuoc, tongTien, soLuong;
    private Date ngayLayThuoc;

    public DonThuoc() {
    }

    public DonThuoc(String maThuoc, String maBenhNhan, String maDuocSi, String maBacSi, String tenThuoc, int maDonThuoc, int tongTien, int soLuong, Date ngayLayThuoc) {
        this.maThuoc = maThuoc;
        this.maBenhNhan = maBenhNhan;
        this.maDuocSi = maDuocSi;
        this.maBacSi = maBacSi;
        this.tenThuoc = tenThuoc;
        this.maDonThuoc = maDonThuoc;
        this.tongTien = tongTien;
        this.soLuong = soLuong;
        this.ngayLayThuoc = ngayLayThuoc;
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public String getMaDuocSi() {
        return maDuocSi;
    }

    public void setMaDuocSi(String maDuocSi) {
        this.maDuocSi = maDuocSi;
    }

    public String getMaBacSi() {
        return maBacSi;
    }

    public void setMaBacSi(String maBacSi) {
        this.maBacSi = maBacSi;
    }

    public String getTenThuoc() {
        return tenThuoc;
    }

    public void setTenThuoc(String tenThuoc) {
        this.tenThuoc = tenThuoc;
    }

    public int getMaDonThuoc() {
        return maDonThuoc;
    }

    public void setMaDonThuoc(int maDonThuoc) {
        this.maDonThuoc = maDonThuoc;
    }

    public int getTongTien() {
        return tongTien;
    }

    public void setTongTien(int tongTien) {
        this.tongTien = tongTien;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Date getNgayLayThuoc() {
        return ngayLayThuoc;
    }

    public void setNgayLayThuoc(Date ngayLayThuoc) {
        this.ngayLayThuoc = ngayLayThuoc;
    }
    
}
