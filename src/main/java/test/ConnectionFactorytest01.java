package test;

import conn.ConnectionFactory;

import java.sql.SQLException;

public class ConnectionFactorytest01 {
    public static void main(String[] args) throws SQLException {
        ConnectionFactory.getConnection();
    }
}
