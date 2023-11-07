/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;
import Object.taikhoan;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author An Nhien
 */
public class taikhoanDao {
  
    public taikhoan CheckLogin(String tendangnhap,String matkhau) 
        {
//        String sql="select ID,matkhau,vaitro from taikhoan "
//                + " Where ID=? and matkhau=?";
//        try(
//               Connection con=databasehelper.openconnection();
//                //ps = connect.getConnect().prepareStatement("SELECT * FROM taikhoan where ID = ? and matkhau=?");
//              PreparedStatement ps = connect.getConnect().prepareStatement(sql);
//                
//            ){
//            ps.setString(1, tendangnhap);
//            ps.setString(2, matkhau);
//            
//        
//        try(ResultSet rs = ps.executeQuery();){
//            if(rs.next()){
//                taikhoan tk=new taikhoan();
//                tk.setTendangnhap(tendangnhap);
//                //tk.setMatkhau(m);
//                tk.setVaitro(rs.getString("vaitro"));
//                return tk;
//            }
//        }
//            
//        }
//        return null;
try {
        String sql="select ID,matkhau,vaitro from taikhoan Where ID=? and matkhau=?"; 
                 
          Connection con=connect.getConnect();
         PreparedStatement ps = con.prepareStatement(sql);
           ps.setString(1, tendangnhap);
           ps.setString(2, matkhau);
           try{
               ResultSet rs = ps.executeQuery();
               
               if(rs.next()){
                taikhoan tk=new taikhoan();
                tk.setTendangnhap(tendangnhap);
                //tk.setMatkhau(m);
                tk.setVaitro(rs.getString("vaitro"));
              
                return tk;
             }
           }    catch (Exception e) {
               
           }
        
        } catch (Exception e) {
            
        }
return null;
    }    
}
            
    

