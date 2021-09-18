package Q1.Stack;
import static java.lang.System.exit;

import java.util.EmptyStackException;


public class ArrayStack <E> {

  private int top;
  private E[] a;

  public ArrayStack() {
    top = -1;
    a = (E[]) new Object[1];
  }

  public int getSize() {
    return top+1;
  }
  public E top(){
    return a[top];
  }

  public E pop() {
    if (empty()){
      throw new EmptyStackException();
    }
    E poped = a[top];
    a[top--] = null;
    if (getSize() > 0 && getSize() == a.length / 4) {
      reSize(a.length / 2);
    }
    return poped;
  }

  public void reSize(int newSize) {
    Object[] t = new Object[newSize];
    for (int i = 0; i < getSize(); i++) {
      t[i] = a[i];
    }
    a = (E[]) t;
  }

  public boolean empty() {
    return (top == -1);
  }

  public void push(E newItem) {
    if (getSize() == a.length) {
      reSize(2 * a.length);
    }
    a[++top] = newItem;
  }
}

