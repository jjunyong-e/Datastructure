package Hanoi;

public class Hanoi {
	private int [] a;
	public Hanoi(){
	}
	public void move(int num, String From, String Mid, String To){
		if(num == 1){
			System.out.println("원판 1을 " + From + "에서 "+ To + "으로 옮긴다");
			return;
		}else{
			move(num-1, From,To,Mid);
			System.out.println("원판 " + (num-1) + "을 "+ From + "에서 " + To +"으로 옮긴다" );
			move(num-1,Mid,From,To);
		}

	}
	}
