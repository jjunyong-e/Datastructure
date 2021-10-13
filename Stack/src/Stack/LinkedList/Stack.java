package Stack.LinkedList;

public class Stack<E> {
	private int size;
	private Node<E> top;
	public Stack(){
		top = null;
		size = 0;
	}
	public void push(E newItem){
		Node newNode = new Node(newItem, top);
		top = newNode;
		size++;
	}
	public E pop(){
		E poped = top.getItem();
		top = top.getNext();
		size--;
		return poped;
	}
	public String toString(){
		String str = "";
		Node p = top;
		for(int i = 0; i < size; i++){
			str += (String)p.getItem();
			p = p.getNext();
		}
return str;
	}}
