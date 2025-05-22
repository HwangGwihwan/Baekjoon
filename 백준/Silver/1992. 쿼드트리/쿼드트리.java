import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static StringBuilder sb = new StringBuilder();
	
	public static void check(int[][] qt, int x, int y, int size) {

		int check = qt[x][y];
		
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (qt[i][j] != check) {
					check = -1;
					break;
				}
			}
			
			if (check == -1) {
				break;
			}
		}
		
		if (check == -1) {
			sb.append("(");
			int newSize = size / 2;
			check(qt, x, y, newSize);
			check(qt, x, y + newSize, newSize);
			check(qt, x + newSize, y, newSize);
			check(qt, x + newSize, y + newSize, newSize);
			sb.append(")");
		} else {
			sb.append(check);
		}
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        int[][] qt = new int[n][n];
        
        for (int i = 0; i < n; i++) {
        	String[] arr = br.readLine().split("");
        	for (int j = 0; j < n; j++) {
        		qt[i][j] = Integer.parseInt(arr[j]);
        	}
        }
        
        check(qt, 0, 0, n);
        System.out.println(sb);
    }
}
