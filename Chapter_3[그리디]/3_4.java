import java.util.*;
public class ±×¸®µð4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int count = 0;
		
		while(n!=1) {
			if(n%k!=0) {
				n-=1;
				count++;
			}
			else {
				n=n/k;
				count++;
			}
		}
		
		System.out.print(count);
	}
}
