public class DonThuocChiTiet{
    private String maThuoc;
    private int maDonThuocChiTiet, maDonThuoc, soLuong;

    public DonThuocChiTiet() {
    }

    public DonThuocChiTiet(String maThuoc, int maDonThuocChiTiet, int maDonThuoc, int soLuong) {
        this.maThuoc = maThuoc;
        this.maDonThuocChiTiet = maDonThuocChiTiet;
        this.maDonThuoc = maDonThuoc;
        this.soLuong = soLuong;
    }

    public String getMaThuoc() {
        return maThuoc;
    }

    public int getMaDonThuocChiTiet() {
        return maDonThuocChiTiet;
    }

    public int getMaDonThuoc() {
        return maDonThuoc;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setMaThuoc(String maThuoc) {
        this.maThuoc = maThuoc;
    }

    public void setMaDonThuocChiTiet(int maDonThuocChiTiet) {
        this.maDonThuocChiTiet = maDonThuocChiTiet;
    }

    public void setMaDonThuoc(int maDonThuoc) {
        this.maDonThuoc = maDonThuoc;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
}
