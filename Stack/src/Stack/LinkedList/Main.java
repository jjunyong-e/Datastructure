package Stack.LinkedList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> ls = new Stack<>();
		for (int i = 0; i < 5; i++) {
			ls.push(sc.next());
		}
		System.out.println(ls.toString());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.pop());
		System.out.println(ls.toString());
	}
}
