package org.example;

import org.example.util.DatabaseConnection;

import java.sql.*;


public class Main {
    public static void main(String[] args) throws SQLException {
        try(Connection myConn = DatabaseConnection.getInstance();
            Statement myStmt = myConn.createStatement();
            ResultSet myRes = myStmt.executeQuery("SELECT * FROM employees")){
            while (myRes.next()){
                System.out.println(myRes.getString("first_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error de conexion");
        }

    }
}