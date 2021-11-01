import java.util.Scanner;

public class lsMain {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    LinkedStack<Character> lsc = new LinkedStack<>(){};
    String input = sc.next();
    for (int i = 0; i < input.length(); i++) {
      char k = input.charAt(i);
      if ((k == '{') || (k == '[') || (k =='(')){
        lsc.push(k);
      } else if ((lsc.peek()=='[') && (k == ']') || (lsc.peek()=='{') && (k == '}') ||(lsc.peek()=='(') && (k == ')')){
        lsc.pop();
      }
    }
    if(lsc.isEmpty()){
      System.out.println("YES");
    } else{
      System.out.println("NO");
    }
  }

}
