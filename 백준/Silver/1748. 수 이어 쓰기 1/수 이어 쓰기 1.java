import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        int n = Integer.parseInt(br.readLine());
        
        int digit = 0;
        int tmp = n;
        while (n > 0) {
        	n = n / 10;
        	digit++;
        }

        int cnt = 0;
        for (int i = 1; i < digit; i++) {
        	if (i == 1) {
        		cnt += 9;
        	} else {
        		cnt += 9 * Math.pow(10, i-1) * i;
        	}
        }
        cnt += ((tmp - Math.pow(10, digit-1)) + 1)* digit;
        
        System.out.println(cnt);
    }
}