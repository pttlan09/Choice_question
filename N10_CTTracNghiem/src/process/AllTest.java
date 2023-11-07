/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package process;

import Data.connect;
import Object.nganhang;
import Data.nganhangData;
import Object.hocvien;
import Object.ketqua;
import Data.ketquaData;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JRadioButton;
import javax.swing.JTabbedPane;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JButton;

import Data.hocvienData;
import Object.hocvien;

/**
 *
 * @author An Nhien
 */
public class AllTest extends javax.swing.JFrame {

    public static PreparedStatement ps;
    hocvienData hvData = new hocvienData();
    //hocvien member;
    public String questionId = "1";

    public String questionId2 = "11";
    public String questionId3 = "26";
    public String questionId4 = "39";
    public String answer;
    //tab1
    public int min = 0;
    public int sec = 0;
    public int mark = 0;
    public String mark1;

    Timer time;
    //tab2
    public int min1 = 0;
    public int sec1 = 0;
    Timer time1;
    //tab3
    public int min2 = 0;
    public int sec2 = 0;
    Timer time2;
    //tab4
    public int min3 = 0;
    public int sec3 = 0;
    Timer time3;

//    Connection conn=null;
//    PreparedStatement pst=null;
    public void answerCheck() {
        String stAns = "";
        if (rdo1.isSelected()) {
            stAns = rdo1.getText();
        } else if (rdo2.isSelected()) {
            stAns = rdo2.getText();

        } else if (rdo3.isSelected()) {
            stAns = rdo3.getText();

        } else if (rdo4.isSelected()) {
            stAns = rdo4.getText();

        } else if (rdo5.isSelected()) {
            stAns = rdo5.getText();

        } else if (rdo6.isSelected()) {
            stAns = rdo6.getText();

        } else if (rdo7.isSelected()) {
            stAns = rdo7.getText();

        } else if (rdo8.isSelected()) {
            stAns = rdo8.getText();

        } else if (rdo9.isSelected()) {
            stAns = rdo9.getText();

        } else if (rdo10.isSelected()) {
            stAns = rdo10.getText();

        } else if (rdo11.isSelected()) {
            stAns = rdo11.getText();

        } else if (rdo12.isSelected()) {
            stAns = rdo12.getText();

        } else if (rdo13.isSelected()) {
            stAns = rdo13.getText();

        } else if (rdo14.isSelected()) {
            stAns = rdo14.getText();

        } else if (rdo15.isSelected()) {
            stAns = rdo15.getText();

        } else {
            stAns = rdo16.getText();

        }
        if (stAns.equals(answer)) {
            mark = mark + 1;

        }
        //question2

        //question number change
        int questionId1 = Integer.parseInt(questionId);
        questionId1 = questionId1 + 1;
        questionId = String.valueOf(questionId1);

        int questionId22 = Integer.parseInt(questionId2);
        //int questionId1=questionId;
        questionId22 = questionId22 + 1;
        //questionId=
        questionId2 = String.valueOf(questionId22);

        //question number change
        int questionId33 = Integer.parseInt(questionId3);
        //int questionId1=questionId;
        questionId33 = questionId33 + 1;
        //questionId=
        questionId3 = String.valueOf(questionId33);

//question number change
        int questionId44 = Integer.parseInt(questionId4);
        //int questionId1=questionId;
        questionId44 = questionId44 + 1;
        //questionId=
        questionId4 = String.valueOf(questionId44);
//    String questionId1=String.valueOf(questionId);
//    questionId1=questionId1+1;
//    questionId=String.valueOf(questionId1);   
//   

        //clear rdo
        rdo1.setSelected(false);
        rdo2.setSelected(false);
        rdo3.setSelected(false);
        rdo4.setSelected(false);
        rdo5.setSelected(false);
        rdo6.setSelected(false);
        rdo7.setSelected(false);
        rdo8.setSelected(false);
        rdo9.setSelected(false);
        rdo10.setSelected(false);
        rdo11.setSelected(false);
        rdo12.setSelected(false);
        rdo13.setSelected(false);
        rdo14.setSelected(false);
        rdo15.setSelected(false);
        rdo16.setSelected(false);

        //last qs hide btnnext
        if (questionId.equals("10")) {
            btnnext.setVisible(false);
        }
        if (questionId2.equals("20")) {
            btnnext1.setVisible(false);
        }
        if (questionId3.equals("35")) {
            btnnext2.setVisible(false);
        }
        if (questionId4.equals("48")) {
            btnnext3.setVisible(false);
        }
    }

    public void question1() {

        // btnbai1.addActionListener(this);
        try {
            Connection conn = connect.getConnect();
            Statement st = conn.createStatement();

            ResultSet rsl = st.executeQuery("select tbNganHang.* from tbNganHang where IDDe= 'Y01' and IDCauHoi='" + questionId + "'");
            while (rsl.next()) {
                lblcauhoi.setText(rsl.getString(1));
                // lblmamon.setText(rsl.getString(2));
                lblndcauhoi.setText(rsl.getString(4));
                rdo1.setText((rsl.getString(5)));
                rdo2.setText((rsl.getString(6)));
                rdo3.setText((rsl.getString(7)));
                rdo4.setText((rsl.getString(8)));
                answer = rsl.getString(9);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void question2() {
        // btnbai1.addActionListener(this);
        try {
            Connection conn = connect.getConnect();
            Statement st = conn.createStatement();

            ResultSet rsl = st.executeQuery("select tbNganHang.* from tbNganHang where IDDe= 'Y02' and IDCauHoi='" + questionId2 + "'");
            while (rsl.next()) {

                lblndcauhoi1.setText(rsl.getString(4));
                rdo5.setText((rsl.getString(5)));
                rdo6.setText((rsl.getString(6)));
                rdo7.setText((rsl.getString(7)));
                rdo8.setText((rsl.getString(8)));
                answer = rsl.getString(9);
                //lbldiem.setText((rsl.getString(8)));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void question3() {
        // btnbai1.addActionListener(this);
        try {
            Connection conn = connect.getConnect();
            Statement st = conn.createStatement();

            ResultSet rsl = st.executeQuery("select tbNganHang.* from tbNganHang where IDDe= 'W01' and IDCauHoi='" + questionId3 + "'");
            while (rsl.next()) {

                lblndcauhoi.setText(rsl.getString(4));
                rdo9.setText((rsl.getString(5)));
                rdo10.setText((rsl.getString(6)));
                rdo11.setText((rsl.getString(7)));
                rdo12.setText((rsl.getString(8)));
                answer = rsl.getString(9);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void question4() {
        // btnbai1.addActionListener(this);
        try {
            Connection conn = connect.getConnect();
            Statement st = conn.createStatement();

            ResultSet rsl = st.executeQuery("select tbNganHang.* from tbNganHang where IDDe= 'S01' and IDCauHoi='" + questionId4 + "'");
            while (rsl.next()) {

                lblndcauhoi3.setText(rsl.getString(4));
                rdo13.setText((rsl.getString(5)));
                rdo14.setText((rsl.getString(6)));
                rdo15.setText((rsl.getString(7)));
                rdo16.setText((rsl.getString(8)));
                answer = rsl.getString(9);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void submit() {

        answerCheck();
        try {
//            Connection con=connect.getConnect();
//            Statement st=con.createStatement();
            //st.executeUpdate("update tbKetQua set Diem='"+mark+"' where IDHv='"+Login.hocvienID+"' ");

            mark1 = String.valueOf(mark);

            //JOptionPane.showMessageDialog(null, mark1);
            setVisible(false);
            new ThongBaoKQ(mark1).setVisible(true);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

    public AllTest() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel24 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnquaylai = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnbai2 = new javax.swing.JButton();
        btnbai3 = new javax.swing.JButton();
        btnbai4 = new javax.swing.JButton();
        btnbai1 = new javax.swing.JButton();
        tbptest = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel25 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnnext = new javax.swing.JButton();
        btnnop = new javax.swing.JButton();
        lblcauhoi = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        lblndcauhoi = new javax.swing.JLabel();
        rdo1 = new javax.swing.JRadioButton();
        rdo2 = new javax.swing.JRadioButton();
        rdo3 = new javax.swing.JRadioButton();
        rdo4 = new javax.swing.JRadioButton();
        jPanel8 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblmin = new javax.swing.JLabel();
        lblsec = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lbldate = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        btnnext1 = new javax.swing.JButton();
        btnnop1 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        lblndcauhoi1 = new javax.swing.JLabel();
        rdo5 = new javax.swing.JRadioButton();
        rdo6 = new javax.swing.JRadioButton();
        rdo7 = new javax.swing.JRadioButton();
        rdo8 = new javax.swing.JRadioButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblmin1 = new javax.swing.JLabel();
        lblsec1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lbldate1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        btnnext2 = new javax.swing.JButton();
        btnnop2 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        lblndcauhoi2 = new javax.swing.JLabel();
        rdo9 = new javax.swing.JRadioButton();
        rdo10 = new javax.swing.JRadioButton();
        rdo11 = new javax.swing.JRadioButton();
        rdo12 = new javax.swing.JRadioButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblmin2 = new javax.swing.JLabel();
        lblsec2 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        lbldate2 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        btnnext3 = new javax.swing.JButton();
        btnnop3 = new javax.swing.JButton();
        jPanel21 = new javax.swing.JPanel();
        lblndcauhoi3 = new javax.swing.JLabel();
        rdo13 = new javax.swing.JRadioButton();
        rdo14 = new javax.swing.JRadioButton();
        rdo15 = new javax.swing.JRadioButton();
        rdo16 = new javax.swing.JRadioButton();
        jPanel22 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        lblmin3 = new javax.swing.JLabel();
        lblsec3 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        lbldate3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel24.setBackground(new java.awt.Color(0, 204, 204));
        jPanel24.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/logo-teky.png"))); // NOI18N
        jPanel24.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 38, -1, -1));

        btnquaylai.setBackground(new java.awt.Color(255, 255, 255));
        btnquaylai.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnquaylai.setForeground(new java.awt.Color(0, 153, 153));
        btnquaylai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/homepage.png"))); // NOI18N
        btnquaylai.setText("Quay lại");
        btnquaylai.setBorderPainted(false);
        btnquaylai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnquaylaiActionPerformed(evt);
            }
        });
        jPanel24.add(btnquaylai, new org.netbeans.lib.awtextra.AbsoluteConstraints(126, 611, 132, 42));

        jPanel1.setBackground(new java.awt.Color(0, 204, 204));

        btnbai2.setBackground(new java.awt.Color(0, 102, 102));
        btnbai2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbai2.setForeground(new java.awt.Color(255, 255, 255));
        btnbai2.setText("Bài kiểm tra Python 02");
        btnbai2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnbai2.setBorderPainted(false);
        btnbai2.setFocusPainted(false);
        btnbai2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbai2ActionPerformed(evt);
            }
        });

        btnbai3.setBackground(new java.awt.Color(0, 102, 102));
        btnbai3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbai3.setForeground(new java.awt.Color(255, 255, 255));
        btnbai3.setText("Bài kiểm tra Web 01");
        btnbai3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnbai3.setBorderPainted(false);
        btnbai3.setFocusPainted(false);
        btnbai3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbai3ActionPerformed(evt);
            }
        });

        btnbai4.setBackground(new java.awt.Color(0, 102, 102));
        btnbai4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbai4.setForeground(new java.awt.Color(255, 255, 255));
        btnbai4.setText("Bài kiểm tra Photoshop");
        btnbai4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnbai4.setBorderPainted(false);
        btnbai4.setFocusPainted(false);
        btnbai4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbai4ActionPerformed(evt);
            }
        });

        btnbai1.setBackground(new java.awt.Color(0, 102, 102));
        btnbai1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnbai1.setForeground(new java.awt.Color(255, 255, 255));
        btnbai1.setText("Bài kiểm tra Python 01");
        btnbai1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        btnbai1.setBorderPainted(false);
        btnbai1.setFocusPainted(false);
        btnbai1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbai1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnbai1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnbai2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnbai3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnbai4, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnbai1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnbai2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnbai3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(btnbai4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        jPanel24.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 280, 290));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 102, 102));
        jLabel7.setText("CHỌN BÀI KIỂM TRA CẦN LÀM ");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/exercise (1).png"))); // NOI18N

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/left-arrow (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addContainerGap(390, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(215, 215, 215))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)))
                .addContainerGap(227, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tbptest.addTab("tab1", jPanel2);

        jPanel6.setBackground(new java.awt.Color(0, 204, 204));

        jPanel25.setBackground(new java.awt.Color(0, 204, 204));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Tổng câu hỏi: 10 ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Câu hỏi:");

        btnnext.setBackground(new java.awt.Color(0, 102, 102));
        btnnext.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnext.setForeground(new java.awt.Color(255, 255, 255));
        btnnext.setText("NEXT");
        btnnext.setBorderPainted(false);
        btnnext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnextActionPerformed(evt);
            }
        });

        btnnop.setBackground(new java.awt.Color(0, 102, 102));
        btnnop.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnop.setForeground(new java.awt.Color(255, 255, 255));
        btnnop.setText("NỘP");
        btnnop.setBorderPainted(false);
        btnnop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnopActionPerformed(evt);
            }
        });

        lblcauhoi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblcauhoi.setText("00");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblcauhoi)
                        .addGap(51, 51, 51)
                        .addComponent(btnnext, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnnop, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(4, 4, 4))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(19, 19, 19)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblcauhoi)
                    .addComponent(btnnext)
                    .addComponent(btnnop))
                .addGap(118, 118, 118))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        lblndcauhoi.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblndcauhoi.setText("Question");

        rdo1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo1ActionPerformed(evt);
            }
        });

        rdo2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo2ActionPerformed(evt);
            }
        });

        rdo3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo3ActionPerformed(evt);
            }
        });

        rdo4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblndcauhoi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdo1)
                            .addComponent(rdo4)
                            .addComponent(rdo2)
                            .addComponent(rdo3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblndcauhoi, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(rdo1)
                .addGap(18, 18, 18)
                .addComponent(rdo2)
                .addGap(18, 18, 18)
                .addComponent(rdo3)
                .addGap(18, 18, 18)
                .addComponent(rdo4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Thời gian:  10 phút");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("Thời gian đã làm:");

        lblmin.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblmin.setForeground(new java.awt.Color(255, 0, 0));
        lblmin.setText("00");

        lblsec.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblsec.setForeground(new java.awt.Color(255, 0, 0));
        lblsec.setText("00");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Ngày:");

        lbldate.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(lblmin)
                        .addGap(18, 18, 18)
                        .addComponent(lblsec))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(lbldate, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblmin)
                    .addComponent(lblsec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel6))
                    .addComponent(lbldate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel25Layout = new javax.swing.GroupLayout(jPanel25);
        jPanel25.setLayout(jPanel25Layout);
        jPanel25Layout.setHorizontalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel25Layout.createSequentialGroup()
                        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(124, 124, 124)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel25Layout.setVerticalGroup(
            jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel25Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(152, 152, 152)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 116, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        tbptest.addTab("tab2", jPanel6);

        jPanel11.setBackground(new java.awt.Color(0, 204, 204));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Tổng câu hỏi: 10 ");

        btnnext1.setBackground(new java.awt.Color(0, 102, 102));
        btnnext1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnext1.setForeground(new java.awt.Color(255, 255, 255));
        btnnext1.setText("NEXT");
        btnnext1.setBorderPainted(false);
        btnnext1.setFocusPainted(false);
        btnnext1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnext1ActionPerformed(evt);
            }
        });

        btnnop1.setBackground(new java.awt.Color(0, 102, 102));
        btnnop1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnop1.setForeground(new java.awt.Color(255, 255, 255));
        btnnop1.setText("NỘP");
        btnnop1.setBorderPainted(false);
        btnnop1.setFocusPainted(false);
        btnnop1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnop1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap(180, Short.MAX_VALUE)
                .addComponent(btnnext1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(btnnop1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnnop1)
                    .addComponent(btnnext1))
                .addGap(113, 113, 113))
        );

        jPanel13.setBackground(new java.awt.Color(255, 255, 255));

        lblndcauhoi1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblndcauhoi1.setText("Question");

        rdo5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo5.setText("jRadioButton1");
        rdo5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo5ActionPerformed(evt);
            }
        });

        rdo6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo6.setText("jRadioButton2");
        rdo6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo6ActionPerformed(evt);
            }
        });

        rdo7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo7.setText("jRadioButton3");
        rdo7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo7ActionPerformed(evt);
            }
        });

        rdo8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo8.setText("jRadioButton4");
        rdo8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblndcauhoi1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdo5)
                            .addComponent(rdo6)
                            .addComponent(rdo8)
                            .addComponent(rdo7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblndcauhoi1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdo5)
                .addGap(18, 18, 18)
                .addComponent(rdo6)
                .addGap(18, 18, 18)
                .addComponent(rdo7)
                .addGap(18, 18, 18)
                .addComponent(rdo8)
                .addGap(34, 34, 34))
        );

        jPanel14.setBackground(new java.awt.Color(255, 255, 255));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("Thời gian:  10 phút");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Thời gian đã làm:");

        lblmin1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblmin1.setForeground(new java.awt.Color(255, 0, 0));
        lblmin1.setText("00");

        lblsec1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblsec1.setForeground(new java.awt.Color(255, 0, 0));
        lblsec1.setText("00");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Ngày:");

        lbldate1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addGap(18, 18, 18)
                                .addComponent(lblmin1)
                                .addGap(18, 18, 18)
                                .addComponent(lblsec1))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(18, 18, 18)
                                .addComponent(lbldate1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(92, 92, 92))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(lblmin1)
                    .addComponent(lblsec1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbldate1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addGap(129, 129, 129)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tbptest.addTab("tab3", jPanel5);

        jPanel15.setBackground(new java.awt.Color(0, 204, 204));

        jPanel16.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Tổng câu hỏi: 10 ");

        btnnext2.setBackground(new java.awt.Color(0, 102, 102));
        btnnext2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnext2.setForeground(new java.awt.Color(255, 255, 255));
        btnnext2.setText("NEXT");
        btnnext2.setBorderPainted(false);
        btnnext2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnext2ActionPerformed(evt);
            }
        });

        btnnop2.setBackground(new java.awt.Color(0, 102, 102));
        btnnop2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnop2.setForeground(new java.awt.Color(255, 255, 255));
        btnnop2.setText("Nộp");
        btnnop2.setBorderPainted(false);
        btnnop2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnop2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(135, Short.MAX_VALUE)
                .addComponent(btnnext2)
                .addGap(38, 38, 38)
                .addComponent(btnnop2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(27, 27, 27)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnext2)
                    .addComponent(btnnop2))
                .addGap(113, 113, 113))
        );

        jPanel17.setBackground(new java.awt.Color(255, 255, 255));

        lblndcauhoi2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblndcauhoi2.setText("Question");

        rdo9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo9.setText("jRadioButton1");
        rdo9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo9ActionPerformed(evt);
            }
        });

        rdo10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo10.setText("jRadioButton2");
        rdo10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo10ActionPerformed(evt);
            }
        });

        rdo11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo11.setText("jRadioButton3");
        rdo11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo11ActionPerformed(evt);
            }
        });

        rdo12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo12.setText("jRadioButton4");
        rdo12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblndcauhoi2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdo9)
                            .addComponent(rdo10)
                            .addComponent(rdo11)
                            .addComponent(rdo12))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblndcauhoi2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rdo9)
                .addGap(18, 18, 18)
                .addComponent(rdo10)
                .addGap(18, 18, 18)
                .addComponent(rdo11)
                .addGap(18, 18, 18)
                .addComponent(rdo12)
                .addGap(23, 23, 23))
        );

        jPanel18.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("Thời gian:  10 phút");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 0, 0));
        jLabel18.setText("Thời gian đã làm:");

        lblmin2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblmin2.setForeground(new java.awt.Color(255, 0, 0));
        lblmin2.setText("00");

        lblsec2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblsec2.setForeground(new java.awt.Color(255, 0, 0));
        lblsec2.setText("00");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("Ngày:");

        lbldate2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldate2.setText("jLabel7");

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addGap(18, 18, 18)
                        .addComponent(lbldate2))
                    .addComponent(jLabel17)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addGap(18, 18, 18)
                        .addComponent(lblmin2)
                        .addGap(18, 18, 18)
                        .addComponent(lblsec2)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(lblmin2)
                    .addComponent(lblsec2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(lbldate2))
                .addGap(80, 80, 80))
        );

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 169, Short.MAX_VALUE)
                        .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel18, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(143, 143, 143)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        tbptest.addTab("tab4", jPanel9);

        jPanel19.setBackground(new java.awt.Color(0, 204, 204));
        jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel20.setBackground(new java.awt.Color(255, 255, 255));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Tổng câu hỏi: 10 ");

        btnnext3.setBackground(new java.awt.Color(0, 102, 102));
        btnnext3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnext3.setForeground(new java.awt.Color(255, 255, 255));
        btnnext3.setText("NEXT");
        btnnext3.setBorderPainted(false);
        btnnext3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnext3ActionPerformed(evt);
            }
        });

        btnnop3.setBackground(new java.awt.Color(0, 102, 102));
        btnnop3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnnop3.setForeground(new java.awt.Color(255, 255, 255));
        btnnop3.setText("NỘP");
        btnnop3.setBorderPainted(false);
        btnnop3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnop3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnnext3, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(btnnop3, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20)
                .addGap(28, 28, 28)
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnnext3)
                    .addComponent(btnnop3))
                .addGap(103, 103, 103))
        );

        jPanel19.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 26, 380, 120));

        jPanel21.setBackground(new java.awt.Color(255, 255, 255));

        lblndcauhoi3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblndcauhoi3.setText("Question");

        rdo13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo13.setText("jRadioButton1");
        rdo13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo13ActionPerformed(evt);
            }
        });

        rdo14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo14.setText("jRadioButton2");
        rdo14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo14ActionPerformed(evt);
            }
        });

        rdo15.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo15.setText("jRadioButton3");
        rdo15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo15ActionPerformed(evt);
            }
        });

        rdo16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdo16.setText("jRadioButton4");
        rdo16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdo16ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblndcauhoi3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdo16)
                            .addComponent(rdo13)
                            .addComponent(rdo14)
                            .addComponent(rdo15))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblndcauhoi3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(rdo13)
                .addGap(18, 18, 18)
                .addComponent(rdo14)
                .addGap(18, 18, 18)
                .addComponent(rdo15)
                .addGap(18, 18, 18)
                .addComponent(rdo16)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel19.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 268, 850, -1));

        jPanel22.setBackground(new java.awt.Color(255, 255, 255));

        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Thời gian:  10 phút");

        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 0, 0));
        jLabel24.setText("Thời gian đã làm:");

        lblmin3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblmin3.setForeground(new java.awt.Color(255, 0, 0));
        lblmin3.setText("00");

        lblsec3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblsec3.setForeground(new java.awt.Color(255, 0, 0));
        lblsec3.setText("00");

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setText("Ngày:");

        lbldate3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lbldate3.setText("jLabel7");

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addGap(18, 18, 18)
                        .addComponent(lbldate3))
                    .addComponent(jLabel23)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addGap(18, 18, 18)
                        .addComponent(lblmin3)
                        .addGap(18, 18, 18)
                        .addComponent(lblsec3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(lblmin3)
                    .addComponent(lblsec3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(lbldate3))
                .addGap(80, 80, 80))
        );

        jPanel19.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, 350, 110));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 874, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel19, javax.swing.GroupLayout.DEFAULT_SIZE, 658, Short.MAX_VALUE)
        );

        tbptest.addTab("tab5", jPanel10);

        jPanel24.add(tbptest, new org.netbeans.lib.awtextra.AbsoluteConstraints(288, -33, -1, 686));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jPanel24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnquaylaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnquaylaiActionPerformed
        // TODO add your handling code here:
        GiaoDienChinh gdc = new GiaoDienChinh();
        gdc.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnquaylaiActionPerformed

    private void btnbai1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbai1ActionPerformed
        // TODO add your handling code here:
        //        HocVienTest hvtesTest=new HocVienTest();
        //        hvtesTest.setVisible(true);
        //        dispose();
        //        if(evt.getSource()==btnbai1)
        //        hvtesTest.setVisible(true);
        //tbptest=hvtesTest.setVisible(true);
        //  btnbai1.setText(deId="Y01");
        //String  tende=btnbai1.getText();
        //  if(btnbai1.getText()=="Y01")
        //      {
        //          question1();
        //          answerCheck();
        //      }
        //date
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        lbldate.setText(dFormat.format(date));
        //time
        setLocationRelativeTo(this);
        time = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblsec.setText(String.valueOf(sec));
                lblmin.setText(String.valueOf(min));

                if (sec == 60) {
                    sec = 0;
                    min++;
                    if (min == 10) {
                        time.stop();
                        answerCheck();
                        submit();
                    }
                }
                sec++;
            }

        });
        time.start();
        //goi tab
        tbptest.setSelectedIndex(1);

        try {
            Connection conn = connect.getConnect();
            Statement st = conn.createStatement();

            // ResultSet rs=st.executeQuery("select*from tbDeThi where IDDe=?");
            ResultSet rsl = st.executeQuery("select tbNganHang.* from tbNganHang where IDDe= 'Y01' and IDCauHoi='" + questionId + "'");
            while (rsl.next()) {
                lblcauhoi.setText(rsl.getString(1));
                // lblmamon.setText(rsl.getString(2));
                lblndcauhoi.setText(rsl.getString(4));
                rdo1.setText((rsl.getString(5)));
                rdo2.setText((rsl.getString(6)));
                rdo3.setText((rsl.getString(7)));
                rdo4.setText((rsl.getString(8)));
                answer = rsl.getString(9);

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnbai1ActionPerformed

    private void btnbai2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbai2ActionPerformed
        // TODO add your handling code here:
        //        if(btnbai2.getText()=="Y02")
        //      {
        //          question2();
        //          answerCheck();;
        //      }
        //date
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        lbldate1.setText(dFormat.format(date));
        //time
        setLocationRelativeTo(this);
        time1 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblsec1.setText(String.valueOf(sec1));
                lblmin1.setText(String.valueOf(min1));

                if (sec1 == 60) {
                    sec1 = 0;
                    min1++;
                    if (min1 == 10) {
                        time1.stop();
                        answerCheck();
                        submit();
                    }
                }
                sec1++;
            }

        });
        time1.start();

        //goi tab
        tbptest.setSelectedIndex(2);
        try {
            Connection conn = connect.getConnect();
            Statement st = conn.createStatement();

            // ResultSet rs=st.executeQuery("select*from tbDeThi where IDDe=?");
            ResultSet rsl = st.executeQuery("select tbNganHang.* from tbNganHang where IDDe= 'Y02' and IDCauHoi='" + questionId2 + "'");
            while (rsl.next()) {

                lblndcauhoi1.setText(rsl.getString(4));
                rdo5.setText((rsl.getString(5)));
                rdo6.setText((rsl.getString(6)));
                rdo7.setText((rsl.getString(7)));
                rdo8.setText((rsl.getString(8)));
                answer = rsl.getString(9);
                //lbldiem.setText((rsl.getString(8)));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnbai2ActionPerformed

    private void btnbai3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbai3ActionPerformed
        // TODO add your handling code here:
        //        if(btnbai3.getText()=="W01")
        //      {
        //          question3();
        //          answerCheck();;
        //      }
        //date
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        lbldate2.setText(dFormat.format(date));
        //time
        setLocationRelativeTo(this);
        time2 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblsec2.setText(String.valueOf(sec2));
                lblmin2.setText(String.valueOf(min2));

                if (sec2 == 60) {
                    sec2 = 0;
                    min2++;
                    if (min2 == 10) {
                        time2.stop();
                        answerCheck();
                        submit();
                    }
                }
                sec2++;
            }

        });
        time2.start();
        //goi tab
        tbptest.setSelectedIndex(3);
        try {
            Connection conn = connect.getConnect();
            Statement st = conn.createStatement();

            // ResultSet rs=st.executeQuery("select*from tbDeThi where IDDe=?");
            ResultSet rsl = st.executeQuery("select tbNganHang.* from tbNganHang where IDDe= 'W01' and IDCauHoi='" + questionId3 + "'");
            while (rsl.next()) {

                lblndcauhoi2.setText(rsl.getString(4));
                rdo9.setText((rsl.getString(5)));
                rdo10.setText((rsl.getString(6)));
                rdo11.setText((rsl.getString(7)));
                rdo12.setText((rsl.getString(8)));
                answer = rsl.getString(9);
                //lbldiem.setText((rsl.getString(8)));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnbai3ActionPerformed

    private void btnbai4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbai4ActionPerformed
        // TODO add your handling code here:
        //        if(btnbai4.getText()=="S01")
        //      {
        //          question4();
        //          answerCheck();;
        //      }
        //date
        SimpleDateFormat dFormat = new SimpleDateFormat("dd-MM-yyyy");
        Date date = new Date();
        lbldate3.setText(dFormat.format(date));
        //time
        setLocationRelativeTo(this);
        time3 = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lblsec3.setText(String.valueOf(sec3));
                lblmin3.setText(String.valueOf(min3));

                if (sec3 == 60) {
                    sec3 = 0;
                    min3++;
                    if (min3 == 10) {
                        time3.stop();
                        answerCheck();
                        submit();
                    }
                }
                sec3++;
            }

        });
        time3.start();
        //goi tab

        tbptest.setSelectedIndex(4);

        try {
            Connection conn = connect.getConnect();
            Statement st = conn.createStatement();

            // ResultSet rs=st.executeQuery("select*from tbDeThi where IDDe=?");
            ResultSet rsl = st.executeQuery("select tbNganHang.* from tbNganHang where IDDe= 'S01' and IDCauHoi='" + questionId4 + "'");
            while (rsl.next()) {

                lblndcauhoi3.setText(rsl.getString(4));
                rdo13.setText((rsl.getString(5)));
                rdo14.setText((rsl.getString(6)));
                rdo15.setText((rsl.getString(7)));
                rdo16.setText((rsl.getString(8)));
                answer = rsl.getString(9);
                //lbldiem.setText((rsl.getString(8)));

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnbai4ActionPerformed

    private void btnnextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnextActionPerformed

        // TODO add your handling code here:
        answerCheck();

        question1();
    }//GEN-LAST:event_btnnextActionPerformed

    private void btnnopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnopActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn nộp bài không", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            answerCheck();
            question1();
            submit();
            // System.out.println("hello "+Login.hocvienID);

            String q = "insert into tbKetQua values('Y01',N'" + btnbai1.getText() + "',N'" + GiaoDienChinh.hocvienID + "','" + mark1 + "','" + lbldate.getText() + "' )";
            try {
                ps = connect.getConnect().prepareStatement(q);
                ps.execute();

            } catch (Exception e) {
            }

        }
    }//GEN-LAST:event_btnnopActionPerformed

    private void rdo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo1ActionPerformed
        // TODO add your handling code here:
        if (rdo1.isSelected()) {
            rdo2.setSelected(false);
            rdo3.setSelected(false);
            rdo4.setSelected(false);

        }
    }//GEN-LAST:event_rdo1ActionPerformed

    private void rdo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo2ActionPerformed
        // TODO add your handling code here:
        if (rdo2.isSelected()) {
            rdo1.setSelected(false);
            rdo3.setSelected(false);
            rdo4.setSelected(false);

        }
    }//GEN-LAST:event_rdo2ActionPerformed

    private void rdo3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo3ActionPerformed
        // TODO add your handling code here:
        if (rdo3.isSelected()) {
            rdo2.setSelected(false);
            rdo1.setSelected(false);
            rdo4.setSelected(false);

        }
    }//GEN-LAST:event_rdo3ActionPerformed

    private void rdo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo4ActionPerformed
        // TODO add your handling code here:
        if (rdo4.isSelected()) {
            rdo2.setSelected(false);
            rdo3.setSelected(false);
            rdo1.setSelected(false);

        }
    }//GEN-LAST:event_rdo4ActionPerformed

    private void btnnext1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnext1ActionPerformed
        // TODO add your handling code here:
        answerCheck();
        question2();
    }//GEN-LAST:event_btnnext1ActionPerformed

    private void btnnop1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnop1ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn nộp bài không", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            answerCheck();
            submit();
        }
        String q = "insert into tbKetQua values('Y02',N'" + btnbai2.getText() + "',N'" + GiaoDienChinh.hocvienID + "','" + mark1 + "','" + lbldate1.getText() + "' )";
        try {
            ps = connect.getConnect().prepareStatement(q);
            ps.execute();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnnop1ActionPerformed

    private void rdo5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo5ActionPerformed
        // TODO add your handling code here:
        if (rdo5.isSelected()) {
            rdo6.setSelected(false);
            rdo7.setSelected(false);
            rdo8.setSelected(false);

        }
    }//GEN-LAST:event_rdo5ActionPerformed

    private void rdo6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo6ActionPerformed
        // TODO add your handling code here:
        if (rdo6.isSelected()) {
            rdo5.setSelected(false);
            rdo7.setSelected(false);
            rdo8.setSelected(false);

        }
    }//GEN-LAST:event_rdo6ActionPerformed

    private void rdo7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo7ActionPerformed
        // TODO add your handling code here:
        if (rdo7.isSelected()) {
            rdo8.setSelected(false);
            rdo6.setSelected(false);
            rdo5.setSelected(false);

        }
    }//GEN-LAST:event_rdo7ActionPerformed

    private void rdo8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo8ActionPerformed
        // TODO add your handling code here:
        if (rdo8.isSelected()) {
            rdo7.setSelected(false);
            rdo6.setSelected(false);
            rdo5.setSelected(false);

        }
    }//GEN-LAST:event_rdo8ActionPerformed

    private void btnnext2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnext2ActionPerformed
        // TODO add your handling code here:
        answerCheck();
        question3();
    }//GEN-LAST:event_btnnext2ActionPerformed

    private void btnnop2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnop2ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn nộp bài không", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            answerCheck();
            submit();
        }
        String q = "insert into tbKetQua values('W01',N'" + btnbai4.getText() + "',N'" + GiaoDienChinh.hocvienID + "','" + mark1 + "','" + lbldate2.getText() + "' )";
        try {
            ps = connect.getConnect().prepareStatement(q);
            ps.execute();

        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnnop2ActionPerformed

    private void rdo9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo9ActionPerformed
        // TODO add your handling code here:
        if (rdo9.isSelected()) {
            rdo10.setSelected(false);
            rdo11.setSelected(false);
            rdo12.setSelected(false);

        }
    }//GEN-LAST:event_rdo9ActionPerformed

    private void rdo10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo10ActionPerformed
        // TODO add your handling code here:
        if (rdo10.isSelected()) {
            rdo12.setSelected(false);
            rdo9.setSelected(false);
            rdo11.setSelected(false);

        }
    }//GEN-LAST:event_rdo10ActionPerformed

    private void rdo11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo11ActionPerformed
        // TODO add your handling code here:
        if (rdo11.isSelected()) {
            rdo10.setSelected(false);
            rdo9.setSelected(false);
            rdo12.setSelected(false);

        }
    }//GEN-LAST:event_rdo11ActionPerformed

    private void rdo12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo12ActionPerformed
        // TODO add your handling code here:
        if (rdo12.isSelected()) {
            rdo11.setSelected(false);
            rdo10.setSelected(false);
            rdo9.setSelected(false);

        }
    }//GEN-LAST:event_rdo12ActionPerformed

    private void btnnext3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnext3ActionPerformed
        // TODO add your handling code here:
        answerCheck();
        question4();
    }//GEN-LAST:event_btnnext3ActionPerformed

    private void btnnop3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnop3ActionPerformed
        // TODO add your handling code here:
        int a = JOptionPane.showConfirmDialog(null, "Bạn có muốn nộp bài không", "Select", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            answerCheck();
            submit();

            String q = "insert into tbKetQua values('S01',N'" + btnbai4.getText() + "',N'" + GiaoDienChinh.hocvienID + "','" + mark1 + "','" + lbldate3.getText() + "' )";
            try {
                ps = connect.getConnect().prepareStatement(q);
                ps.execute();

            } catch (Exception e) {
            }
        }
    }//GEN-LAST:event_btnnop3ActionPerformed

    private void rdo13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo13ActionPerformed
        // TODO add your handling code here:
        if (rdo13.isSelected()) {
            rdo14.setSelected(false);
            rdo15.setSelected(false);
            rdo16.setSelected(false);

        }
    }//GEN-LAST:event_rdo13ActionPerformed

    private void rdo14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo14ActionPerformed
        // TODO add your handling code here:
        if (rdo14.isSelected()) {
            rdo15.setSelected(false);
            rdo16.setSelected(false);
            rdo13.setSelected(false);

        }
    }//GEN-LAST:event_rdo14ActionPerformed

    private void rdo15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo15ActionPerformed
        // TODO add your handling code here:
        if (rdo15.isSelected()) {
            rdo16.setSelected(false);
            rdo14.setSelected(false);
            rdo13.setSelected(false);

        }
    }//GEN-LAST:event_rdo15ActionPerformed

    private void rdo16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdo16ActionPerformed
        // TODO add your handling code here:
        if (rdo16.isSelected()) {
            rdo15.setSelected(false);
            rdo14.setSelected(false);
            rdo13.setSelected(false);

        }
    }//GEN-LAST:event_rdo16ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AllTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AllTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AllTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AllTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                AllTest at = new AllTest();
                at.setLocationRelativeTo(null);
                at.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbai1;
    private javax.swing.JButton btnbai2;
    private javax.swing.JButton btnbai3;
    private javax.swing.JButton btnbai4;
    private javax.swing.JButton btnnext;
    private javax.swing.JButton btnnext1;
    private javax.swing.JButton btnnext2;
    private javax.swing.JButton btnnext3;
    private javax.swing.JButton btnnop;
    private javax.swing.JButton btnnop1;
    private javax.swing.JButton btnnop2;
    private javax.swing.JButton btnnop3;
    private javax.swing.JButton btnquaylai;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel25;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblcauhoi;
    private javax.swing.JLabel lbldate;
    private javax.swing.JLabel lbldate1;
    private javax.swing.JLabel lbldate2;
    private javax.swing.JLabel lbldate3;
    private javax.swing.JLabel lblmin;
    private javax.swing.JLabel lblmin1;
    private javax.swing.JLabel lblmin2;
    private javax.swing.JLabel lblmin3;
    private javax.swing.JLabel lblndcauhoi;
    private javax.swing.JLabel lblndcauhoi1;
    private javax.swing.JLabel lblndcauhoi2;
    private javax.swing.JLabel lblndcauhoi3;
    private javax.swing.JLabel lblsec;
    private javax.swing.JLabel lblsec1;
    private javax.swing.JLabel lblsec2;
    private javax.swing.JLabel lblsec3;
    private javax.swing.JRadioButton rdo1;
    private javax.swing.JRadioButton rdo10;
    private javax.swing.JRadioButton rdo11;
    private javax.swing.JRadioButton rdo12;
    private javax.swing.JRadioButton rdo13;
    private javax.swing.JRadioButton rdo14;
    private javax.swing.JRadioButton rdo15;
    private javax.swing.JRadioButton rdo16;
    private javax.swing.JRadioButton rdo2;
    private javax.swing.JRadioButton rdo3;
    private javax.swing.JRadioButton rdo4;
    private javax.swing.JRadioButton rdo5;
    private javax.swing.JRadioButton rdo6;
    private javax.swing.JRadioButton rdo7;
    private javax.swing.JRadioButton rdo8;
    private javax.swing.JRadioButton rdo9;
    private javax.swing.JTabbedPane tbptest;
    // End of variables declaration//GEN-END:variables
}
