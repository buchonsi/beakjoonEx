package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class No2751 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int count = Integer.parseInt(br.readLine());
		List<Integer> arr = new ArrayList<Integer>();
		int num=0;
		
		for(int i=0; i<count; i++) {
			num = Integer.parseInt(br.readLine());
			arr.add(num);
		}
		Collections.sort(arr);
		
		for(int i=1; i<=arr.size(); i++) {
			sb.append(arr.get(i-1));
			if(i!=arr.size()) {
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
}