import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int[][] po = new int[n][2];
    	for (int i = 0; i < n; i++) {
    		po[i][0] = i;
    		po[i][1] = Integer.parseInt(st.nextToken());
    	}
    	
    	Arrays.sort(po, Comparator.comparingInt((int[] o) -> o[1]));
    	
    	int start = 0;
    	for (int i = 0; i < n-1; i++) {
    		if (po[i][1] == po[i+1][1]) {
    			po[i][1] = start;
    		} else {
    			po[i][1] = start;
    			start++;
    		}
    	}
    	po[n-1][1] = start;
    	
    	Arrays.sort(po, Comparator.comparingInt((int[] o) -> o[0]));
    	
    	StringBuilder sb = new StringBuilder();
    	for (int i = 0; i < n; i++) {
    		sb.append(po[i][1]).append(" ");
    	}
    	
    	System.out.println(sb);
    }
}