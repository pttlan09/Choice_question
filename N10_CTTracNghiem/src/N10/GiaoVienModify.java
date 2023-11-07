/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N10;

//import com.sun.jdi.connect.spi.Connection;
//import java.awt.List;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DatabaseMetaData;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;
import java.sql.Date;
import N10.Connect;
/**
 *
 * @author An Nhien
 */
public class GiaoVienModify {

    public static List<GV> findAll() {
        List<GV> gvList = new ArrayList<>();
        Connection connection = null;
        Statement statement = null;
        try {
            //lay all ds gv
//            java.security.Security.setProperty("jdk.tls.disabledAlgorithms", "SSLv3, RC4, MD5withRSA, DH keySize < 768, EC keySize < 224");
//            
//                  connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CTTracNghiem;user=sa;password=123456");
            Connect a=new Connect();
            Connection conn=a.getConnection();
            //query
            String sql = "select * from tbGiaoVien";
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                GV gv = new GV(resultSet.getString("IDGv"), resultSet.getString("TenGv"), resultSet.getString("GioiTinh"), resultSet.getString("CMND_CCCD"), resultSet.getString("Email_Gv"), resultSet.getString("Diachi_Gv"), resultSet.getString("SDT_Gv"), resultSet.getString("NgaySinh_Gv"));
                gvList.add(gv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ketthuc
        return gvList;
    }

    public static void insert(GV gv) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay all ds gv
//            java.security.Security.setProperty("jdk.tls.disabledAlgorithms", "SSLv3, RC4, MD5withRSA, DH keySize < 768, EC keySize < 224");
//            
//                 connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CTTracNghiem;user=sa;password=123456");
  Connect a=new Connect();
            Connection conn=a.getConnection();
            //query
            String sql = "insert into tbGiaoVien(IDGv,TenGv,NgaySinh_Gv,GioiTinh,CMND_CCCD,Email_Gv,Diachi_Gv,SDT_Gv)values(?,?,?,?,?,?,?,?)";
            statement = connection.prepareCall(sql);
            statement.setString(1, gv.getIdgv());
            statement.setString(2, gv.getHotengv());
            statement.setString(3, gv.getNgaysinh());
            statement.setString(4, gv.getGioitinh());
            statement.setString(5, gv.getCmnd());
            statement.setString(6, gv.getEmail());
            statement.setString(7, gv.getDiachi());
            statement.setString(8, gv.getSdt());

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ketthuc

    }

    public static void update(GV gv) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay all ds gv
//            java.security.Security.setProperty("jdk.tls.disabledAlgorithms", "SSLv3, RC4, MD5withRSA, DH keySize < 768, EC keySize < 224");
//            
//                 connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CTTracNghiem;user=sa;password=123456");
  Connect a=new Connect();
            Connection conn=a.getConnection();
            //query
            String sql = "update tbGiaovien set TenGv=?,NgaySinh_Gv=?,GioiTinh=?,CMND_CCCD=?,Email_Gv=?,Diachi_Gv=?,SDT_Gv=? where IDGv=?";
            statement = connection.prepareCall(sql);

            statement.setString(1, gv.getHotengv());
            statement.setString(2, gv.getNgaysinh());
            statement.setString(3, gv.getGioitinh());
            statement.setString(4, gv.getCmnd());
            statement.setString(5, gv.getEmail());
            statement.setString(6, gv.getDiachi());
            statement.setString(7, gv.getSdt());
            statement.setString(8, gv.getIdgv());

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    //ketthuc 

    public static void delete(GV gv) {
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay all ds gv
//            java.security.Security.setProperty("jdk.tls.disabledAlgorithms", "SSLv3, RC4, MD5withRSA, DH keySize < 768, EC keySize < 224");
//            
//                connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CTTracNghiem;user=sa;password=123456");
  Connect a=new Connect();
            Connection conn=a.getConnection();
            //query
            String sql = "delete tbGiaovien where IDGv=?";
            statement = connection.prepareCall(sql);

            statement.setString(1, gv.getIdgv());

            statement.execute();

        } catch (SQLException ex) {
            Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    //ketthuc 

    public static List<GV> findname(String hotengv) {
        List<GV> gvList = new ArrayList<>();
        Connection connection = null;
        PreparedStatement statement = null;
        try {
            //lay all ds gv
//            java.security.Security.setProperty("jdk.tls.disabledAlgorithms", "SSLv3, RC4, MD5withRSA, DH keySize < 768, EC keySize < 224");
//            
//            connection = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=CTTracNghiem;user=sa;password=123456");
  Connect a=new Connect();
            Connection conn=a.getConnection();
            //query
            String sql = "select * from tbGiaoVien where TenGv like ?";
            statement = connection.prepareCall(sql);
            statement.setString(1, "%" + hotengv + "%");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                GV gv = new GV(resultSet.getString("IDGv"), resultSet.getString("TenGv"), resultSet.getString("GioiTinh"), resultSet.getString("CMND_CCCD"), resultSet.getString("Email_Gv"), resultSet.getString("Diachi_Gv"), resultSet.getString("SDT_Gv"), resultSet.getString("NgaySinh_Gv"));
                gvList.add(gv);
            }
        } catch (SQLException ex) {
            Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            if (statement != null) {
                try {
                    statement.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException ex) {
                    Logger.getLogger(GiaoVienModify.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        //ketthuc
        return gvList;
    }

    static void delete(String idgv) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
