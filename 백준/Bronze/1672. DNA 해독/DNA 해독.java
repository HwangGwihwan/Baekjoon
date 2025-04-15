import java.util.Scanner;

public class Main {
	public static Character change(char a, char b) {
		if (a == 'A') {
			if (b == 'A') return 'A';
			if (b == 'G') return 'C';
			if (b == 'C') return 'A';
			if (b == 'T') return 'G';
		}
		if (a == 'G') {
			if (b == 'A') return 'C';
			if (b == 'G') return 'G';
			if (b == 'C') return 'T';
			if (b == 'T') return 'A';
		}
		if (a == 'C') {
			if (b == 'A') return 'A';
			if (b == 'G') return 'T';
			if (b == 'C') return 'C';
			if (b == 'T') return 'G';
		}
		if (a == 'T') {
			if (b == 'A') return 'G';
			if (b == 'G') return 'A';
			if (b == 'C') return 'G';
			if (b == 'T') return 'T';
		}
		return ' ';
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String str = sc.nextLine();
	
		char result = str.charAt(n -1); // 마지막 문자부터
		
		for (int i = n - 2; i >= 0; i--) {
			result = change(str.charAt(i), result);
		}
		
		System.out.println(result);
	}
}
