/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N10;

//import java.util.Date;
import javax.swing.Timer;

/**
 *
 * @author An Nhien
 */
public class GV {
    String idgv,hotengv,gioitinh,cmnd,email,diachi,sdt, ngaysinh;
   public GV(){
       
   }

    public GV(String idgv, String hotengv, String gioitinh, String cmnd, String email, String diachi, String sdt, String ngaysinh) {
//        this.idgv = idgv;
        this.hotengv = hotengv;
        this.gioitinh = gioitinh;
        this.cmnd = cmnd;
        this.email = email;
        this.diachi = diachi;
        this.sdt = sdt;
        this.ngaysinh = ngaysinh;
    }

//    public GV(String hotengv, String gioitinh, String cmnd, String email, String diachi, String sdt, Date ngaysinh) {
//        this.hotengv = hotengv;
//        this.gioitinh = gioitinh;
//        this.cmnd = cmnd;
//        this.email = email;
//        this.diachi = diachi;
//        this.sdt = sdt;
//        this.ngaysinh = ngaysinh;
//    }

//    GV(String id, String hoten, String ngaysinh, String gioitinh, String cmnd, String diachi, String email, String sdt) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public String getIdgv() {
        return idgv;
    }

    public void setIdgv(String idgv) {
        this.idgv = idgv;
    }

    public String getHotengv() {
        return hotengv;
    }

    public void setHotengv(String hotengv) {
        this.hotengv = hotengv;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }
    
}
    