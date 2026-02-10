    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author Naveen
 */
public class tables {
    public static void main(String args[]){
        Connection con  = null;
        Statement stmt = null;
        try{
            con = connectionprovider.getcon();
            stmt = con.createStatement();
            //stmt.executeUpdate("create table app_user(app_user_pk int AUTO_INCREMENT primary key ,userRole varchar(50),name varchar(69),mobile_no varchar(50),password varchar(25),address varchar(200),status varchar(50))");
            stmt.executeUpdate("insert into app_user(userRole,name,mobile_no,password,address,status) values('admin','shanks','123696789','password',' dwelling in system','active' )");
            JOptionPane.showMessageDialog(null,"TABLE CREATED SUCCESSFULLY");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            
        }
        finally{
            try{
                con.close();
                stmt.close();
            }
            catch(Exception e){
                System.out.println("SQL EXCEPTION");
                
            }
        }
    }
}
