/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package giao_dien;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Choncc
 */
public class SQL_connect {
    public static Connection getJDBCConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/quanlyphongkham";
        var user = "root";
        var password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(SQL_connect.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    public String getMCT(String a) throws SQLException{
        Connection conn = getJDBCConnection();
        String sql = "SELECT maThuoc FROM thuoc WHERE tenThuoc = \"" + a + "\"";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        String maThuoc = "";
        while (resultSet.next()) {
                String columnData = resultSet.getString("maThuoc");

                // Thêm dữ liệu vào biến data, có thể thực hiện các thao tác xử lý ở đây
                maThuoc += columnData + "\n";
            }
        return maThuoc;
    }
    public int getGCT(String s) throws SQLException{
        Connection conn = getJDBCConnection();
        String sql = "SELECT donGia FROM thuoc WHERE tenThuoc = \"" + s + "\"";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        int donGia = 0;
        while (resultSet.next()) {
                int columnData = resultSet.getInt("donGia");

                // Thêm dữ liệu vào biến data, có thể thực hiện các thao tác xử lý ở đây
                donGia += columnData ;
            }
        return donGia;
    }
    public String getMNV(String s) throws SQLException{
        Connection conn = getJDBCConnection();
        String sql = "SELECT maNhanVien FROM nhanvien WHERE hoTen = \""+s+"\"";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        String maNhanVien = "";
        while (resultSet.next()) {
                String columnData = resultSet.getString("maNhanVien");

                // Thêm dữ liệu vào biến data, có thể thực hiện các thao tác xử lý ở đây
                maNhanVien += columnData + "\n";
            }
        return maNhanVien;
    }
    public void addBN(String MaBN, String tenBN, String Gt, String NS, String NN, String tthn, String dc, String tieusu, String sdt, String CCCD) throws SQLException{
        Connection conn = getJDBCConnection();
        String sql = "INSERT INTO benhnhan(maBenhNhan, tenBenhNhan, gioiTinh, ngaySinh, ngheNghiep, tinhTrangHonNhan, diaChi, tieuSuBenhAn, soDienThoai, soCMND) VALUE (?,?,?,?,?,?,?,?,?,?)"; 
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, MaBN);
        ps.setString(2, tenBN);
        ps.setString(3, Gt);
        ps.setString(4, NS);
        ps.setString(5, NN);
        ps.setString(6, tthn);
        ps.setString(7, dc);
        ps.setString(8, tieusu);
        ps.setString(9, sdt);
        ps.setString(10, CCCD);
        ps.executeUpdate();
    }
    public void addPK(String MaPK, String MaNV, String MaBN, String lydo, String ghiChu, String tenBS, int tt, String nk) throws SQLException{
        Connection conn = getJDBCConnection();
        String sql = "INSERT INTO phieukham(maPhieuKham, maNhanVien, maBenhNhan, lyDoKham, ghiChu, tenBacSi, thanhToan, ngayKham) VALUE (?,?,?,?,?,?,?,?)"; 
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, MaPK);
        ps.setString(2, MaNV);
        ps.setString(3, MaBN);
        ps.setString(4, lydo);
        ps.setString(5, ghiChu);
        ps.setString(6, tenBS);
        ps.setInt(7, tt);
        ps.setString(8, nk);
        ps.executeUpdate();
    }
    public void setTTien(int s, String maBN) throws SQLException{
        Connection conn = getJDBCConnection();
        String gt = Integer.toString(s);
        String sql = "UPDATE phieukham SET thanhToan = " + gt + " WHERE maBenhNhan = \"BN05\"";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.executeUpdate();
    }
    public void addThuoc(String ma, String ten, int sl, int dg) throws  SQLException{
        Connection conn = getJDBCConnection();
        String sql = "INSERT INTO thuoc(maThuoc, tenThuoc, soLuong, donGia) VALUE (?,?,?,?)"; 
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, ma);
        ps.setString(2,ten);
        ps.setInt(3, sl);
        ps.setInt(4, dg);
        ps.executeUpdate();
    }
    public void DelThuoc(String ma) throws SQLException{
        Connection conn = getJDBCConnection();
        String sql = "DELETE FROM thuoc WHERE maThuoc = \""+ ma +"\""; 
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.executeUpdate();
    }
    public String inMaThuoc(String ten) throws SQLException{
        Connection conn = getJDBCConnection();
        String sql = "SELECT maThuoc FROM thuoc WHERE tenThuoc = \""+ ten +"\"";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        String maThuoc = "";
        while (resultSet.next()) {
                String columnData = resultSet.getString("maThuoc");

                // Thêm dữ liệu vào biến data, có thể thực hiện các thao tác xử lý ở đây
                maThuoc += columnData + "\n";
            }
        return maThuoc;
    }
    public int inSLThuoc(String ten) throws SQLException{
        Connection conn = getJDBCConnection();
        String sql = "SELECT soLuong FROM thuoc WHERE tenThuoc = \""+ ten +"\"";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        int soLuong = 0;
        while (resultSet.next()) {
                int columnData = resultSet.getInt("soLuong");

                // Thêm dữ liệu vào biến data, có thể thực hiện các thao tác xử lý ở đây
                soLuong += columnData;
            }
        return soLuong;
    }
    public int inDGThuoc(String ten) throws SQLException{
        Connection conn = getJDBCConnection();
        String sql = "SELECT donGia FROM thuoc WHERE tenThuoc = \""+ ten +"\"";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        int donGia = 0;
        while (resultSet.next()) {
                int columnData = resultSet.getInt("donGia");

                // Thêm dữ liệu vào biến data, có thể thực hiện các thao tác xử lý ở đây
                donGia += columnData;
            }
        return donGia;
    }
    public String getTenBS(String s) throws SQLException{
        Connection conn = getJDBCConnection();
        String sql = "SELECT nhanvien.hoTen FROM nhanvien "
                + "JOIN donthuoc ON nhanvien.maNhanVien = donthuoc.maBacSi "
                + "AND donthuoc.maBenhNhan = \"" + s + "\"";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        String tenBS = "";
        while (resultSet.next()) {
                String columnData = resultSet.getString("nhanvien.hoTen");

                // Thêm dữ liệu vào biến data, có thể thực hiện các thao tác xử lý ở đây
                tenBS += columnData + "\n";
            }
        return tenBS;
    }
    public String getTenDS(String s) throws SQLException{
        Connection conn = getJDBCConnection();
        String sql = "SELECT nhanvien.hoTen FROM nhanvien "
                + "JOIN donthuoc ON nhanvien.maNhanVien = donthuoc.maDuocSi "
                + "AND donthuoc.maBenhNhan = \"" + s + "\"";
        Statement statement = conn.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        String tenDS = "";
        while (resultSet.next()) {
                String columnData = resultSet.getString("nhanvien.hoTen");

                // Thêm dữ liệu vào biến data, có thể thực hiện các thao tác xử lý ở đây
                tenDS += columnData + "\n";
            }
        return tenDS;
    }
}


