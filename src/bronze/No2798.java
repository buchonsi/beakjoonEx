package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2798 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count = Integer.parseInt(st.nextToken());
		int keyNum = Integer.parseInt(st.nextToken());
		int sum = 0;
		int maxNum=0;
		
		st = new StringTokenizer(br.readLine());
		int[] arr = new int[count];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<count-2; i++) {
			for(int j=i+1; j<count; j++) {
				for(int k=j+1; k<count; k++) {
					sum = arr[i]+arr[j]+arr[k];
					if(sum > keyNum) {
						continue;
					}else {
						maxNum = maxNum<sum?sum:maxNum;
					}
				}
			}
		}
		System.out.println(maxNum);
	}
}
