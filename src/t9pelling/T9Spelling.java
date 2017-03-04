package t9pelling;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class T9Spelling {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < n; i++) {
			// read
			String text = sc.nextLine();
			
			// compute
			ArrayList<Character> charArray = new ArrayList<Character>();
			for (int j = 0; j < text.length(); j++) {
				ArrayList<Character> newCharArray = convert(text.charAt(j));
				
				if (!charArray.isEmpty()) {
					char last = charArray.get(charArray.size()-1);
					char first = newCharArray.get(0);
					if (last == first) {
						charArray.add(' ');
					}
				}
				
				charArray.addAll(newCharArray);
			}
			
			// print
			System.out.println("Case #" + (i+1) + ": " + getStringRepresentation(charArray));
		}
	}
	
	public static ArrayList<Character> convert(char c) {
		String ans = "";
		switch (c) {
			case 'a':
				ans = "2";
				break;
			case 'b':
				ans = "22";
				break;
			case 'c':
				ans = "222";
				break;
			case 'd':
				ans = "3";
				break;
			case 'e':
				ans = "33";
				break;
			case 'f':
				ans = "333";
				break;
			case 'g':
				ans = "4";
				break;
			case 'h':
				ans = "44";
				break;
			case 'i':
				ans = "444";
				break;
			case 'j':
				ans = "5";
				break;
			case 'k':
				ans = "55";
				break;
			case 'l':
				ans = "555";
				break;
			case 'm':
				ans = "6";
				break;
			case 'n':
				ans = "66";
				break;
			case 'o':
				ans = "666";
				break;
			case 'p':
				ans = "7";
				break;
			case 'q':
				ans = "77";
				break;
			case 'r':
				ans = "777";
				break;
			case 's':
				ans = "7777";
				break;
			case 't':
				ans = "8";
				break;
			case 'u':
				ans = "88";
				break;
			case 'v':
				ans = "888";
				break;
			case 'w':
				ans = "9";
				break;
			case 'x':
				ans = "99";
				break;
			case 'y':
				ans = "999";
				break;
			case 'z':
				ans = "9999";
				break;
			case ' ':
				ans = "0";
				break;
		}
		
		ArrayList<Character> charArray = new ArrayList<Character>();
		for (char ch : ans.toCharArray()) {
			charArray.add(ch);
		}

		return charArray;
	}
	
	// http://stackoverflow.com/questions/6324826/converting-arraylist-of-characters-to-a-string
	public static String getStringRepresentation(ArrayList<Character> list)
	{    
	    StringBuilder builder = new StringBuilder(list.size());
	    for(Character ch: list)
	    {
	        builder.append(ch);
	    }
	    return builder.toString();
	}

}
