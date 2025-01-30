package Games.Game1;

import java.util.Arrays;
import java.util.Random;

public class Words {
    String word = getRandomWord();
    char close = '_';

    private String getRandomWord () {
        var random = new Random();
        var list = Arrays.asList("апельсин", "лимон", "грейпфрут");
        return list.get(random.nextInt(list.size()));
    }
}
