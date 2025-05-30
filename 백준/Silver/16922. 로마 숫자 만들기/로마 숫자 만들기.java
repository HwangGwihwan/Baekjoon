import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
	static int n;
	static int[] arr = new int[] {1, 5, 10, 50};
	static HashSet<Integer> set = new HashSet<Integer>();
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        
        comb(0, 0, 0);
        System.out.println(set.size());
    }
    
    public static void comb(int sum, int idx, int cnt) {
    	if (cnt == n) {
    		set.add(sum);
    		return;
    	}
    	
    	for (int i = idx; i < 4; i++) {
    		comb(sum + arr[i], i, cnt+1);
    	}
    }
}