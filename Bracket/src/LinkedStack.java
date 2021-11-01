public class LinkedStack<E> {
  public int size;
  public Node<E> top;
  public LinkedStack(){
    this.top = null;
    this.size = 0;
  }
  public int getSize(){return size;}
  public boolean isEmpty(){return size == 0;}
  public void push(E newItem){
    Node<E> p = new Node<E>(newItem,headm);
    p.setNext(top);
    top = p;
    size++;
  }
  public E peek(){
    if(isEmpty())
      throw new NullPointerException();
    return top.getItem();
  }
  public E pop(){
    E topItem = peek();
    top = top.getNext();
    size--;
    return topItem;
  }
  public String toString(){
    String str = "";
    Node<E> p = top;
    for(int i=0;i<getSize();i++){
      str += p.getItem();
      p = p.getNext();
    }
    return str;
  }
}
