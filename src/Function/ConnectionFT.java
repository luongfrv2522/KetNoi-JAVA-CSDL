/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/** 
 *
 * @author Administrator
 */
public class ConnectionFT {
    private static Connection conn;
    
    public static Connection getConnection(){
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url="jdbc:sqlserver://localhost:1433;user=sa;password=1;database=DemoForm";
            conn= DriverManager.getConnection(url);
            System.out.println("Kết nối DB Thành Công!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Kết nối DB bị lỗi!");
        }
        return conn;
    };
};


