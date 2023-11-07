/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Object;

/**
 *
 * @author An Nhien
 */
public class lophoc {
    private String malop;
    private String tenlop;
    private String ghichu;
    public lophoc()
    {
        
    }

    public lophoc(String malop, String tenlop, String ghichu) {
        this.malop = malop;
        this.tenlop = tenlop;
        this.ghichu = ghichu;
    }

    public String getMalop() {
        return malop;
    }

    public void setMalop(String malop) {
        this.malop = malop;
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
