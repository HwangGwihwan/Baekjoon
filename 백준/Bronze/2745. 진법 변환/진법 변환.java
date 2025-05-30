import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] str = br.readLine().split(" ");
        String n = str[0];
        int b = Integer.parseInt(str[1]);
        char[] c = n.toCharArray();
        
        long num = 0;
        for (int i = c.length - 1; i >= 0; i--) {
        	if (c[c.length - 1 - i] >= 'A' && c[c.length - 1 - i] <= 'Z') {
        		num += (int) Math.pow(b, i) * (c[c.length - 1 - i] - 55);
        	} else {
        		num += (int) Math.pow(b, i) * (c[c.length - 1 - i] - 48);
        	}
        }
        
        System.out.println(num);
    }
}