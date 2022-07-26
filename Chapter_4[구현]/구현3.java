import java.util.*;
public class ±¸Çö3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int x = str.charAt(0)-96;
		int y = str.charAt(1)-48;
		int dx=0,dy=0;
		int count = 0;
		
		for(int i=0;i<8;i++) {
			switch(i) {
			case 0:
				dx=x+2;
				dy=y+1;
				break;
			case 1:
				dx=x+2;
				dy=y-1;
				break;
			case 2:
				dx=x-2;
				dy=y+1;
				break;
			case 3:
				dx=x-2;
				dy=y-1;
				break;
			case 4:
				dx=x+1;
				dy=y+2;
				break;
			case 5:
				dx=x-1;
				dy=y+2;
				break;
			case 6:
				dx=x+1;
				dy=y-2;
				break;
			case 7:
				dx=x-1;
				dy=y-2;
				break;
			}
			if(dx<1||dx>8||dy<1||dy>8) {
			continue;
			}
			count+=1;
		}

		System.out.print(count);
	}
}
