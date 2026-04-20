/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usersystem;

/**
 *
 * @author USER
 */
public class UserSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (DBConnection.getConnection() != null) {
            // This line makes your window appear!
            new LoginFrame().setVisible(true);
        } else {
            System.out.println("Connection Failed.");
        }
    }
    
}
