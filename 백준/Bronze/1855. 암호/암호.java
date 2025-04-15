import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int k = sc.nextInt();
		sc.nextLine();
		String s = sc.nextLine();
	
		String[] arr = s.split("");
		int len = arr.length; // 받은 문자열의 길이
		
		String[][] msg = new String[200][200];
		int i = len / k; // 원래 문자열의 행
		int j = k; // 원래 문자열의 열
		
		int cn = 0;
		for (int n = 0; n < i; n++) {
			if (n % 2 == 0) {
				for (int m = 0; m < j; m++) {
					msg[n][m] = arr[cn];
					cn++;
				}
			} else {
				for (int m = j - 1; m >= 0; m--) {
					msg[n][m] = arr[cn];
					cn++;
				}
			}
		}
		
		for (int m = 0; m < j; m++) {
			for (int n = 0; n < i; n++) {
				System.out.print(msg[n][m]);
			}
		}
	}
}
