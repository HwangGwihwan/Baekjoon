import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	String input = "";
    	while ((input = br.readLine()) != null && !(input.isEmpty())) {
	    	StringTokenizer st = new StringTokenizer(input);
	    	
	    	int n = Integer.parseInt(st.nextToken());
	    	int m = Integer.parseInt(st.nextToken());
	    	
	    	int count = 0;
	    	for (int i = n; i <= m; i++) {
	    		String str = i + "";
	    		char[] ch = str.toCharArray();
	    		
	    		int same = 0;
	    		for (int a = 0; a < ch.length-1; a++) {
	    			for (int b = a+1; b < ch.length; b++) {
	    				if (ch[a] == ch[b]) {
	    					same = 1;
	    					break;
	    				}
	    			}
	    			
	    			if (same == 1) {
	    				break;
	    			}
	    		}
	    		
	    		if (same == 0) {
	    			count++;
	    		}
	    	}
	    	System.out.println(count);
    	}
    }
}