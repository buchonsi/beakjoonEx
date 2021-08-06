package programmers;

import java.util.ArrayList;
import java.util.Arrays;

public class NumK {
	int[] numCheck = new int[10];
	int answer;
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		NumK fd = new NumK();
		int[] result = fd.solution(array, commands);
		System.out.println(Arrays.toString(result));
		
	}
	
	public int[] solution(int[] array, int[][] commands) {
		int[] answer = {};
		int result = 0;
		//commands를 1부터 사이즈까지 돌면서
        //subString(1,2)
        //charAt(3)
		answer = new int[commands.length];
		for(int i=0; i<commands.length; i++) {
			int[] cutArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
			Arrays.sort(cutArr);
			result = cutArr[commands[i][2]-1];
			answer[i] = result;
		}
		
		return answer;
    }
    
}
