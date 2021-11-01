package SinglyLinkedList;

public class Node <E>{
  private E item;
  protected Node<E> next;
  public Node(E newItem, Node nextNode) {
    this.item = newItem;
    this.next = nextNode;
  }

  public E getItem() {
    return item;
  }

  public void setItem(E item) {
    this.item = item;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }
}
