package giao_dien;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class sqlconnec {
    public static Connection getJDBCConnection() throws SQLException{
        String url = "jdbc:mysql://localhost:3306/quanlyphongkham";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(sqlconnec.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
