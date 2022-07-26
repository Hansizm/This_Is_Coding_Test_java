import java.util.*;
public class ±¸Çö2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		String h, m, s;
		
		for(int i=0;i<=n;i++) {
			for(int j=0;j<60;j++) {
				for(int k=0;k<60;k++) {
					h=String.valueOf(i);
					m=String.valueOf(j);
					s=String.valueOf(k);
					if(h.contains("3")||m.contains("3")||s.contains("3")) {
						count+=1;
					}
				}
			}
		}
		
		System.out.print(count);
	}
}
