import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String batch = br.readLine();
        batch = batch.replace("()", "*");
        char[] arr = batch.toCharArray();
        
        int total = 0;
        int left = 0;
        int total_left = 0;
        for (int i = 0; i < batch.length(); i++) {   	
        	if (arr[i] == '(') {
        		left++;
        		total_left++;
        	}
        	
        	if (arr[i] == '*') {
        		total += left;
        	}
        	
        	if (arr[i] == ')') {
        		left--;
        	}
        	
        	if (left == 0) {
        		total += total_left;
        		total_left = 0;
        	}
        }
        
        System.out.println(total);
    }
}