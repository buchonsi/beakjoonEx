package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No10989 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int count = Integer.parseInt(br.readLine());
		
//		int[] num = new int[count];
		int[] countArr = new int [10001];
//		int[] result = new int[count];
		
//		//값 넣기
//		for(int i=0; i<count; i++) {
//			//[2,2,3,4,5,.....]
//			num[i] = Integer.parseInt(br.readLine());
//		}
//		
//		//카운팅
//		for(int i=0; i<count; i++) {
//			int chk = num[i];
//			countArr[chk]++;
//		}
//		
//		for(int i=1; i<countArr.length; i++) {
//			countArr[i] += countArr[i-1];
//		}
//		
//		for(int i=num.length-1; i>=0; i--) {
//			countArr[num[i]]--;
//			result[countArr[num[i]]] = num[i];
//		}
//		System.out.println(Arrays.toString(result));
		for(int i=0; i<count; i++) {
			int number = Integer.parseInt(br.readLine());
			countArr[number]++;
		}
		
		for(int i=1; i<countArr.length; i++) {
			while(countArr[i]-- > 0) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
}
