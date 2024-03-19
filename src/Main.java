import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your text.");
        String input = scanner.nextLine();

        String[] words = input.split(" ");

        HashMap<String, Integer> wordCounts = new HashMap<>();

        //populate the HashMap with the occurrence rates of each word
        for (String word : words) {
            if (wordCounts.containsKey(word)){
                int i = wordCounts.get(word);
                wordCounts.put(word, i + 1);
            } else {
                wordCounts.put(word, 1);
            }
        }

        //loop through the HashMap and find the key with the highest value
        String maxKey = null;
        int maxValue = 0;
        
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            int value = entry.getValue();
            if (value > maxValue){
                maxKey = entry.getKey();
                maxValue = value;
            }
        }

        //print out the word that occurs the most in user input
        System.out.println("The word with the highest occurrence count is: " + maxKey);
    }
}