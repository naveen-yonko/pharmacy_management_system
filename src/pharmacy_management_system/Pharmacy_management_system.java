/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pharmacy_management_system;

/**
 *
 * @author Naveen
 */
public class Pharmacy_management_system {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Launch the login form
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new login().setVisible(true);
            }
        });
    }
    
}
