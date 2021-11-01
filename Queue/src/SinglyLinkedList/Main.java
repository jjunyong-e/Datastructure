package SinglyLinkedList;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedQueue <Integer> queue = new LinkedQueue<Integer>(){};
    for (int i = 0; i < 5; i++) {
      queue.add(sc.nextInt());
    }
    System.out.println(queue.toString());
    System.out.println(queue.peek());
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    System.out.println(queue.toString());
  }
}
