import java.util.HashSet;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			sc.nextLine();
			
			HashSet<Integer> set = new HashSet<Integer>();
			for (int i = 0; i < n; i++) {
				set.add(sc.nextInt());
			}
			sc.nextLine();
			
			int m = sc.nextInt();
			
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < m; i++) {
				int num = sc.nextInt();
				if (set.contains(num)) {
					sb.append("1 ");
				} else {
					sb.append("0 ");
				}
			}
			
			System.out.println(sb.toString().trim());
		}
}