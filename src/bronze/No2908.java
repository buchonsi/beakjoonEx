package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2908 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String s = br.readLine();
//		StringTokenizer st = new StringTokenizer(s);
//		String a = st.nextToken();
//		String b = st.nextToken();
//		String newA = "";
//		String newB = "";
//		String maxNum ="";
//		
//		for(int i=2; i>=0; i--) {
//			newA += a.charAt(i);
//			newB += b.charAt(i);
//		}
//		maxNum = Integer.parseInt(newA)>Integer.parseInt(newB)?newA:newB;
//		System.out.println(maxNum);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		String[] arr = s.split(" ");
		int num1 = Integer.parseInt(arr[0]);
		int num2 = Integer.parseInt(arr[1]);
		int maxNum;
		num1 = (num1%10)*100 + ((num1/10)%10)*10 + num1/100;
		num2 = (num2%10)*100 + ((num2/10)%10)*10 + num2/100;
		
		maxNum = num1>num2?num1:num2;
		System.out.println(maxNum);
	}
}
