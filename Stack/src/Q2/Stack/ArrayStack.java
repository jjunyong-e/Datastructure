package Q2.Stack;

public class ArrayStack <E>{
  private int top;
  private E[] a;
  public ArrayStack (){
    top = -1;
    a = (E[]) new Object [1];
  }
  public boolean empty(){
    return(top == -1);
  }
  public void reSize(int newSize){
    Object [] t = new Object [newSize];
    for (int i = 0; i < a.length; i++){
      t[i] = a[i];
    }
    a = (E[]) t;
  }
  public int getSize(){
    return top + 1;
  }
  public void push(E newItem){
    if (getSize() == a.length){
      reSize(2*a.length);
    }
    a[++top] = newItem;
  }
  public E top(){
    return a[top];
  }
  public E pop(){
    if(getSize() > 0 && getSize() < a.length/4){
      reSize(a.length/2);
    }
    E poped = a[top];
    a[top--] =null;
    return poped;
  }
  public String toString(){
    String str = "";
    for(int i = 0; i < a.length;i ++){
      str += a[i];
    }
    return str;
  }

}
