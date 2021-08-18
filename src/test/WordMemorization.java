package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class WordMemorization {
	
	static int n;
	static int w;
	static int totalWordLength;
	static int avgWordLength;
	static ArrayList<String> words;
	static ArrayList<String> memo;
	
	public static void main(String[] args) throws IOException {
		input();
		int result = solved();
		System.out.println(result);
	}
	
	private static int solved() {
		int count = 0;
		for(String word:words) {
			//암기 다 참
			if(memo.contains(word)) {
				count += 1;
				memo.remove(word);
				memo.add(word);
			}else {
				count += 3;
				if(memo.size()>=n) {
					for(int i=0; i<memo.size(); i++) {
						if(memo.get(i).length()<=avgWord(memo)) {
							//idx++;
							memo.remove(i);
							break;
						}
					}
				}
				memo.add(word);
			}
			
//			if(memo.size()>n) {
//				//단어포함인지
//				if(memo.contains(word)) {
//					memo.remove(word);
//					memo.add(word);
//					count += 1;
//					continue;
//				}
//				
//				for(int i=0; i<memo.size(); i++) {
//					if(memo.get(i).length()<=avgWordLength) {
//						//idx++;
//						memo.remove(i);
//						break;
//					}
//				}
//				//memo.remove(idx);
//				memo.add(word);
//				count += 3;
//			}else {
//				memo.add(word);
//				count += 3;
//			}
		}
		return count;
		
	}

	private static int avgWord(ArrayList<String> memo) {
		totalWordLength = 0;
		for(String s:memo) {
			totalWordLength += s.length();
		}
		avgWordLength = totalWordLength/n;
		return avgWordLength;
	}

	private static void input() throws IOException {
		BufferedReader br = new  BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		
		memo = new ArrayList<>();
		words = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			String s = st.nextToken();
			words.add(s);
		}
	}
}
