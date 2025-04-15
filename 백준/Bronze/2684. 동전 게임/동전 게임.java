import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static int[] game(String str) {
		int[] count = new int[8];
		Arrays.fill(count, 0);
		String coin = new String();
		String[] arr = str.split("");
		
		for (int i = 0; i < arr.length - 2; i++) {
			coin = "" + arr[i] + arr[i+1] + arr[i+2];
			if (coin.equals("TTT")) {
				count[0]++;
			}
			if (coin.equals("TTH")) {
				count[1]++;
			}
			if (coin.equals("THT")) {
				count[2]++;
			}
			if (coin.equals("THH")) {
				count[3]++;
			}
			if (coin.equals("HTT")) {
				count[4]++;
			}
			if (coin.equals("HTH")) {
				count[5]++;
			}
			if (coin.equals("HHT")) {
				count[6]++;
			}
			if (coin.equals("HHH")) {
				count[7]++;
			}			
		}

		return count;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		sc.nextLine();
		String[] str = new String[p];
		
		for (int i = 0; i < p; i++) {
			str[i] = sc.nextLine();
		}
		
		for (int i = 0; i < p; i++) {
			int[] count = game(str[i]);
			for (int j = 0; j < count.length; j++) {
				System.out.print(count[j] + " ");
			}
			System.out.println();
		}
	}
}