package model;

import java.util.ArrayList;

public class Node {
    private int id;
    private Day date;
    private ArrayList<Comments> comments;
    public Node next;

    public Node(int id, Day date){
        this.id = id;
        this.date = date;
        this.next = null;
    }
}
