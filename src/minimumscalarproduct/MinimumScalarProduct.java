package minimumscalarproduct;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MinimumScalarProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for (int i = 0; i < t; i++) {
			// read
			int n = sc.nextInt();
			ArrayList<Long> arr1 = new ArrayList<Long>();
			ArrayList<Long> arr2 = new ArrayList<Long>();
			
			for (int j = 0; j < n; j++) {
				arr1.add((long)sc.nextInt());
			}
			for (int j = 0; j < n; j++) {
				arr2.add((long)sc.nextInt());
			}
			
			// compute
			Collections.sort(arr1);
			Collections.sort(arr2);
			Collections.reverse(arr2);
			
			long sum = 0;
			for (int j = 0; j < n; j++) {
				sum += arr1.get(j) * arr2.get(j); 
			}
			
			// print
			System.out.println("Case #" + (i+1) + ": " + sum);
		}
		
	}
}
