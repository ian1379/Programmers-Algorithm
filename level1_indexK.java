import java.util.Arrays;

public class level1_indexK {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
		sol.solution(array, commands);

	}
	static class Solution {
	    public int[] solution(int[] array, int[][] commands) {
	    	int[] temp = null;
	    	int[] answer = new int[commands.length];
	    	
	    	for (int i = 0; i < commands.length; i++) {
	    		temp = new int[commands[i][1] - commands[i][0] + 1];
	    		for (int j = 0; j <  temp.length; j++) {
					temp[j] = array[commands[i][0]-1 + j];
				}
	    		Arrays.sort(temp);
	    		answer[i] = 
	    				temp[commands[i][2]-1];
			}
	    	
	        return answer;
	    }
	}

}
