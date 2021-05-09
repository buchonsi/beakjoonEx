package forExam;

import java.io.IOException;
import java.util.HashMap;

public class KTest1 {
	public static void main(String[] args) throws IOException {
		solution("123");
	}
	
    public static int solution(String s) {
    	String input = s;
    	int answer = 0;
    	
    	HashMap<String, String> changer = new HashMap<String, String>();
    	changer.put("zero", "0");
    	changer.put("one", "1");
    	changer.put("two", "2");
    	changer.put("three", "3");
    	changer.put("four", "4");
    	changer.put("five", "5");
    	changer.put("six", "6");
    	changer.put("seven", "7");
    	changer.put("eight", "8");
    	changer.put("nine", "9");
    	
    	for(String key : changer.keySet()) {
    		if(input.contains(key)) {
        		input = input.replaceAll(key, changer.get(key));
        	}
    	}
    	answer = Integer.parseInt(input);
        return answer;
    }
}
