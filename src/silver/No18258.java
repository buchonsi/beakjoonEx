package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class No18258 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		Integer count = Integer.parseInt(br.readLine());
		String[] command = new String[count];
		
		//명령어
		for(int i=0; i<count; i++) {
			command[i] = br.readLine();
		}
		//System.out.println(Arrays.toString(command));
		Deque<Integer> que = new LinkedList<Integer>();
		
		for(String s:command) {
			Integer push=0;
			if(s.contains("push")) {
				StringTokenizer st = new StringTokenizer(s);
				s = st.nextToken();
				push = Integer.parseInt(st.nextToken());
				//System.out.println(push);
			}
			
			Integer result=null;
			switch (s) {
			case "push":
				que.add(push);
				//sb.append(push).append("\n");
				break;
			case "pop":
				result = que.poll();
				result=(result!=null)?result:-1;
				sb.append(result).append("\n");
				break;
			case "size":
				sb.append(que.size()).append("\n");
				break;
			case "empty":
				result = que.isEmpty()?1:0;
				sb.append(result).append("\n");
				break;
			case "front":
				result = que.peek();
				result = (result!=null)?result:-1;
				sb.append(result).append("\n");
				break;
			case "back":
				result = que.peekLast();
				result = (result!=null)?result:-1;
				sb.append(result).append("\n");
				break;
			}
		}
		System.out.println(sb);
	}
}
