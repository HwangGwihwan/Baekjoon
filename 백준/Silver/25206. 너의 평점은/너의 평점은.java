import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static double grade(String s) {
		double grade = 0;
		
		if (s.equals("A+")) {
			grade = 4.5;
		}
		if (s.equals("A0")) {
			grade = 4.0;
		}
		if (s.equals("B+")) {
			grade = 3.5;
		}
		if (s.equals("B0")) {
			grade = 3.0;
		}
		if (s.equals("C+")) {
			grade = 2.5;
		}
		if (s.equals("C0")) {
			grade = 2.0;
		}
		if (s.equals("D+")) {
			grade = 1.5;
		}
		if (s.equals("D0")) {
			grade = 1.0;
		}
		if (s.equals("F")) {
			grade = 0.0;
		}
		
		return grade;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double credit = 0;
		double avg = 0;
		
		for (int i = 0; i < 20; i++) {
			String str = sc.nextLine();
			String[] list = str.split(" ");
			
			if (!list[2].equals("P")) {
				credit += Double.parseDouble(list[1]);
				avg += Double.parseDouble(list[1]) * grade(list[2]);
			}
		}
		
		System.out.println(avg / credit);
	}
}