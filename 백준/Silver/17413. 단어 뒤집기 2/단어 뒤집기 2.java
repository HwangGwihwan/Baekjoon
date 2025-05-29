import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        char[] arr = br.readLine().toCharArray();
        List<String> list = new ArrayList<String>();
    	String s = new String();
    	int check = 0;
    	
        for (int i = 0; i < arr.length; i++) {
        	if (arr[i] == '<') {
        		check = 1;
        		if (i != 0) {
            		list.add(s);
        		}
        		s = "";
        	}
        	
        	if (arr[i] == '>') {
        		check = 0;
        		s += arr[i];
        		list.add(s);
        		s = "";
        		continue;
        	}
        	
        	if (arr[i] == ' ' && check == 0) {
        		list.add(s);
        		s = "";
        	}
        	
        	s += arr[i];
        	
        }
        list.add(s);
        
        String answer = "";
        for (String str : list) {
        	if (str.contains("<")) {
        		answer += str;
        	} else {
        		char[] c = str.toCharArray();
    			String temp = "";
        		for (int i = 0; i < c.length; i++) {
        			if (c[i] == ' ') {
        				answer += " ";
        			} else {
        				temp = c[i] + temp;
        			}
        		}
    			answer += temp;
        	}
        }

        System.out.println(answer);        
    }
}
