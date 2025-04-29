import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		list.sort(Comparator.reverseOrder());
		
		int height = 0;
		int tree = list.get(0);
		int cnt = 1;
		int index = 1;
		
		while (m > height) {
			if (index < n && tree == list.get(index)) {
				index++;
				cnt++;
				continue;
			}
			height += cnt;
			tree--;
		}
		
		System.out.println(tree);
	}
}