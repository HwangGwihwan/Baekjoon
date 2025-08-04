import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	while (true) {
    		StringBuilder sb = new StringBuilder();
    		
    		int n = Integer.parseInt(br.readLine());  		
    		if (n == -1) {
    			break;
    		}
    		
    		int[] prime = new int[100000];
        	int cnt = 0;
        	int sum = 0;
        	
        	for (int i = 1; i <= n; i++) {
        		if (n % i == 0) {
        			prime[cnt] = i;
        			cnt++;
        		}
        	}
        	
        	for (int i = 0; i < cnt - 1; i++) {
        		sum += prime[i];
        	}
        	
        	if (sum == n) {
        		sb.append(sum).append(" = ");
        		for (int i = 0; i < cnt - 2; i++) {
        			sb.append(prime[i]).append(" + ");
        		}
        		sb.append(prime[cnt-2]);
        	} else {
        		sb.append(n).append(" is NOT perfect.");
        	}
    		
        	System.out.println(sb);
    	}
    }
}