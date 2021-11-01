package LinkedList;

public class Node <E>{
  private E item;
  private Node<E> next;
  public Node(E newItem, Node<E> newNode) {
    this.next = newNode;
    this.item = newItem;
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
