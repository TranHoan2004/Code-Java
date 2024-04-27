/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package connecttosql;
import com.microsoft.sqlserver.jdbc.SQLServerDataSource;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author ADMIN
 */
public class ConnectToSQL {

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
        ds.setDatabaseName(db);
        ds.setServerName(server);
        ds.setPortNumber(port);
        try (Connection conn = ds.getConnection()) {
            System.out.println("Connection successfully");
            System.out.println(conn.getCatalog());
        } catch (SQLException ex) {
            //Logger.getLogger(Connect_to_SQLServer.class.getName()).log(Level.SEVERE, null, ex);
            ex.printStackTrace();
        } 
    }
}
