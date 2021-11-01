package ArrayList;

import java.util.Scanner;


//실험할 코드 추가


public class Main {

  public static void main(String[] args) {
    long beforeTime = System.currentTimeMillis(); //코드 실행 전에 시간 받아오기
    Scanner sc = new Scanner (System.in);
    arrayList<Integer> numbers = new arrayList<Integer>(){};
    for (int i = 0; i < 10; i++) {
      numbers.insertLast(sc.nextInt());
    }

//오름차순정렬
    for (int i = 0; i < numbers.getSize(); i++) {
      for (int j = 0; j < i; j++) {
        if(numbers.peek(i) < numbers.peek(j)){
          int temp1 = numbers.peek(i);
          int temp2 = numbers.peek(j);
          numbers.setItem(temp2,i);
          numbers.setItem(temp1,j);
        }
      }
    }
    System.out.println("asec");
    System.out.println(numbers.toString());
    //내림차순정렬
    for (int i = 0; i < numbers.getSize(); i++) {
      for (int j = 0; j < i; j++) {
        if(numbers.peek(i) > numbers.peek(j)){
          int temp1 = numbers.peek(i);
          int temp2 = numbers.peek(j);
          numbers.setItem(temp2,i);
          numbers.setItem(temp1,j);
        }
      }
    }
    System.out.println("desc");
    System.out.println(numbers.toString());
    long afterTime = System.currentTimeMillis(); // 코드 실행 후에 시간 받아오기
    long secDiffTime = (afterTime - beforeTime); //두 시간에 차 계산
    System.out.println("시간차이(m) : "+secDiffTime);
  }
}
