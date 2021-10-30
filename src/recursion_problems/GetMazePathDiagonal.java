package recursion_problems;

import java.util.ArrayList;

public class GetMazePathDiagonal {

	public static void main(String[] args) {
		// Ans: [HHVV, HVHV, HVVH, HVD, HDV, VHHV, VHVH, VHD, VVHH, VDH, DHV, DVH, DD]

		System.out.println(getMazePathDiagonal(0, 0, 2, 2));
	}

	public static ArrayList<String> getMazePathDiagonal(int cr, int cc, int er, int ec) {

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

		ArrayList<String> rrh = getMazePathDiagonal(cr, cc + 1, er, ec);
		for (String rrhs : rrh) {
			mr.add("H" + rrhs);
		}

		ArrayList<String> rrv = getMazePathDiagonal(cr + 1, cc, er, ec);
		for (String rrvs : rrv) {
			mr.add("V" + rrvs);
		}

		ArrayList<String> rrd = getMazePathDiagonal(cr + 1, cc + 1, er, ec);
		for (String rrds : rrd) {
			mr.add("D" + rrds);
		}

		return mr;
	}

}
