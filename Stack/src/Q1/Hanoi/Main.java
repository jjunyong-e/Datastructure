package Q1.Hanoi;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hanoi Hanoi = new Hanoi();
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        Hanoi.hanoi(a,'A','B','C');

    }

}