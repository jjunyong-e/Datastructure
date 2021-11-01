package DoubleLinkedList;

public class Node <E>{
  private Node prev;
  private Node next;
  private E item;
  public Node(E newItem,Node prev, Node next){
    this.item = newItem;
    this.prev = prev;
    this.next = next;
  }

  public Node getPrev() {
    return prev;
  }

  public void setPrev(Node prev) {
    this.prev = prev;
  }

  public Node getNext() {
    return next;
  }

  public void setNext(Node next) {
    this.next = next;
  }

  public E getItem() {
    return item;
  }

  public void setItem(E item) {
    this.item = item;
  }
}
