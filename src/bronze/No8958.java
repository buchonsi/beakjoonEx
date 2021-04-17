package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No8958 {

	public static void main(String[] args) throws NumberFormatException, IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuffer sb = new StringBuffer();
//		
//		int idx = Integer.parseInt(br.readLine());
//		String[] arr = new String[idx];				//총개수
//		
//		for(int i=0; i<idx; i++) {
//			arr[i] = br.readLine();
//			char[] arr2 = new char[arr[i].length()];	//ox 판단용
//			int sum=0;
//			int count=0;
//			for(int j=0; j<arr2.length; j++) {
//				arr2[j] = arr[i].charAt(j);
//				if(arr2[j]=='O') count++;
//				else count=0;
//				sum+=count;
//			}
//			sb.append(sum).append("\n");
//		}
//		System.out.println(sb);
//		br.close();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int idx = Integer.parseInt(br.readLine());
		
		for(int i=0; i<idx; i++) {
			char[] arr2 = br.readLine().toCharArray();	//arr = [o,x,o,o,o,x,x,o.....]
			int sum=0;
			int count=0;
			for(int j=0; j<arr2.length; j++) {
				//System.out.println(arr2[j]);
				if(arr2[j]=='O') count++;
				else count=0;
				sum+=count;
				
			}
			sb.append(sum).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
