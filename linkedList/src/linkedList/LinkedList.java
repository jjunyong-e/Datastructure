package linkedList;

public class LinkedList<E> {
  protected Node head;
  private int size;
  public LinkedList(){
    head = null;
    size = 0;
  }
  public int search(E target){
    Node p = head;
    for(int i = 0; i < size; i++){
      if (target== p.getItem()){
        return i;
      }else{
        p = p.getNext();
      }
    }
    return -1;
  }
  public void InsertFront(E newItem){
    head = new Node(newItem,head);
    size ++;
  }
  public void InsertAfter(E newItem,Node p){
    p.setNext(new Node(newItem,p.getNext()));
    size++;
  }
  public void deleteFront(){
    head= head.getNext();
    size--;
  }
  public void deleteAfter(Node p){
    Node t = p.getNext();
    p.setNext(t.getNext());
    t.setNext(null);
    size -- ;
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
