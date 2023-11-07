/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import static Data.giaovienData.ps;
import static Data.hocvienData.ps;
import Object.Admin;
import Object.giaovien;
import Object.hocvien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;


/**
 *
 * @author An Nhien
 */
public class AdminData {
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public Admin dangNhap(String taiKhoan, String pass) {
        Admin ad = null;
        try{
            ps = connect.getConnect().prepareStatement("SELECT * FROM Admin where ID = ? and Password=?");
            ps.setString(1, taiKhoan);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while(rs.next()) {
                ad = new Admin();
               // kh.setMaKH(rs.getString("Ma_Khach_hang"));
               // kh.setPass(rs.getString("Password"));
                
            }
        }
        catch(Exception e) {
            return ad = null;
        }
        return ad;
    }
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
        
    }
    
    public boolean UpdateAdmin(Admin ad) {
        try {
            ps = connect.getConnect().prepareStatement("UPDATE Admin SET Password = ? where ID = ?");
            ps.setString(2, ad.getMaAdmin());
            ps.setString(1, ad.getPassword());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteAdmin(String maAd) {
        try {
            ps = connect.getConnect().prepareStatement("DELETE FROM Admin WHERE ID = ?");
            ps.setString(1, maAd);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
