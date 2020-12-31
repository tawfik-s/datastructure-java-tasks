/*
  *bubble and insertion sort.java program
*/
package task5;

/**
 *
 * @author TAWFIQ $
 */

public class Task5 {

    /**
     * @param args the command line arguments
     */
    static void bubbleSort(int[] v,int nElems)
    {
        int out,in;
        for(out=nElems-1;out>1;out--)
        {
            for(in=0;in<out;in++)
                if(v[in]>v[in+1])
                {
                    int x=v[in];
                    v[in]=v[in+1];
                    v[in+1]=x;
                }
        }
    }
    static void insertionSort(int[]v,int nElems)
    {
        int in,out;
        for(out=1;out<nElems;out++)
        {
            int temp=v[out];
            in=out;
            while(in>0&&v[in-1]>temp)
            {
                v[in]=v[in-1];
                --in;
            }
            v[in]=temp;
        }
    }
    
    public static void main(String[] args) {
         int[] arr=new int[15];
        
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
        bubbleSort(arr,15);
        for(int i:arr)
            System.out.println(i);
    }
    
}
