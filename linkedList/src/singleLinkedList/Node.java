package singleLinkedList;

public class Node<E> {
private E item;
private Node<E> next;
public Node(E newItem, Node<E> node) {
	item = newItem;
	next = node;
}

	public Node<E> getNext() {
		return next;
	}
	public void setItem(E newItem) {
		this.item = newItem;
	}
	public E getItem() {
		return item;
	}
	public void setNext(Node<E> newNext) {
		this.next = newNext;
	}
}
