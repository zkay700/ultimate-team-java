import java.util.ArrayList;

// This is the Ultimate Team class that consists of a list of players.
// It tracks the teams performance through wins, losses and draws instance variables.
// It also consists of different methods that represent actions taken by the user in managing their Ultimate Team squad.
public class UltimateTeam {
    // Instance Variables.
    private ArrayList<Player> players;
    private int wins;
    private int losses;
    private int draws;
    
    // Constructor that initializes the instance variables.
    public UltimateTeam(int wins, int losses, int draws) {
        this.players = new ArrayList<>();
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;

    }
    
    // Method that adds a player specified to the team, if they are not already in the team.
    public void addPlayer(Player newPlayer) {
        
            if (!(players.contains(newPlayer))) {
                players.add(newPlayer);
            }
        
    }
    
    // Method that removes a player from the squad if they are no longer needed.
    public void sellPlayer(Player oldPlayer) {
        for (int i = players.size() - 1; i >= 0; i--) {
            if (players.get(i).equals(oldPlayer)) {
                Player removed = players.remove(i);
                System.out.println(removed.getPlayerName() + " has been sold.");
            }
        }
    }
    
    // Method that increments wins, losses and draws based on goals scored and goals conceded in a specific match.
    public void addWins(int scored, int conceded) {

        if (scored > conceded) {
            wins++;
            System.out.println("We won the game. Total Wins: " + wins);
        }

        if (scored < conceded) {
            losses++;
            System.out.println("We lost the game. Total Losses: " + losses);
        }

        if (scored == conceded) {
            draws++;
            System.out.println("The game ended in a Draw. Total Draws: " + draws);
        }

        

    }
    
    // Method for if the user wants to search for a specific player.
    public void searchPlayers(Player toBeFound) {
        boolean found = false;
        for (Player e : players) {
            if (toBeFound.equals(e)) {
                System.out.println("On Searching: " + e.getPlayerName() + " is in the squad.");
                found = true;
                break;
            }

    }

    if (!found) {
        System.out.println("On Searching: " + toBeFound.getPlayerName() + " is NOT in the squad");
    }


}
    // Functions like a toString method and displays the complete team.
    public void displayTeam() {
        System.out.println("\n" + "UltimateTeam Squad: ");

        for (Player p : players) {
            System.out.println(p);
        }
    }
        






}
