package Stack.ArrayList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayStack<Integer> arrayStack = new ArrayStack<>();
		for (int i = 0; i < 5; i++) {
			arrayStack.push(sc.nextInt());
		}
		System.out.println(arrayStack.peek());
		while(!arrayStack.isEmpty()){
			System.out.println(arrayStack.pop());
		}

	}
}
