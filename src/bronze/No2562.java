package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2562 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int[] arr = new int[9];
		int maxNum = Integer.MIN_VALUE;
		int count = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = Integer.parseInt(br.readLine());
			
			if(maxNum < arr[i]) {
				maxNum = arr[i];
				count = i+1;
			}
		}
		sb.append(maxNum).append("\n").append(count);
		System.out.println(sb);
	}

}
