import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.awt.*;

public class DataPhieuKhamChiTiet extends JFrame {

    private JTable table1;
    private DefaultTableModel tableModel1;
    
   
    // Thông tin kết nối database
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost:3306/quanlyphongkham";
    static final String USER = "root";
    static final String PASS = "";

    public DataPhieuKhamChiTiet() {
            
        setTitle("Dữ liệu phiếu khám chuyên khoa");
        setSize(800, 400);
        //setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        // Tạo bảng để hiển thị dữ liệu
        tableModel1 = new DefaultTableModel();
        tableModel1.addColumn("Mã phiếu");
        tableModel1.addColumn("Mã bệnh nhân");
        tableModel1.addColumn("Mã nhân viên");
        tableModel1.addColumn("Ngày khám");
       
        tableModel1.addColumn("Kết luận");
        tableModel1.addColumn("Khuyến Nghị");

        table1 = new JTable(tableModel1);
        JScrollPane scrollPane = new JScrollPane(table1);
        add(scrollPane);
            JButton btn = new JButton("Cập nhật");
            JPanel Jbtn = new JPanel();
            Jbtn.add(btn);
         add(Jbtn, BorderLayout.SOUTH);
        // Hiển thị dữ liệu từ cơ sở dữ liệu khi khởi động ứng dụng
        showData();
        
        btn.addActionListener((ActionEvent e) -> {
            showData();
        });
        
        
    }

    // Hàm hiển thị dữ liệu từ cơ sở dữ liệu vào bảng
    

public void showData() {
        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            String sql = "SELECT * FROM phieukhamchitiet";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            ResultSet rs1 = pstmt.executeQuery();

            // Xóa dữ liệu cũ trong bảng
            tableModel1.setRowCount(0);

            // Thêm dữ liệu mới từ ResultSet vào bảng
            while (rs1.next()) {
                Object[] row = new Object[]{
                        rs1.getInt("maPhieuKham"),
                        rs1.getInt("maBenhNhan"),
                        rs1.getInt("maNhanVien"),
                        rs1.getDate("ngayKham"),
                        rs1.getString("ketLuan"),
                        rs1.getString("khuyenNghi")
                };
                tableModel1.addRow(row);
            }

           // rs.close();
           // pstmt.close();
           // conn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Lỗi khi hiển thị dữ liệu: " + ex.getMessage());
        }
    }
    public static void main(String[] args) {
       
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            
            public void run() {
                new DataPhieuKhamChiTiet().setVisible(true);
            }
        });
    }
}