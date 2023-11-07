/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.sql.Date;

/**
 *
 * @author An Nhien
 */
public class hocvien {
    private String mahv;
   
    private String name;
    private Date ngaysinh;
    private String gioitinh;
    private String email;
    private String diachi;
    private String phone;
   public hocvien()
   {
       
   }

    public hocvien(String mahv, String name, Date ngaysinh, String gioitinh, String email, String diachi, String phone) {
        this.mahv = mahv;
        
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.email = email;
        this.diachi = diachi;
        this.phone = phone;
    }

    public String getMahv() {
        return mahv;
    }

    public void setMahv(String mahv) {
        this.mahv = mahv;
    }

  

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(Date ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
   
}
