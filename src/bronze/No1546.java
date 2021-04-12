package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1546 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int count = Integer.parseInt(br.readLine());
		int[] arr = new int[count];
		int maxNum = 0;
		double sum = 0;
		String nums = br.readLine();
		StringTokenizer st = new StringTokenizer(nums," ");
		
		for(int i=0; i<count; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			if(maxNum < arr[i]) {
				maxNum = arr[i];
			}
			sum += arr[i];
		}
		sum = (sum/maxNum*100)/count;
		System.out.println(sum);
	}
}
