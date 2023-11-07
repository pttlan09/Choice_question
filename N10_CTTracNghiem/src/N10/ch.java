/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package N10;

/**
 *
 * @author An Nhien
 */
public class ch {
    private String question;
    private String A;
    private String B;
    private String C;
    private String D;
    private char answer;
    
    public ch(){
        
    }

    public ch(String question, String A, String B, String C, String D, char answer) {
        this.question = question;
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.answer = answer;
    }

    public String getQuestion() {
        return question;
    }

    public String getA() {
        return A;
    }

    public String getB() {
        return B;
    }

    public String getC() {
        return C;
    }

    public String getD() {
        return D;
    }

    public char getAnswer() {
        return answer;
    }

    
}
