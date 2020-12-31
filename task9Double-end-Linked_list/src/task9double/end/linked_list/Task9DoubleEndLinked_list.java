/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task9double.end.linked_list;

/**
 *
 * @author TAWFIQ $
 */
class link3{
    public double dData;
    public link3 next;
    //----------------------------
    public link3(double d)
    {
        dData =d;
    }
    public void displayLink()
    {
        System.out.print(dData+" ");
    }
}
///////////////////////////////////////////////////////////////////////////////////////////////////
 class doubleEndedlist {
    private link3 first;
    private link3 last;
    //====================================================
    public doubleEndedlist()
    {
        first=null;
        last=null;
    }
    //---------------------------------------------------------
    public boolean isEmpty()
    {
        return (first==null);
    }
    //----------------------------------------------
    public void insertFirst(double dd)
    {
        link3 newlink=new link3 (dd);
        if(isEmpty())
            last=newlink;
        newlink.next=first;
        first=newlink;
    }
    public void insertLast(double dd)
    {
        link3 newLink=new link3 (dd);
        if(isEmpty())
            first=newLink;
        else
            last.next=newLink;
            last=newLink;
    }
    public double deleteFirst()
    {
        double temp=first.dData;
        if(first.next==null)
            last=null;
        first=first.next;
        return temp;
    }
    public void displayList()
    {
        System.out.print("List(first-->last):");
        link3 current=first;
        while(current!=null)
        {
            current.displayLink();
            current=current.next;
        }
        System.out.print(" ");
    }

}
public class Task9DoubleEndLinked_list {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
    }
    
}
