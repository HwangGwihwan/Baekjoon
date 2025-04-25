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
		
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < n; i++) {
			set.add(Integer.parseInt(st.nextToken()));
		}

		int[] arr = new int[set.size()];
		int index = 0;
		for (int num : set) {
			arr[index++] = num;
		}
		
		Arrays.sort(arr);
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]).append(" ");
		}
		
		System.out.print(sb);
	}
}