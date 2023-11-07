/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.thongtinlop;
import Object.giaovien;
import Object.hocvien;
import Object.lophoc;
import Object.monhoc;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.Date;

/**
 *
 * @author An Nhien
 */
public class thongtinlophocData {
    
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
    
    public static void Insertttlop(thongtinlop ttlop) {
        String sql = "insert into ThongTinLopHoc values(?,?,?,?,?,?)";
        try {
            ps = connect.getConnect().prepareStatement(sql);
            ps.setString(1, ttlop.getMalop());
            ps.setString(2, ttlop.getMagv());
            ps.setString(3, ttlop.getMahv());
            ps.setString(4, ttlop.getMamon());
            ps.setDate(5, (Date) ttlop.getNgaybatdau());
            ps.setDate(6, (Date) ttlop.getNgayketthuc());
           
           
            ps.execute();
            JOptionPane.showMessageDialog(null, "Bạn muốn thêm thông tin lớp học ?" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Thông tin lớp học không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean Updatettlop(thongtinlop ttlop) {
        try {
            ps = connect.getConnect().prepareStatement("UPDATE ThongTinLopHoc SET  IDLop = ?, IDGv = ? IDHv = ?,IDMon=?,"
            +"NgayBatDau=?,NgayKetThuc=?");
            ps.setString(6, ttlop.getMalop());
            ps.setString(1, ttlop.getMagv());
            ps.setString(2, ttlop.getMahv());
            ps.setString(3,ttlop.getMamon() );
            ps.setDate(4, (Date) ttlop.getNgaybatdau());
             ps.setDate(5, (Date) ttlop.getNgayketthuc());
            
            
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
//     
    }
    
    public boolean Deletettlop(String mttlop) {
        try {
            ps = connect.getConnect().prepareStatement("DELETE FROM ThongTinLopHoc WHERE IDLop = ?");
            ps.setString(1, mttlop);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }

}

