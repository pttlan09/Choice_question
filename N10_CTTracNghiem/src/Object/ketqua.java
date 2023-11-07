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
public class ketqua {
    private String made;
    private String tende;
    private String idhocvienString;
    private String diem;
    public ketqua()
    {
    }

    public ketqua(String made, String tende, String idhocvienString, String diem) {
        this.made = made;
        this.tende = tende;
        this.idhocvienString = idhocvienString;
        this.diem = diem;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public String getTende() {
        return tende;
    }

    public void setTende(String tende) {
        this.tende = tende;
    }

    public String getIdhocvienString() {
        return idhocvienString;
    }

    public void setIdhocvienString(String idhocvienString) {
        this.idhocvienString = idhocvienString;
    }

    public String getDiem() {
        return diem;
    }

    public void setDiem(String diem) {
        this.diem = diem;
    }

    
}
