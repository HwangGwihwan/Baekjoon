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
		
		int amount = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int[] price = new int[14];
		for (int i = 0; i < 14; i++) {
			price[i] = Integer.parseInt(st.nextToken());
		}

		int j_amount = amount;
		int j_stock = 0;
		
		int s_amount = amount;
		int s_stock = 0;
		
		for (int i = 0; i < 14; i++) {
			j_stock += j_amount / price[i];
			j_amount = j_amount % price[i];
		}
		
		for (int i = 3; i < 14; i++) {
			if (price[i] > price[i-1] && price[i-1] > price[i-2] && price[i-2] > price[i-3]) {
				s_amount += s_stock * price[i];
				s_stock = 0;
			}
			
			if (price[i] < price[i-1] && price[i-1] < price[i-2] && price[i-2] < price[i-3]) {
				s_stock += s_amount / price[i];
				s_amount = s_amount % price[i];
			}
		}
		
		int j_total = price[13] * j_stock + j_amount;
		int s_total = price[13] * s_stock + s_amount;
		
		StringBuilder sb = new StringBuilder();
		if (j_total > s_total) {
			sb.append("BNP");
		} else if (j_total < s_total) {
			sb.append("TIMING");
		} else {
			sb.append("SAMESAME");
		}

		System.out.print(sb);
	}
}