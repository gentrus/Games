package Games.Game1;

public class Picture {

    int attempt;

    public void printPicture (int miss) {
        switch (miss) {
            case 0:
                System.out.println("""
                  ____|
                  |   |
                      |
                      |
                      |
                 _____|_
                """);
                break;
            case 1:
                System.out.println("""
                  ____|
                  |   |
                  O   |
                      |
                      |
                 _____|_
                """);
                break;
            case 2:
                System.out.println("""
                  ____|
                  |   |
                  O   |
                  |   |
                      |
                 _____|_
                """);
                break;
            case 3:
                System.out.println("""
                  ____|
                  |   |
                  O   |
                  |\\  |
                      |
                 _____|_
                """);
                break;
            case 4:
                System.out.println("""
                  ____|
                  |   |
                  O   |
                 /|\\  |
                      |
                 _____|_
                """);
                break;
            case 5:
                System.out.println("""
                  ____|
                  |   |
                  O   |
                 /|\\  |
                 /    |
                 _____|_
                """);
                break;
            case 6:
                System.out.println("""
                  ____|
                  |   |
                  O   |
                 /|\\  |
                 / \\  |
                 _____|_
                """);
                break;
        }
    }
}


/*
 ____|
 |   |
 O   |
/|\  |
 /\  |
_____|_

 */