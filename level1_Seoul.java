
public class level1_Seoul {

	public static void main(String[] args) {
		Solution s = null;
		String[] seoul = {"Kim","s","s"};
		s.solution(seoul);
	}
	class Solution {
	    public String solution(String[] seoul) {
	    	String answer = null;
	    	for (int i = 0; i < seoul.length; i++) {
				if(seoul[i].equals("Kim")) {
					answer = "김서방은 " + i  + "에 있다";
				}
			}
	        return answer;
	    }
	}

}
