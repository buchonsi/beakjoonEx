package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1157 {

	public static void main(String[] args) throws IOException {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		String message = br.readLine().toUpperCase();
//		int wordCount[] = new int[26];	//a~z >> 26개
//		int max = 0;
//		char maxWord = '?';
//		
//		for(int i=0; i<message.length(); i++) {
//			int countIndex = message.charAt(i)-65;		//'A' = 65
//			wordCount[countIndex]++;
//			
//			if(max < wordCount[countIndex]) {
//				max = wordCount[countIndex];
//				maxWord = message.charAt(i);
//			}else if(max == wordCount[countIndex]) {
//				maxWord = '?';
//			}
//		}
//		System.out.println(maxWord);
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] message = br.readLine().toUpperCase().toCharArray();
		int wordCount[] = new int[26];	//a~z >> 26개
		int max = 0;
		char maxWord = '?';
		
		for(int i=0; i<message.length; i++) {
			int countIndex = message[i]-65;		//'A' = 65
			wordCount[countIndex]++;
			
			if(max < wordCount[countIndex]) {
				max = wordCount[countIndex];
				maxWord = message[i];
			}else if(max == wordCount[countIndex]) {
				maxWord = '?';
			}
		}
		System.out.println(maxWord);
	}
}
