package DoubleLinkedList;

public class doubleLinkedList<E> {
  protected Node head;
  protected Node tail;
  private int size;
  public doubleLinkedList(){
    head = new Node(null,null,null);
    tail = new Node(null,head,null);
    head.setNext(tail);
    this.size = 0;
  }
  public String toString(){
    String str = "";
    Node p =head;
    for (int i = 0; i < size; i++) {
      p = p.getNext();
      str += p.getItem() + " ";
    }
    return str;
  }
  public void insertBefore(E newItem, Node p){
    Node pPrev = p.getPrev();
    Node newNode = new Node(newItem,pPrev, p);
    pPrev.setNext(newNode);
    p.setPrev(newNode);
    size++;
//    p앞에넣기 -->pPrev,p,pNext  --> pprev newNode p pnext
  }
  public void insertAfter(E newItem, Node p){
    Node pNext = p.getNext();
    Node newNode = new Node(newItem,p,pNext);
    pNext.setPrev(newNode);
    p.setNext(newNode);
    size++;
//    p앞에넣기 -->pPrev,p,pNext  -->  p newNode pnext
  }
  public void delete(Node targetNode){
    Node p = targetNode.getPrev();
    Node q = targetNode.getNext();
    p.setNext(q);
    q.setPrev(p);
    size--;
//    --> p target q -->
  }
  public Node peek(int index){
    Node p = head;
    for (int i = 0; i < index; i++) {
      p = p.getNext();
    }
    return p;
  }
  public int getSize(){return size;}
  public boolean isEmpty(){return size == 0;}
  public void swap(int index1, int index2){
    Node p = head; // 싱글에서 peek같은기능
    // index12를 0이랑 size랑 비교해서 차이로 tail부터 갈지 head에서 갈지결정할수도 있음 --> 더블 링크드 리스트 장점
    for (int i = 0; i < index1; i++) {
      p = p.getNext();
    }
    Node q = head;
    for (int i = 0; i < index2; i++) {
      q = q.getNext();
    }
    int temp1 = (int)p.getItem();
    int temp2 = (int)q.getItem();
    p.setItem(temp2);
    q.setItem(temp1);
    //insertion에서랑 비슷한 기능 setItem 으로 이용
  }
  public Node partition(Node left, Node right) {
    System.out.println("part");


    Node p = left.getPrev();
    for(Node q=left; q!=right; q=q.getNext()) {
      if((int)q.getItem()<=(int)pivot.getItem()){
        if(p == null){
          p = left;
        }else{
          p.getNext();
        }
        int temp = (int) p.getItem();
        p.setItem(q.getItem());
        q.setItem(temp);
      }
    }
    if(p == null){
      p = null;
    }else{
      p.getNext();
    }
    int temp = (int)p.getItem();
    p.setItem(pivot.getItem());
    pivot.setItem(temp);
    System.out.println(p.getItem());
    return p;
  }
  public void QuickSort(Node left, Node right) {
    System.out.println("sort");
    if(right!=null && left!=right && left!=right.getNext()) {
      Node p = partition(left,right);
      QuickSort(left,p.getPrev());
      QuickSort(p.getNext(),right);
    }
  }
}
