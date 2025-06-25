import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int A = Integer.parseInt(st.nextToken());
    	int B = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(br.readLine());
    	
    	int[] su = new int[m];
    	int num = 0;
    	st = new StringTokenizer(br.readLine());
    	for (int i = 0; i < m; i++) {
    		su[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	for (int i = 0; i < m; i++) {
    		num += Math.pow(A, m-i-1) * su[i];
    	}
    	
    	int temp = num;
    	int pow = 0;
    	while (temp > 1) {
    		temp = temp / B;
    		pow++;
    		
    		if (temp == 1) {
    			pow++;
    		}
    	}
    	
    	StringBuilder sb = new StringBuilder();
    	
    	for (int i = pow; i > 0; i--) {
			int n = num / (int) Math.pow(B, i-1);
			sb.append(n).append(" ");
			num -= n * (int) Math.pow(B, i-1);
		}
    	
    	System.out.println(sb);
    }
}