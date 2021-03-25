
public class level1_PE {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int n=5;
		int[] lost = {4};
		int[] reserve = {3,4};
		System.out.println(sol.solution(n, lost, reserve));
	}
	static class Solution {
	    public int solution(int n, int[] lost, int[] reserve) {
	    	int out = 0;
	    	for (int i = 0; i < lost.length; i++) {
				for (int j = 0; j < reserve.length; j++) {
					if(lost[i]==reserve[j]) {
						reserve[j] = -1;
						out++;
					}
				}
	    	}
	    	for (int i = 0; i < lost.length; i++) {
				for (int j = 0; j < reserve.length; j++) {
					if (lost[i]-1 == reserve[j] || lost[i]+1 == reserve[j]) {
						reserve[j] = -1;
						out++;
						break;
					}
				}
			}
	        return n - (lost.length -out);
	    }
	}

}
