/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N10;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

/**
 *
 * @author An Nhien
 */
public class LopHoc extends javax.swing.JFrame {
    DefaultTableModel tbn=new DefaultTableModel();
    /**
     * Creates new form LopHoc
     */
    public LopHoc() {
        initComponents();
        loadData();
    }
     public void loadData(){
        try{
            Connect a=new Connect();
            Connection conn=a.getConnection();
            int number;
            Vector row,column;
            column=new Vector();
            Statement st=conn.createStatement();
            ResultSet rs= st.executeQuery("Select* from tbLopHoc");
            ResultSetMetaData metadate= rs.getMetaData();
            number = metadate.getColumnCount();
            
            for(int i=1;i<=number;i++)
            {
                column.add(metadate.getColumnName(i));//lay tieu de cac cot
                
            }
            tbn.setColumnIdentifiers(column);
            
            while(rs.next()){
                row=new Vector();
                for(int i=1;i<=number;i++)
                {
                    row.addElement(rs.getString(i));
                }
                tbn.addRow(row);
                tblophoc.setModel(tbn);
            }
            
            tblophoc.getSelectionModel().addListSelectionListener(new ListSelectionListener(){
                public void valueChanged(ListSelectionEvent e){
                    if(tblophoc.getSelectedRow()>=0){
                        txtidlop.setText(tblophoc.getValueAt(tblophoc.getSelectedRow(), 0) +"");
                        txttenlop.setText(tblophoc.getValueAt(tblophoc.getSelectedRow(), 1) +"");
                        txtghichu.setText(tblophoc.getValueAt(tblophoc.getSelectedRow(), 2) +"");
                    }
                }
                        
            
        });
        }catch(Exception ex){
            System.out.println(ex.toString());
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        lblidlop = new javax.swing.JLabel();
        lbltenlop = new javax.swing.JLabel();
        lblghichu = new javax.swing.JLabel();
        btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        btnthoat = new javax.swing.JButton();
        txtidlop = new javax.swing.JTextField();
        txttenlop = new javax.swing.JTextField();
        txtghichu = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblophoc = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ LỚP HỌC");

        lblidlop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblidlop.setText("ID Lớp:");

        lbltenlop.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lbltenlop.setText("Tên lớp:");

        lblghichu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblghichu.setText("Ghi chú:");

        btnthem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnthem.setText("Thêm");
        btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthemActionPerformed(evt);
            }
        });

        btnsua.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnsua.setText("Sửa");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        btnthoat.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnthoat.setText("Thoát");
        btnthoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnthoatActionPerformed(evt);
            }
        });

        tblophoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblophoc);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnthem)
                        .addGap(18, 18, 18)
                        .addComponent(btnsua)
                        .addGap(24, 24, 24)
                        .addComponent(btnxoa)
                        .addGap(18, 18, 18)
                        .addComponent(btnthoat))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbltenlop, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblghichu))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txttenlop, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtghichu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblidlop)
                                .addGap(46, 46, 46)
                                .addComponent(txtidlop, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblidlop)
                            .addComponent(txtidlop, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbltenlop)
                            .addComponent(txttenlop, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblghichu)
                            .addComponent(txtghichu, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnthem)
                            .addComponent(btnsua)
                            .addComponent(btnxoa)
                            .addComponent(btnthoat)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthemActionPerformed
       try{
            Connect a=new Connect();
            Connection conn=a.getConnection();
            PreparedStatement ps= conn.prepareStatement("Insert into tbLopHoc values(?,?,?)");
            ps.setString(1,txtidlop.getText());
            ps.setString(2,txttenlop.getText());
            ps.setString(3,txtghichu.getText());
            int chk=ps.executeUpdate();
            if (chk>0){
                JOptionPane.showMessageDialog(this, "Them thanh cong");
                tbn.setRowCount(0);
                loadData();
            }else
            {
                
            }
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        try{
            Connect a=new Connect();
            Connection conn=a.getConnection();
            PreparedStatement comm = conn.prepareStatement("Update tbLopHoc set TenLop=?,ghighu=? where IDLop=?");
            comm.setString(3, txtidlop.getText());
            comm.setString(1, txttenlop.getText());
            comm.setString(2, txtghichu.getText());
            comm.executeUpdate();
            tbn.setRowCount(0);
            loadData();
        }
        catch(Exception ex)
        {
            System.out.println(ex.toString());
        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed
        try{
            Connect a=new Connect();
            Connection conn=a.getConnection();
            PreparedStatement comm = conn.prepareStatement("Delete tbLopHoc where IDop=?");
            comm.setString(1, tblophoc.getValueAt(tblophoc.getSelectedRow(), 0).toString());
         
            if(JOptionPane.showConfirmDialog(this, "Xoa Lop?","Confirm",
                    JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION) {
           comm.executeUpdate();
           tbn.setRowCount(0);
           loadData();
      }
            
    }catch(Exception ex)
    {
        System.out.println(ex.toString());
    }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void btnthoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnthoatActionPerformed
         System.exit(0);
    }//GEN-LAST:event_btnthoatActionPerformed

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
            java.util.logging.Logger.getLogger(LopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LopHoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LopHoc().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnthem;
    private javax.swing.JButton btnthoat;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblghichu;
    private javax.swing.JLabel lblidlop;
    private javax.swing.JLabel lbltenlop;
    private javax.swing.JTable tblophoc;
    private javax.swing.JTextField txtghichu;
    private javax.swing.JTextField txtidlop;
    private javax.swing.JTextField txttenlop;
    // End of variables declaration//GEN-END:variables
}
