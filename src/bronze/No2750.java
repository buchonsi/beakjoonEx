package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class No2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int count = Integer.parseInt(br.readLine());
		int[] numbers = new int[count];
		int num=0;
		
		for(int i=0; i<count; i++) {
			num = Integer.parseInt(br.readLine());
			numbers[i] = num;
		}
		
		Arrays.sort(numbers);
		
		for(int i=0; i<numbers.length; i++) {
			sb.append(numbers[i]);
			if(i!=numbers.length-1) {
				sb.append("\n");
			}
		}
		System.out.println(sb);
	}
	//	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	StringBuffer sb = new StringBuffer();
	//	int count = Integer.parseInt(br.readLine());
	//	List<Integer> arr = new ArrayList<Integer>();
	//	int num=0;
	//	
	//	for(int i=0; i<count; i++) {
	//		num = Integer.parseInt(br.readLine());
	//		arr.add(num);
	//	}
	//	Collections.sort(arr);
	//	
	//	for(int i=1; i<=arr.size(); i++) {
	//		sb.append(arr.get(i-1));
	//		if(i!=arr.size()) {
	//			sb.append("\n");
	//		}
	//	}
	//	System.out.println(sb);
	//}
}