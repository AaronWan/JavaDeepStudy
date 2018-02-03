package com.aita.db;

import java.sql.*;

/**
 * Created by Aita on 18/2/3.
 */
public class JDBCTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/book_manager", "root", "123456");
        PreparedStatement pstm = connection.prepareStatement("select * from book");
        ResultSet result = pstm.executeQuery();
        while (result.next()){
            System.out.println(result.getNString("name"));
        }

    }
}
