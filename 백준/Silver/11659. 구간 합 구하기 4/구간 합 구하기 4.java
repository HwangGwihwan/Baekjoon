import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int[] sum = new int[n+1];
			
		for (int k = 1; k <= n; k++) {
			sum[k] = sum[k-1] + Integer.parseInt(st.nextToken());
		}
		
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < m; k++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			
			sb.append(sum[j] - sum[i-1]).append("\n");
		}
		
		System.out.println(sb);
	}
}