package SinglyLinkedList;

public class LinkedQueue<E>{
  private Node <E> front ,rear;
  private int size;
  public LinkedQueue(){
    this.front = null;
    this.rear = null;
    this.size = 0;
  }
  public int getSize(){return size;}
  public boolean isEmpty(){return size == 0;}
  public void add (E newItem){
    Node<E> newNode = new Node(newItem,null);
    if(isEmpty()){
      front = newNode;
    } else{
      rear.setNext(newNode);
    }
    rear = newNode;
    size++;
  }
  public E remove(){
    E frontItem = front.getItem();
    front = front.getNext();
    if(isEmpty()){
      rear = null;
    }
    size--;
    return frontItem;
  }
  public E peek(){
    return front.getItem();
  }
  public String toString(){
    String str ="";
    Node p = front;
    for(int i = 0; i < size; i++){
      str += p.getItem() + " ";
      p = p.getNext();
    }
    return str;
  }
}
