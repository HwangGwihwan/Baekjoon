import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	static int[][] color;
	static int white, blue;
	
	public static void cut(int x, int y, int size) {
		int col = color[x][y];
		
		for (int i = x; i < x + size; i++) {
			for (int j = y; j < y + size; j++) {
				if (col != color[i][j]) {
					col = -1;
					break;
				}
			}
			if (col == -1) {
				break;
			}
		}
		
		if (col == 1) {
			blue++;
		} else if (col == 0) {
			white++;
		} else {
			cut(x, y, size/2);
			cut(x+size/2, y, size/2);
			cut(x, y+size/2, size/2);
			cut(x+size/2, y+size/2, size/2);
		}
		
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        color = new int[n][n];
        
        for (int i = 0; i < n; i++) {
        	String[] token = br.readLine().split(" ");
        	for (int j = 0; j < n; j++) {
        		color[i][j] = Integer.parseInt(token[j]);
        	}
        }
        
        cut(0, 0, n);
        System.out.println(white);
        System.out.println(blue);
    }
}