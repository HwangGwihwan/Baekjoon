import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static int score = 0;
	public static void happy(int n) {
		if (n == 1) {
			score += 0;
			return;
		}
		
		if (n % 2 == 0) {
			n = n/2;
			score += n * n;
			happy(n);
			happy(n);
		} else {
			n = n / 2;
			score += n * (n + 1);
			happy(n);
			happy(n+1);
		}
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int n = Integer.parseInt(br.readLine());
        
        happy(n);
        System.out.println(score);
    }
}