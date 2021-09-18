package Q1.Stack;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    //  배열 리스트를 이용한 풀이
    ArrayStack <Character> arrStack = new ArrayStack<>();
    LinkedStack <Character> ls = new LinkedStack<>();
    String inputs = sc.next();
    for (int i = 0; i < inputs.length(); i++){
      if (inputs.charAt(i) == '}'){
        if (arrStack.top()=='{'){
          arrStack.pop();

        }

      }else if (inputs.charAt(i) == ')'){
        if (arrStack.top()=='('){
          arrStack.pop();

        }

      } else if(inputs.charAt(i) == ']'){
        if (arrStack.top()=='['){
          arrStack.pop();

        }

      }
      else{
        arrStack.push(inputs.charAt(i));

      }
    }
    //  연결리스트
    for (int i = 0; i < inputs.length(); i++){
      if (inputs.charAt(i) == '}'){
        if (ls.top()=='{'){
          ls.pop();
        }

      }else if (inputs.charAt(i) == ')'){
        if (ls.top()=='('){
          ls.pop();

        }

      } else if(inputs.charAt(i) == ']'){
        if (ls.top()=='['){
          ls.pop();

        }

      }
      else{
        ls.push(inputs.charAt(i));
      }
    }
    System.out.println("배열리스트 스택 이용 결과");
    if (arrStack.empty()){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }

    System.out.println("연결리스트 스택 이용 결과");
    if (ls.empty()){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }

  }

}
