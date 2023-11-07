/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

import java.util.Date;

/**
 *
 * @author An Nhien
 */
public class thongtinlop {
    private String malop;
    private String magv;
    private String mahv;
    private String mamon;
    private Date ngaybatdau;
    private Date ngayketthuc;
    public thongtinlop()
    {
        
    }

    public thongtinlop(String malop, String magv, String mahv, String mamon, Date ngaybatdau, Date ngayketthuc) {
        this.malop = malop;
        this.magv = magv;
        this.mahv = mahv;
        this.mamon = mamon;
        this.ngaybatdau = ngaybatdau;
        this.ngayketthuc = ngayketthuc;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
    }

    public String getMagv() {
        return magv;
    }

    public void setMagv(String magv) {
        this.magv = magv;
    }

    public String getMahv() {
        return mahv;
    }

    public void setMahv(String mahv) {
        this.mahv = mahv;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public Date getNgaybatdau() {
        return ngaybatdau;
    }

    public void setNgaybatdau(Date ngaybatdau) {
        this.ngaybatdau = ngaybatdau;
    }

    public Date getNgayketthuc() {
        return ngayketthuc;
    }

    public void setNgayketthuc(Date ngayketthuc) {
        this.ngayketthuc = ngayketthuc;
    }
    
}
