/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.ketqua;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
/**
 *
 * @author An Nhien
 */
public class ketquaData {
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
         public static void Insertketqua(ketqua kq) {
        String sql = "insert into tbKetQua values(?,?,?,?)";
        try {
            ps = connect.getConnect().prepareStatement(sql);
            ps.setString(1, kq.getIdhocvienString());
            ps.setString(2, kq.getMade());
            ps.setString(3, kq.getTende());
            ps.setString(4, kq.getTende());
            
            ps.execute();
            JOptionPane.showMessageDialog(null, "Bạn muốn thêm thông tin kết quả ?" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Kết quả không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean Updateketqua(ketqua kq) {
        try {
            ps = connect.getConnect().prepareStatement("UPDATE tbKetQua SET Diem=? WHERE IDDe = ? and  IDHv = ? ");
            ps.setString(2, kq.getMade());
            ps.setString(3, kq.getIdhocvienString());
            ps.setString(1, kq.getDiem());
            
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean Deleteketqua(String mkq) {
        try {
            ps = connect.getConnect().prepareStatement("DELETE FROM tbKetQua WHERE IDHv = ?");
            ps.setString(1, mkq);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}

