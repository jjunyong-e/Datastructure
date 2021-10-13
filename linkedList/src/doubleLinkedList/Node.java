package doubleLinkedList;

public class Node <E> {
	private E item;
	private Node prev;
	private Node next;

	public Node(E newItem, Node p, Node q){
		item = newItem;
		prev = p;
		next = q;
	}
	public E getItem(){return item;}
	public Node getPrev(){return prev;}
	public Node getNext(){return next;}
	public void setItem(Node item){this.prev = item;}
	public void setPrev(Node p){prev = p;}
	public void setNext(Node q){next = q;}
}
