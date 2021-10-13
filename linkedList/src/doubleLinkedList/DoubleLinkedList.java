package doubleLinkedList;

public class DoubleLinkedList <E>{
	protected Node tail;
	protected Node head;
	private int size;
	public DoubleLinkedList(){
		head = new Node(null,null,tail);
		tail = new Node(null,head,null);
		head.setNext(tail);

		size = 0;
	}
	public void insertBefore(Node p,E newItem){
		Node q = p.getPrev();
		Node inserted = new Node(newItem,q,p);
		q.setNext(inserted);
		p.setPrev(inserted);
		size ++;
	}
	public void insertAfter(Node p,E newItem){
		Node q = p.getNext();
		Node inserted = new Node(newItem,p,q);
		q.setPrev(inserted);
		p.setNext(inserted);
		size++;
	}
	public void delete(Node d) {
		Node p = d.getPrev();
		Node q = d.getNext();
		p.setPrev(q);
		q.setNext(p);
		size--;
	}
}
