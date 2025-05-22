import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int[][] dp = new int[n][n];
        int[][] num = new int[n][n];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	for (int j = 0; j <= i; j++) {
        		num[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        
        dp[0][0] = num[0][0];
        for (int i = 1; i < n; i++) {
        	dp[i][0] = dp[i-1][0] + num[i][0];
        	for (int j = 1; j <= i; j++) {
        		dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + num[i][j];
        	}
        }
        
        int max = dp[n-1][0];
        for (int i = 1; i < n; i++) {
        	if (dp[n-1][i] > max) {
        		max = dp[n-1][i];
        	}
        }
        
        System.out.println(max);
    }
}