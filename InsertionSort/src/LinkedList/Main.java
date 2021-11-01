package LinkedList;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    long beforeTime = System.currentTimeMillis();
    Scanner sc = new Scanner(System.in);
    linkedList <Integer> numbers = new linkedList<>(){};
    for (int i = 0; i < 10; i++) {
      numbers.insertFront(sc.nextInt());
    }
    System.out.println("origin");
    System.out.println(numbers.toString());
    // aesc
    for (int i = 0; i < numbers.getSize(); i++) {
      for (int j = 0; j < i; j++) {
        int temp1 =numbers.peek(i);
        int temp2 =numbers.peek(j);
        if (temp1 < temp2){
          numbers.change(temp1,j);
          numbers.change(temp2,i);
        }
      }
    }
    System.out.println("aesc");
    System.out.println(numbers.toString());
// desc
    for (int i = 0; i < numbers.getSize(); i++) {
      for (int j = 0; j < i; j++) {
        int temp1 =numbers.peek(i);
        int temp2 =numbers.peek(j);
        if (temp1 > temp2){
          numbers.change(temp1,j);
          numbers.change(temp2,i);
        }
      }
    }
    System.out.println("desc");
    System.out.println(numbers.toString());
    long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
    long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
    System.out.println(secDiffTime);
  }
}
