/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
/**
 *
 * @author An Nhien
 */
public class databasehelper {
    public static Connection  openconnection() throws Exception{
        java.security.Security.setProperty("jdk.tls.disabledAlgorithms", "SSLv3, RC4, MD5withRSA, DH keySize < 768, EC keySize < 224");
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        String connectionUrl="jdbc:sqlserver://localhost:1433;databaseName=CTTracNghiem";
        String dbusername="sa";
        String password="123456";
        Connection con=DriverManager.getConnection(connectionUrl,dbusername,password);
        return con;
    }
    
}
// public static Connection getConnect(){
//        try {
//            java.security.Security.setProperty("jdk.tls.disabledAlgorithms", "SSLv3, RC4, MD5withRSA, DH keySize < 768, EC keySize < 224");
//           
//            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
//            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CTTracNghiem;Username=sa;Password = 123456");
//           // con = DriverManager.getConnection("jdbc:sqlserver://localhost:59739;databaseName=CTTracNghiem;Username=sa;Password = 1234567");
//           
//        } catch (Exception e) {
//            System.out.println("Kết nối không thành công");
//        }
//        return con;
//    }
//    public static String testConnect() {
//        try{
//            con = connect.getConnect();
//            return "Kết nối thành công";
//        }
//        catch(Exception e) {
//            return "Kết nối thất bại";
//        }
//    } 