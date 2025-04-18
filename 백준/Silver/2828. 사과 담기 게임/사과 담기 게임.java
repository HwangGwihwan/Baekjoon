import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
			sc.nextLine();
			
			int j = sc.nextInt();
			sc.nextLine();
			
			int[] arr = new int[20];
			for (int i = 0; i < j; i++) {
				int loc = sc.nextInt();
				arr[i] = loc;
			}
			
			int left = 1;
			int right = left + m - 1;
			
			int count = 0;
			for (int i = 0; i < j; i++) {
				while (true) {
					if (arr[i] >= left && arr[i] <= right) { // 바구니가 사과가 떨어지는 위치에 있음
						break;
					} else if (arr[i] < left) { // 바구니가 사과가 떨어지는 위치보다 오른쪽에 있음
						left--;
						right--;
						count++;
					} else { // 바구니가 사과가 떨어지는 위치보다 왼쪽에 있음
						left++;
						right++;
						count++;
					}
				}
			}
			
			System.out.println(count);
		}
}