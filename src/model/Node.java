package model;

import java.util.ArrayList;

public class Node {
    private final Day date;
    public Node next;

    public Node(Day date){
        this.date = date;
        this.next = null;
    }


}
