package forExam;

import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;
import java.util.Vector;

public class KTest2 {
	public static void main(String[] args) throws IOException {
		Vector<String> cmd = new Vector<String>();
		cmd.add("D 2");
		cmd.add("C");
		cmd.add("U 3");
		cmd.add("C");
		cmd.add("D 4");
		cmd.add("C");
		cmd.add("U 2");
		cmd.add("Z");
		cmd.add("Z");
		cmd.add("U 2");
		cmd.add("C");
		solution(8,2,cmd);
	}
	
    public static String solution(int n, int k, Vector<String> cmd) {
    	HashMap<Integer, String> table = new HashMap<>();
    	Vector<Integer> storige = new Vector<Integer>();
    	String check = "";
    	String answer="";
    	int num = k;
    	for(int i=0; i<n; i++) {
    		table.put(i, "O");
    	}
    	for(String s:cmd) {
    		StringTokenizer st = new StringTokenizer(s," ");
    		check = st.nextToken();
    		switch (check) {
			case "U":
				int up = Integer.parseInt(st.nextToken());
				for(int i:storige) {
					if(num-up<i && i<num) {
						num -= 1;
					}
				}
				num -= up;
				break;
			case "D":
				int down = Integer.parseInt(st.nextToken());
				for(int i:storige) {
					if(num<i && i<num+down) {
						num += 1;
					}
				}
				num += down;
				break;
			case "C":
				storige.add(num);
				table.replace(num, "X");
				num = num+1;
				if(num==n-1) {
					num=(n-2);
				}
				break;
			case "Z":
				table.replace(storige.lastElement(), "O"); 
				storige.remove(storige.size()-1);
				break;
    		}
    	}
    	
    	for(int i=0; i<table.size(); i++) {
    		answer += table.get(i);
    	}
    	return answer;
    }
}
