package pattensoverlap;

import java.util.Scanner;

public class PatternsOverlap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < t; i++) {
			// read
			String pat1 = sc.nextLine();
			String pat2 = sc.nextLine();
			
			// compute
			boolean possible = compute(pat1, pat2);
			
			// print
			if (possible) {
				System.out.println("Case #" + (i+1) + ": TRUE");
			} else {
				System.out.println("Case #" + (i+1) + ": FALSE");
			}
		}
	}
	
	public static boolean compute(String pat1, String pat2) {
		if ((pat1.isEmpty()) && (pat2.isEmpty())) {
			return true;
		} else if ((pat1.isEmpty()) && (!pat2.isEmpty())) {
			return false;
		} else if ((!pat1.isEmpty()) && (pat2.isEmpty())) {
			return false;
		}	
		
		char first = pat1.charAt(0);
		char second = pat2.charAt(0);
		
		boolean possible = false;
		if ((first != '*') && (second != '*') && (first == second)) {
			// matched char
			possible = compute(pat1.substring(1, pat1.length()), pat2.substring(1, pat2.length()));
		} else if (((first != '*') && (second != '*') && (first != second))) {
			// non-matching char
			possible = false;
		} else if ((first == '*') || (second == '*')) {
			// either is a wild
			if (first == '*') {
				for (int i = 0; i < 5; i++) {
					if (i <= pat2.length()) {
						if (compute(pat1.substring(1, pat1.length()), pat2.substring(i, pat2.length()))) {
							possible = true;
							break;
						}
					}
				}
			}
			if (second == '*') {
				for (int i = 0; i < 5; i++) {
					if (i <= pat1.length()) {
						if (compute(pat2.substring(1, pat2.length()), pat1.substring(i, pat1.length()))) {
							possible = true;
							break;
						}
					}
				}
			}
		}

		return possible;
	}
}
