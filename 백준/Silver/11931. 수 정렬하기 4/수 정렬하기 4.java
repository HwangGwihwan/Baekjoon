import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringBuilder sb = new StringBuilder();
    	
    	int n = Integer.parseInt(br.readLine());
    	Integer num[] = new Integer[n];
    	
    	for (int i = 0; i < n; i++) {
    		num[i] = Integer.parseInt(br.readLine());
    	}
    	
    	Arrays.sort(num, Collections.reverseOrder());
    	
    	for (int i = 0; i < n; i++) {
    		sb.append(num[i]).append("\n");
    	}
    	
    	System.out.println(sb);
    }
}