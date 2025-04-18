import java.util.ArrayList;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int k = sc.nextInt();
			sc.nextLine();

			ArrayList<Integer> list = new ArrayList<Integer>();
			for (int i = 0; i < k; i++) {
				int num = sc.nextInt();
				sc.nextLine();
				
				if (num == 0) { // 0이면 최근에 쓴 수 삭제
					list.remove(list.size() - 1);
				} else { // 아니면 추가
					list.add(num);
				}
			}
			
			long sum = 0;
			for (int i = 0; i < list.size(); i++) {
				sum += list.get(i);
			}
			
			System.out.println(sum);
		}
}