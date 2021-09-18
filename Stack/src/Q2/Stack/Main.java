package Q2.Stack;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayStack<Character> arrStack = new ArrayStack<>();
    String inputs = sc.next();
    for (int i = 0; i < inputs.length(); i++) {
      char input = inputs.charAt(i);
      boolean checker = Character.isDigit(input);
      // 숫자인지아닌지
      if (checker) {
        System.out.println(input);
      } else {
        // 괄호인경우
        if (input == '(') {
          arrStack.push(input);
        } else if (input == ')') {
          while (!arrStack.empty() && arrStack.top() != '(') {
            System.out.println(arrStack.pop());
          }
          if(!arrStack.empty()){
            arrStack.pop();
          }
        }
        // 연산자
        else {if (input == '+' || input == '-') {
          while(!arrStack.empty() && (arrStack.top() == '*' || arrStack.top() == '/')){
            System.out.println(arrStack.pop());
          }

        }
          arrStack.push(input);

        }
      }
    }
    System.out.println();

    while(!arrStack.empty()){
      System.out.println(arrStack.pop());
    }
  }

}
