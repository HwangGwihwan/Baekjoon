import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int t = Integer.parseInt(br.readLine());
		
		while (t > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			ArrayList<Integer> list1 = new ArrayList<Integer>();
			ArrayList<Integer> list2 = new ArrayList<Integer>();
			
			st = new StringTokenizer(br.readLine()); 
			for (int i = 0; i < n; i++) {
				list1.add(Integer.parseInt(st.nextToken()));
			}
			
			st = new StringTokenizer(br.readLine()); 
			for (int i = 0; i < m; i++) {
				list2.add(Integer.parseInt(st.nextToken()));
			}
			
			list1.sort(Comparator.reverseOrder());
			list2.sort(Comparator.reverseOrder());
			
			int cnt = 0;
			int j = 0;
			for (int i = 0; i < n; i++) {
				while (j < m) {
					if (list1.get(i) <= list2.get(j)) {
						j++;
					} else {
						cnt += m - j;
						break;
					}
				}
			}
			
			System.out.println(cnt);
			t--;
		}
	}
}