package Games.Game1;
import java.util.Scanner;

public class Game1 {

    public static void main(String[] args) {
        Words randomWord = new Words();
        Picture picture = new Picture();
        Scanner scanner = new Scanner(System.in);

        int miss = 0;
        int openLetter = 0;
        String word = randomWord.word;
        char c = scanner.next().charAt(0);
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == c) {
                openLetter = i;

            }
        }
    }

}
