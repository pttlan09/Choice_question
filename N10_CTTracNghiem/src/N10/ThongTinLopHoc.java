/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N10;

import java.util.Date;

/**
 *
 * @author An Nhien
 */
public class ThongTinLopHoc {
    String IDLop,IDGV,IDHV,IDMon;
    Date NgayBatDau,NgayKetThuc;
    public ThongTinLopHoc()
    {
        
    }

    public ThongTinLopHoc(String IDLop, String IDGV, String IDHV, String IDMon, Date NgayBatDau, Date NgayKetThuc) {
        this.IDLop = IDLop;
        this.IDGV = IDGV;
        this.IDHV = IDHV;
        this.IDMon = IDMon;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
    }

    public ThongTinLopHoc(String IDGV, String IDHV, String IDMon, Date NgayBatDau, Date NgayKetThuc) {
        this.IDGV = IDGV;
        this.IDHV = IDHV;
        this.IDMon = IDMon;
        this.NgayBatDau = NgayBatDau;
        this.NgayKetThuc = NgayKetThuc;
    }

    public String getIDLop() {
        return IDLop;
    }

    public void setIDLop(String IDLop) {
        this.IDLop = IDLop;
    }

    public String getIDGV() {
        return IDGV;
    }

    public void setIDGV(String IDGV) {
        this.IDGV = IDGV;
    }

    public String getIDHV() {
        return IDHV;
    }

    public void setIDHV(String IDHV) {
        this.IDHV = IDHV;
    }

    public String getIDMon() {
        return IDMon;
    }

    public void setIDMon(String IDMon) {
        this.IDMon = IDMon;
    }

    public Date getNgayBatDau() {
        return NgayBatDau;
    }

    public void setNgayBatDau(Date NgayBatDau) {
        this.NgayBatDau = NgayBatDau;
    }

    public Date getNgayKetThuc() {
        return NgayKetThuc;
    }

    public void setNgayKetThuc(Date NgayKetThuc) {
        this.NgayKetThuc = NgayKetThuc;
    }
    
}
