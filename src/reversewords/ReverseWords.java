package reversewords;

import java.util.Scanner;

public class ReverseWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			// read
			String text = sc.nextLine();
		    String[] split = text.split("\\s+");
		    
		    // print
		    System.out.print("Case #" + (i+1) + ": ");
		    for (int j = split.length - 1 ; j > -1; j--) {
			    System.out.print(split[j] + " ");
		    }
		    System.out.println();
		}
	}

}
