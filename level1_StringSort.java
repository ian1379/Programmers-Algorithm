
public class level1_StringSort {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String[] strings = {"absa", "abc", "acc","ssd","aac"};
		int n = 1;
		sol.solution(strings, n);
	}
	
	static class Solution {
	    public String[] solution(String[] strings, int n) {
	    	String temp = "";
	    	int index = 0;
	    	for (int i = 0; i < strings.length; i++) {
				for (int j = i+1; j < strings.length; j++) {
					if(strings[i].charAt(n) > strings[j].charAt(n)) {
						temp = strings[i];
						strings[i] = strings[j];
						strings[j] = temp;
					} else if (strings[i].charAt(n) == strings[j].charAt(n)) {
						if(strings[i].length() < strings[j].length()) {
							index = strings[i].length();
						}else {
							index = strings[j].length();
						}
						for (int j2 = 0; j2 < index; j2++) {
							if(strings[i].charAt(j2) > strings[j].charAt(j2)) {
								temp = strings[i];
								strings[i] = strings[j];
								strings[j] = temp;
								break;
							} else if(strings[i].charAt(j2) < strings[j].charAt(j2)) {
								break;
							}
						}
					}
				}
			}
	    	
	    	
	    	//코드 같은것 배열 비교
	    	
	    	String[] answer = strings;
	        
	        return answer;
	    }
	}

}
