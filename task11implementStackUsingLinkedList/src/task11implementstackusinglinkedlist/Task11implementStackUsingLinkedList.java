/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task11implementstackusinglinkedlist;

/**
 *
 * @author TAWFIQ $
 */


class Link{

    public double dData;
    public Link next;
    //------------------------
    public Link( double dd)
    {

        dData=dd;
    }
    public void displayLink()
    {
        System.out.print("{"+dData+"}");
    }

}


 class linkList {
    private Link first;

    public linkList()
    {
        first=null;
    }
    public boolean isEmpty(){return (first==null);}
    public void insertFirst( double dd)
    {
        Link newLink=new Link(dd);
        newLink.next=first;
        first=newLink;
    }
    //--------------------------------------
   public double deleteFirst()
   {
       Link temp=first;
       first=first.next;
       return temp.dData;
   }
    //-----------------------------------------
   public void displayList()
   {
       Link current=first;
       while(current!=null)
       {
           current.displayLink();
           current=current.next;
       }
       System.out.println(" ");
   }


}
///////////////////////////////////////////////////////////////////
class LinkStack
{
    private linkList theList;

    //=====================================

    public LinkStack()       //constructor
    {
        theList=new linkList();
    }
    //----------------------------------------------------
    public void push(double j)
    {
        theList.insertFirst(j);
    }
    //----------------------------------
    public double pop()
    {
        return theList.deleteFirst();
    }
    public boolean isEmpty()
    {
        return (theList.isEmpty());
    }
    public void displayStack()
    {
        System.out.print("Stack(top-->bootom):");
        theList.displayList();
    }
}
public class Task11implementStackUsingLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    }
    
}
