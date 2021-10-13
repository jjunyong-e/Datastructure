package Stack.ArrayList;

import java.util.Arrays;

public class ArrayStack<E> {
	private E s[];
	private int size;
	public ArrayStack(){
		s = (E[]) new Object[1];
		size = -1;
	}

	public int getSize() {
		return size+1;
	}
	public E pop(){
		if (getSize()< s.length/4){
			resize(s.length/2);
		}
		E poped = s[size];
		s[size--] = null;
		return poped;
	}
	public boolean isEmpty() {
		return size == -1;
	}
	public void push(E newItem) {
		if (getSize() == s.length){
			resize(2*s.length);
		}
		s[++size] = newItem;
	}
	public E peek(){
		return s[size];
	}
	public void resize(int newSize){
		Object[] k = new Object[newSize];
		for (int i = 0; i <= size; i++) {
			k[i] = s[i];
		}
		s = (E[])k;
	}
//public String toString() {
//	String str = "";
//
//}
}
