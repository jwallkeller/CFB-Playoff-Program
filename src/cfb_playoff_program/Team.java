package cfb_playoff_program;

import java.util.ArrayList;

/**
 *
 * @author Jack Keller
 */
public class Team {
    private String name;
    private int rank;
    private ArrayList<Game> games = new ArrayList<Game>();
    private double SoS;
    private int pointsScored;
    private int pointsGivenUp;
    private int wins;
    private int losses;
    
    Team(String name) {
        this.name = name;
        this.pointsGivenUp = 0;
        this.pointsScored = 0;
    }

    public String getName() {
        return name;
    }
       
    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public double getSoS() {
        return SoS;
    }

    public void setSoS(float SoS) {
        this.SoS = SoS;
    }
    
    public void addGame(String opponent, double opponentSoS, int score, int opponentScore) {
        if (score > opponentScore) {
            Game newGame = new Game(this.name, opponent, 1, score, opponentScore, opponentSoS);
            games.add(newGame);
            wins += 1;
        } else {
            Game newGame = new Game(this.name, opponent, 0, opponentScore, score, opponentSoS);
            games.add(newGame);
            losses += 1;
        }

        this.pointsGivenUp += opponentScore;
        this.pointsScored += score;
    }

    public int getPointsScored() {
        return pointsScored;
    }

    public int getPointsGivenUp() {
        return pointsGivenUp;
    }
    
    public void printRecordNumerical() {
        System.out.printf("%s's record is %d-%d\n", name, wins, losses);
    }
    
    public void printRecord() {
        System.out.printf("%s's record is %d-%d with outcomes:\n", name, wins, losses);
        
        for (int i = 0; i < games.size(); i++) {
            System.out.printf("\tOpponent: %s\n", games.get(i).getOpponent());
            System.out.printf("\tOutcome: %s\n", games.get(i).getOutcome());
            
            if (games.get(i).getOutcome() == "W") {
                System.out.printf("\tScore: %d-%d\n", games.get(i).getWinningScore(), games.get(i).getLosingScore());
            } else {
                System.out.printf("\tScore: %d-%d\n", games.get(i).getLosingScore(), games.get(i).getWinningScore());
            }
            
            System.out.printf("\t%s's SoS: %.1f\n\n", games.get(i).getOpponent(), games.get(i).getOpponentSoS());
        }
    }
}
