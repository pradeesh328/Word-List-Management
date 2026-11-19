public class GameStatistics {
    private int totalAttempts;
    private int wordsFound;

    public void recordAttempt() {
        totalAttempts++;
    }

    public void recordFoundWord() {
        wordsFound++;
    }

    public void displayStatistics() {
        System.out.println("Total valid word attempts: " + totalAttempts);
        System.out.println("Words successfully found: " + wordsFound);

        if (totalAttempts > 0) {
            double accuracy = (wordsFound * 100.0) / totalAttempts;
            System.out.printf("Success rate: %.2f%%%n", accuracy);
        } else {
            System.out.println("Success rate: 0.00%");
        }
    }
}
