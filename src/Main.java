import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WordList wordList = new WordList();
        WordValidator validator = new WordValidator(wordList);
        FoundWordList foundWords = new FoundWordList();
        GameStatistics statistics = new GameStatistics();

        System.out.println("==================================");
        System.out.println("       WORD DISCOVERY GAME");
        System.out.println("==================================");
        System.out.println("Find all the words stored in the game.");
        System.out.println("Commands: LIST, HINT, QUIT");

        while (!wordList.isComplete(foundWords)) {
            System.out.print("\nEnter a word or command: ");
            String input = scanner.nextLine().trim();

            if (input.equalsIgnoreCase("QUIT")) {
                break;
            }

            if (input.equalsIgnoreCase("LIST")) {
                System.out.println("\nWords found: " + foundWords.getAllWords());
                System.out.println("Words remaining: " + wordList.getRemainingCount(foundWords));
                continue;
            }

            if (input.equalsIgnoreCase("HINT")) {
                System.out.println("There are " + wordList.getRemainingCount(foundWords)
                        + " words left to find.");
                continue;
            }

            statistics.recordAttempt();

            String result = validator.validate(input, foundWords);

            if (result.equals("FOUND")) {
                foundWords.addWord(input);
                statistics.recordFoundWord();
                System.out.println("Correct! You found: " + input.toLowerCase());
            } else if (result.equals("EMPTY")) {
                System.out.println("Please enter a word.");
            } else if (result.equals("INVALID")) {
                System.out.println("That word is not in the word list.");
            } else if (result.equals("DUPLICATE")) {
                System.out.println("You have already found that word.");
            }
        }

        System.out.println("\n========== GAME SUMMARY ==========");
        if (wordList.isComplete(foundWords)) {
            System.out.println("Congratulations! You found all the words.");
        } else {
            System.out.println("Game ended before all words were found.");
        }

        statistics.displayStatistics();
        System.out.println("Words found: " + foundWords.getAllWords());
        System.out.println("==================================");

        scanner.close();
    }
}
