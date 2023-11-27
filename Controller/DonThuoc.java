public class DonThuoc{
    private String maThuoc, maBenhNhan, maDuocSi, maBacSi;
    private int maDonThuoc;
    private double tongTien;

    public DonThuoc() {
    }

    public DonThuoc(String maThuoc, String maBenhNhan, String maDuocSi, String maBacSi, int maDonThuoc, double tongTien) {
        this.maThuoc = maThuoc;
        this.maBenhNhan = maBenhNhan;
        this.maDuocSi = maDuocSi;
        this.maBacSi = maBacSi;
        this.maDonThuoc = maDonThuoc;
        this.tongTien = tongTien;
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public String getMaBenhNhan() {
        return maBenhNhan;
    }

    public String getMaDuocSi() {
        return maDuocSi;
    }

    public String getMaBacSi() {
        return maBacSi;
    }

    public int getMaDonThuoc() {
        return maDonThuoc;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public void setMaBenhNhan(String maBenhNhan) {
        this.maBenhNhan = maBenhNhan;
    }

    public void setMaDuocSi(String maDuocSi) {
        this.maDuocSi = maDuocSi;
    }

    public void setMaBacSi(String maBacSi) {
        this.maBacSi = maBacSi;
    }

    public void setMaDonThuoc(int maDonThuoc) {
        this.maDonThuoc = maDonThuoc;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }
}
