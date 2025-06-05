import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        int n = Integer.parseInt(br.readLine());
        int[][] paper = new int[100][100];        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	
        	for (int k = x; k < x + 10; k++) {
        		for (int l = y; l < y + 10; l++) {
        			paper[k][l] = 1;
        		}
        	}
        }
        
        int cnt = 0;
        for (int i = 0; i < 100; i++) {
        	for (int j = 0; j < 100; j++) {
        		if (paper[i][j] == 1) {
        			cnt++;
        		}
        	}
        }
        
        System.out.println(cnt);
    }
}