import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n*2-1; j++) {
				if (j > n-i && j < n+i) {
					sb.append("*");
				} else if (j <= n-1){
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		
		for (int i = n+1; i <= n*2-1; i++) {
			for (int j = 1; j <= n*2-1; j++) {
				if (j > i-n && j <= n*2-1-(i-n)) {
					sb.append("*");
				} else if (j <= i-n){
					sb.append(" ");
				}
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}