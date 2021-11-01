package Stack.arrayList;

public class Stack<E> {
	private int top; // top의 인덱스
	private E[] a; // 아이템 저장될 배열
	public Stack(){
		top = -1;
		a = (E[]) new Object[1];
	}

	public boolean isEmpty(){return top == -1;}
	public int getSize(){return top+1;}
	public void resize(int newSize){
		Object[] s = new Object[newSize];
		for(int i = 0; i < getSize(); i++){
			s[i] = a[i];
		}
		a = (E[])s;
	}
	public void push(E newItem){
		if(a.length == getSize()){
			resize(2*a.length);
		}
		a[++top] = newItem;
	}
	public E pop(){
		E poped = a[top];
		a[top--] = null;
		if(getSize() > 0 && getSize()==a.length/4){
			resize(a.length/2);
		}
		return poped;
	}
	public E peek(int index){
		E item = a[index];
		return item;
	}
}
