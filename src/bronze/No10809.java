package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10809 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuffer sb = new StringBuffer();
//		char[] word = br.readLine().toCharArray();
//		int[] arr = new int[26];
//		Arrays.fill(arr, -1);			//전체 -1로 만들기
//		
//		for(int i=0; i<word.length; i++) {
//			int idx = word[i]-'a';
//			if(arr[idx]==-1) arr[idx]=i;
//			System.out.println(Character.getNumericValue(word[i]));
//			System.out.println((int)word[i]);
//			System.out.println((int)'a');
//			System.out.println((int)'A');
//			System.out.println("------------------");
//		}
//		for(int i: arr) {
//			sb.append(i).append(" ");
//		}
//		System.out.println(sb.toString().trim());
//		br.close();


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		String word = br.readLine();
		char alp = 'a';
		
		for(int i=0; i<26; i++) {
			//indexOf : 문자열 중 입력받은 문자가 있으면 해당 문자의 위치(index) 값을 리턴하고 문자가 없으면 -1을 리턴한다
			sb.append(word.indexOf(String.valueOf(alp))).append(" ");	//valueOf >> char를 String으로 바꿔줌
			alp++;
		}
		System.out.println(sb.toString().trim());
		br.close();
		
	}
}
