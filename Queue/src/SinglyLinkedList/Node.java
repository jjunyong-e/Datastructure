package SinglyLinkedList;

public class Node <E>{
  private Node<E> next;
  private E item;
  public Node(E item, Node nextNode){
    this.item = item;
    this.next = nextNode;
  }

  public Node<E> getNext() {
    return next;
  }

  public void setNext(Node<E> next) {
    this.next = next;
  }

  public E getItem() {
    return item;
  }

  public void setItem(E item) {
    this.item = item;
  }

}
