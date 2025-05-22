import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int k = Integer.parseInt(br.readLine());
        int size = 0;
        StringTokenizer st;
        
        int[] length = new int[6];
        for (int i = 0; i < 6; i++) {
        	st = new StringTokenizer(br.readLine());
        	st.nextToken();
        	length[i] = Integer.parseInt(st.nextToken());
        }
        
        int n = 0;
        int amax = length[0];
        int m = 1;
        int bmax = length[1];
        
        for (int i = 2; i <= 4; i+=2) {
        	if (length[i] > amax) {
        		amax = length[i];
        		n = i;
        	}
        }
        
        for (int i = 3; i <= 5; i+=2) {
        	if (length[i] > bmax) {
        		bmax = length[i];
        		m = i;
        	}
        }
        
        size = amax * bmax - length[(n+3)%6] * length[(m+3)%6];     
        System.out.println(size * k);
    }
}