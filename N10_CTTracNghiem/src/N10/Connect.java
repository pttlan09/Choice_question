/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N10;

import java.sql.Connection;
//import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author An Nhien
 */
public class Connect {
 
    public Connection getConnection(){
        Connection conn=null;
        try{
           java.security.Security.setProperty("jdk.tls.disabledAlgorithms", "SSLv3, RC4, MD5withRSA, DH keySize < 768, EC keySize < 224");
            
          Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            conn=DriverManager.getConnection(" jdbc:sqlserver://localhost:1433;databaseName=CTTracNghiem;user=sa;password=123456");
            
            if(conn!=null){
                System.out.println("ket noi thanh cong");
            }
        }catch(Exception ex){
            System.out.println(ex.toString());
        }return conn;
    }
}