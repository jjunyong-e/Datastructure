package doubleLinkedList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DoubleLinkedList<String> list = new DoubleLinkedList<>();
		list.insertAfter(list.head,"a");
		list.insertBefore(list.tail,"b");
		System.out.println(list.head.getItem());
		System.out.println(list.head.getNext().getItem());
		System.out.println(list.head.getNext().getNext().getItem());
		System.out.println(list.head.getNext().getNext().getNext().getItem());






	}


}
