/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

/**
 *
 * @author TAWFIQ $
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] arr=new int[15];
        int key=11;
        arr[0]=77;
        arr[1]=22;
        arr[14]=13;
        arr[2]=45;
        arr[3]=89;
        arr[4]=77;
        arr[5]=12;
        arr[6]=4;
        arr[7]=3;
        arr[9]=23;
        arr[8]=10;
        arr[10]=11;
        arr[11]=12;
        arr[12]=77;
        arr[13]=90;
        for(int i=0;i<15;i++)
        {
            if(key==arr[i])
            {
                System.out.println("found");
              return;
            }
            
        }
        System.out.println("not found the key");
    }
    
}
