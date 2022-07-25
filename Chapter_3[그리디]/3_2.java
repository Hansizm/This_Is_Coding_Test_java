import java.util.*;
public class ±×¸®µð2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[] num = new int[n];
		int result = 0;
		
		for(int i=0;i<n;i++) {
			num[i]=sc.nextInt();
		}
		
		Arrays.sort(num);
		
		while(m>0) {
			for(int i=0;i<k;i++) {
				if(m==0) {
					break;
				}
				result+=num[n-1];
				m-=1;
			}
			
			result+=num[n-2];
			m-=1;
		}
		
		System.out.print(result);
	}
}
