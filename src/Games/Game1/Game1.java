package Games.Game1;

import java.util.Scanner;


public class Game1 {

    public static void main(String[] args) {
        Picture picture = new Picture();

        Scanner scanner = new Scanner(System.in);

        String word = "превет";
        char[] charArray = word.toCharArray();
        char[] array = new char[charArray.length];
        for (int i = 0; i < array.length; i++) {
            array[i] = '_';
        }

        int miss = 0;
        picture.printPicture(miss);
        System.out.println(array);

        int counter = 0;
        while (miss <= 6) {
            if (counter == array.length) {
                System.out.println("YOU WIN!!!");
                break;
            }

            char c = scanner.next().charAt(0);
            int index = word.indexOf(c);

            if (index < 0) {
                miss++;
                picture.printPicture(miss);
                System.out.println(array);
            } else {
                array[index] = c;
                counter++;
                for (int i = index + 1; i < charArray.length; i++) {
                    if (charArray[i] == c) {
                        array[i] = c;
                        counter++;
                    }
                }
                picture.printPicture(miss);
                System.out.println(array);
            }

            if (miss == 6) {
                System.out.println("YOU LOSE... " + "\nTRY AGAIN!");
            }
        }
    }
}
