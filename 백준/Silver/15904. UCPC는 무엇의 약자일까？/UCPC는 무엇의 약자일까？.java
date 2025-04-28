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
		
		String str = br.readLine();
		String upper = "";
		
		char[] ch = str.toCharArray();
		for (char c : ch) {
			if (Character.isUpperCase(c)) {
				upper += c;
			}
		}
		
		ch = upper.toCharArray();
		
		int end = 0;
		char[] ucpc = {'U', 'C', 'P', 'C'};
		StringBuilder sb = new StringBuilder();
		
		for (char c : ch) {
			if (c == ucpc[end]) {
				end++;
			}
			
			if (end == 4) {
				sb.append("I love UCPC");
				break;
			}
		}
		
		if (end != 4) {
			sb.append("I hate UCPC");
		}
		
		System.out.print(sb);
	}
}