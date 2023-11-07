/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N10;

/**
 *
 * @author An Nhien
 */
public class MH {
    String idmon,tenlop,ghichu;
    public MH()
    {
        
    }

    public MH(String idmon, String tenlop, String ghichu) {
        this.idmon = idmon;
        this.tenlop = tenlop;
        this.ghichu = ghichu;
    }

    public String getIdmon() {
        return idmon;
    }

    public void setIdmon(String idmon) {
        this.idmon = idmon;
    }

    public String getTenlop() {
        return tenlop;
    }

    public void setTenlop(String tenlop) {
        this.tenlop = tenlop;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    
}
