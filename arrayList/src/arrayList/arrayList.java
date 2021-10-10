package arrayList;

public class arrayList<E> {
//    필드
    private E a[];
    private int size;
//    생성자
    public arrayList(){
        a = (E[]) new Object[1];
        size = 0;
    }
public boolean isEmpty(){
        return size == 0;
}
//    마지막에 추가
    public void insertLast(E newItem){
        if (size == a.length){
            resize(2*a.length);
        }
        a[size++] = newItem;
    }
//    index에 추가
    public void insert(E newItem, int index){
        if (size == a.length){
            resize(2*a.length);
        }
        for (int i = size - 1; i >= index; i--){
            a[i+1] = a[i];
        }
        a[index] = newItem;
        size ++;
    }
// 리사이즈
    public void resize(int newSize){
        Object [] k = new Object[newSize];
        for (int i = 0; i < size; i++){
            k[i] = a[i];
        }
        a = (E[])k;
    }
    public E search(int index){
        return a[index];
    }
    public E delete(int index){
        if (size > 0 && size == a.length/4){
            resize(a.length/2);
        }
        E newItem = a[index];
        for (int i = index; i <size; i++){
            a[i] = a[i+1];
        }
        size --;
        return newItem;
    }
    public String toString(){
        String str = "";
        for (int i = 0; i < size; i++){
            str += a[i] + " ";
        }
        return str;
    }
}
