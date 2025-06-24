import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken());
    	int w = Integer.parseInt(st.nextToken());
    	int l = Integer.parseInt(st.nextToken());
    	
    	st = new StringTokenizer(br.readLine());
    	int[] truck = new int[n];
    	for (int i = 0; i < n; i++) {
    		truck[i] = Integer.parseInt(st.nextToken());
    	}
    	
    	Queue<Integer> queue = new LinkedList<Integer>();
    	int time = 0;
    	int weight = 0;
    	int cnt = 0;
    	
    	queue.offer(truck[0]);
    	weight += truck[0];
    	time++;
    	cnt++;
    	
    	while (cnt < n) {
    		if (queue.size() == w) {
    			int tmp = queue.poll();
    			weight -= tmp;
    			
    			if (truck[cnt] + weight <= l) {
        			queue.offer(truck[cnt]);
        			weight += truck[cnt];
        			time++;
        			cnt++;
        		} else {
        			queue.offer(0);
        			time++;
        		}
    		} else {
    			if (truck[cnt] + weight <= l) {
        			queue.offer(truck[cnt]);
        			weight += truck[cnt];
        			time++;
        			cnt++;        			
        		} else {
        			queue.offer(0);
        			time++;
        		}
    		}
    	}
    	
    	time += w;
    	System.out.println(time);
    }
}