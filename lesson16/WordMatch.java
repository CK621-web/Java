public class WordMatch {

    private String secret;

    public wordMatch (String word){
        secret = word;

    }

    public int scoreGuess(String guess) {
        int count = 0;
        for (int i = 0; i <= length.secret() - length.guess(); i++) {
            if (secret.substring(i, i + length.guess()).equals(guess)) {
                count++;
            }
        }
        return count * length.guess() * length.guess();
    }

    public String findBetterGuess(String guess1, String guess2) {

    }
}
