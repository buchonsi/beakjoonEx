package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//java.lang.NumberFormatException : 숫자 형식 오류(문자를 숫자로 바꾸려 해서 생긴오류)

public class No10951 {
	
	public static void main(String[] args) throws IOException {
		
//    	StringBuilder sb = new StringBuilder();
//    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        String str;
//    	
//    	while((str=br.readLine()) != null) {
//            st = new StringTokenizer(str, " ");
//    		int a = Integer.parseInt(st.nextToken());
//        	int b = Integer.parseInt(st.nextToken());	
//        
//        	sb.append((a+b)+"\n");
//        	
//    	}
//    	System.out.print(sb);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String nums;
		int result;
		
		while((nums = br.readLine())!=null) {
			String[] num = nums.split(" ");
			int a = Integer.parseInt(num[0]);
			int b = Integer.parseInt(num[1]);
			result = a+b;
			sb.append(sb).append("\n");
		}
		System.out.println(sb);
		br.close();
	}
}
