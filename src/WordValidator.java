public class WordValidator {
    private final WordList wordList;

    public WordValidator(WordList wordList) {
        this.wordList = wordList;
    }

    public String validate(String input, FoundWordList foundWords) {
        if (input == null || input.trim().isEmpty()) {
            return "EMPTY";
        }
        if (!input.trim().matches("[a-zA-Z]+")) {
    return "INVALID";
}

        String word = input.trim().toLowerCase();

        if (!word.matches("[a-z]+")) {
            return "INVALID";
        }

        if (!wordList.contains(word)) {
            return "INVALID";
        }

        if (foundWords.contains(word)) {
            return "DUPLICATE";
        }

        return "FOUND";
    }
}
