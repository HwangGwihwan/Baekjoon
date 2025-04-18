import java.util.ArrayList;
import java.util.Scanner;

public class Main {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int t = sc.nextInt();
			sc.nextLine();
			
			String[] arr = new String[t];
			for (int i = 0; i < t; i++) {
				String s = sc.nextLine();
				arr[i] = s;
			}
			
			for (int i = 0; i < t; i++) {
				char[] charArr = arr[i].toCharArray();
				ArrayList<Character> reverse = new ArrayList<Character>();
				StringBuilder str = new StringBuilder();
				for (int j = 0; j < charArr.length; j++) {
					if (charArr[j] != ' ') { // 공백이 아니면 문자 추가
						reverse.add(charArr[j]);
					} else { // 공백이면 저장된 문자 배열 다 출력 후 초기화
						for (int k = reverse.size() - 1; k >= 0; k--) {
							str.append(reverse.get(k));
						}
						str.append(" ");
						reverse.clear();
					}
				}
				
				// 문장의 마지막 단어 출력해야함....
				for (int k = reverse.size() - 1; k >= 0; k--) {
					str.append(reverse.get(k));
				}
				reverse.clear();
				System.out.println(str);
			}
		}
}