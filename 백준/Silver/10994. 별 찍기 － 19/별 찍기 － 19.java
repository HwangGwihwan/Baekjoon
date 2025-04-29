import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		char[][] star = new char[4*n-3][4*n-3];
		
		for (int i = 0; i < 4*n-3; i++) {
			for (int j = 0; j < 4*n-3; j++) {
				if (i == 0 || i == 4*n-4 || j == 0 || j == 4*n-4) {
					star[i][j] = '*';
				}
				else {
					star[i][j] = ' ';
				}
			}
		}
		
		int temp = n-1;
		int step = 2;
		while (temp > 0) {			
			for (int i = 0 + step; i < 4*temp-3 + step; i++) {
				for (int j = 0 + step; j < 4*temp-3 + step; j++) {
					if (i == 0 + step || i == 4*temp-4 + step || j == 0 + step || j == 4*temp-4 + step) {
						star[i][j] = '*';
					}
				}
			}
			
			temp--;
			step +=2;
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < 4*n-3; i++) {
			for (int j = 0; j < 4*n-3; j++) {
				sb.append(star[i][j]);
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}