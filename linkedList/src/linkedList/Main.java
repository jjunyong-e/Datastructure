package linkedList;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> ll = new LinkedList<>();
    ll.InsertFront(sc.nextInt());
    for (int i = 0; i < 5; i++){
      ll.InsertAfter(sc.nextInt(),ll.head);
    }
    System.out.println(ll.search(2));
    System.out.println(ll.toString());
    ll.deleteFront();
    System.out.println(ll.toString());
    ll.deleteAfter(ll.head.getNext());
    System.out.println(ll.toString());
  }
}
