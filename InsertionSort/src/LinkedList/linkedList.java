package LinkedList;

public class linkedList <E>{
  protected Node<E> head;
  private int size;
  public linkedList(){
    this.head = null;
    this.size = 0;
  }
  public int getSize(){return size;}
  public boolean isEmpty(){return size==0;}
  public void insertFront(E newItem){
    Node newNode = new Node(newItem,head);
    newNode.setNext(head);
    head = newNode;
    size++;
  }
  public void insert(E newItem, Node prev){
    Node after = prev.getNext();
    Node newNode = new Node(newItem,after);
    prev.setNext(newNode);
    newNode.setNext(after);
    size++;
  }
  public void change(E newItem,int index){
    Node p = head;
    for (int i = 0; i < index; i++) {
      p = p.getNext();
    }
    p.setItem(newItem);
  }
  public int search(E target){
    Node p = head;
    for (int i = 0; i < size; i++) {
      if(p.getItem() == target){return i;}
      p = p.getNext();
    }
    return -1;
  }
  public E peek(int index){
    Node p = head;
    for (int i = 0; i < index; i++) {
      p = p.getNext();
    }
    return (E) p.getItem();
  }
  public void deleteFront(){
    Node p = head;
    Node nextHead = p.getNext();
    head = nextHead;
    size--;
  }
public String toString(){
    String str = "";
    Node p = head;
    for (int i = 0; i < size; i++) {
      str += p.getItem() + " ";
      p = p.getNext();
    }
    return str;
}

}
