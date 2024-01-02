public class CombinationLock {
    
    private String lock;

    public CombinationLock(String lock) {
        this.lock = lock;
    }

    public String getClue(String guess) {
        
        String clue = "";

        for (int i = 0; i < 4; i++) {
            char guessChar = guess.charAt(i);
            char lockChar = lock.charAt(i);

            if (guessChar == lockChar) {
                clue += guessChar; // Matching letter
            } else if (lock.contains(String.valueOf(guessChar))) {
                clue += '+'; // Letter in lock but not in the correct position
            } else {
                clue += '*'; // Letter not in the lock
            }
        }

        return clue;
    }
}