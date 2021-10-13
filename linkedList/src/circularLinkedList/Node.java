package circularLinkedList;

public class Node<E>{
	Node next;
	E item;
	public Node(E newItem, Node next){
		this.item = newItem;
		this.next = next;
	}
	public E getItem(){return item;}
	public void setItem(E item){this.item = item;}
	public void setNext(Node newNode){this.next = newNode;}
	public Node getNext(){return this.next;}
}
