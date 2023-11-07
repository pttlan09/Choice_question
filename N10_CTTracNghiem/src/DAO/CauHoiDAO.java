/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Random;

import Data.connect;
import Object.nganhang;
import java.util.Random;

/**
 *
 * @author An Nhien
 */
public class CauHoiDAO {
    //hàm trả về mã đề thi ngẫu nhiên trong cấp độ
    public static int getExamId(String capDo){
        List<Integer> listIntegers = new ArrayList<>();
        String sql="select * from tbNganHang";
        try(PreparedStatement ps=connect.getConnect().prepareStatement(sql)){
            ps.setString(1, capDo);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                listIntegers.add(rs.getInt("MaDT"));
            }
            if(listIntegers.size()==0){
                return -1;
            }else{
                Random rd=new Random();
                int x=rd.nextInt(listIntegers.size());
                return listIntegers.get(x);
            }                         
        }catch(Exception e){
                e.printStackTrace();
                }
        return -1;
    }   
    //hàm lấy câu hỏi đề thi
    public static  List<nganhang> selectReading(int maDT){
        //tạo list chứa ds câu hỏi
        List<nganhang> list=new ArrayList<>();
        int lenCH=list.size();
        List<Integer> randomCH=randomList(lenCH,15);
        for(int i=0;i<randomCH.size();i++){
            list.add(list.get(randomCH.get(i)));
        }
        return list;
    }
    
    //hàm lấy list random
    public static List<Integer> randomList(int max, int count){
        List<Integer> list = new ArrayList<>();
        Random rd = new Random();
        while (list.size() < count) {
            int x = rd.nextInt(max);
            boolean flag = false;
            for (int i : list) {
                if (x == i) {
                    flag = true;
                }
            }
            if (!flag) {
                list.add(x);
            }
        }
        return list;
    }
    
    //dòng 203 bên bài kia
//    public static List<nganhang> getList(String tenDT){
//        List<nganhang> list=new ArrayList<>();
//        String sql=
//    }
//    public static void insert (nganhang ch){
//        String sqlString="insert into tbNganHang values("
//    }
}
