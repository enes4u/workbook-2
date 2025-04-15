package HighScoreWins;
import java.util.Scanner;
public class Java {
    public static void main(String[] args) {

        Scanner referee = new Scanner(System.in);

        // Prompt the user for a game score
        System.out.print("Please enter a game score (format: Home:Visitor|21:9): ");
        String input = referee.nextLine().trim();

        // Split input into team names and scores
        String[] teamsAndScores = input.split("\\|"); // Split on the pipe '|'
        String[] teams = teamsAndScores[0].split(":"); // Split teams on the colon ':'
        String[] scores = teamsAndScores[1].split(":"); // Split scores on the colon ':'

        // Parse teams and scores
        String homeTeam = teams[0];
        String visitorTeam = teams[1];
        int homeScore = Integer.parseInt(scores[0]);
        int visitorScore = Integer.parseInt(scores[1]);

        // Determine the winner
        String winner;
        if (homeScore > visitorScore) {
            winner = homeTeam;
        } else if (visitorScore > homeScore) {
            winner = visitorTeam;
        } else {
            winner = "It's a tie!"; // Handle tie case
                }

        // Display the winner
        System.out.println("Winner: " + winner);

        referee.close();



    }
}
