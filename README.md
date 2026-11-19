# Word List Management – Word Discovery Game

## Description
A Java console mini-project in which the player finds words from a predefined word list. The program validates guesses, tracks found words, and displays game statistics.

## Problem Statement
A simple word-based application is needed to maintain a list of target words, validate user entries, track successfully found words, and report the player's progress.

## Objectives
- Maintain a predefined word list.
- Select and validate words entered by the player.
- Prevent duplicate entries from being counted.
- Track words found by the player.
- Display completion status and game statistics.

## Features / Modules
1. **WordList** – stores the target words and checks game completion.
2. **WordValidator** – checks empty, invalid, and repeated entries.
3. **FoundWordList** – stores the words found by the player.
4. **GameStatistics** – records attempts, successful words, and success rate.
5. **Main** – controls the game and accepts user input.

## Technology Stack
- Java
- JDK
- Visual Studio Code or any Java IDE
- Git and GitHub

## Prerequisites
Install a Java Development Kit (JDK). Verify installation:
```bash
java -version
javac -version
```

## Installation and Execution
1. Download or clone the repository.
2. Open the project folder in a terminal.
3. Compile the source files:
```bash
javac -d out src/*.java
```
4. Run the application:
```bash
java -cp out Main
```

## Commands
- Enter a word to submit a guess.
- `LIST` displays words already found and the remaining count.
- `HINT` displays the number of words remaining.
- `QUIT` ends the game.

## Sample Input
```text
java
JAVA
notaword
LIST
QUIT
```

## Sample Output (illustrative)
```text
Correct! You found: java
You have already found that word.
That word is not in the word list.
Words found: [java]
Words remaining: 9
```

## Testing
Test the application with:
- A valid word.
- An invalid word.
- An empty input.
- A word entered with uppercase letters.
- A duplicate word.
- LIST, HINT, and QUIT commands.
- Finding all words to verify game completion.

## Team Contributions
Add each team member's name, register number, and actual contribution here.

## Known Limitations
- The target word list is predefined in the source code.
- The game runs in the console.
- The words are not loaded from an external file or database.

## Future Enhancements
- Allow users to add and remove target words.
- Add difficulty levels and a time limit.
- Store scores between sessions.
- Develop a graphical user interface.
