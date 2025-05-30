import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        
        for (int i = 0; i < t; i++) {
        	int c = Integer.parseInt(br.readLine());
        	int q = 0;
        	int d = 0;
        	int n = 0;
        	int p = 0;
        	
        	if (c >= 25) {
    			q = c / 25;
    			c = c % 25;
    		}
        	if (c >= 10) {
    			d = c / 10;
    			c = c % 10;
    		}
        	if (c >= 5) {
    			n = c / 5;
    			c = c % 5;
    		}
        	p = c;
        	
        	System.out.println(q + " " + d + " " + n + " " + p);
        }
    }
}