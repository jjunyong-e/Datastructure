package circularLinkedList;

public class CircularLinkedList <E>{
	private Node last;
	private int size;
	public CircularLinkedList(){
		this.last = null;
		this.size = 0;
	}
	public void insert(E newItem){
		Node newNode = new Node(newItem, null);
		if(last == null){
			newNode.setNext(newNode);
			last = newNode;
		} else{
			newNode.setNext(last.getNext());
			last.setNext(newNode);
		}
		size++;
	}
	public boolean isEmpty(){return size==0;}
	public Node delete(){
		Node x = last.getNext();
		if(x == last){
			last = null;
		}else{
			last.setNext(x.getNext());
			x.setNext(null);
		}
		size--;
		return x;
	}
	public String toString(){
		Node p = last;
		String str = "";
		for (int i = 0; i < size; i++) {
			str += (String)(p.getItem()) + " ";
			p = p.getNext();
		}
		return str;
	}
}
