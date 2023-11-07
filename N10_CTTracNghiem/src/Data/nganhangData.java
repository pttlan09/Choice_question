/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.nganhang;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author An Nhien
 */
public class nganhangData {
    
   
    public static PreparedStatement ps;
    public static ResultSet rs;
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
    public static void Insernganhang(nganhang nh) {
        String sql = "insert into tbNganHang values(?,?,?,?,?,?,?,?,?)";
        try {
            ps = connect.getConnect().prepareStatement(sql);
            
            ps.setInt(1, nh.getMacauhoi());
            ps.setString(2, nh.getMade());
            ps.setString(3, nh.getMamon());
            ps.setString(4, nh.getCauhoi());
            ps.setString(5, nh.getDA1());
            ps.setString(6, nh.getDA2());
            ps.setString(7, nh.getDA3());
            ps.setString(8,nh.getDA4());
            ps.setString(9,nh.getDA());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Bạn muốn thêm câu hỏi ?" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Câu hỏi không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean Updatenganhang(nganhang nh) {
        try {
            ps = connect.getConnect().prepareStatement("UPDATE tbNganHang SET IDDe = ? , IDMon = ? ,"
                    +"CauHoi = ?,DA1=?,DA2=?,DA3=?,DA4=?,DA=? WHERE  IDCauHoi = ?");
            
            ps.setInt(9, nh.getMacauhoi());
            ps.setString(1, nh.getMade());
            ps.setString(2, nh.getMamon());
            ps.setString(3, nh.getCauhoi());
            ps.setString(4,nh.getDA1());
            ps.setString(5, nh.getDA2());
            ps.setString(6, nh.getDA3());
            ps.setString(7, nh.getDA4());
            ps.setString(8, nh.getDA());
            
            
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }

    }
    
    public boolean Deletenganhang(int mnh) {
        try {
            ps = connect.getConnect().prepareStatement("DELETE FROM tbNganHang WHERE IDCauHoi = ?");
            ps.setInt(1, mnh);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }

}