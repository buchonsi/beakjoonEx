package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class No2447 {
	
	static char[][] arr;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		int n = Integer.parseInt(br.readLine());
		//최종 배열개수
		
		arr = new char[n][n];
		//필요 매개변수 x,y(좌표값) , n(블록으로 나눌 사이즈용), 
		makeStar(0,0,n,false);
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sb.append(arr[i][j]);
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
	static void makeStar(int x, int y, int n, boolean check) {

		
		if(check) {
			for(int i = x; i < x+n; i++) {
				for(int j = y; j < y+n; j++) {
					arr[i][j] = ' ';
				}
			}
			return;
		}
		
		if(n==1) {
			arr[x][y] = '*';
			return;
		}
		int block = n/3;								//1차: 9 			/2차 : 3
		int count = 0;
		for(int i = x; i < x+n; i += block) {			//1차: i=[0,9,27]  /2차 : i=[0,3,9]
			for(int j = y; j < y+n; j += block) {		//1차: j=[0,9,27]	/2차 : j=[0,3,9]
				count++;
				if(count==5) {							//1차: i=9,j=9일때 
					makeStar(i,j,block,true);			//1차: 공백만들기 (좌표 9,9부터 block크기만큼)	//2차: 3,3부터 3만큼 가로세로로 공백
				}else {
					makeStar(i,j,block,false);
				}
			}
		}
	}
}
