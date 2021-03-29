import java.util.ArrayList;
import java.util.Arrays;

public class level1_descending {

	public static void main(String[] args) {
		Solution sol = new Solution();
		String s= "Zbcdefga";
		sol.solution(s);
	}
	static class Solution {
	    public String solution(String s) {
	        int ascii = 0;
	        int[] arr = new int[s.length()];
	        
	        for (int i = 0; i< s.length(); i ++) {
	        	ascii =  (int)s.charAt(i);
	        	arr[i] = ascii;
	        }
	        //정렬
	        Arrays.sort(arr);
	        String answer = "";
	        
	        String small = "";
	        String capital = "";
	        for (int i = arr.length-1; i>= 0; i --) {
	        	if(arr[i] >=65 && arr[i]<=90) {
	        		capital += Character.toString(arr[i]);
	        	}else {
	        		small += Character.toString(arr[i]);
	        	}
	        }
	        answer =  small + capital ;
	        

	        System.out.println( small);
	        
	        return answer;
	    }
	}

}
