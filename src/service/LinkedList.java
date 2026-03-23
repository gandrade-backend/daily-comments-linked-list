package service;

import model.Day;
import model.Humor;
import model.singly.Node;

public class LinkedList {
    Node<Day> start;

    //Constructor
    public LinkedList(){
        this.start = null;
    }

    //
    public boolean isEmpty(){
        return start == null;
    }

    //Check if it's empty
    public boolean checkEmpty() {
        if(isEmpty()){
            System.out.println("The List is empty");
            return true;
        }
        return false;
    }

    //Complete
    public void addRegistration(Day day){
        Node<Day> newNode = new Node<>(day);

        if(isEmpty()){ start = newNode; }
        else{
            Node<Day> current = start;

            while(current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    //Incomplete
    public void printRegister(Node<Day> node){
        System.out.println("Id : " + node.getData().getId());
        System.out.println("Date: " + node.getData().getDate());
        System.out.println("Humor: " + node.getData().getHumor());
        System.out.println("Comments: " + node.getData().getComments());
        System.out.println("Note of The Day: " + node.getData().getNoteOfTheDay());
    }

    //Name Incomplete
    public void printAllRegisters(){
        if(!checkEmpty()) {
            Node<Day> current = start;
            while(current.next != null){
                printRegister(current);
            }
        }
    }

    //Incomplete
    public void removeById(int id){
        if(!checkEmpty()) {
            Node<Day> current, previous;
            for(current = start; current != null; current = current.next){
                if(current.getData().getId() == id){
                    break;
                }
                previous = current;
            }
            if(current != null){

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
        return count == 0 ? 0 : noteTotal/count;
    }

    //Complete
    public void cleanRegistry(){
        if(!checkEmpty()) {
            start = null;
        }
    }
}
