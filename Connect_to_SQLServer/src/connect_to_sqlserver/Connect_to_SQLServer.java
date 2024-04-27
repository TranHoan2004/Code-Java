/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connect_to_sqlserver;

import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author ADMIN
 */
public class Connect_to_SQLServer {
    /**
     * @param args the command line arguments
     */    
    public static void main(String[] args) {
        // TODO code application logic here
        String url = "jdbc:sqlserver://localhost:1433;databaseName=myDatabase";
        String server = "LAPTOP-H0L0INL8\\SQLEXPRESS";
        String user = "sa";
        String password = "hoan2709";
        int port = 1433;
        String db = "myDatabase";
        SQLServerDataSource ds= new SQLServerDataSource();
        ds.setUser(user);
        ds.setPassword(password);
        ds.setServerName(server);
        ds.setDatabaseName(db);
        ds.setPortNumber(port);
        try (Connection conn = ds.getConnection()) {
            System.out.println("Connection successfully");
            System.out.println(conn.getCatalog());
        } catch (SQLException ex) {
            //Logger.getLogger(Connect_to_SQLServer.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } 
        try {
            //connect to database
            Connection conn = getConnection(url, user, password);
            //create statement
            Statement stm = conn.createStatement();
//            //get data from table
            
            String sqlInsert = "insert into myTable values (1,'L',21)";
            stm.executeUpdate(sqlInsert);
            ResultSet rs = stm.executeQuery("select*from myTable");
            //show data
            while(rs.next()) {
                System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3));
            }
            //close connection
            conn.close();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
    }
    public static Connection getConnection(String url, String user, String password) {
        Connection conn = null;
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection(url, user, password);
            System.out.println("Connect successfully");
        } catch(Exception ex) {
            System.out.println("Connect failure!");
            ex.printStackTrace();
        }
        return conn;
    }
}
