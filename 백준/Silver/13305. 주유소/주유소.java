import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
        int n = Integer.parseInt(br.readLine());
        
		int[] dis = new int[n-1];
		int[] pri = new int[n];

		st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n - 1; i++) {
        	dis[i] = Integer.parseInt(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
        	pri[i] = Integer.parseInt(st.nextToken());
        }
        
        int min = pri[0];
        long totalpri = min * dis[0];
        
        for(int i = 1; i < n -1; i++) {
        	if (min > pri[i]) {
        		min = pri[i];
        	}
        	totalpri += min * dis[i];
        }
        
        System.out.println(totalpri);
    }
}