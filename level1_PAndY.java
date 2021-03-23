
public class level1_PAndY {

	public static void main(String[] args) {
		Solution Sol = new Solution();
		String s = "pPoooyY";
		System.out.println(Sol.solution(s));
	}

	public static class Solution {
		boolean solution(String s) {
			boolean answer = true;
			s = s.toUpperCase();
			char chr;
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				chr = s.charAt(i);
				if (chr == 'P') {
					count++;
				} else if (chr == 'Y') {
					count--;
				}
			}
			if (count == 0) {
				answer = true;
			} else {
				answer = false;
			}

			return answer;
		}
	}
}
