package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No10250 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb =  new StringBuffer();
		int count = Integer.parseInt(br.readLine());
		int floor = 0;
		int num = 0;
		int roomNum =0;
		
		for(int i=0; i<count; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int h = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			int v = Integer.parseInt(st.nextToken());
			
			if(v%h==0) {
				floor= h*100;
				num=v/h;
			}else {
				floor=v%h*100;
				num=(v/h)+1;
			}
			roomNum = floor+num;
			sb.append(roomNum).append("\n");
		}
		System.out.println(sb);
	}
}
