package DoublyLinkedList;

import java.util.NoSuchElementException;

public class DoublyLinkedList <E> {
  protected Node head,tail;
  private int size;
  public DoublyLinkedList(){
    this.size = 0;
    this.head = new Node(null,null,null);
    this.tail = new Node(null,head,null);
    head.setNext(tail);
    tail.setPrev(head);
  }
  public int getSize(){return size;}
  public boolean isEmpty(){return size == 0;}

  public void insertFront(E newItem){
    // head - p
    // --> head - newNode - p
    Node p = head.getNext();
    Node newNode = new Node(newItem,head,p);
    p.setPrev(newNode);
    head.setNext(newNode);
    size++;
  }
  public void insertBack(E newItem){
    // q - p - tail
    //--> p - newNode- tail
    // 위와같은 형식으로 변환
    Node p = tail.getPrev();
    Node newNode = new Node(newItem,p,tail);
    p.setNext(newNode);
    tail.setPrev(newNode);
    size++;
  }

  public E deleteBack(){
     // q - p - tail
    // --> q - tail
    //위같이 변한다
    Node p = tail.getPrev();
    Node q = p.getPrev();
    E deletedItem = (E) p.getItem();
    tail.setPrev(q);
    q.setNext(tail);
    size--;
    return deletedItem;
  }
  public E deleteFront(){
    // head - p - q
    // ==> head - q
    //위같이 변환한다

    Node p = head.getNext();
    E deletedItem = (E) p.getItem();
    Node q = p.getNext();
    head.setNext(q);
    q.setPrev(head);
    size--;
    return deletedItem;
  }
public E peek(){
      Node p = tail.getPrev(); // tail 앞의 노드 p
      return (E) p.getItem(); // P의 아이템 리턴
  }
  public String toString(){
    String str = "";
    Node p = head.getNext();
    for (int i = 0; i < getSize(); i++) {
      str += p.getItem();
      p = p.getNext();
    }
    return str;
    //헤드는 더미이므로 헤드 다음부터 사이즈 에 맞춰 뒤로가며 str에 더한다
  }
}
