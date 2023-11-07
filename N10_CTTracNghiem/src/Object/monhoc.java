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
public class monhoc {
    private String mamon;
    private String tenmon;
    private String ghichu;
    public monhoc()
    {
        
    }

    public monhoc(String mamon, String tenmon, String ghichu) {
        this.mamon = mamon;
        this.tenmon = tenmon;
        this.ghichu = ghichu;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getTenmon() {
        return tenmon;
    }

    public void setTenmon(String tenmon) {
        this.tenmon = tenmon;
    }

    public String getGhichu() {
        return ghichu;
    }

    public void setGhichu(String ghichu) {
        this.ghichu = ghichu;
    }
    
}
