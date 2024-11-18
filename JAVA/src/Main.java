import java.util.Scanner;

class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] merged = new char[word1.length() + word2.length()];
        int i = 0, j = 0, k = 0;

        // Merge characters alternately
        while (i < word1.length() && j < word2.length()) {
            merged[k++] = word1.charAt(i++);
            merged[k++] = word2.charAt(j++);
        }

        // Append remaining characters from word1
        while (i < word1.length())
            merged[k++] = word1.charAt(i++);


        // Append remaining characters from word2
        while (j < word2.length())
            merged[k++] = word2.charAt(j++);


        // Convert char array to string and return
        return new String(merged);
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter word1: ");
        String word1 = sc.nextLine();

        System.out.println("Enter word2: ");
        String word2 = sc.nextLine();

        System.out.println(new Solution().mergeAlternately(word1, word2));
        sc.close();
    }
}