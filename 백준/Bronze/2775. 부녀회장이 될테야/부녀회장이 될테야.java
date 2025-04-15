import java.util.Scanner;

public class Main {
	public static int add(int k, int n) {
		if (k == 0) {
			return n;
		} else if (n == 1) {
			return 1;
		} else {
			return add(k, n-1) + add(k-1, n);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		int[][] p = new int[15][14];
		int sum = 0;
		
		for (int j = 0; j < 14; j++) {
			p[0][j] = j + 1;
		}
		
		for (int i = 0; i < 15; i++) {
			p[i][0] = 1;
		}
		
		for (int i = 0; i < t; i++) {
			int k = sc.nextInt();
			sc.nextLine();
			int n = sc.nextInt();
			sc.nextLine();
			
			sum = add(k, n);
			System.out.println(sum);
		}
	}
}