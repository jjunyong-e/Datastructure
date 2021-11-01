package Stack.singleLinkedList;

public class Stack<E> {
	private int size;
	protected Node<E> top;
	public Stack(){
		this.size = 0;
		this.top = null;
	}
//	push : 스택 위에 노드생성후 쌓기
	public void push(E newItem) {
		Node<E> newNode = new Node<E>(newItem,top);
		top = newNode;
		size++;
	}
// pop
	public E pop(){
		E poped = (E) top.getItem();
		top = top.getNext();
		size--;
		return poped;
	}

	public int getSize(){return size;}
	public boolean isEmpty(){return size == 0;}
//	toString : 스택의 내용 탑부터 밑으로 내려가며 문자열로 변환후 반환
	public String toString(){
		String str = "";
		Node<E> p = top;
		for(int i=0; i<size; i++){
			str += p.getItem();
			p = p.getNext();
		}
		return String.valueOf(str);
	}
//	peek : top 아이템 리턴
	public E peek(){
		return top.getItem();
	}
}
