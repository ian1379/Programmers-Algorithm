package test;
import java.util.ArrayList;
/*
 * level1_2016
 * */

public class level1_sum2num {

	 public int[] solution(int[] numbers) {
	        ArrayList<Integer> arr = new ArrayList<Integer>();
			for (int i = 0; i < numbers.length; i++) {
				for (int j = 1; j < numbers.length-i; j++) {
					if(!arr.contains(numbers[i] + numbers[j+i])) {
						arr.add(numbers[i] + numbers[j+i]);
					}
				}
			}
			int[] answer = new int[arr.size()];
	        arr.sort(null);
			for (int i = 0; i < arr.size(); i++) {
				answer[i] = (int) arr.get(i);
			}
			
		     return answer;
	    }

}
