package Stack.singleLinkedList;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stack<Integer> Stack = new Stack<Integer>();
		System.out.println(Stack.getSize());
		Stack.push(sc.nextInt());
		System.out.println(Stack.toString());
		System.out.println(Stack.getSize());
		Stack.push(sc.nextInt());
		System.out.println(Stack.toString());
		System.out.println(Stack.getSize());
		Stack.push(sc.nextInt());
		System.out.println(Stack.toString());
		System.out.println(Stack.getSize());
		Stack.push(sc.nextInt());
		System.out.println(Stack.toString());
		while(!Stack.isEmpty()){
			System.out.println(Stack.pop());
		}
	}
}
