import java.util.HashMap;
import java.util.Map;

public class level1_Keypad {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		System.out.println(sol.solution(numbers, hand));
		
	}

	static class Solution {
	    public String solution(int[] numbers, String hand) {
	    	int nowR = 10;
	    	int nowL = 12;
	    	String moveHand = "";
	    	String handC = hand.substring(0,1).toUpperCase();
	    	
	    	
	    	for (int i = 0; i < numbers.length; i++) {
	    		
	    		if(numbers[i]==1||numbers[i]==4||numbers[i]==7) {
	    			moveHand += "L";
	    			nowL = numbers[i];
	    		}else if(numbers[i]==3||numbers[i]==6||numbers[i]==9) {
	    			moveHand += "R";
	    			nowR = numbers[i];
	    		}else {
		    		if(numbers[i]==0) {
		    			numbers[i] =11;
		    		}
		    		if(distance(nowR, numbers[i])<distance(nowL, numbers[i])) {
		    			moveHand += "R";
		    			nowR = numbers[i];
		    		}else if(distance(nowR, numbers[i])>distance(nowL, numbers[i])) {
		    			moveHand += "L";
		    			nowL = numbers[i];
		    		}else {
		    			String h = hand.substring(1).toUpperCase();
		    			moveHand += handC;
		    			if (handC.equals("L")) { nowL = numbers[i]; }else { nowR = numbers[i];};
		    		}
	    		}

			}
	    	
	        return moveHand;
	    }
	    
	    public int distance(int now, int point) {
	    	int[] nowP = posi(now);
	    	int[] pointP = posi(point);
	    	
	    	return Math.abs(nowP[0] - pointP[0]) + Math.abs(nowP[1]-pointP[1]);
	    }
	    
	    public int[] posi(int num) {
	    	int[][] arr = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
	    	int[] posn = new int[2];
	    	for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
					if(arr[i][j]==num) {
						posn = new int[]{i,j};
					}
				}
			}
	    	return posn;
	    }
	}
}
