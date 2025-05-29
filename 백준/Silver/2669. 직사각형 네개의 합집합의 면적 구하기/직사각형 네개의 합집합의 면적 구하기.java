import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st; 
        
        int[][] check = new int[105][105];
        for (int i = 0; i < 4; i++) {
        	st = new StringTokenizer(br.readLine());
        	int startx = Integer.parseInt(st.nextToken());
        	int starty = Integer.parseInt(st.nextToken());
        	int endx = Integer.parseInt(st.nextToken());
        	int endy = Integer.parseInt(st.nextToken());
        	
        	for (int n = startx; n < endx; n++) {
        		for (int m = starty; m < endy; m++) {
        			check[n][m] = 1;
        		}
        	}
        }
        
        int area = 0;
        for (int i = 0; i < 105; i++) {
        	for (int j = 0; j < 105; j++) {
        		if (check[i][j] == 1) {
        			area++;
        		}
        	}
        }
        
        System.out.println(area);
    }
}