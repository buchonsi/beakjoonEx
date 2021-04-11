package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class No10818 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		List<Integer> arr = new ArrayList<>();
		int count = Integer.parseInt(br.readLine());
		int maxNum;
		int minNum;
		StringTokenizer st = new StringTokenizer(br.readLine()," ");

		for(int i=0; i<count; i++) {
			arr.add(Integer.parseInt(st.nextToken()));
		}
		maxNum = Collections.max(arr);
		minNum = Collections.min(arr);
		
		sb.append(minNum).append(" ").append(maxNum);
		System.out.println(sb);
	}
}