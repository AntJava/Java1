package java1.lesson3;

import java.util.Scanner;

public class lesson3 {


    public static void game() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli",
                "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom",
                "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String word1 = words[(int) (Math.random() * words.length)];
        String word2 = words[(int) (Math.random() * words.length)];
        Scanner in = new Scanner(System.in);
        //System.out.println(word1);
        System.out.println("Guess the fruit:");

        for (int i = 0; i < word1.length() ; i++) {
            if (i == word1.length() - 1) {
                System.out.println("HAHA, You LOSE! It was " + word1);
                break;
            }
            System.out.println(showWord(i, word1) + hash(i));
            String guess = in.nextLine();
            if (guess.toLowerCase().matches(word1)) {
                System.out.println("You WIN, sir! It's surely a " + word1);
                System.out.println("Try counts: " + (i + 1));
                break;
            }
        }

        System.out.println("Guess the fruit (version 2):\n" + word2.charAt(0) + hash(0));
        int count = 0;
        //System.out.println(word2);
        while (true) {
            count++;
            String guess = in.nextLine().toLowerCase();
            if (guess.matches(word2)) {
                System.out.println("You WIN, sir! It's surely a " + word2);
                System.out.println("Try counts: " + count);
                break;
            }
            StringBuilder str = new StringBuilder();
            int len = Math.min(word2.length(), guess.length());
            for (int i = 0; i < len; i++) {
                if (word2.charAt(i) == guess.charAt(i)) {
                    str.append(word2.charAt(i));
                } else  str.append("#");
                if(i == len - 1) str.append(hash(i));
            }
            System.out.println(str);
        }

    }


    public static String showWord(int i, String word) {
        if (i == 0){
            return word.charAt(i) + "";
        }
        char letter = word.charAt(i);
        return  showWord(i - 1, word) + letter;
    }

    public static String hash(int i) {
        if (i >= 14) return "";
        return "#" + hash(i + 1);
    }

    public static void main(String[] args) {
        game();
    }
}
