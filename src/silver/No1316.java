package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1316 {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		int count = Integer.parseInt(br.readLine());
		int group =0;
		for(int i=0; i<count; i++) {
			if(group()==true) {
				group++;
			}
		}
		System.out.println(group);
	}
	private static boolean group() throws IOException {
		boolean[] alp = new boolean[26];
		String s = br.readLine();
		int oldNum = 0;
		
		for(int i=0; i<s.length(); i++) {
			int newNum = s.charAt(i);
			
			if(oldNum != newNum) {
				if(alp[newNum-'a']==false) {
					alp[newNum-'a'] = true;
					oldNum = newNum;
				}else {
					return false;
				}
			}
		}
		return true;
	}
}
