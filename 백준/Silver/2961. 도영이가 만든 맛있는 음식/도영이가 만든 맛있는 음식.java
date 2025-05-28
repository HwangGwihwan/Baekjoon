import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int n;
	static int answer = 100000000;
	static int[] S;
	static int[] B;
	
	public static void DFS(int depth, int sour, int bitter, int selectedCount) {
		if (depth == n) {
			if (selectedCount != 0) {
				if (Math.abs(sour - bitter) < answer) {
					answer = Math.abs(sour - bitter);
				}
			}
			return;
		}
		
		DFS(depth+1, sour*S[depth], bitter+B[depth], selectedCount+1);
		DFS(depth+1, sour, bitter, selectedCount);
	}
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        n = Integer.parseInt(br.readLine());
        S = new int[n];
        B = new int[n];
        
        for (int i = 0; i < n; i++) {
        	st = new StringTokenizer(br.readLine());
        	S[i] = Integer.parseInt(st.nextToken());
        	B[i] = Integer.parseInt(st.nextToken());
        }
        
        DFS(0, 1, 0, 0);
        System.out.println(answer);
    }
}