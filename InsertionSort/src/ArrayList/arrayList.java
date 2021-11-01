package ArrayList;

public class arrayList<E> {
  private E[] a;
  private int size;
  public arrayList(){
    this.size = 0;
    this.a = (E[])new Object[1];
  }
  public void insertLast(E e){
    if(size == a.length){
      reSize(2*a.length);
    }
    a[size++] = e;
  }
  public void insert(E e, int index){
    if(size == a.length){
      reSize(2*a.length);
    }
    for (int i = size-1; i >= index; i--) {
      a[i+1] = a[i];
    }
    a[size++] = e;
  }
  public void setItem(E e,int index){
    a[index] = e;
  }
  public E delete(int index){
    E deleted = a[index];
    for (int i = index; i < size; i++) {
      a[i] = a[i+1];
    }
    size --;
    if(size == a.length/4){
      reSize(a.length/2);
    }
    return deleted;
  }
  public E peek(int index){
    return a[index];
  }
  public void delete(){}
  public boolean isEmpty(){return size == 0;}
  public int getSize(){return size;}
  public void reSize(int newSize){
    Object [] k = new Object[newSize];
    for(int i = 0; i < size; i++){
      k[i] = a[i];
    }
    a = (E[])k;
  }
  public String toString(){
    String str = "";
    for(int i = 0; i < size; i++){
      str += a[i] + " ";
    }
    return str;
  }
}
