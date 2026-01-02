
package com.exam.dao;
import com.exam.config.DBConnection;
import java.sql.*;

public class ExamDAO {

    public boolean login(String u,String p) throws Exception {
        Connection c=DBConnection.getConnection();
        PreparedStatement ps=c.prepareStatement(
          "SELECT * FROM users WHERE username=? AND password=?");
        ps.setString(1,u); ps.setString(2,p);
        return ps.executeQuery().next();
    }

    public void register(String u,String p) throws Exception {
        Connection c=DBConnection.getConnection();
        PreparedStatement ps=c.prepareStatement(
          "INSERT INTO users(username,password) VALUES(?,?)");
        ps.setString(1,u); ps.setString(2,p);
        ps.executeUpdate();
    }
}
