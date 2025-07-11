import java.util.Scanner;

public class SentenceAnalysis {

    // Function to count vowels and consonants
    public static void countVowelsAndConsonants(String sentence) {
        int vowels = 0, consonants = 0;
        sentence = sentence.toLowerCase();

        for (char ch : sentence.toCharArray()) {
            if (Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    // Function to count words
    public static int countWords(String sentence) {
        if (sentence.trim().isEmpty()) return 0;
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    // Function to reverse each word
    public static void reverseEachWord(String sentence) {
        String[] words = sentence.split(" ");
        System.out.print("Reversed Words: ");
        for (String word : words) {
            StringBuilder sb = new StringBuilder(word);
            System.out.print(sb.reverse().toString() + " ");
        }
        System.out.println(); // New line
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        countVowelsAndConsonants(sentence);

        int wordCount = countWords(sentence);
        System.out.println("Number of Words: " + wordCount);

        reverseEachWord(sentence);
    }
}
