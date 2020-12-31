/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//**
 *
 * @author TAWFIQ $
 */
package binarysearchtree;
class Node{
    public int iData;
    public int fData;
    Node leftChild;
    Node rightChild;
    public void displayNode()
    {
        System.out.println("{"+iData+","+fData+"}");
    }
}


public class tree {
    private Node root;
    //--------------------------------------------------------
    public Node find(int key)
    {
        Node current=root;
        while(current.iData!=key)
        {
            if(key<current.iData)
                current=current.leftChild;
            else
                current=current.rightChild;
            if(current==null)
                return null;
        }
        return current;
    }
    //----------------------------------------------------------
    public void insert(int id,int dd)
    {
        Node newNode=new Node();
        newNode.iData=id;
        newNode.fData=dd;
        if(root==null)
        {
            root=newNode;
        }
        else
        {
            Node current=root;
            Node parent;
            while(true)
            {
                parent=current;
                if(id<current.iData)
                {
                    current=current.leftChild;
                    if(current==null)
                        parent.leftChild=newNode;
                    return;
                }
                else
                {
                    current=current.rightChild;
                    if(current==null)
                        parent.leftChild=newNode;
                    return;
                }
            }
        }

    }
    //----------------------------------------------
    private void inOrder(Node localroot){
        while (localroot!=null)
        {
            inOrder(localroot.leftChild);
            localroot.displayNode();
            inOrder(localroot.rightChild);
        }
    }
    //---------------------------------------------
    public void inOrder(){
        inOrder(root);
    }
    //------------------------------------------------------
    private void preOrder(Node localroot){
        while(localroot!=null)
        {
            localroot.displayNode();
            preOrder(localroot.leftChild);
            preOrder(localroot.rightChild);
        }

    }
    //--------------------------------------------
    public void preOrder()
    {
        preOrder(root);
    }
    //-----------------------------------------
    private void postOrder(Node localroot)
    {
        while(localroot!=null)
        {
            postOrder(localroot.leftChild);
            postOrder(localroot.rightChild);
            localroot.displayNode();
        }
    }
    public void postOrder()
    {
        postOrder(root);
    }

    //---------------------------------------------
    public Node minimum()
    {
        Node current,last=null;
        current=root;
        while(current!=null)
        {
            last=current;
            current=current.leftChild;
        }
        return last;
    }
    //-------------------------------------------------------
    public Node Maximum()
    {
        Node current,last=null;
        current=root;
        while(current!=null)
        {
            last=current;
            current=current.rightChild;
        }
        return last;
    }
    
}
