import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int n = Integer.parseInt(br.readLine());
    	
    	int[] stair = new int[n];
    	for (int i = 0; i < n; i++) {
    		stair[i] = Integer.parseInt(br.readLine());
    	}
    	
    	if (n == 1) {
    		System.out.println(stair[0]);
    		return;
    	} else if (n == 2) {
    		System.out.println(stair[0] + stair[1]);
    		return;
    	} else if (n == 3) {
    		System.out.println(Math.max(stair[0] + stair[2], stair[1] + stair[2]));
    		return;
    	}
    	
    	int[][] dp = new int[n][3];
    	dp[0][0] = 0;
    	dp[0][1] = stair[0];
    	dp[1][1] = dp[0][0] + stair[1];
    	dp[1][2] = dp[0][1] + stair[1];
    	dp[2][0] = dp[1][2];
    	dp[2][1] = dp[0][1] + stair[2];
    	dp[2][2] = dp[1][1] + stair[2];
    	
    	for (int i = 3; i < n-1; i++) {
    		dp[i][0] = dp[i-1][2];
    		dp[i][1] = Math.max(dp[i-2][2], dp[i-2][1]) + stair[i];
    		dp[i][2] = dp[i-1][1] + stair[i];
    	}
    	
    	dp[n-1][1] = Math.max(dp[n-3][2], dp[n-3][1]) + stair[n-1];
    	dp[n-1][2] = dp[n-2][1] + stair[n-1];
    	
    	System.out.println(Math.max(dp[n-1][1], dp[n-1][2]));
    }
}