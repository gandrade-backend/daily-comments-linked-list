package service;

import model.Day;
import model.Humor;
import model.Node;

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

    //Incomplete
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

    //Incomplete
    public void printRegister(Node<Day> node){
        System.out.println("Id : " + node.getData().getId());
        System.out.println("Date: " + node.getData().getDate());
        System.out.println("Humor: " + node.getData().getHumor());
        for(String c : node.getData().getComments()){
            System.out.println("Comments: " + c);
        }
        System.out.println("Note of The Day: " + node.getData().getNoteOfTheDay());
    }

    //Incomplete
    public void printAllRegisters(){
        if(!checkEmpty()) {
            Node<Day> current = start;
            while(current != null){
                printRegister(current);
                current = current.next;
            }
        }
    }

    //Incomplete / id found or no
    public void removeById(int id){
        if(!checkEmpty()) {
            Node<Day> current;
            for(current = start; current != null; current = current.next){
                if(current.getData().getId() == id){
                    break;
                }
            }
            if(current != null){
                if(current == start){
                    start = current.next;
                    if(start != null){
                        current.previous = null;
                    }
                }
                else{
                    if(current.previous != null){
                        current.previous.next = current.next;
                    }
                    if(current.next != null){
                        current.next.previous = current.previous;
                    }
                }
            }
        }
    }

    //Complete
    public void searchForHumor(Humor humor){
        if(!checkEmpty()) {
            Node<Day> n = start;
            int count = 0;
            while(n != null){
                if(n.getData().getHumor() == humor){
                    printRegister(n);
                    count++;
                }
                n = n.next;
            }
            if(count == 0)
                System.out.println("There is no Register of this Type of Humor");
        }
    }

    //Complete
    public double averageOfTheDay(){
        if(checkEmpty()) { return 0; }

        Node<Day> current = start;
        double noteTotal = 0;
        int count = 0;

        while(current != null){
            noteTotal += current.getData().getNoteOfTheDay();
            current = current.next;
            count++;
        }
        return noteTotal/count;
    }

    public void humorMoreOften(Humor humor){
        if(!checkEmpty()){

        }
    }

    //Complete
    public void cleanRegistry(){
        if(!checkEmpty()) {
            start = null;
        }
    }
}
