
public class level1_PTest {

	public static void main(String[] args) {
		Solution sol = new Solution();
		int[] answers = { 1, 3, 2, 4, 2 };
		sol.solution(answers);
	}

	static class Solution {
		public int[] solution(int[] answers) {
			int[] First = { 1, 2, 3, 4, 5 };
			int[] second = { 2, 1, 2, 3, 2, 4, 2, 5 };
			int[] third = { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 };
			int[] correct = { 0, 0, 0 };
			int[] answer = { 0, 0, 0 };

			for (int i = 0; i < answers.length; i++) {
				if (First[i % 5] == answers[i]) {
					correct[0]++;
				}
				if (second[i % 8] == answers[i]) {
					correct[1]++;
				}
				if (third[i % 10] == answers[i]) {
					correct[2]++;
				}
			}

			if (correct[0] > correct[1] && correct[0] > correct[2]) {
				answer = new int[] { 1 };
			} else if (correct[1] > correct[2] && correct[1] > correct[0]) {
				answer = new int[] { 2 };
			} else if (correct[2] > correct[1] && correct[2] > correct[0]) {
				answer = new int[] { 3 };
			} else if (correct[0] == correct[1]) {
				if (correct[0] == correct[2]) {
					answer = new int[] { 1, 2, 3 };
				} else {
					answer = new int[] { 1, 2 };
				}
			} else if (correct[1] == correct[2]) {
				answer = new int[] { 2, 3 };
			} else {
				answer = new int[] { 1, 3 };
			}

			return answer;
		}
	}
}
