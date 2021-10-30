package recursion_problems;

import java.util.ArrayList;

public class GetBoardPath {

	public static void main(String[] args) {
		System.out.println(getBoardPath(0, 10));
		System.out.println(getBoardPath(0, 10).size());

	}

	public static ArrayList<String> getBoardPath(int curr, int end) {

		// Positive Base Case
		if (curr == end) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}

		// Negative Base Case
		if (curr > end) {
			ArrayList<String> br = new ArrayList<String>();
			return br;
		}

		// Recursive case
		ArrayList<String> mr = new ArrayList<>();

		for (int dice = 1; dice <= 6; dice++) {
			ArrayList<String> rr = getBoardPath(curr + dice, end);

			for (String s : rr) {
				mr.add(dice + s);
			}
		}

		return mr;
	}

}
