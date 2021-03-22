package test;

public class level1_2016 {

	class Solution {
	    public String solution(int a, int b) {
	                String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
	        int[] dcount = {31,29,31,30,31,30,31,31,30,31,30,31};
	        int total = 0;
	        //월계산
	        for (int i = 0; i < a-1; i++) {
	            total += dcount[i];
	        }
	        total += b;
	        total = total%7;
	        //날계산
	        String s = day[total];

	        String answer = s;
	        return answer;
	    }
	}

}
