package cn.light;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DemoJdbc {
    private String url = "jdbc:mysql://localhost:3306/demo_db";
    Connection con;

    public Connection getCon() throws SQLException {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
        con = DriverManager.getConnection(url,"root","root1234");
        return con;
    }
}
