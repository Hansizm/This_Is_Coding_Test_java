import java.util.*;
public class ±×¸®µð1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int change = sc.nextInt();
		int[] money = {500, 100, 50, 10};
		int count = 0;
		
		for(int i=0;i<3;i++) {
			if(change==0) {
				break;
			}
			count+=change/money[i];
			change%=money[i];
		}
		System.out.print(count);
	}

}
