import java.util.ArrayList;
import java.util.List;

public class FoundWordList {
    private final List<String> foundWords;

    public FoundWordList() {
        foundWords = new ArrayList<String>();
    }

    public void addWord(String word) {
        String value = word.toLowerCase();
        if (!contains(value)) {
            foundWords.add(value);
        }
    }

    public boolean contains(String word) {
        return foundWords.contains(word.toLowerCase());
    }

    public int getSize() {
        return foundWords.size();
    }

    public List<String> getAllWords() {
        return new ArrayList<String>(foundWords);
    }
}
