/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author An Nhien
 */
public class loadch {
    public ArrayList<ch>loadch(){
          ArrayList<ch>listch=new ArrayList<>();
          try{
              File file=new File("db");
              BufferedReader br=new BufferedReader(new FileReader(file));
              String line=br.readLine();
              while(line!=null){
                  String q[]=line.split(";");
                  ch question=new ch(q[0],q[1],q[2],q[3],q[4],q[5].charAt(0));
                  listch.add(question);
                  line=br.readLine();
              }
          }
          catch(IOException ioe){
              ioe.printStackTrace();
          }
          return listch;
    }
}
