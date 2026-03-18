package service;

import model.Node;

public class LinkedList {
    Node start;

    public boolean IsEmpty(){
        return start == null;
    }

    public void Insert(){
        //Node newNode = new Node();


    }

    public void print(){
        if(!IsEmpty()) {
            for(Node n = start; n != null; n = n.next){

            }
        }else
            System.out.println("The Node is empty");
    }
}
