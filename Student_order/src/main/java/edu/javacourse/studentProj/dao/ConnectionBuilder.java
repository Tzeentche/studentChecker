package edu.javacourse.studentProj.dao;

import edu.javacourse.studentProj.config.Config;

import java.sql.*;

public class ConnectionBuilder {

    public static Connection getConnection() throws SQLException {
        Connection con = DriverManager.getConnection(
                Config.getProperty(Config.DB_URL),
                Config.getProperty(Config.DB_LOGIN),
                Config.getProperty(Config.DB_PASSWORD));
        return con;
    }
}
