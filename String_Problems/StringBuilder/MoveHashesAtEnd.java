package Java_DSA_Codes.String_Problems.StringBuilder;
import java.util.Scanner;

public class MoveHashesAtEnd {

	public static void main(String[] args) {
		//Move all # to the front
		//Input: Move#Hash#to#Front
		//Output:###MoveHashtoFront
		
//		StringBuilder sb = new StringBuilder("Hello");
//		sb.append(" World");
//		System.out.println(sb);
//		sb.insert(5, ",");
//		System.out.println(sb);
//		char c = sb.charAt(4);
//		System.out.println(c);
//		String str = sb.substring(2, 4);
//		System.out.println(str);
  
		String str = "Move#hash#to#front";
		String res = MoveHash(str);
		System.out.print(res);
		
		

	}
	public static String MoveHash(String str) {
		StringBuilder hashes = new StringBuilder();
		StringBuilder letters = new StringBuilder();
		for(char c:str.toCharArray()) {
			if(c == '#') {
				hashes.append(c);
			}else {
				letters.append(c);
			}
		}
		return  hashes.toString() + letters.toString();
		
	}

}
