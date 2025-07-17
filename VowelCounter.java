import java.util.HashMap;
import java.util.Scanner;
class VowelCounter {
    static HashMap<String, Integer> memo = new HashMap<>();
    static boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c =='u';
    }
    static int countVowels(String s) {
        if(s.isEmpty()) return 0;
        if(memo.containsKey(s)) {
            return memo.get(s);
        }
        int count = isVowel(s.charAt(0)) ? 1 : 0;
        count += countVowels(s.substring(1));
        memo.put(s, count);
        return count;
    }
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        int result = countVowels(input);
        System.out.println("Number of vowels in \"" + input + "\" is: " + result);
        scanner.close();
    }
}