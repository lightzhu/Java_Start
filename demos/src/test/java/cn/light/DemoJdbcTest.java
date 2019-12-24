package cn.light;

import org.junit.Test;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import static org.junit.Assert.*;

public class DemoJdbcTest {
    static Connection con;
    static Statement sql;
    static ResultSet res;
    @Test
    public void getCon() throws SQLException {
        con = new DemoJdbc().getCon();
    }
    @Test
    public void doSql() throws SQLException {
        getCon();
        sql = con.createStatement();
        res = sql.executeQuery("select * from account");
        while (res.next()){
            System.out.println(res.getString("name"));
        }
    }
}