package circularLinkedList;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CircularLinkedList<String> cl = new CircularLinkedList<>();
		for (int i = 0; i < 5; i++) {
			cl.insert(sc.next());
			System.out.println(cl.toString());
		}

	}
}
