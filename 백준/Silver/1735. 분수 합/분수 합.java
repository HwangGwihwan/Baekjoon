import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	public static int gcd(int a, int b) {
		if (b == 0) {
			return a;
		} else {
			return gcd(b, a%b);
		}
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken());
		int m1 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		int n2 = Integer.parseInt(st.nextToken());
		int m2 = Integer.parseInt(st.nextToken());
		
		int x = n1 * m2 + n2 * m1;
		int y = m1 * m2;
		
		int z = gcd(x, y);
		
        System.out.println(x/z + " " + y/z);
    }
}