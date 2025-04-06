public class ScoreChecker {
    public static void main(String[] args) throws InvalidScoreException {
        int score1 = 89;
        int score2 = -67;

        try {
            checkScore(score1);
            checkScore(score2);
        } catch (InvalidScoreException ise) {
            System.out.println(ise.getMessage());
        } finally {
            System.out.println("Validation complete!");
        }
    }
    public static void checkScore (int score) throws InvalidScoreException {
        if (score < 0 || score > 100) {
            throw new InvalidScoreException("Score should be between 0-100!");
        } else {
            System.out.println("Score is valid!");
        }
    }
}
