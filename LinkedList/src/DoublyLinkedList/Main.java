package DoublyLinkedList;

import java.util.Scanner;

public class Main {
// 로직은 스택을 이용한것과 같다
  // deque의 장점이라면 앞뒤 삽입삭제가 가능 하나
  // 나의 풀이는 뒤에서만 이루어 졌다
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    DoublyLinkedList <Character> dqueue = new DoublyLinkedList<Character>();
    String input = sc.next();
    for (int i = 0; i < input.length(); i++) {
      char k = input.charAt(i);
      if ((k == '{') || (k == '[') || (k =='(')){
        dqueue.insertBack(k);
        System.out.println(dqueue.toString());
        //확인하기위해 스트링 출력
      }
        else if ((dqueue.peek() != null) &&((dqueue.peek() == ('[')) && (k == ']') || (dqueue.peek() == ('{')) && (k == '}') ||(dqueue.peek() == ('(')) && (k == ')'))){
        System.out.println("deleted : "+ dqueue.deleteBack() +" " +  k); // 스택이용과 같은 로직
      }
    }
    System.out.println("last dequeue: " + dqueue.toString());
    // 마지막 dequeue상황확인
    if(dqueue.isEmpty()){
      System.out.println("yes");
    } else{
      System.out.println("No");
    }
  }

}
