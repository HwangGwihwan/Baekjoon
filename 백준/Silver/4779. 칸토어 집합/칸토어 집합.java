import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static StringBuilder sb;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String input = "";
    		
    	while ((input = br.readLine()) != null) {
    		int n = Integer.parseInt(input);
    		sb = new StringBuilder();
    		if (n > 0) {
    			line(n-1, 1);
    			line(n-1, 2);
    			line(n-1, 3);
    		} else {
    			sb.append("-");
    		}
    		
    		System.out.println(sb);
    	}    	
    }
    
    public static void line(int n, int cut) {
    	if (cut == 2) {
    		for (int i = 0; i < Math.pow(3, n); i++) {
    			sb.append(" ");
    		}
    	} else {
    		if (n == 0) {
        		if (cut % 2 == 1) {
        			sb.append("-");
        		} else {
        			sb.append(" ");
        		}
        	} else {
        		line(n-1, 1);
        		line(n-1, 2);
        		line(n-1, 3);
        	}
    	}
    	
    }
}
