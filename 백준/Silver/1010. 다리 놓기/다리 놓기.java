import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
        	String[] token = br.readLine().split(" ");
        	int n = Integer.parseInt(token[0]);
        	int m = Integer.parseInt(token[1]);
        	if (n > m/2) {
        		n = m-n;
        	}
        	
        	long x = 1;
        	long y = 1;
        	
        	for (int k = m; k > m-n; k--) {
        		x = x * k;
        	}
        	for (int k = n; k > 0; k--) {
        		y = y * k;
        	}
        	
        	System.out.println(x/y);
        }
    }
}