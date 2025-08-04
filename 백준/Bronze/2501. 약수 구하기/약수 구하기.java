import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int k = Integer.parseInt(st.nextToken());
    	
    	int[] prime = new int[1000];
    	int cnt = 0;
    	
    	for (int i = 1; i <= n; i++) {
    		if (n % i == 0) {
    			prime[cnt] = i;
    			cnt++;
    		}
    	}
    	
    	if (k <= cnt) {
    		System.out.println(prime[k-1]);
    	} else {
    		System.out.println(0);
    	}
    }
}