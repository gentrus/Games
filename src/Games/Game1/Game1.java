package Games.Game1;

import java.util.Scanner;


public class Game1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int answer = 1;
        while (answer == 1) {
            play();
            answer = scanner.nextInt();
        }
    }

    public static void play() {
        Picture picture = new Picture();
        Words randomWord = new Words();
        Scanner scanner = new Scanner(System.in);

        char[] charArray = randomWord.word.toCharArray();
        char[] array = new char[charArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = '_';
        }

        int miss = 0;
        picture.printPicture(miss);
        System.out.println(array);

        int counter = 0;
        while (miss < 6) {
            if (counter == array.length) {
                System.out.println("YOU WIN!!!" + "\nTRY AGAIN?" + "\n1 - YES\nANY NUMBS - NO");
                break;
            }

            char c = scanner.next().charAt(0);
            int index = randomWord.word.indexOf(c);
            if (index < 0) {
                miss++;
                picture.printPicture(miss);
                System.out.println(array);
            } else {
                if (array[index] == '_') {
                    array[index] = c;
                    counter++;

                    for (int i = index + 1; i < charArray.length; i++) {
                        if (charArray[i] == c) {
                            array[i] = c;
                            counter++;
                        }
                    }
                }
                picture.printPicture(miss);
                System.out.println(array);
            }

            if (miss == 6) {
                System.out.println("YOU LOSE... " + "\nTRY AGAIN?" + "\n1 - YES\nANY NUMBS - NO");
            }
        }
    }
}
