package Stack.singleLinkedList;

public class Node<E>{
	private Node<E> next;
	private E item;
	public Node(E newItem,Node<E> newNode){
		this.next = newNode;
		this.item = newItem;
	}
	public Node<E> getNext() {return next;}
	public E getItem() {return item;}
	public void setNext(Node<E> next) {this.next = next;}
	public void setItem(E item) {this.item = item;}
}
