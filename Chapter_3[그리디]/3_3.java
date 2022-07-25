import java.util.*;
public class ±×¸®µð3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] matrix = new int[m][n];
		int[] min = new int[n];
		
		for(int i=0;i<n;i++) {
				min[i]=10001;
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				matrix[j][i]=sc.nextInt();
			}
		}
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(min[i]>matrix[j][i]) {
					min[i]=matrix[j][i];
				}
			}
		}
		
		for(int i=0;i<n;i++) {
			if(min[0]<min[i]) {
				min[0]=min[i];
			}
		}
		
		System.out.print(min[0]);
	}
}
