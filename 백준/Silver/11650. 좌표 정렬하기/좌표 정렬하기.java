import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st;
    	
    	int n = Integer.parseInt(br.readLine());
    	int[][] point = new int[n][2];
    			
    	for (int i = 0; i < n; i++) {
    		st = new StringTokenizer(br.readLine());
    		
    		point[i][0] = Integer.parseInt(st.nextToken());
    		point[i][1] = Integer.parseInt(st.nextToken());
    	}

    	Arrays.sort(point, (int[] a, int[] b) -> {
    		if (a[0] == b[0]) {
    			return a[1] - b[1];
    		} else {
    			return a[0] - b[0];
    		}
    	});
    	
    	for (int i = 0; i < n; i++) {
    		System.out.println(point[i][0] + " " + point[i][1]);
    	}
    }
}