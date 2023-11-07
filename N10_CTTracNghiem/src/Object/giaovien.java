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
public class giaovien {
   private String magv;
   
    private String name;
    private Date ngaysinh;
    private String gioitinh;
    private String CMDN;
    private String email;
    private String diachi;
    private String phone;
    public giaovien()
    {
        
    }

    public giaovien(String magv,String name, Date ngaysinh, String gioitinh, String CMDN, String email, String diachi, String phone) {
        this.magv = magv;
       
        this.name = name;
        this.ngaysinh = ngaysinh;
        this.gioitinh = gioitinh;
        this.CMDN = CMDN;
        this.email = email;
        this.diachi = diachi;
        this.phone = phone;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
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

    public String getCMDN() {
        return CMDN;
    }

    public void setCMDN(String CMDN) {
        this.CMDN = CMDN;
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

        