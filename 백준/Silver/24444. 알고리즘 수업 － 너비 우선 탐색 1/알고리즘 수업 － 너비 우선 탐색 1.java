import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	static int[] visited;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	
    	int n = Integer.parseInt(st.nextToken());
    	int m = Integer.parseInt(st.nextToken());
    	int r = Integer.parseInt(st.nextToken());
    	
    	visited = new int[n+1];
    	
    	for (int i = 0; i <= n; i++) {
    		graph.add(new ArrayList<Integer>());
    	}
    	
    	for (int i = 0; i < m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int u = Integer.parseInt(st.nextToken());
    		int v = Integer.parseInt(st.nextToken());
    		
    		graph.get(u).add(v);
    		graph.get(v).add(u);
    	}
    	
    	for (int i = 1; i <= n; i++) {
    		Collections.sort(graph.get(i));
    	}
    	
    	bfs(r);
    	
    	for (int i = 1; i < visited.length; i++) {
    		System.out.println(visited[i]);
    	}
    }
    
    public static void bfs(int start) {
    	Queue<Integer> queue = new LinkedList<Integer>();
    	int cnt = 1;
    	
    	queue.offer(start);
    	visited[start] = cnt++;
    	
    	while (!queue.isEmpty()) {
    		int index = queue.poll();
    		
    		for (int i = 0; i < graph.get(index).size(); i++) {
    			int next = graph.get(index).get(i);
    			
    			if (visited[next] != 0) {
    				continue;
    			}
    			
    			queue.offer(next);
    			visited[next] = cnt++;
    		}
    	}
    }
}