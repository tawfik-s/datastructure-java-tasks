/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task.pkg15;
import java.util.*; 
/**
 *
 * @author TAWFIQ $
 */
public class Task15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack<Character> st = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        st.push('w');
        st.push('e');
        st.push('l');
        st.push('l');
        st.push('c');
        st.push('o');
        st.push('m');
        st.push('e');
        for(int i=0;i<8;i++)
        {
            st2.push(st.pop());
        }
        st=st2;
        for(int i=0;i<8;i++)
        {
            System.out.print(st.pop());
        }
        
    }
    
}
