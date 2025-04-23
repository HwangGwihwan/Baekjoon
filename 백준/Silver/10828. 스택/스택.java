import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
	static Stack<Integer> stack = new Stack<Integer>();
	static StringBuilder sb = new StringBuilder();
	
	public static void push(int x) {
		stack.push(x);
	}
	
	public static void get(String str) {
		if (str.equals("top")) {
			if (stack.size() > 0) {
				sb.append(stack.peek());
				sb.append("\n");
			} else {
				sb.append("-1");
				sb.append("\n");
			}
		} else if (str.equals("size")) {
			sb.append(stack.size());
			sb.append("\n");
		} else if (str.equals("pop")) {
			if (stack.size() > 0) {
				sb.append(stack.pop());
				sb.append("\n");
			} else {
				sb.append("-1");
				sb.append("\n");
			}
		} else if (str.equals("empty")) {
			if (stack.empty()) {
				sb.append("1");
				sb.append("\n");
			} else {
				sb.append("0");
				sb.append("\n");
			}
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String str = br.readLine();
			String[] list = str.split(" ");
			
			if (list[0].equals("push")) {
				push(Integer.parseInt(list[1]));
			} else {
				get(list[0]);
			}
		}
		
		System.out.println(sb);
	}
}