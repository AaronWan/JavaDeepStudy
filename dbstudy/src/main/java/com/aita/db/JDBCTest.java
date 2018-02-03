package com.aita.db;

import java.sql.*;

/**
 * Created by Aita on 18/2/3.
 */
public class JDBCTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("");
        PreparedStatement pstm = connection.prepareStatement("");
        ResultSet result = pstm.executeQuery();
        while (result.next()){
            result.getString(1);
        }

    }
}
