import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<Integer>();
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		for (int i = 0; i < n; i++) {
			String[] arr = br.readLine().split(" ");
			
			if (arr[0].equals("push_front")) {
				list.add(0, Integer.parseInt(arr[1]));
			} else if (arr[0].equals("push_back")) {
				list.add(Integer.parseInt(arr[1]));
			} else if (arr[0].equals("pop_front")) {
				if (list.size() == 0) {
					sb.append("-1\n");
				} else {
					sb.append(list.get(0)).append("\n");
					list.remove(0);
				}
			} else if (arr[0].equals("pop_back")) {
				if (list.size() == 0) {
					sb.append("-1\n");
				} else {
					sb.append(list.get(list.size()-1)).append("\n");
					list.remove(list.size()-1);
				}
			} else if (arr[0].equals("size")) {
				sb.append(list.size()).append("\n");
			} else if (arr[0].equals("empty")) {
				if (list.size() == 0) {
					sb.append("1\n");
				} else {
					sb.append("0\n");
				}
			} else if (arr[0].equals("front")) {
				if (list.size() == 0) {
					sb.append("-1\n");
				} else {
					sb.append(list.get(0)).append("\n");
				}
			} else if (arr[0].equals("back")) {
				if (list.size() == 0) {
					sb.append("-1\n");
				} else {
					sb.append(list.get(list.size()-1)).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}