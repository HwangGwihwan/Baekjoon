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
		
		// k층 n호 -> k층 n-1호 + k-1층 n호 --> 재귀함수 사용
		// 0층이면 호수만큼 더해주고
		// 1호면 1을 더해주면 거주민 수를 알 수 있음
		
		int sum = 0;
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