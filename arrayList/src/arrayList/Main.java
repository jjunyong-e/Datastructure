package arrayList;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        arrayList<String> arr = new arrayList();
        for (int i = 0; i <10; i++){
            arr.insertLast(sc.next());
        }
        System.out.println(arr.toString());
        arr.insert(sc.next(),3);
        System.out.println(arr.toString());
        arr.delete(5);
        System.out.println(arr.toString());
    }
}
