import java.util.*;
public class ±¸Çö1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		int x=1, y=1;
		int[][] map = new int[n+1][n+1];
		String str = sc.nextLine();
		String[] move = str.split(" ");
		
		for(int i=0;i<move.length;i++) {
			switch(move[i]) {
			case "L":
				x-=1;
				break;
			case "R":
				x+=1;
				break;
			case "U":
				y-=1;
				break;
			case "D":
				y+=1;
				break;
			}
			if(x>n) {
				x-=1;
			}
			else if(y>n) {
				y-=1;
			}
			else if(x<1) {
				x+=1;
			}
			else if(y<1) {
				y+=1;
			}
		}
		
		System.out.print(y+" "+x);

	}
}
