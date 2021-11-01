public class Node <E>{
    private E item;
    private Node prev;
    private Node next;
    public Node(E item, Node prev, Node next){
        this.item = item;
        this.next = prev;
        this.prev = next ;
    }
    public E getItem() {
        return item;
    }
    public void setItem(E item) {
        this.item = item;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }

}
