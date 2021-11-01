package Stack.arrayList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<String> alStack = new Stack<>();
		for (int i = 0; i <5; i++) {
			alStack.push(sc.next());
		}
		System.out.println(alStack.pop());
		System.out.println(alStack.pop());
		System.out.println(alStack.pop());
		System.out.println(alStack.pop());
		System.out.println(alStack.pop());

	}
}
