import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int answer = 0;
	
	public static void z(int n, int r, int c) {
		if (n == 0) {
			return;
		}
		
		int size = (int)Math.pow(2, n-1);
		int area = size * size;
		
		if (r < size && c < size) {
			z(n-1, r, c);
		} else if (r < size && c >= size) {
			answer += area;
			z(n-1, r, c - size);
		} else if (r >= size && c < size) {
			answer += area*2;
			z(n-1, r - size, c);
		} else {
			answer += area*3;
			z(n-1, r - size, c - size);
		}
		
	}
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int r = Integer.parseInt(st.nextToken());
    	int c = Integer.parseInt(st.nextToken());
    	
    	z(n, r, c);
    	System.out.println(answer);
    }
}
