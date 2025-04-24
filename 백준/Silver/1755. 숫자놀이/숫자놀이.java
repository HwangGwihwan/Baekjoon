import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static String change(char c) {
		String str = "";
		if (c == '1') {
			str = "one ";
		} else if (c == '2') {
			str = "two ";
		} else if (c == '3') {
			str = "three ";
		} else if (c == '4') {
			str = "four ";
		} else if (c == '5') {
			str = "five ";
		} else if (c == '6') {
			str = "six ";
		} else if (c == '7') {
			str = "seven ";
		} else if (c == '8') {
			str = "eight ";
		} else if (c == '9') {
			str = "nine ";
		} else {
			str = "zero ";
		}
		
		return str;
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken()); 
		
		String[][] arr = new String[n-m+1][2];
		for (int i = 0; i <= n-m; i++) {
			arr[i][0] = m + i + "";
			arr[i][1] = "";
			
			char[] ch = arr[i][0].toCharArray();
			
			for (char c : ch) {
				arr[i][1] += change(c);
			}
		}
		
		Arrays.sort(arr, (o1, o2) -> {
			return o1[1].compareTo(o2[1]);
		});
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= n-m; i++) {
			sb.append(arr[i][0]).append(" ");
			
			if ((i+1) % 10 == 0) {
				sb.append("\n");
			}
		}
		
		System.out.println(sb);
	}
}