package service;

import model.Day;
import model.doubly.Node;

public class DoublyLinkedList {
    Node<Day> start;

    public DoublyLinkedList(){
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

    public void addRegistration(Day day){
        Node<Day> newNode = new Node<>(day);

        if(isEmpty()){ start = newNode; }
        else{
            Node<Day> current = start;

            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
            newNode.previous = current;
        }
    }

    public void printRegister(model.singly.Node<Day> node){
        System.out.println("Id : " + node.getData().getId());
        System.out.println("Date: " + node.getData().getDate());
        System.out.println("Humor: " + node.getData().getHumor());
        System.out.println("Comments: " + node.getData().getComments());
        System.out.println("Note of The Day: " + node.getData().getNoteOfTheDay());
    }


}
