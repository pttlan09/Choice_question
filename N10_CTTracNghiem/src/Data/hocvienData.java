/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import Object.hocvien;
/**
 *
 * @author An Nhien
 */
public class hocvienData {
    public static PreparedStatement ps;
    public static ResultSet rs;
//    public hocvien dangNhap(String taiKhoan, String pass) {
//        hocvien hv=null;
//        try{
//
//            ps = connect.getConnect().prepareStatement("SELECT * FROM tbHocVien where IDHv = ? and Pass=?");
//            ps.setString(1, taiKhoan);
//            ps.setString(2, pass);
//            rs = ps.executeQuery();
//            while(rs.next()) {
//                hv = new hocvien();
//               // kh.setMaKH(rs.getString("Ma_Khach_hang"));
//               // kh.setPass(rs.getString("Password"));
//                hv.setName(rs.getString("TenHv"));
//                hv.setNgaysinh(rs.getDate("NgaySinh_Hv"));
//                hv.setGioitinh(rs.getString("GioiTinh"));
//                hv.setEmail(rs.getString("Email_Hv"));
//                hv.setDiachi(rs.getString("DiaChi_Hv"));
//                hv.setPhone(rs.getString("SDT_Hv"));
//            }
//        }
//        catch(Exception e) {
//            return hv = null;
//        }
//        return hv;
//    }
    
    
    public static ResultSet showTextfield(String sql) {
        try {
            ps = connect.getConnect().prepareStatement(sql);
            return ps.executeQuery();
        } catch (Exception e) {
            return null;
        }
    }
    
     public static void InsertHocVien(hocvien hv) {
        String sql = "insert into tbHocVien values(?,?,?,?,?,?,?)";
        try {
            ps = connect.getConnect().prepareStatement(sql);
            ps.setString(1, hv.getMahv());
            
            ps.setString(3, hv.getName());
            ps.setDate(4, hv.getNgaysinh());
            ps.setString(5, hv.getGioitinh());
            ps.setString(6, hv.getEmail());
            ps.setString(7, hv.getDiachi());
            ps.setString(8, hv.getPhone());
           // ps.setString(7, "Nguyễn Hoàng Hải");
            ps.execute();
            JOptionPane.showMessageDialog(null, "Bạn muốn thêm thông tin học viên ?" , "Thông báo", 1);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Học viên không được thêm" , "Thông báo", 1);
        }
    }
    
    public boolean UpdateHocVien(hocvien hv) {
        try {
            ps = connect.getConnect().prepareStatement("UPDATE tbHocVien SET  TenHv = ?,"
                    + "NgaySinh_Hv = ?,GioiTinh=?,Email_Hv=?, DiaChi_Hv = ?, SDT_Hv = ? where IDHv = ?");
            ps.setString(8, hv.getMahv());
           
            ps.setString(2, hv.getName());
            ps.setDate(3, hv.getNgaysinh());
            ps.setString(4, hv.getGioitinh());
            ps.setString(5, hv.getEmail());
            ps.setString(6, hv.getDiachi());
            ps.setString(7, hv.getPhone());
            return ps.executeUpdate() >0;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean DeleteHocVien(String mahv) {
        try {
            ps = connect.getConnect().prepareStatement("DELETE FROM tbHocVien WHERE IDHv = ?");
            ps.setString(1, mahv);
            return ps.executeUpdate() >0;
        } catch(Exception e) {
            return false;
        }
    }
    
}