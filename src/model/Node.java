package model;

import java.util.ArrayList;

public class Node {
    private final Day day;
    public Node next;

    public Node(Day day){
        this.day = day;
        this.next = null;
    }

    public Day getDay() { return day; }
}
