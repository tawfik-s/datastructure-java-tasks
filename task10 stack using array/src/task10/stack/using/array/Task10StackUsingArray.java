/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task10.stack.using.array;

/**
 *
 * @author TAWFIQ $
 */
 class stack {

        private int maxSize;
        private double[] stackArray;
        private int top;

        public stack(int max)
        {
            maxSize=max;
            stackArray=new double[maxSize];
            top=-1;
        }
        public void push(int elem)
        {
            stackArray[++top]=elem;
        }
        public double pop()
        {
            return stackArray[top--];
        }
        public double peek()
        {
            return stackArray[top];
        }
        public boolean isEmpty()
        {
            return top==-1;
        }
        public boolean isfull()
        {
            return top==maxSize-1;
        }

}

public class Task10StackUsingArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
