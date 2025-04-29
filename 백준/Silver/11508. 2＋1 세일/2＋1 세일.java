import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < n; i++) {
			list.add(Integer.parseInt(br.readLine()));
		}
		
		list.sort(Comparator.reverseOrder());
		
		int cn = 0;
		int total = 0;
		for (Integer i : list) {
			cn++;
			if (cn % 3 == 0)
				continue;
			total += i;
		}
		
		System.out.println(total);
	}
}