import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	int t = Integer.parseInt(br.readLine());
    	
    	for (int i = 0; i < t; i++) {
    		int n = Integer.parseInt(br.readLine());
    		
    		long[][] dp = new long[n+1][10];
    	
    		for (int j = 0; j < 10; j++) {
    			dp[1][j] = 1;
    		}
    		
    		for (int k = 2; k <= n; k++) {
    			long sum = 0;
    			for (int j = 0; j < 10; j++) {
    				sum += dp[k-1][j];
    				dp[k][j] = sum;
    			}
    		}
    		
    		long result = 0;
    		for (int j = 0; j < 10; j++) {
    			result += dp[n][j];
    		}
    	
    		System.out.println(result);
    	}
    	
    }
}