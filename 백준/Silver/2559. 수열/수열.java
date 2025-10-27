import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	
    	int num[] = new int[n];
    	
    	st = new StringTokenizer(br.readLine());    	
    	for (int i = 0; i < n; i++) {
    		num[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	int start, sum;
    	int max = -10000000;
    	for (int j = 0; j <= n - k; j++) {
    		start = j;
        	sum = 0;
        	
    		for (int i = start; i < k + start; i++) {
        		sum += num[i];
        	}
    		
    		if (sum > max) {
    			max = sum;
    		}
    	}
    	
    	System.out.println(max);
	}
}