import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int i = 1;
    	int num = 1;
    	int cnt = 0;
    	
    	while (n >= num) {
    		cnt++;
    		i++;
    		num = (int)Math.pow(i, 2); 
    	}
    	
    	System.out.println(cnt);
    	
    }
}