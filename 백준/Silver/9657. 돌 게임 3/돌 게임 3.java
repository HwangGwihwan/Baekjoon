import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		
		int n = Integer.parseInt(br.readLine());
		boolean[] win = new boolean[n+1];
		
		if (n >= 1) win[1] = true;
		if (n >= 2) win[2] = false;
		if (n >= 3) win[3] = true;
		if (n >= 4) win[4] = true;
		
		for (int i = 5; i <= n; i++) {
			if (!win[i-1] || !win[i-3] || !win[i-4]) {
				win[i] = true;
			} else {
				win[i] = false;
			}
		}

		if (win[n] == true) {
			System.out.println("SK");
		} else {
			System.out.println("CY");
		}
	}
}