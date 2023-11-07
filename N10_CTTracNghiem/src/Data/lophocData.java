/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.lophoc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author An Nhien
 */
public class lophocData {
     
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
    
     public static void InsertLop(lophoc l) {
        String sql = "insert into tbLopHoc values(?,?,?)";
        try {
            ps = connect.getConnect().prepareStatement(sql);
            ps.setString(1, l.getMalop());
            ps.setString(2, l.getTenlop());
            ps.setString(3, l.getGhichu());
           
            ps.execute();
            JOptionPane.showMessageDialog(null, "Bạn muốn thêm thông tin lớp học ?" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Lớp học không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdateLop(lophoc l) {
        try {
            ps = connect.getConnect().prepareStatement("UPDATE tbLopHoc SET  TenLop = ?, ghichu = ? WHERE IDLop = ?");
            ps.setString(3, l.getMalop());
            ps.setString(1, l.getTenlop());
            ps.setString(2, l.getGhichu());
            
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteLop(String ml) {
        try {
            ps = connect.getConnect().prepareStatement("DELETE FROM tbLopHoc WHERE IDLop = ?");
            ps.setString(1, ml);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
}
