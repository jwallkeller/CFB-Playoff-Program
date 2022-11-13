/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cfb_playoff_program;

/**
 *
 * @author Jack Keller
 */
public class Game {
    private String winner;
    private String loser;
    private String opponent;
    private int winningScore;
    private int losingScore;
    private int outcome;
    private double opponentSoS;
    
    Game(String team, String opponent, int outcome, int winningScore, int losingScore, double opponentSoS) {
        this.opponent = opponent;
        this.winningScore = winningScore;
        this.losingScore = losingScore;
        this.opponentSoS = opponentSoS;
        
        if(outcome == 0) {
            this.outcome = 0;
            this.winner = opponent;
            this.loser = team;
        } else {
            this.outcome = 1;
            this.winner = team;
            this.loser = opponent;
        }
    }

    public String getWinner() {
        return winner;
    }

    public String getLoser() {
        return loser;
    }

    public String getOpponent() {
        return opponent;
    }

    public int getWinningScore() {
        return winningScore;
    }

    public int getLosingScore() {
        return losingScore;
    }

    public String getOutcome() {
        if (this.outcome == 1) {
            return "W";
        } else {
            return "L";
        }
    }    

    public double getOpponentSoS() {
        return opponentSoS;
    }
    
}
