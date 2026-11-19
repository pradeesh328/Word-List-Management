import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class WordList {
    private final Set<String> words;

    public WordList() {
        words = new LinkedHashSet<String>(Arrays.asList(
                "java", "python", "object", "class", "method",
                "computer", "program", "array", "string", "logic"
        ));
    }

    public boolean contains(String word) {
        return words.contains(word.toLowerCase());
    }

    public int getSize() {
        return words.size();
    }

    public int getRemainingCount(FoundWordList foundWords) {
        return words.size() - foundWords.getSize();
    }

    public boolean isComplete(FoundWordList foundWords) {
        return foundWords.getSize() == words.size();
    }
}
