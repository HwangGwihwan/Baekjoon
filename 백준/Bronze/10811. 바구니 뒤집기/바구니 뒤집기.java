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
    	
    	int[] num = new int[n+1];
    	for (int i = 1; i <= n; i++) {
    		num[i] = i;
    	}
    	
    	for (int i = 0; i < m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		
    		int[] tmp = new int[y-x+1];
    		int k = x;
    		
    		for (int j = 0; j <= y-x; j++) {
    			tmp[j] = num[k];
    			k++;
    		}
    		
    		k = x;
    		for (int j = y-x; j >= 0; j--) {
    			num[k] = tmp[j];
    			k++;
    		}    		
    	}
    	
    	for (int i = 1; i <= n; i++) {
    		System.out.print(num[i] + " ");
    	}
    }
}