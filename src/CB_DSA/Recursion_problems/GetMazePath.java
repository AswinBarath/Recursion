package CB_DSA.Recursion_problems;

import java.util.ArrayList;

public class GetMazePath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getMazePath(0, 0, 2, 2));
	}

	public static ArrayList<String> getMazePath(int cr, int cc, int er, int ec) {

		// +ve Base Case
		if (cr == er && cc == ec) {
			ArrayList<String> br = new ArrayList<String>();
			br.add("");
			return br;
		}

		// -ve Base Case
		if (cr > er || cc > ec) {
			ArrayList<String> br = new ArrayList<String>();
			return br;
		}

		ArrayList<String> mr = new ArrayList<>();

		ArrayList<String> rrh = getMazePath(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}

		ArrayList<String> rrv = getMazePath(cr + 1, cc, er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}

		return mr;
	}
}
