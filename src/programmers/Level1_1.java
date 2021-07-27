package programmers;

public class Level1_1 {

	public static void main(String[] args) {
		//n의 약수의 합 구하기
		Level1_1 test = new Level1_1();
		System.out.println(test.solution(12));	//28
		System.out.println(test.solution(5));	//6
	}
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){
            if(n%i != 0) continue;
            answer += (n/i);               
        }
        return answer;
    }
}
