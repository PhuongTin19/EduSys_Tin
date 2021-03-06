package com.eduSys.Utils;

import java.sql.*;
import jdk.jshell.spi.ExecutionControl;

public class jdbcHelper {

    static String user = "sa";
    static String password = "123";
    static String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    static String dburl = "jdbc:sqlserver://localhost:1433;databaseName=EduSys";

    static {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
  
    public static PreparedStatement getStmt(String sql, Object... args) throws SQLException {
        Connection con = DriverManager.getConnection(dburl, user, password);
        PreparedStatement stmt;
        //Phân biệt câu lệnh sql
        if (sql.trim().startsWith("{")) {
            stmt = con.prepareCall(sql);
        } else {
            stmt = con.prepareStatement(sql);
        }
        for (int i = 0; i < args.length; i++) {
            stmt.setObject(i + 1, args[i]);
        }
        return stmt;
    }

  
    public static int update(String sql, Object... args) {
        try {
            PreparedStatement stmt = jdbcHelper.getStmt(sql, args);
            try {
                return stmt.executeUpdate();
            } finally {
                stmt.getConnection().close();
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }

    
    public static ResultSet query(String sql, Object... args) throws SQLException {
        try {
            PreparedStatement stmt = jdbcHelper.getStmt(sql, args);
            return stmt.executeQuery();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    
    public static Object value(String sql, Object... args) {
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            if (rs.next()) {
                return rs.getObject(0);
            }
            rs.getStatement().getConnection().close();
            return null;
        } catch (Exception e) {
            throw new RuntimeException();
        }

    }
    
}
