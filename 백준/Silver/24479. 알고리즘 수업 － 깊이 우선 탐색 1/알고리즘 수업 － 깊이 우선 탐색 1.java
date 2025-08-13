import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
	static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
	static int[] visited;
	static int order = 1;
	
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
    	
    	dfs(r);
    	
    	for (int i = 1; i < visited.length; i++) {
    		System.out.println(visited[i]);
    	}
    }
    
    public static void dfs(int node) {
    	visited[node] = order;
    	
    	for (int i = 0; i < graph.get(node).size(); i++) {
    		int newNode = graph.get(node).get(i);
    		if (visited[newNode] == 0) {
    			order++;
    			dfs(newNode);
    		}
    	}
    }
}