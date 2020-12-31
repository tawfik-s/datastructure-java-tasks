/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test14;

/**
 *
 * @author TAWFIQ $
 */
 class Queue {
    private int maxSize;
    private double [] queArray;
    private int front ;
    private int rear;
    private int nitems;

    public Queue(int max)
    {
        maxSize=max;
        queArray=new double[maxSize];
        front=0;
        rear=-1;
        nitems=0;
    }
    public void insert(double j)
    {
        if(rear==maxSize-1)
            rear=-1;
        queArray[++rear]=j;
        nitems++;
    }
    public double remove()
    {
        double s=queArray[front++];
        if(front==maxSize)
            front=0;
        nitems--;
        return s;
    }
    public double peekfront()
    {
        return queArray[front];
    }
    public boolean isEmpty()
    {
        return nitems==0;
    }
    public boolean isFull()
    {
        return nitems==maxSize;
    }
    public int size()
    {
        return nitems;
    }


}

public class Test14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
