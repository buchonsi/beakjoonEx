package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//NoSuchElementException >> 공간이 없다(비어있는, 없는 공간의 값을 꺼내려고 하면 발생)

public class No10871 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int num=0;
		
		int count = Integer.parseInt(st.nextToken());	//카운트 숫자 
		int comp = Integer.parseInt(st.nextToken());	//비교할거
		
		st = new StringTokenizer(br.readLine()," ");
		for(int i=0; i<count; i++) {
			num = Integer.parseInt(st.nextToken());
			if(comp>num) {
				sb.append(num).append(" ");
			}
		}
		System.out.println(sb);
	}
}
