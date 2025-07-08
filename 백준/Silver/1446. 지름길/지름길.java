import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int d = Integer.parseInt(st.nextToken());

    	int[][] road = new int[n][3];
    	
    	for (int i = 0; i < n; i++) {
    		st = new StringTokenizer(br.readLine());
    		road[i][0] = Integer.parseInt(st.nextToken());
    		road[i][1] = Integer.parseInt(st.nextToken());
    		road[i][2] = Integer.parseInt(st.nextToken());
    	}
    	
    	int[] dp = new int[d+10];
    	
    	dp[0] = 0;
    	for (int i = 1; i <= d; i++) {
    		dp[i] = 100000;
    	}
    	
    	for (int i = 0; i < d; i++) {
    		dp[i+1] = Math.min(dp[i+1], dp[i] + 1);
    		
    		for (int j = 0; j < n; j++) {
    			if (i == road[j][0] && road[j][1] <= d) {
    				dp[road[j][1]] = Math.min(dp[road[j][1]], dp[i] + road[j][2]);
    			}
    		}
    	}
    	
    	System.out.println(dp[d]);
    }
}
