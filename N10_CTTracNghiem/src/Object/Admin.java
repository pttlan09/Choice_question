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
public class Admin {
    
  private String maAdmin;
    private String password;
    
    public Admin() {
        
    }
    public Admin(String maAdmin, String password) {
        this.maAdmin = maAdmin;
        this.password = password;
    }
    
    public String getMaAdmin() {
        return maAdmin;
    }
    public void setMaAdmin(String maAdmin) {
        this.maAdmin = maAdmin;
    }
    
    public String getPassword() {
        return password;
    }
    public void setPassword(String pass) {
        this.password = pass;
    }
}
