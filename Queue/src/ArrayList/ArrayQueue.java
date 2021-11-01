package ArrayList;

public class ArrayQueue <E>{
  private E[] a;
  private int front,rear, size;
  public ArrayQueue(){
    this.a = (E[]) new Object[2];
    this.front = 0;
    this.rear = 0;
    this.size = 0;
  }
  public void add(E newItem){
    if((rear + 1) % a.length == front){
      reSize(2 * a.length);
    }
    rear = (rear + 1) % a.length;
    a[rear] = newItem;
    size++;
  }
  public E remove(){
    front = (front + 1) % a.length;
    E removedItem  = a[front];
    a[front] = null;
    size --;
    if(getSize() > 0 && getSize() == a.length/4){
      reSize(a.length/2);
    }
    return removedItem;
  }
  public void reSize(int newSize){
    Object k[] = new Object[newSize];
    for (int i = 1, j = front + 1; i < size+1; i++, j ++) {
      k[i] = a[j%a.length];
    }
    a = (E[]) k;
  }
  public boolean isEmpty(){return size ==0;}
  public int getSize(){return size;}
  public E peek(){
    return a[front];
  }
public String toString(){
    String str = "";
    for (int i = 1; i < getSize()+1; i++){
      str += a[i] + " ";
    }
    return str;
  }
}
