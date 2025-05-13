import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
        	list.add(Integer.parseInt(br.readLine()));	
        }
        
        Collections.sort(list);
        
        ArrayList<Integer> weight = new ArrayList<Integer>();
        for (Integer i : list) {
        	weight.add(i * n);
        	n--;
        }

        System.out.println(Collections.max(weight));
    }
}