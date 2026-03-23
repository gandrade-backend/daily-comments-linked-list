package service;

import model.Day;
import model.Humor;
import model.Node;

public class LinkedList {
    Node start;

    public LinkedList(){
        this.start = null;
    }

    public boolean isEmpty(){
        return start == null;
    }

    public boolean checkEmpty() {
        if(isEmpty()){
            System.out.println("The List is empty");
            return true;
        }
        return false;
    }

    public void insert(Day day){
        Node newNode = new Node(day);

        if(isEmpty()){ start = newNode; }
        else{
            Node current = start;

            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    //Name Incomplete
    public void print(){
        if(checkEmpty()) { return; }
        else {
            Node current = start;
            while(current.next != null){
                System.out.println("print");
            }
        }
    }

    //Incomplete
    public void removeById(int id){
        if(checkEmpty()) { return; }
        else{

        }
    }

    public void searchForHumor(Humor humor){
        if(checkEmpty()) { return; }
    }

    //Incomplete
    public void averageOfTheDay(){
        if(checkEmpty()) { return; }
        else{
            Node current = start;
            double noteTotal = 0;
            while(current.next != null){
                noteTotal += current.getDay().getNoteOfTheDay();
            }
        }
    }
}
