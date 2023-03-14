package ss8.bai_tap.Refactoring;

public class TennisGame {
//    public static final int LOVE = 0;
//    public static final int FIFTEEN = 1;
//    public static final int THIRTY = 2;
//    public static final int FORTY = 3;

    public static String getScore(String firstPlayerName, String secondPlayerName, int firstPlayScore, int secondPlayScore) {
        String score = " ";
        int tempScore;
        if (firstPlayScore == secondPlayScore) {

            switch (firstPlayScore) {
                case 0:
                    score = "Love-All";
                    break;
                case 1:
                    score = "Fifteen-All";
                    break;
                case 2:
                    score = "Thirty-All";
                    break;
                case 3:
                    score = "Forty-All";
                    break;
                default:
                    score = "Deuce";
                    break;

            }
            return score;
        } else if (firstPlayScore >= 4 || secondPlayScore >= 4) {
            int minusResult = firstPlayScore - secondPlayScore;
            if (minusResult == 1) {
                score = "Advantage player1";
            } else if (minusResult == -1) {
                score = "Advantage player2";
            } else if (minusResult >= 2) {
                score = "Win for player1";
            } else {
                score = "Win for player2";
            }

        } else {
            for (int i = 1; i < 3; i++) {
                if (i == 1) {
                    tempScore = firstPlayScore;
                } else {
                    score += "-";
                    tempScore = secondPlayScore;
                }
                score = getString(score, tempScore);
            }
        }
        return score;
    }

    public static String getString(String score, int tempScore) {
        switch (tempScore) {
            case 0:
                score += "Love";
                break;
            case 1:
                score += "Fifteen";
                break;
            case 2:
                score += "Thirty";
                break;
            case 3:
                score += "Forty";
                break;
        }
        return score;
    }
}
