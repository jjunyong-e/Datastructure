package Q1.Stack;

public class LinkedStack <E>{
  private Node<E> top;
  private int size;
  public LinkedStack(){
    top = null;
    size = 0;
  }
  public int size(){
    return size;
  }
  public boolean empty(){
    return size == 0;
  }
  public E peek(){
    return top.getItem();
  }
  public void push(E newItem){
    Node newNode = new Node(newItem,top);
    top = newNode;
    size++;
  }
  public E top(){
    return top.getItem();
  }
  public E pop(){
    E topItem = top.getItem();
    top = top.getNext();
    size--;
    return topItem;
  }
}

