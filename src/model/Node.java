package model;

public class Node<T> {
    private final T data;
    public Node<T> next;
    public Node<T> previous;

    public Node(T data){
        this.data = data;
        this.next = null;
        this.previous = null;
    }

    public T getData() { return data; }
}
