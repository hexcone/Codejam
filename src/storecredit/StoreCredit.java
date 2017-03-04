package storecredit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// 2 items add up to a fixed total
public class StoreCredit {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			// read
			int credit = sc.nextInt();
			int items = sc.nextInt();
			ArrayList<Integer> price = new ArrayList<Integer>();
			for (int j = 0; j < items; j++) {
				price.add(sc.nextInt());
			}
			
			// calculate
			String ans = calculate(credit, price);
			
			// print
			System.out.println("Case #" + (i+1) + ": " + ans);
			
		}
	}

	public static String calculate(int credit, ArrayList<Integer> price) {
		ArrayList<Integer> originalPrice =  new ArrayList<Integer>(price);
		
		Collections.sort(price);
		Collections.sort(price);
		
		int size = (price.size() / 2) + 1;
		
		// compute
		int ans1 = 0, ans2 = 0;
		for (int i = 0; i < size; i++) {
			ans1 = price.get(i);
			ans2 = credit - ans1;
			if (price.contains(ans2)) {
				break;
			}
		}
		
		// get index
		int index1 = originalPrice.indexOf(ans1) + 1;
		int index2 = originalPrice.indexOf(ans2) + 1;
		if (index1 == index2) {
			index2++;
		}
		
		// return
		if (index1 < index2) {
			return (index1 + " " + index2);
		} else {
			return (index2 + " " + index1);
		}
	}
}
