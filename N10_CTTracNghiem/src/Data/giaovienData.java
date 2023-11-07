/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Object.giaovien;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author An Nhien
 */
public class giaovienData {
       public static PreparedStatement ps;
    public static ResultSet rs;
//    public giaovien dangNhap(String taiKhoan, String pass) {
//        giaovien gv=null;
//        try{
//
//            ps = connect.getConnect().prepareStatement("SELECT * FROM tbGiaoVien where IDGv = ? and Pass=?");
//            ps.setString(1, taiKhoan);
//            ps.setString(2, pass);
//            rs = ps.executeQuery();
//            while(rs.next()) {
//                gv = new giaovien();
//               // kh.setMaKH(rs.getString("Ma_Khach_hang"));
//               // kh.setPass(rs.getString("Password"));
//                gv.setName(rs.getString("TenGv"));
//                gv.setNgaysinh(rs.getDate("NgaySinh_Gv"));
//                gv.setGioitinh(rs.getString("GioiTinh"));
//                gv.setCMDN(rs.getString("CMND_CCCD"));
//                gv.setEmail(rs.getString("Email_Gv"));
//                gv.setDiachi(rs.getString("DiaChi_Gv"));
//                gv.setPhone(rs.getString("SDT_Gv"));
//            }
//        }
//        catch(Exception e) {
//            return gv = null;
//        }
//        return gv;
//    }
    
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
     public static void InsertGiaoVien(giaovien gv) {
        String sql = "insert into tbGiaoVien values(?,?,?,?,?,?,?,?)";
        try {
            ps = connect.getConnect().prepareStatement(sql);
            ps.setString(1, gv.getMagv());
          
            ps.setString(3, gv.getName());
            ps.setDate(4, gv.getNgaysinh());
            ps.setString(5, gv.getGioitinh());
            ps.setString(6, gv.getCMDN());
            ps.setString(7, gv.getEmail());
            ps.setString(8, gv.getDiachi());
            ps.setString(9, gv.getPhone());
           // ps.setString(7, "Nguyễn Hoàng Hải");
            ps.execute();
            JOptionPane.showMessageDialog(null, "Bạn muốn thêm thông tin giáo viên ?" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Giáo viên không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdateGiaoVien(giaovien gv) {
        try {
            ps = connect.getConnect().prepareStatement("UPDATE tbGiaoVien SET  TenGv = ?,"
                    + "NgaySinh_Gv = ?,GioiTinh=?,CMND_CCCD=?,Email_Gv=?, DiaChi_Gv = ?, SDT_Gv = ? where IDGv = ?");
            ps.setString(9, gv.getMagv());
            
            ps.setString(2, gv.getName());
            ps.setDate(3, gv.getNgaysinh());
            ps.setString(4, gv.getGioitinh());
            ps.setString(5, gv.getCMDN());
            ps.setString(6, gv.getEmail());
            ps.setString(7, gv.getDiachi());
            ps.setString(8, gv.getPhone());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteGiaoVien(String mgv) {
        try {
            ps = connect.getConnect().prepareStatement("DELETE FROM tbGiaoVien WHERE IDGv = ?");
            ps.setString(1, mgv);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
    
}