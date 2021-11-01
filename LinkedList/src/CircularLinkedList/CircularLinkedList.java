package CircularLinkedList;

public class CircularLinkedList <E>{
  private int size;
  protected Node last;
  public CircularLinkedList(){
    this.size = 0;
    this.last = null;
  }
  public void insert(E newItem){
    Node newNode = new Node(newItem,null);
    if (last == null){
      newNode.setNext(newNode);
      last = newNode;
    } else{ // last다음 노드에 삽입
      newNode.setNext(last.getNext());
      last.setNext(newNode);
    }
    size++;
  }
  public E delete(){ // last 다음 노드 삭제
    Node x = last.getNext();
    E deletedItem = (E) x.getItem();
    if (x == last){
      last = null;
    }else{
      last.setNext(x.getNext());
      x.setNext(null);
    }
    size--;
    return deletedItem;
  }
}
