package com.aita.db;

import java.sql.*;

/**
 * Created by Aita on 18/2/3.
 */
public class JDBCTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_manager", "root", "123456");
            PreparedStatement pstm = connection.prepareStatement("insert into member(name, mail, passwd) values(?,?.?)");
            pstm.setString(1, "wan");
            pstm.setString(2, "wan@126.com");
            pstm.setString(3, "song");
            pstm.executeUpdate();

            ResultSet result = pstm.executeQuery("select * from member");
            while (result.next()) {
                System.out.println(result.getNString("name"));
            }
        }catch(SQLException e)
        {
            throw new RuntimeException(e);
        }
    }
}
