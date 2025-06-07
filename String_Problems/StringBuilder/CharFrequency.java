package Java_DSA_Codes.String_Problems.StringBuilder;

import java.util.*;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO: Ask user for input string
        String str = scanner.nextLine();
        HashMap<Character,Integer> freqMap = new LinkedHashMap<>();

        for(char ch: str.toCharArray()){
            freqMap.put(ch, freqMap.getOrDefault(ch,0) + 1);
        }
        System.out.println("Character Frequencies:");
        for(Map.Entry<Character,Integer> entry : freqMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        scanner.close();
    }
}
