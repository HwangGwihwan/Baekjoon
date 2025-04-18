import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			sc.nextLine();
			
			String[] arr = new String[t];
			
			for (int i = 0; i < t; i++) {
				String str = sc.nextLine();
				arr[i] = str;
			}
			
			for (int i = 0; i < t; i++) {
				int lcnt = 0;
				int rcnt = 0;
				for (int j = 0; j < arr[i].length(); j++) {
					if (rcnt > lcnt)
						break;
					if (arr[i].charAt(j) == '(') {
						lcnt++;
					} else {
						rcnt++;
					}
				}
				
				if (lcnt == rcnt) {
					System.out.println("YES");
				} else {
					System.out.println("NO");
				}
			}
		}
}