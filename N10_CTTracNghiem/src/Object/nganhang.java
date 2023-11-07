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
public class nganhang {
    private int macauhoi;
    private String made;
    private String mamon;
    private String cauhoi;
    private String DA1;
    private String DA2;
    private String DA3;
    private String DA4;
    private String DA;
  
    public nganhang()
    {
        
    }

    public nganhang(int macauhoi, String made, String mamon, String cauhoi, String DA1, String DA2, String DA3, String DA4, String DA) {
        this.macauhoi = macauhoi;
        this.made = made;
        this.mamon = mamon;
        this.cauhoi = cauhoi;
        this.DA1 = DA1;
        this.DA2 = DA2;
        this.DA3 = DA3;
        this.DA4 = DA4;
        this.DA = DA;
    }

    public int getMacauhoi() {
        return macauhoi;
    }

    public void setMcauhoi(int macauhoi) {
        this.macauhoi = macauhoi;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }
    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getCauhoi() {
        return cauhoi;
    }

    public void setCauhoi(String cauhoi) {
        this.cauhoi = cauhoi;
    }

    public String getDA1() {
        return DA1;
    }

    public void setDA1(String DA1) {
        this.DA1 = DA1;
    }

    public String getDA2() {
        return DA2;
    }

    public void setDA2(String DA2) {
        this.DA2 = DA2;
    }

    public String getDA3() {
        return DA3;
    }

    public void setDA3(String DA3) {
        this.DA3 = DA3;
    }

    public String getDA4() {
        return DA4;
    }

    public void setDA4(String DA4) {
        this.DA4 = DA4;
    }

    public String getDA() {
        return DA;
    }

    public void setDA(String DA) {
        this.DA = DA;
    }
    
}
