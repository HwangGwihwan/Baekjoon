import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        
        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
        	st = new StringTokenizer(br.readLine());
        	int n = Integer.parseInt(st.nextToken());
        	int[] score = new int[n];
        	int sum = 0;
        	int count = 0;
        	double avg;
        	double ratio;
        	
        	for (int j = 0; j < n; j++) {
        		score[j] = Integer.parseInt(st.nextToken());
        		sum += score[j];
        	}
        	
        	avg = (double)sum / (double)n;
        	
        	for (int j = 0; j < n; j++) {
        		if (score[j] > avg) {
        			count++;
        		}
        	}
        	
        	ratio = ((double)count / (double)n * 100);
        	String str = String.format("%.3f", ratio);
        	sb.append(str).append("%\n");
        }

        System.out.println(sb);
    }
}