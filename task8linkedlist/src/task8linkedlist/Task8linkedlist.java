/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 
//--------------------------------------writen by tawfik ashraf shlash------------------------------------------------ 
package task8linkedlist;

/**
 *
 * @author TAWFIQ $
 */
class link{
    public int iData;
    public double dData;
    public link next;
//-----------------------------------------
public link(int id,double dd)
{
    iData=id;
    dData=dd;
}
//-----------------------------------------
public void displayLink(){
System.out.print("{"+iData+","+dData+"}");
}
}
class LinkedList{
private link first;
//----------------------------------
public LinkedList(){
    first=null;
}
//-----------------------------------
public void insertFirst(int id,double dd)
{
    link newLink=new link(id,dd);
    newLink.next=first;
    first=newLink;
}
//-----------------------------------
public link search(int key){
    link current=first;
    while(current.iData!=key){
        if(current.next==null)
        {
            return null;
        }else
        {
            current=current.next;
        }
        
    }
        return current;
    }
//----------------------------------------
public link delete(int key)
{
    link current=first;
    link previous=first;
    while(current.iData!=key)
    {
        if(current.next==null)
            return null;
        else
        {
            previous=current;
            current=current.next;
        }
    }
    if(current==first)
        first=first.next;
    else
        previous.next=current.next;
    return current;
}
public void displayList(){
    System.out.print("list(first--last):");
    link current=first;
    while(current!=null)
    {
        current.displayLink(); 
        current=current.next;
    }
    System.out.println("");
}
public int nodesnumber(){
    int n=0;
    
    link current=first;
    while(current!=null)
    {
        n++;
        current=current.next;
    }
   return n;
}
public void Reverse(){
    LinkedList newlist=new LinkedList();
    
    link current=first;
    while(current!=null)
    {
        newlist.insertFirst(current.iData, current.dData);
        current=current.next;
    }
    first=newlist.first;
}
//------------------------------
}
    

public class Task8linkedlist {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList theList=new LinkedList();
        theList.insertFirst(10, 15);
        theList.insertFirst(20,33);
        theList.insertFirst(33, 22.2);
        theList.insertFirst(44, 15);
        theList.displayList();
        link f=theList.search(44);
        if(f!=null)
            System.out.println("found link with key"+f.dData);
        System.out.println(theList.nodesnumber());
        
        theList.Reverse();
        
        theList.displayList();
        
        
        
    }
    
}
