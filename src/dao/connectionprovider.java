/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;
/**
 *
 * @author Naveen
 */
public class connectionprovider{
public static Connection getcon(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        return getConnectionFromConfig();
    }
    catch(Exception e){
    System.out.println(e+"here");
    return null;
    }
}

private static Connection getConnectionFromConfig() throws Exception{
    Properties props = new Properties();
    try (InputStream in = connectionprovider.class.getResourceAsStream("/dao/db.properties")) {
        if (in != null) {
            props.load(in);
        }
    }

    String url = firstNonEmpty(System.getenv("DB_URL"), props.getProperty("db.url"),
            "jdbc:mysql://localhost:3306/pharmacy?useSSL=false");
    String user = firstNonEmpty(System.getenv("DB_USER"), props.getProperty("db.user"), "root");
    String pass = firstNonEmpty(System.getenv("DB_PASSWORD"), props.getProperty("db.password"), "");

    return DriverManager.getConnection(url, user, pass);
}

private static String firstNonEmpty(String primary, String secondary, String fallback){
    if (primary != null && !primary.trim().isEmpty()) {
        return primary.trim();
    }
    if (secondary != null && !secondary.trim().isEmpty()) {
        return secondary.trim();
    }
    return fallback;
}
}
