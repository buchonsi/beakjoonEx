package programmers;

public class Level1_2 {
	//시저암호
	public static void main(String[] args) {
		Level1_2 test = new Level1_2();
		System.out.println(test.solution("AB", 1)); // "BC"
		System.out.println(test.solution("z", 1)); // "a"
		System.out.println(test.solution("a B z", 4)); // "e F d"
	}
	
    public String solution(String s, int n) {
        String answer = "";
        char check = 0;
        for(int i=0; i<s.length(); i++){
            check = s.charAt(i);
            if(check == ' '){
                answer += check;
                continue;
            }else if(check<='Z'){
                check += n;
                if(check>'Z') check = (char)('A'+(check-'Z'-1));
            }else{
                check += n;
                if(check>'z') check = (char)('a'+(check-'z'-1));
            }
                       
            answer += check;
        }
        return answer;
    }
}
