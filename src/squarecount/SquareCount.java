package squarecount;

import java.util.Scanner;

public class SquareCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			// read
			long r = sc.nextLong();
			long c = sc.nextLong();
			
			long min = 0;
			long max = 0;
			if (r < c) {
				min = r;
				max = c;
			} else {
				min = c;
				max = r;
			}
			
			long total = 0;
			
			// compute
			for (long j = 1; j <= min; j++) {
				// normal squares
				long subtotal = (r-j) * (c-j);
				subtotal = subtotal % 1000000007;
				total += subtotal;
				total = total % 1000000007;
				
				// weird square
				if (j > 1) {
					subtotal = (r-(j))* (c-(j));
					subtotal = subtotal % 1000000007;
					if (j > 2) {
						subtotal = subtotal * (j-1);
						subtotal = subtotal % 1000000007;
					}
					total += subtotal;
					total = total % 1000000007;
				}
				
			}
			
			total = total % 1000000007;
			System.out.println("Case #" + (i+1) + ": " + total);
		}
	}

}
