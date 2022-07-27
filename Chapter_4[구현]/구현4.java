import java.util.*;
public class ±¸Çö4 {
	
	public static int n, m, x, y, d;
	
	public static void left() {
		d--;
		if(d<0) {
			d=3;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		n = sc.nextInt();
		m = sc.nextInt();
		
		x = sc.nextInt();
		y = sc.nextInt();
		d = sc.nextInt();
		
		int count = 0;
		int result = 0;
		
		int[] dx = {0, +1, 0, -1};
		int[] dy = {-1, 0, +1, 0};
		
		int[][] map = new int[n][m];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				map[i][j]=sc.nextInt();
			}
		}
		
		while(true) {
			left();
			
			if(map[y+dy[d]][x+dx[d]]==0) {
			y+=dy[d];
			x+=dx[d];
			map[y][x]=2;
			result++;
			count=0;
			}
			else if(map[y+dy[d]][x+dx[d]]!=0) {
				count++;
			}
			
			if(count==4) {
				left();
				left();
				if(map[y+dy[d]][x+dx[d]]==1) {
					break;
				}
				else {
					y+=dy[d];
					x+=dx[d];
				}
				left();
				left();
				count=0;
			}
			
		}
		
		System.out.print(result);
	}
}
