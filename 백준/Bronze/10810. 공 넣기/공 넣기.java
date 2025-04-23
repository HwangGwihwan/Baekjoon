import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int m = scanner.nextInt();
		scanner.nextLine();
		
		int[] arr = new int[n];
		for (int a = 0; a < m; a++) {
			int i = scanner.nextInt();
			int j = scanner.nextInt();
			int k = scanner.nextInt();
			
			for (int b = i-1; b < j; b++) {
				arr[b] = k;
			}
		}
		
		for (int a = 0; a < n; a++) {
			System.out.print(arr[a] + " ");
		}
	}
}