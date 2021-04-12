package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;

public class No3052 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int[] arr = new int[42];
		int count = 0;
		for(int i=0; i<10; i++) {
			int a = Integer.parseInt(br.readLine());
			arr[a%42]++;
		}
		
		for(int num:arr) {
			if(num>=1) count++;
		}
		sb.append(count);
		System.out.println(sb);
		
		br.close();
		
//		InputStream in = System.in;
//        InputStreamReader reader = new InputStreamReader(in);
//        BufferedReader br = new BufferedReader(reader);
//        HashSet<Integer> remainderSet = new HashSet<>();
//        for(int i=0; i<10; i++){
//            int input = Integer.valueOf(br.readLine());
//            remainderSet.add(input%42);
//        }
//        System.out.println(remainderSet.size());
	}
}
