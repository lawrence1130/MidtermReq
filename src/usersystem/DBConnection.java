package usersystem;

import java.sql.Connection;
import java.sql.DriverManager;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
public class DBConnection {
    public static Connection getConnection() {
        try {
            // This line is what matches the Library you added
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            
            // Make sure "user_db" exists in your XAMPP/MySQL
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
        } catch (Exception e) {
            System.out.println("Driver not found: " + e.getMessage());
            return null;
        }
    }
}
