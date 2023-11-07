/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;



import Object.monhoc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author An Nhien
 */
public class monhocData {
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
    
     public static void InsertMon(monhoc m) {
        String sql = "insert into tbMonHoc values(?,?,?)";
        try {
            ps = connect.getConnect().prepareStatement(sql);
            ps.setString(1, m.getMamon());
            ps.setString(2, m.getTenmon());
            ps.setString(3, m.getGhichu());
           
            ps.execute();
            JOptionPane.showMessageDialog(null, "Bạn muốn thêm thông tin môn học ?" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Môn học không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdateMon(monhoc m) {
        try {
            ps = connect.getConnect().prepareStatement("UPDATE tbMonHoc SET  TenMon = ?, ghichu = ?  WHERE IDMon = ?");
            ps.setString(3, m.getMamon());
            ps.setString(1, m.getTenmon());
            ps.setString(2, m.getGhichu());
            
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
             
    }
    
    public boolean DeleteMon(String mm) {
        try {
            ps = connect.getConnect().prepareStatement("DELETE FROM tbMonHoc WHERE IDMon = ?");
            ps.setString(1, mm);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
