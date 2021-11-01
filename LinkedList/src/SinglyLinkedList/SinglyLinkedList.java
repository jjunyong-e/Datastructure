package SinglyLinkedList;

public class SinglyLinkedList <E> {
  private Node head;
  private int size;
  public boolean isEmpty(){return size ==0;}
  public int getSize(){return size;}
  public void InsertFront(E newItem){
    Node newNode = new Node(newItem,head);
    newNode.setNext(newNode);
    size++;
  }
  public void insertAfter(E newItem,Node p){
    Node newNode = new Node(newItem,p.getNext());
    p.setNext(newNode);
    newNode.setNext(p.getNext());
    size++;
  }
  public E peek(int index){
    Node p = head;
    for(int i = 0; i < index; i++){
      p = p.getNext();
    }
    return (E) p.getItem();
  }
  public E deleteFront(){
    E deletedItem = (E) head.getItem();
    head = head.getNext();
    size--;
    return deletedItem;
  }
  public E deleteAfter(Node p ){
    Node q = p.getNext();
    E deletedItem = (E) q.getItem();
    p.setNext(q.getNext());
    size--;
    return deletedItem;
  }
  public int search(E target){
    Node p = head;
    for (int i = 0; i < size; i++) {
      if(p.getItem() == target){return i;}
      p = p.getNext();
    }
    return -1;
  }
}
