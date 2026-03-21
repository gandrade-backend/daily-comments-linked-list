package service;

import model.Day;
import model.Node;

public class LinkedList {
    Node start;

    public boolean IsEmpty(){
        return start == null;
    }

    public void Insert(){
        //Node newNode = new Node();
        //Day day = new Day(date);
        //Node<Day> newNode = new Node<>(day);

    }

    public void print(){
        if(!IsEmpty()) {
            for(Node n = start; n != null; n = n.next){
                System.out.println("Id - " + n.getId() + "| Day - ");
                for(String c : n.commets){
                    System.out.println("commets - " + n.commets);
                }
            }
        }else
            System.out.println("The Node is empty");
    }
}
