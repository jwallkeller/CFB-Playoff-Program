package cfb_playoff_program;

import java.util.ArrayList;

/**
 *
 * @author Jack Keller
 */
public class CFB_Playoff_Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Team> teams = new ArrayList<Team>();
        
        Team OhioState = new Team("Ohio State");
        teams.add(OhioState);
        OhioState.printRecordNumerical();

        OhioState.addGame("Indiana", 29.4, 49, 10);
        OhioState.addGame("Wisconsin", 12.7, 28, 7);
        OhioState.addGame("Michigan", 39.2, 56, 14);
        OhioState.addGame("Iowa", 10.8, 17, 24);
        OhioState.addGame("Maryland", 56.4, 48, 3);
        OhioState.addGame("Purdue", 20.2, 21, 24);
        
        OhioState.printRecord();
        // Create Excel spreadsheet with ranks and scores to read from and populate the teams
        
    }
    
}
