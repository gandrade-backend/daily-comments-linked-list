package model.doubly;

public class Node<T> {
    private final T data;
    public Node<T> next;
    public Node<T> previous;

    public Node(T data){
        this.data = data;
    }

    public T getData() { return data; }
}
